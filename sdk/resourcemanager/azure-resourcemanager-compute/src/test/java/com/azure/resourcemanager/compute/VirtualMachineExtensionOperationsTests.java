// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.models.KnownLinuxVirtualMachineImage;
import com.azure.resourcemanager.compute.models.VirtualMachine;
import com.azure.resourcemanager.compute.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.models.VirtualMachineSizeTypes;
import com.azure.resourcemanager.keyvault.models.Secret;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.resourcemanager.storage.models.StorageAccount;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VirtualMachineExtensionOperationsTests extends ComputeManagementTest {
    private String rgName = "";
    private Region region = Region.US_WEST2;

    @Override
    protected void initializeClients(HttpPipeline httpPipeline, AzureProfile profile) {
        rgName = generateRandomResourceName("vmexttest", 15);
        super.initializeClients(httpPipeline, profile);
    }

    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().beginDeleteByName(rgName);
    }

    @Test
    public void canEnableDiagnosticsExtension() throws Exception {
        final String storageAccountName = generateRandomResourceName("stg", 15);
        final String vmName = "javavm1";

        // Creates a storage account
        StorageAccount storageAccount = storageManager.storageAccounts()
            .define(storageAccountName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .disableSharedKeyAccess()
            .create();

        // Create a Linux VM
        //
        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withExistingResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))
            .withExistingStorageAccount(storageAccount)
            .create();

        final InputStream embeddedJsonConfig
            = VirtualMachineExtensionOperationsTests.class.getResourceAsStream("/linux_diagnostics_public_config.json");
        String jsonConfig = SerializerFactory.createDefaultManagementSerializerAdapter()
            .serialize(SerializerFactory.createDefaultManagementSerializerAdapter()
                .deserialize(embeddedJsonConfig, Object.class, SerializerEncoding.JSON), SerializerEncoding.JSON);
        jsonConfig = jsonConfig.replace("%VirtualMachineResourceId%", vm.id());

        // Update Linux VM to enable Diagnostics
        vm.update()
            .defineNewExtension("LinuxDiagnostic")
            .withPublisher("Microsoft.OSTCExtensions")
            .withType("LinuxDiagnostic")
            .withVersion("2.3")
            .withPublicSetting("ladCfg", new String(Base64.getEncoder().encode(jsonConfig.getBytes())))
            .withPublicSetting("storageAccount", storageAccount.name())
            .withProtectedSetting("storageAccountName", storageAccount.name())
            .withProtectedSetting("storageAccountKey", storageAccount.getKeys().get(0).value())
            .withProtectedSetting("storageAccountEndPoint", "https://core.windows.net:443/")
            .attach()
            .apply();

        Map<String, VirtualMachineExtension> extensions = vm.listExtensions();
        Assertions.assertNotNull(extensions);
        Assertions.assertFalse(extensions.isEmpty());
        VirtualMachineExtension diagExtension = extensions.get("LinuxDiagnostic");
        Assertions.assertNotNull(diagExtension);
        Assertions.assertNotNull(diagExtension.publicSettings());
        Assertions.assertFalse(diagExtension.publicSettings().isEmpty());

        vm.refresh();
        extensions = vm.listExtensions();
        Assertions.assertNotNull(extensions);
        Assertions.assertFalse(extensions.isEmpty());
        diagExtension = extensions.get("LinuxDiagnostic");
        Assertions.assertNotNull(diagExtension);
        Assertions.assertNotNull(diagExtension.publicSettings());
        Assertions.assertFalse(diagExtension.publicSettings().isEmpty());
    }

    @Test
    public void canResetPasswordUsingVMAccessExtension() throws Exception {
        final String vmName = "javavm2";

        // Create a Linux VM
        //
        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))
            .create();

        // Using VMAccess Linux extension to reset the password for the existing user 'Foo12'
        // https://github.com/Azure/azure-linux-extensions/blob/master/VMAccess/README.md
        //
        vm.update()
            .defineNewExtension("VMAccessForLinux")
            .withPublisher("Microsoft.OSTCExtensions")
            .withType("VMAccessForLinux")
            .withVersion("1.4")
            .withProtectedSetting("username", "Foo12")
            .withProtectedSetting("password", "B12a6@12xyz!")
            .withProtectedSetting("reset_ssh", "true")
            .attach()
            .apply();

        Assertions.assertTrue(vm.listExtensions().size() > 0);
        Assertions.assertTrue(vm.listExtensions().containsKey("VMAccessForLinux"));

        // Update the VMAccess Linux extension to reset password again for the user 'Foo12'
        //
        vm.update()
            .updateExtension("VMAccessForLinux")
            .withProtectedSetting("username", "Foo12")
            .withProtectedSetting("password", "muy!234OR")
            .withProtectedSetting("reset_ssh", "true")
            .parent()
            .apply();
    }

    @Test
    public void canInstallUninstallCustomExtension() throws Exception {
        final String vmName = "javavm3";

        final String installCommand = "sudo -- sh -c 'apt-get update && apt-get -y install mysql-server'";

        // Create Linux VM with a custom extension to install MySQL
        //
        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_A1_v2"))
            .defineNewExtension("CustomScriptForLinux")
            .withPublisher("Microsoft.OSTCExtensions")
            .withType("CustomScriptForLinux")
            .withVersion("1.4")
            .withMinorVersionAutoUpgrade()
            .withPublicSetting("commandToExecute", installCommand)
            .attach()
            .create();

        Assertions.assertTrue(vm.listExtensions().size() > 0);
        Assertions.assertTrue(vm.listExtensions().containsKey("CustomScriptForLinux"));
        VirtualMachineExtension customScriptExtension = vm.listExtensions().get("CustomScriptForLinux");
        Assertions.assertEquals(customScriptExtension.publisherName(), "Microsoft.OSTCExtensions");
        Assertions.assertEquals(customScriptExtension.typeName(), "CustomScriptForLinux");
        Assertions.assertTrue(customScriptExtension.autoUpgradeMinorVersionEnabled());

        // Remove the custom extension
        //
        vm.update().withoutExtension("CustomScriptForLinux").apply();

        Assertions.assertFalse(vm.listExtensions().containsKey("CustomScriptForLinux"));

        vm.refresh();
        Assertions.assertFalse(vm.listExtensions().containsKey("CustomScriptForLinux"));
    }

    @Test
    public void canHandleExtensionReference() throws Exception {
        final String vmName = "javavm4";

        // Create a Linux VM
        //
        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))
            .defineNewExtension("VMAccessForLinux")
            .withPublisher("Microsoft.OSTCExtensions")
            .withType("VMAccessForLinux")
            .withVersion("1.4")
            .withProtectedSetting("username", "Foo12")
            .withProtectedSetting("password", "B12a6@12xyz!")
            .withProtectedSetting("reset_ssh", "true")
            .attach()
            .create();

        Assertions.assertTrue(vm.listExtensions().size() > 0);

        // Get the created virtual machine via VM List not by VM GET
        PagedIterable<VirtualMachine> virtualMachines = computeManager.virtualMachines().listByResourceGroup(rgName);
        VirtualMachine vmWithExtensionReference = null;
        for (VirtualMachine virtualMachine : virtualMachines) {
            if (virtualMachine.name().equalsIgnoreCase(vmName)) {
                vmWithExtensionReference = virtualMachine;
                break;
            }
        }
        // The VM retrieved from the list will contain extensions as reference (i.e. with only id)
        Assertions.assertNotNull(vmWithExtensionReference);

        // Update the extension
        VirtualMachine vmWithExtensionUpdated = vmWithExtensionReference.update()
            .updateExtension("VMAccessForLinux")
            .withProtectedSetting("username", "Foo12")
            .withProtectedSetting("password", "muy!234OR")
            .withProtectedSetting("reset_ssh", "true")
            .parent()
            .apply();

        // Again getting VM with extension reference
        virtualMachines = computeManager.virtualMachines().listByResourceGroup(rgName);
        vmWithExtensionReference = null;
        for (VirtualMachine virtualMachine : virtualMachines) {
            vmWithExtensionReference = virtualMachine;
        }
        Assertions.assertNotNull(vmWithExtensionReference);

        VirtualMachineExtension accessExtension = null;
        for (VirtualMachineExtension extension : vmWithExtensionReference.listExtensions().values()) {
            if (extension.name().equalsIgnoreCase("VMAccessForLinux")) {
                accessExtension = extension;
                break;
            }
        }
        // Even though VM's inner contain just extension reference VirtualMachine::getExtensions()
        // should resolve the reference and get full extension.
        Assertions.assertNotNull(accessExtension);
        Assertions.assertNotNull(accessExtension.publisherName());
        Assertions.assertNotNull(accessExtension.typeName());
        Assertions.assertNotNull(accessExtension.versionName());
    }

    @Test
    public void canGetInstanceViewInDeallocatedState() {
        // Create a Linux VM
        String vmName = generateRandomResourceName("javavm", 15);
        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))
            .defineNewExtension("VMAccessForLinux")
            .withPublisher("Microsoft.OSTCExtensions")
            .withType("VMAccessForLinux")
            .withVersion("1.4")
            .withProtectedSetting("username", "Foo12")
            .withProtectedSetting("password", "B12a6@12xyz!")
            .withProtectedSetting("reset_ssh", "true")
            .attach()
            .create();

        Assertions.assertTrue(vm.listExtensions().size() > 0);
        Assertions.assertTrue(
            vm.listExtensions().values().stream().noneMatch(extension -> extension.getInstanceView() == null));

        vm.deallocate();

        // In deallocated state, we can get VM's extensions but not their instance views.
        Assertions.assertTrue(vm.listExtensions().size() > 0);
        Assertions.assertTrue(
            vm.listExtensions().values().stream().allMatch(extension -> extension.getInstanceView() == null));
    }

    @Test
    public void canIgnoreInvalidJson() throws IOException {
        String vmName = generateRandomResourceName("javavm", 15);
        String vaultName = generateRandomResourceName("javavt", 15);
        final String secretName = generateRandomResourceName("srt", 10);

        Vault vault = this.keyVaultManager.vaults()
            .define(vaultName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .defineAccessPolicy()
            .forUser(azureCliSignedInUser().userPrincipalName())
            .allowSecretAllPermissions()
            .attach()
            .withDeploymentEnabled()
            .create();
        final InputStream embeddedJsonConfig = this.getClass().getResourceAsStream("/myTest.txt");
        String secretValue = IOUtils.toString(embeddedJsonConfig, StandardCharsets.UTF_8);
        Secret secret = vault.secrets().define(secretName).withValue(secretValue).create();

        Map<String, Object> extensionSecretSettings = new HashMap<>();
        extensionSecretSettings.put("pollingIntervalInS", "3600");
        extensionSecretSettings.put("observedCertificates", Collections.singletonList(secret.id()));

        VirtualMachine vm = computeManager.virtualMachines()
            .define(vmName)
            .withRegion(region)
            .withExistingResourceGroup(rgName)
            .withNewPrimaryNetwork("10.0.0.0/28")
            .withPrimaryPrivateIPAddressDynamic()
            .withoutPrimaryPublicIPAddress()
            .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
            .withRootUsername("Foo12")
            .withSsh(sshPublicKey())
            .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))
            .defineNewExtension("KeyVaultForLinux")
            .withPublisher("Microsoft.Azure.KeyVault")
            .withType("KeyVaultForLinux")
            .withVersion("1.0")
            .withPublicSetting("secretsManagementSettings", extensionSecretSettings)
            .attach()
            .create();
        VirtualMachineExtension extension = vm.listExtensions().get("KeyVaultForLinux");
        Assertions.assertNotNull(extension);
        Assertions.assertNotNull(extension.publicSettingsAsJsonString());
        Assertions.assertFalse(extension.publicSettings().isEmpty());
    }
}
