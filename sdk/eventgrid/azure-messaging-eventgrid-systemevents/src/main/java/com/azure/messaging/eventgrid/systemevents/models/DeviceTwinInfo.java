// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Information about the device twin, which is the cloud representation of application device metadata.
 */
@Immutable
public final class DeviceTwinInfo implements JsonSerializable<DeviceTwinInfo> {

    /*
     * Authentication type used for this device: either SAS, SelfSigned, or CertificateAuthority.
     */
    @Generated
    private final String authenticationType;

    /*
     * Count of cloud to device messages sent to this device.
     */
    @Generated
    private final double cloudToDeviceMessageCount;

    /*
     * Whether the device is connected or disconnected.
     */
    @Generated
    private final String connectionState;

    /*
     * The unique identifier of the device twin.
     */
    @Generated
    private final String deviceId;

    /*
     * A piece of information that describes the content of the device twin. Each etag is guaranteed to be unique per
     * device twin.
     */
    @Generated
    private final String etag;

    /*
     * The ISO8601 timestamp of the last activity.
     */
    @Generated
    private final String lastActivityTime;

    /*
     * Properties JSON element.
     */
    @Generated
    private final DeviceTwinInfoProperties properties;

    /*
     * Whether the device twin is enabled or disabled.
     */
    @Generated
    private final String status;

    /*
     * The ISO8601 timestamp of the last device twin status update.
     */
    @Generated
    private final String statusUpdateTime;

    /*
     * An integer that is incremented by one each time the device twin is updated.
     */
    @Generated
    private final double version;

    /*
     * The thumbprint is a unique value for the x509 certificate, commonly used to find a particular certificate in a
     * certificate store. The thumbprint is dynamically generated using the SHA1 algorithm, and does not physically
     * exist in the certificate.
     */
    @Generated
    private final DeviceTwinInfoX509Thumbprint x509Thumbprint;

    /**
     * Creates an instance of DeviceTwinInfo class.
     *
     * @param authenticationType the authenticationType value to set.
     * @param cloudToDeviceMessageCount the cloudToDeviceMessageCount value to set.
     * @param connectionState the connectionState value to set.
     * @param deviceId the deviceId value to set.
     * @param etag the etag value to set.
     * @param lastActivityTime the lastActivityTime value to set.
     * @param properties the properties value to set.
     * @param status the status value to set.
     * @param statusUpdateTime the statusUpdateTime value to set.
     * @param version the version value to set.
     * @param x509Thumbprint the x509Thumbprint value to set.
     */
    @Generated
    private DeviceTwinInfo(String authenticationType, double cloudToDeviceMessageCount, String connectionState,
        String deviceId, String etag, String lastActivityTime, DeviceTwinInfoProperties properties, String status,
        String statusUpdateTime, double version, DeviceTwinInfoX509Thumbprint x509Thumbprint) {
        this.authenticationType = authenticationType;
        this.cloudToDeviceMessageCount = cloudToDeviceMessageCount;
        this.connectionState = connectionState;
        this.deviceId = deviceId;
        this.etag = etag;
        this.lastActivityTime = lastActivityTime;
        this.properties = properties;
        this.status = status;
        this.statusUpdateTime = statusUpdateTime;
        this.version = version;
        this.x509Thumbprint = x509Thumbprint;
    }

    /**
     * Get the authenticationType property: Authentication type used for this device: either SAS, SelfSigned, or
     * CertificateAuthority.
     *
     * @return the authenticationType value.
     */
    @Generated
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Get the cloudToDeviceMessageCount property: Count of cloud to device messages sent to this device.
     *
     * @return the cloudToDeviceMessageCount value.
     */
    @Generated
    public double getCloudToDeviceMessageCount() {
        return this.cloudToDeviceMessageCount;
    }

    /**
     * Get the connectionState property: Whether the device is connected or disconnected.
     *
     * @return the connectionState value.
     */
    @Generated
    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * Get the deviceId property: The unique identifier of the device twin.
     *
     * @return the deviceId value.
     */
    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Get the etag property: A piece of information that describes the content of the device twin. Each etag is
     * guaranteed to be unique per device twin.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the lastActivityTime property: The ISO8601 timestamp of the last activity.
     *
     * @return the lastActivityTime value.
     */
    @Generated
    public OffsetDateTime getLastActivityTime() {
        return lastActivityTime == null ? null : OffsetDateTime.parse(lastActivityTime);
    }

    /**
     * Get the properties property: Properties JSON element.
     *
     * @return the properties value.
     */
    @Generated
    public DeviceTwinInfoProperties getProperties() {
        return this.properties;
    }

    /**
     * Get the status property: Whether the device twin is enabled or disabled.
     *
     * @return the status value.
     */
    @Generated
    public String getStatus() {
        return this.status;
    }

    /**
     * Get the statusUpdateTime property: The ISO8601 timestamp of the last device twin status update.
     *
     * @return the statusUpdateTime value.
     */
    @Generated
    public OffsetDateTime getStatusUpdateTime() {
        return statusUpdateTime == null ? null : OffsetDateTime.parse(statusUpdateTime);
    }

    /**
     * Get the version property: An integer that is incremented by one each time the device twin is updated.
     *
     * @return the version value.
     */
    @Generated
    public double getVersion() {
        return this.version;
    }

    /**
     * Get the x509Thumbprint property: The thumbprint is a unique value for the x509 certificate, commonly used to find
     * a particular certificate in a certificate store. The thumbprint is dynamically generated using the SHA1
     * algorithm, and does not physically exist in the certificate.
     *
     * @return the x509Thumbprint value.
     */
    @Generated
    public DeviceTwinInfoX509Thumbprint getX509Thumbprint() {
        return this.x509Thumbprint;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authenticationType", this.authenticationType);
        jsonWriter.writeDoubleField("cloudToDeviceMessageCount", this.cloudToDeviceMessageCount);
        jsonWriter.writeStringField("connectionState", this.connectionState);
        jsonWriter.writeStringField("deviceId", this.deviceId);
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeStringField("lastActivityTime", this.lastActivityTime);
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("statusUpdateTime", this.statusUpdateTime);
        jsonWriter.writeDoubleField("version", this.version);
        jsonWriter.writeJsonField("x509Thumbprint", this.x509Thumbprint);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeviceTwinInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeviceTwinInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeviceTwinInfo.
     */
    @Generated
    public static DeviceTwinInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String authenticationType = null;
            double cloudToDeviceMessageCount = 0.0;
            String connectionState = null;
            String deviceId = null;
            String etag = null;
            String lastActivityTime = null;
            DeviceTwinInfoProperties properties = null;
            String status = null;
            String statusUpdateTime = null;
            double version = 0.0;
            DeviceTwinInfoX509Thumbprint x509Thumbprint = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("authenticationType".equals(fieldName)) {
                    authenticationType = reader.getString();
                } else if ("cloudToDeviceMessageCount".equals(fieldName)) {
                    cloudToDeviceMessageCount = reader.getDouble();
                } else if ("connectionState".equals(fieldName)) {
                    connectionState = reader.getString();
                } else if ("deviceId".equals(fieldName)) {
                    deviceId = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    etag = reader.getString();
                } else if ("lastActivityTime".equals(fieldName)) {
                    lastActivityTime = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    properties = DeviceTwinInfoProperties.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    status = reader.getString();
                } else if ("statusUpdateTime".equals(fieldName)) {
                    statusUpdateTime = reader.getString();
                } else if ("version".equals(fieldName)) {
                    version = reader.getDouble();
                } else if ("x509Thumbprint".equals(fieldName)) {
                    x509Thumbprint = DeviceTwinInfoX509Thumbprint.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new DeviceTwinInfo(authenticationType, cloudToDeviceMessageCount, connectionState, deviceId, etag,
                lastActivityTime, properties, status, statusUpdateTime, version, x509Thumbprint);
        });
    }
}
