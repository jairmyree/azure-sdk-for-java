// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.timeseriesinsights.models.IngressStartAtType;
import com.azure.resourcemanager.timeseriesinsights.models.IoTHubEventSourceCommonProperties;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestamp;
import com.azure.resourcemanager.timeseriesinsights.models.ProvisioningState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties of the IoTHub event source that are required on create or update requests.
 */
@Fluent
public final class IoTHubEventSourceCreationProperties extends IoTHubEventSourceCommonProperties {
    /*
     * The value of the Shared Access Policy key that grants the Time Series Insights service read access to the iot
     * hub. This property is not shown in event source responses.
     */
    private String sharedAccessKey;

    /*
     * An object that contains the details about the starting point in time to ingest events.
     */
    private IngressStartAtProperties innerIngressStartAt;

    /*
     * The time the resource was created.
     */
    private OffsetDateTime creationTime;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of IoTHubEventSourceCreationProperties class.
     */
    public IoTHubEventSourceCreationProperties() {
    }

    /**
     * Get the sharedAccessKey property: The value of the Shared Access Policy key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event source responses.
     * 
     * @return the sharedAccessKey value.
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the sharedAccessKey property: The value of the Shared Access Policy key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event source responses.
     * 
     * @param sharedAccessKey the sharedAccessKey value to set.
     * @return the IoTHubEventSourceCreationProperties object itself.
     */
    public IoTHubEventSourceCreationProperties withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

    /**
     * Get the innerIngressStartAt property: An object that contains the details about the starting point in time to
     * ingest events.
     * 
     * @return the innerIngressStartAt value.
     */
    private IngressStartAtProperties innerIngressStartAt() {
        return this.innerIngressStartAt;
    }

    /**
     * Get the creationTime property: The time the resource was created.
     * 
     * @return the creationTime value.
     */
    @Override
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    @Override
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withIotHubName(String iotHubName) {
        super.withIotHubName(iotHubName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withConsumerGroupName(String consumerGroupName) {
        super.withConsumerGroupName(consumerGroupName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withKeyName(String keyName) {
        super.withKeyName(keyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withEventSourceResourceId(String eventSourceResourceId) {
        super.withEventSourceResourceId(eventSourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withTimestampPropertyName(String timestampPropertyName) {
        super.withTimestampPropertyName(timestampPropertyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoTHubEventSourceCreationProperties withLocalTimestamp(LocalTimestamp localTimestamp) {
        super.withLocalTimestamp(localTimestamp);
        return this;
    }

    /**
     * Get the type property: The type of the ingressStartAt, It can be "EarliestAvailable", "EventSourceCreationTime",
     * "CustomEnqueuedTime".
     * 
     * @return the type value.
     */
    public IngressStartAtType type() {
        return this.innerIngressStartAt() == null ? null : this.innerIngressStartAt().type();
    }

    /**
     * Set the type property: The type of the ingressStartAt, It can be "EarliestAvailable", "EventSourceCreationTime",
     * "CustomEnqueuedTime".
     * 
     * @param type the type value to set.
     * @return the IoTHubEventSourceCreationProperties object itself.
     */
    public IoTHubEventSourceCreationProperties withType(IngressStartAtType type) {
        if (this.innerIngressStartAt() == null) {
            this.innerIngressStartAt = new IngressStartAtProperties();
        }
        this.innerIngressStartAt().withType(type);
        return this;
    }

    /**
     * Get the time property: ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the
     * date and time that will be the starting point for Events to be consumed.
     * 
     * @return the time value.
     */
    public String time() {
        return this.innerIngressStartAt() == null ? null : this.innerIngressStartAt().time();
    }

    /**
     * Set the time property: ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the
     * date and time that will be the starting point for Events to be consumed.
     * 
     * @param time the time value to set.
     * @return the IoTHubEventSourceCreationProperties object itself.
     */
    public IoTHubEventSourceCreationProperties withTime(String time) {
        if (this.innerIngressStartAt() == null) {
            this.innerIngressStartAt = new IngressStartAtProperties();
        }
        this.innerIngressStartAt().withTime(time);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (sharedAccessKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sharedAccessKey in model IoTHubEventSourceCreationProperties"));
        }
        if (localTimestamp() != null) {
            localTimestamp().validate();
        }
        if (innerIngressStartAt() != null) {
            innerIngressStartAt().validate();
        }
        if (eventSourceResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property eventSourceResourceId in model IoTHubEventSourceCreationProperties"));
        }
        if (iotHubName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property iotHubName in model IoTHubEventSourceCreationProperties"));
        }
        if (consumerGroupName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property consumerGroupName in model IoTHubEventSourceCreationProperties"));
        }
        if (keyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyName in model IoTHubEventSourceCreationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IoTHubEventSourceCreationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("eventSourceResourceId", eventSourceResourceId());
        jsonWriter.writeStringField("iotHubName", iotHubName());
        jsonWriter.writeStringField("consumerGroupName", consumerGroupName());
        jsonWriter.writeStringField("keyName", keyName());
        jsonWriter.writeStringField("timestampPropertyName", timestampPropertyName());
        jsonWriter.writeJsonField("localTimestamp", localTimestamp());
        jsonWriter.writeJsonField("ingressStartAt", innerIngressStartAt());
        jsonWriter.writeStringField("sharedAccessKey", this.sharedAccessKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IoTHubEventSourceCreationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IoTHubEventSourceCreationProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IoTHubEventSourceCreationProperties.
     */
    public static IoTHubEventSourceCreationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IoTHubEventSourceCreationProperties deserializedIoTHubEventSourceCreationProperties
                = new IoTHubEventSourceCreationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("eventSourceResourceId".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withEventSourceResourceId(reader.getString());
                } else if ("iotHubName".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withIotHubName(reader.getString());
                } else if ("consumerGroupName".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withConsumerGroupName(reader.getString());
                } else if ("keyName".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withKeyName(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("creationTime".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("timestampPropertyName".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withTimestampPropertyName(reader.getString());
                } else if ("localTimestamp".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.withLocalTimestamp(LocalTimestamp.fromJson(reader));
                } else if ("ingressStartAt".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.innerIngressStartAt
                        = IngressStartAtProperties.fromJson(reader);
                } else if ("sharedAccessKey".equals(fieldName)) {
                    deserializedIoTHubEventSourceCreationProperties.sharedAccessKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIoTHubEventSourceCreationProperties;
        });
    }
}
