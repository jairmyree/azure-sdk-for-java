// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IaaS VM workload-specific backup item representing a classic virtual machine.
 */
@Fluent
public final class AzureIaaSClassicComputeVMContainer extends IaaSvmContainer {
    /*
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines
     * 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     */
    private ProtectableContainerType containerType
        = ProtectableContainerType.MICROSOFT_CLASSIC_COMPUTE_VIRTUAL_MACHINES;

    /**
     * Creates an instance of AzureIaaSClassicComputeVMContainer class.
     */
    public AzureIaaSClassicComputeVMContainer() {
    }

    /**
     * Get the containerType property: Type of the container. The value of this property for: 1. Compute Azure VM is
     * Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer.
     * 
     * @return the containerType value.
     */
    @Override
    public ProtectableContainerType containerType() {
        return this.containerType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withVirtualMachineVersion(String virtualMachineVersion) {
        super.withVirtualMachineVersion(virtualMachineVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withResourceGroup(String resourceGroup) {
        super.withResourceGroup(resourceGroup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("friendlyName", friendlyName());
        jsonWriter.writeStringField("backupManagementType",
            backupManagementType() == null ? null : backupManagementType().toString());
        jsonWriter.writeStringField("registrationStatus", registrationStatus());
        jsonWriter.writeStringField("healthStatus", healthStatus());
        jsonWriter.writeStringField("protectableObjectType", protectableObjectType());
        jsonWriter.writeStringField("virtualMachineId", virtualMachineId());
        jsonWriter.writeStringField("virtualMachineVersion", virtualMachineVersion());
        jsonWriter.writeStringField("resourceGroup", resourceGroup());
        jsonWriter.writeStringField("containerType", this.containerType == null ? null : this.containerType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureIaaSClassicComputeVMContainer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureIaaSClassicComputeVMContainer if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureIaaSClassicComputeVMContainer.
     */
    public static AzureIaaSClassicComputeVMContainer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureIaaSClassicComputeVMContainer deserializedAzureIaaSClassicComputeVMContainer
                = new AzureIaaSClassicComputeVMContainer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("friendlyName".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withFriendlyName(reader.getString());
                } else if ("backupManagementType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer
                        .withBackupManagementType(BackupManagementType.fromString(reader.getString()));
                } else if ("registrationStatus".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withRegistrationStatus(reader.getString());
                } else if ("healthStatus".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withHealthStatus(reader.getString());
                } else if ("protectableObjectType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withProtectableObjectType(reader.getString());
                } else if ("virtualMachineId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withVirtualMachineId(reader.getString());
                } else if ("virtualMachineVersion".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withVirtualMachineVersion(reader.getString());
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.withResourceGroup(reader.getString());
                } else if ("containerType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMContainer.containerType
                        = ProtectableContainerType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureIaaSClassicComputeVMContainer;
        });
    }
}
