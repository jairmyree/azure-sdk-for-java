// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.batch;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.annotation.LiveOnly;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.identity.AzurePowerShellCredentialBuilder;
import com.azure.resourcemanager.batch.models.AccountKeyType;
import com.azure.resourcemanager.batch.models.Application;
import com.azure.resourcemanager.batch.models.ApplicationPackage;
import com.azure.resourcemanager.batch.models.AutoStorageBaseProperties;
import com.azure.resourcemanager.batch.models.BatchAccount;
import com.azure.resourcemanager.batch.models.BatchAccountKeys;
import com.azure.resourcemanager.batch.models.BatchAccountRegenerateKeyParameters;
import com.azure.resourcemanager.batch.models.ComputeNodeDeallocationOption;
import com.azure.resourcemanager.batch.models.DeploymentConfiguration;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import com.azure.resourcemanager.batch.models.ImageReference;
import com.azure.resourcemanager.batch.models.Pool;
import com.azure.resourcemanager.batch.models.ScaleSettings;
import com.azure.resourcemanager.batch.models.VirtualMachineConfiguration;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.resources.fluentcore.policy.ProviderRegistrationPolicy;
import com.azure.resourcemanager.storage.StorageManager;
import com.azure.resourcemanager.storage.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BatchTests extends TestProxyTestBase {

    private static final Random RANDOM = new Random();

    private static final Region REGION = Region.US_WEST2;
    private String resourceGroup = "rg" + randomPadding();
    private ResourceManager resourceManager;
    private BatchManager batchManager;
    private StorageManager storageManager;
    private boolean testEnv;

    @Override
    public void beforeTest() {
        TokenCredential credential = new AzurePowerShellCredentialBuilder().build();
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);

        resourceManager = ResourceManager.configure()
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile)
            .withDefaultSubscription();

        batchManager = BatchManager.configure()
            .withPolicy(new ProviderRegistrationPolicy(resourceManager))
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile);

        storageManager = StorageManager.configure()
            .withPolicy(new ProviderRegistrationPolicy(resourceManager))
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile);

        String testResourceGroup = Configuration.getGlobalConfiguration().get("AZURE_RESOURCE_GROUP_NAME");
        testEnv = !CoreUtils.isNullOrEmpty(testResourceGroup);
        if (testEnv) {
            resourceGroup = testResourceGroup;
        } else {
            resourceManager.resourceGroups().define(resourceGroup).withRegion(REGION).create();
        }
    }

    @Override
    protected void afterTest() {
        if (!testEnv) {
            resourceManager.resourceGroups().beginDeleteByName(resourceGroup);
        }
    }

    @Test
    @LiveOnly
    public void testCreateBatchAccount() {
        StorageAccount storageAccount = null;
        BatchAccount account = null;
        try {
            // storage account
            final String storageAccountName = "sa" + randomPadding();

            storageAccount = storageManager.storageAccounts()
                .define(storageAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .create();

            // batch account
            final String batchAccountName = "ba" + randomPadding();
            account = batchManager.batchAccounts()
                .define(batchAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .withAutoStorage(new AutoStorageBaseProperties().withStorageAccountId(storageAccount.id()))
                .create();

            assertNotNull(account);

            BatchAccount batchAccount
                = batchManager.batchAccounts().getByResourceGroup(resourceGroup, batchAccountName);
            assertEquals(batchAccountName, batchAccount.name());
            assertEquals(REGION.toString(), batchAccount.location());
        } finally {
            if (account != null) {
                batchManager.batchAccounts().deleteById(account.id());
            }
            if (storageAccount != null) {
                storageManager.storageAccounts().deleteById(storageAccount.id());
            }
        }
    }

    @Test
    @LiveOnly
    public void testCRUDBatchAccount() {
        BatchAccount account = null;
        StorageAccount storageAccount = null;
        final String batchAccountName;
        try {
            // batch account
            batchAccountName = "sa" + randomPadding();
            account = batchManager.batchAccounts()
                .define(batchAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .create();
            Assertions.assertNull(account.autoStorage());

            // batch account data plane access key
            BatchAccountKeys keys = account.getKeys();
            Assertions.assertNotNull(keys.primary());
            Assertions.assertNotNull(keys.secondary());

            BatchAccountKeys regeneratedKeys
                = account.regenerateKey(new BatchAccountRegenerateKeyParameters().withKeyName(AccountKeyType.PRIMARY));
            Assertions.assertNotNull(regeneratedKeys.primary());
            Assertions.assertNotNull(regeneratedKeys.secondary());

            // storage account
            final String storageAccountName = "sa" + randomPadding();
            storageAccount = storageManager.storageAccounts()
                .define(storageAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .create();
            account.update()
                .withAutoStorage(new AutoStorageBaseProperties().withStorageAccountId(storageAccount.id()))
                .apply();
            Assertions.assertNotNull(account.autoStorage().storageAccountId());
            OffsetDateTime lastKeySync = account.autoStorage().lastKeySync();
            Assertions.assertNotNull(lastKeySync);

            account.synchronizeAutoStorageKeys();
            account.refresh();

            Assertions.assertNotEquals(lastKeySync, account.autoStorage().lastKeySync());
        } finally {
            if (account != null) {
                batchManager.batchAccounts().deleteById(account.id());
            }
            if (storageAccount != null) {
                storageManager.storageAccounts().deleteById(storageAccount.id());
            }
        }
    }

    @Test
    @LiveOnly
    public void testCRUDBatchApplication() {
        StorageAccount storageAccount = null;
        BatchAccount account = null;
        Application application = null;
        ApplicationPackage applicationPackage = null;
        final String batchAccountName;
        final String applicationName;
        String packageVersion;
        try {
            // storage account
            final String storageAccountName = "sa" + randomPadding();
            storageAccount = storageManager.storageAccounts()
                .define(storageAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .create();
            // batch account
            batchAccountName = "ba" + randomPadding();
            account = batchManager.batchAccounts()
                .define(batchAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .withAutoStorage(new AutoStorageBaseProperties().withStorageAccountId(storageAccount.id()))
                .create();

            // create application with batch account
            applicationName = "baa" + randomPadding();
            String displayName = "badn" + randomPadding();
            application = batchManager.applications()
                .define(applicationName)
                .withExistingBatchAccount(resourceGroup, batchAccountName)
                .withDisplayName(displayName)
                .withAllowUpdates(true)
                .create();
            Assertions.assertEquals(application.displayName(), displayName);
            Assertions.assertEquals(application.name(), applicationName);
            Assertions.assertNull(application.defaultVersion());

            // update application
            String newDisplayName = "newbadn" + randomPadding();
            application.update().withDisplayName(newDisplayName).apply();
            Assertions.assertNotEquals(displayName, application.displayName());

            packageVersion = "version" + randomPadding();
            applicationPackage = batchManager.applicationPackages()
                .define(packageVersion)
                .withExistingApplication(resourceGroup, batchAccountName, applicationName)
                .create();
            Assertions.assertNotNull(applicationPackage);
            Assertions.assertNull(applicationPackage.lastActivationTime());
        } finally {
            // all application packages must be deleted before the application can be deleted
            if (applicationPackage != null) {
                batchManager.applicationPackages().deleteById(applicationPackage.id());
            }
            if (application != null) {
                batchManager.applications().deleteById(application.id());
            }
            if (account != null) {
                batchManager.batchAccounts().deleteById(account.id());
            }
            if (storageAccount != null) {
                storageManager.storageAccounts().deleteById(storageAccount.id());
            }
        }
    }

    @Test
    @LiveOnly
    public void testCRUDBatchPool() {
        BatchAccount account = null;
        Pool pool = null;
        try {
            String batchAccountName = "sa" + randomPadding();
            String poolName = "bp" + randomPadding();
            String poolDisplayName = "bpdn" + randomPadding();
            // @embedmeStart
            // batch account
            account = batchManager.batchAccounts()
                .define(batchAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroup)
                .create();

            // batch pool create
            pool = batchManager.pools()
                .define(poolName)
                .withExistingBatchAccount(resourceGroup, batchAccountName)
                .withDisplayName(poolDisplayName)
                .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                    new VirtualMachineConfiguration().withImageReference(new ImageReference().withPublisher("Canonical")
                        .withOffer("UbuntuServer")
                        .withSku("18.04-LTS")
                        .withVersion("latest")).withNodeAgentSkuId("batch.node.ubuntu 18.04")))
                .withScaleSettings(new ScaleSettings()
                    .withFixedScale(new FixedScaleSettings().withResizeTimeout(Duration.parse("PT8M"))
                        .withTargetDedicatedNodes(1)
                        .withTargetLowPriorityNodes(1)
                        .withNodeDeallocationOption(ComputeNodeDeallocationOption.TASK_COMPLETION)))
                .withVmSize("Standard_D1")
                .create();
            // @embedmeEnd
            Assertions.assertEquals(poolName, pool.name());
            Assertions.assertEquals(poolDisplayName, pool.displayName());
            Assertions.assertNull(pool.scaleSettings().autoScale());
            Assertions.assertEquals(pool.scaleSettings().fixedScale().nodeDeallocationOption(),
                ComputeNodeDeallocationOption.TASK_COMPLETION);
        } finally {
            if (pool != null) {
                batchManager.pools().deleteById(pool.id());
            }
            if (account != null) {
                batchManager.batchAccounts().deleteById(account.id());
            }
        }
    }

    private static String randomPadding() {
        return String.format("%05d", Math.abs(RANDOM.nextInt() % 100000));
    }

}
