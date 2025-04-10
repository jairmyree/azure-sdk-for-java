// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * IaaS VM workload specific backup copy.
 */
@Fluent
public final class IaasVMRecoveryPoint extends RecoveryPoint {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of
     * types.
     */
    private String objectType = "IaasVMRecoveryPoint";

    /*
     * Type of the backup copy.
     */
    private String recoveryPointType;

    /*
     * Time at which this backup copy was created.
     */
    private OffsetDateTime recoveryPointTime;

    /*
     * Additional information associated with this backup copy.
     */
    private String recoveryPointAdditionalInfo;

    /*
     * Storage type of the VM whose backup copy is created.
     */
    private String sourceVMStorageType;

    /*
     * Identifies whether the VM was encrypted when the backup copy is created.
     */
    private Boolean isSourceVMEncrypted;

    /*
     * Required details for recovering an encrypted VM. Applicable only when IsSourceVMEncrypted is true.
     */
    private KeyAndSecretDetails keyAndSecret;

    /*
     * Is the session to recover items from this backup copy still active.
     */
    private Boolean isInstantIlrSessionActive;

    /*
     * Recovery point tier information.
     */
    private List<RecoveryPointTierInformationV2> recoveryPointTierDetails;

    /*
     * Whether VM is with Managed Disks
     */
    private Boolean isManagedVirtualMachine;

    /*
     * Virtual Machine Size
     */
    private String virtualMachineSize;

    /*
     * Original Storage Account Option
     */
    private Boolean originalStorageAccountOption;

    /*
     * OS type
     */
    private String osType;

    /*
     * Disk configuration
     */
    private RecoveryPointDiskConfiguration recoveryPointDiskConfiguration;

    /*
     * Identifies the zone of the VM at the time of backup. Applicable only for zone-pinned Vms
     */
    private List<String> zones;

    /*
     * Eligibility of RP to be moved to another tier
     */
    private Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo;

    /*
     * Security Type of the Disk
     */
    private String securityType;

    /*
     * Properties of Recovery Point
     */
    private RecoveryPointProperties recoveryPointProperties;

    /*
     * This flag denotes if any of the disks in the VM are using Private access network setting
     */
    private Boolean isPrivateAccessEnabledOnAnyDisk;

    /*
     * Extended location of the VM recovery point,
     * should be null if VM is in public cloud
     */
    private ExtendedLocation extendedLocation;

    /**
     * Creates an instance of IaasVMRecoveryPoint class.
     */
    public IaasVMRecoveryPoint() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the recoveryPointType property: Type of the backup copy.
     * 
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: Type of the backup copy.
     * 
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the recoveryPointTime property: Time at which this backup copy was created.
     * 
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recoveryPointTime property: Time at which this backup copy was created.
     * 
     * @param recoveryPointTime the recoveryPointTime value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointTime(OffsetDateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get the recoveryPointAdditionalInfo property: Additional information associated with this backup copy.
     * 
     * @return the recoveryPointAdditionalInfo value.
     */
    public String recoveryPointAdditionalInfo() {
        return this.recoveryPointAdditionalInfo;
    }

    /**
     * Set the recoveryPointAdditionalInfo property: Additional information associated with this backup copy.
     * 
     * @param recoveryPointAdditionalInfo the recoveryPointAdditionalInfo value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointAdditionalInfo(String recoveryPointAdditionalInfo) {
        this.recoveryPointAdditionalInfo = recoveryPointAdditionalInfo;
        return this;
    }

    /**
     * Get the sourceVMStorageType property: Storage type of the VM whose backup copy is created.
     * 
     * @return the sourceVMStorageType value.
     */
    public String sourceVMStorageType() {
        return this.sourceVMStorageType;
    }

    /**
     * Set the sourceVMStorageType property: Storage type of the VM whose backup copy is created.
     * 
     * @param sourceVMStorageType the sourceVMStorageType value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withSourceVMStorageType(String sourceVMStorageType) {
        this.sourceVMStorageType = sourceVMStorageType;
        return this;
    }

    /**
     * Get the isSourceVMEncrypted property: Identifies whether the VM was encrypted when the backup copy is created.
     * 
     * @return the isSourceVMEncrypted value.
     */
    public Boolean isSourceVMEncrypted() {
        return this.isSourceVMEncrypted;
    }

    /**
     * Set the isSourceVMEncrypted property: Identifies whether the VM was encrypted when the backup copy is created.
     * 
     * @param isSourceVMEncrypted the isSourceVMEncrypted value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsSourceVMEncrypted(Boolean isSourceVMEncrypted) {
        this.isSourceVMEncrypted = isSourceVMEncrypted;
        return this;
    }

    /**
     * Get the keyAndSecret property: Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     * 
     * @return the keyAndSecret value.
     */
    public KeyAndSecretDetails keyAndSecret() {
        return this.keyAndSecret;
    }

    /**
     * Set the keyAndSecret property: Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     * 
     * @param keyAndSecret the keyAndSecret value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withKeyAndSecret(KeyAndSecretDetails keyAndSecret) {
        this.keyAndSecret = keyAndSecret;
        return this;
    }

    /**
     * Get the isInstantIlrSessionActive property: Is the session to recover items from this backup copy still active.
     * 
     * @return the isInstantIlrSessionActive value.
     */
    public Boolean isInstantIlrSessionActive() {
        return this.isInstantIlrSessionActive;
    }

    /**
     * Set the isInstantIlrSessionActive property: Is the session to recover items from this backup copy still active.
     * 
     * @param isInstantIlrSessionActive the isInstantIlrSessionActive value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsInstantIlrSessionActive(Boolean isInstantIlrSessionActive) {
        this.isInstantIlrSessionActive = isInstantIlrSessionActive;
        return this;
    }

    /**
     * Get the recoveryPointTierDetails property: Recovery point tier information.
     * 
     * @return the recoveryPointTierDetails value.
     */
    public List<RecoveryPointTierInformationV2> recoveryPointTierDetails() {
        return this.recoveryPointTierDetails;
    }

    /**
     * Set the recoveryPointTierDetails property: Recovery point tier information.
     * 
     * @param recoveryPointTierDetails the recoveryPointTierDetails value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint
        withRecoveryPointTierDetails(List<RecoveryPointTierInformationV2> recoveryPointTierDetails) {
        this.recoveryPointTierDetails = recoveryPointTierDetails;
        return this;
    }

    /**
     * Get the isManagedVirtualMachine property: Whether VM is with Managed Disks.
     * 
     * @return the isManagedVirtualMachine value.
     */
    public Boolean isManagedVirtualMachine() {
        return this.isManagedVirtualMachine;
    }

    /**
     * Set the isManagedVirtualMachine property: Whether VM is with Managed Disks.
     * 
     * @param isManagedVirtualMachine the isManagedVirtualMachine value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsManagedVirtualMachine(Boolean isManagedVirtualMachine) {
        this.isManagedVirtualMachine = isManagedVirtualMachine;
        return this;
    }

    /**
     * Get the virtualMachineSize property: Virtual Machine Size.
     * 
     * @return the virtualMachineSize value.
     */
    public String virtualMachineSize() {
        return this.virtualMachineSize;
    }

    /**
     * Set the virtualMachineSize property: Virtual Machine Size.
     * 
     * @param virtualMachineSize the virtualMachineSize value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withVirtualMachineSize(String virtualMachineSize) {
        this.virtualMachineSize = virtualMachineSize;
        return this;
    }

    /**
     * Get the originalStorageAccountOption property: Original Storage Account Option.
     * 
     * @return the originalStorageAccountOption value.
     */
    public Boolean originalStorageAccountOption() {
        return this.originalStorageAccountOption;
    }

    /**
     * Set the originalStorageAccountOption property: Original Storage Account Option.
     * 
     * @param originalStorageAccountOption the originalStorageAccountOption value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withOriginalStorageAccountOption(Boolean originalStorageAccountOption) {
        this.originalStorageAccountOption = originalStorageAccountOption;
        return this;
    }

    /**
     * Get the osType property: OS type.
     * 
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OS type.
     * 
     * @param osType the osType value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the recoveryPointDiskConfiguration property: Disk configuration.
     * 
     * @return the recoveryPointDiskConfiguration value.
     */
    public RecoveryPointDiskConfiguration recoveryPointDiskConfiguration() {
        return this.recoveryPointDiskConfiguration;
    }

    /**
     * Set the recoveryPointDiskConfiguration property: Disk configuration.
     * 
     * @param recoveryPointDiskConfiguration the recoveryPointDiskConfiguration value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint
        withRecoveryPointDiskConfiguration(RecoveryPointDiskConfiguration recoveryPointDiskConfiguration) {
        this.recoveryPointDiskConfiguration = recoveryPointDiskConfiguration;
        return this;
    }

    /**
     * Get the zones property: Identifies the zone of the VM at the time of backup. Applicable only for zone-pinned Vms.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Identifies the zone of the VM at the time of backup. Applicable only for zone-pinned Vms.
     * 
     * @param zones the zones value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     * 
     * @return the recoveryPointMoveReadinessInfo value.
     */
    public Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo() {
        return this.recoveryPointMoveReadinessInfo;
    }

    /**
     * Set the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     * 
     * @param recoveryPointMoveReadinessInfo the recoveryPointMoveReadinessInfo value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint
        withRecoveryPointMoveReadinessInfo(Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        this.recoveryPointMoveReadinessInfo = recoveryPointMoveReadinessInfo;
        return this;
    }

    /**
     * Get the securityType property: Security Type of the Disk.
     * 
     * @return the securityType value.
     */
    public String securityType() {
        return this.securityType;
    }

    /**
     * Set the securityType property: Security Type of the Disk.
     * 
     * @param securityType the securityType value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * Get the recoveryPointProperties property: Properties of Recovery Point.
     * 
     * @return the recoveryPointProperties value.
     */
    public RecoveryPointProperties recoveryPointProperties() {
        return this.recoveryPointProperties;
    }

    /**
     * Set the recoveryPointProperties property: Properties of Recovery Point.
     * 
     * @param recoveryPointProperties the recoveryPointProperties value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointProperties(RecoveryPointProperties recoveryPointProperties) {
        this.recoveryPointProperties = recoveryPointProperties;
        return this;
    }

    /**
     * Get the isPrivateAccessEnabledOnAnyDisk property: This flag denotes if any of the disks in the VM are using
     * Private access network setting.
     * 
     * @return the isPrivateAccessEnabledOnAnyDisk value.
     */
    public Boolean isPrivateAccessEnabledOnAnyDisk() {
        return this.isPrivateAccessEnabledOnAnyDisk;
    }

    /**
     * Set the isPrivateAccessEnabledOnAnyDisk property: This flag denotes if any of the disks in the VM are using
     * Private access network setting.
     * 
     * @param isPrivateAccessEnabledOnAnyDisk the isPrivateAccessEnabledOnAnyDisk value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsPrivateAccessEnabledOnAnyDisk(Boolean isPrivateAccessEnabledOnAnyDisk) {
        this.isPrivateAccessEnabledOnAnyDisk = isPrivateAccessEnabledOnAnyDisk;
        return this;
    }

    /**
     * Get the extendedLocation property: Extended location of the VM recovery point,
     * should be null if VM is in public cloud.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended location of the VM recovery point,
     * should be null if VM is in public cloud.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (keyAndSecret() != null) {
            keyAndSecret().validate();
        }
        if (recoveryPointTierDetails() != null) {
            recoveryPointTierDetails().forEach(e -> e.validate());
        }
        if (recoveryPointDiskConfiguration() != null) {
            recoveryPointDiskConfiguration().validate();
        }
        if (recoveryPointMoveReadinessInfo() != null) {
            recoveryPointMoveReadinessInfo().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (recoveryPointProperties() != null) {
            recoveryPointProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeStringField("recoveryPointType", this.recoveryPointType);
        jsonWriter.writeStringField("recoveryPointTime",
            this.recoveryPointTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.recoveryPointTime));
        jsonWriter.writeStringField("recoveryPointAdditionalInfo", this.recoveryPointAdditionalInfo);
        jsonWriter.writeStringField("sourceVMStorageType", this.sourceVMStorageType);
        jsonWriter.writeBooleanField("isSourceVMEncrypted", this.isSourceVMEncrypted);
        jsonWriter.writeJsonField("keyAndSecret", this.keyAndSecret);
        jsonWriter.writeBooleanField("isInstantIlrSessionActive", this.isInstantIlrSessionActive);
        jsonWriter.writeArrayField("recoveryPointTierDetails", this.recoveryPointTierDetails,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("isManagedVirtualMachine", this.isManagedVirtualMachine);
        jsonWriter.writeStringField("virtualMachineSize", this.virtualMachineSize);
        jsonWriter.writeBooleanField("originalStorageAccountOption", this.originalStorageAccountOption);
        jsonWriter.writeStringField("osType", this.osType);
        jsonWriter.writeJsonField("recoveryPointDiskConfiguration", this.recoveryPointDiskConfiguration);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("recoveryPointMoveReadinessInfo", this.recoveryPointMoveReadinessInfo,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("securityType", this.securityType);
        jsonWriter.writeJsonField("recoveryPointProperties", this.recoveryPointProperties);
        jsonWriter.writeBooleanField("isPrivateAccessEnabledOnAnyDisk", this.isPrivateAccessEnabledOnAnyDisk);
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IaasVMRecoveryPoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IaasVMRecoveryPoint if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IaasVMRecoveryPoint.
     */
    public static IaasVMRecoveryPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IaasVMRecoveryPoint deserializedIaasVMRecoveryPoint = new IaasVMRecoveryPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.objectType = reader.getString();
                } else if ("recoveryPointType".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.recoveryPointType = reader.getString();
                } else if ("recoveryPointTime".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.recoveryPointTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("recoveryPointAdditionalInfo".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.recoveryPointAdditionalInfo = reader.getString();
                } else if ("sourceVMStorageType".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.sourceVMStorageType = reader.getString();
                } else if ("isSourceVMEncrypted".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.isSourceVMEncrypted = reader.getNullable(JsonReader::getBoolean);
                } else if ("keyAndSecret".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.keyAndSecret = KeyAndSecretDetails.fromJson(reader);
                } else if ("isInstantIlrSessionActive".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.isInstantIlrSessionActive
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("recoveryPointTierDetails".equals(fieldName)) {
                    List<RecoveryPointTierInformationV2> recoveryPointTierDetails
                        = reader.readArray(reader1 -> RecoveryPointTierInformationV2.fromJson(reader1));
                    deserializedIaasVMRecoveryPoint.recoveryPointTierDetails = recoveryPointTierDetails;
                } else if ("isManagedVirtualMachine".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.isManagedVirtualMachine
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("virtualMachineSize".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.virtualMachineSize = reader.getString();
                } else if ("originalStorageAccountOption".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.originalStorageAccountOption
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("osType".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.osType = reader.getString();
                } else if ("recoveryPointDiskConfiguration".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.recoveryPointDiskConfiguration
                        = RecoveryPointDiskConfiguration.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedIaasVMRecoveryPoint.zones = zones;
                } else if ("recoveryPointMoveReadinessInfo".equals(fieldName)) {
                    Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo
                        = reader.readMap(reader1 -> RecoveryPointMoveReadinessInfo.fromJson(reader1));
                    deserializedIaasVMRecoveryPoint.recoveryPointMoveReadinessInfo = recoveryPointMoveReadinessInfo;
                } else if ("securityType".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.securityType = reader.getString();
                } else if ("recoveryPointProperties".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.recoveryPointProperties = RecoveryPointProperties.fromJson(reader);
                } else if ("isPrivateAccessEnabledOnAnyDisk".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.isPrivateAccessEnabledOnAnyDisk
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedIaasVMRecoveryPoint.extendedLocation = ExtendedLocation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIaasVMRecoveryPoint;
        });
    }
}
