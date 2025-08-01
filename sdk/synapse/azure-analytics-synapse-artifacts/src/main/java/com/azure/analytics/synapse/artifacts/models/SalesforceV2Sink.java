// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Salesforce V2 sink.
 */
@Fluent
public final class SalesforceV2Sink extends CopySink {
    /*
     * Copy sink type.
     */
    @Generated
    private String type = "SalesforceV2Sink";

    /*
     * The write behavior for the operation. Default is Insert.
     */
    @Generated
    private SalesforceV2SinkWriteBehavior writeBehavior;

    /*
     * The name of the external ID field for upsert operation. Default value is 'Id' column. Type: string (or Expression
     * with resultType string).
     */
    @Generated
    private Object externalIdFieldName;

    /*
     * The flag indicating whether or not to ignore null values from input dataset (except key fields) during write
     * operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object
     * unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus
     * ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL
     * value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     */
    @Generated
    private Object ignoreNullValues;

    /**
     * Creates an instance of SalesforceV2Sink class.
     */
    @Generated
    public SalesforceV2Sink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the writeBehavior property: The write behavior for the operation. Default is Insert.
     * 
     * @return the writeBehavior value.
     */
    @Generated
    public SalesforceV2SinkWriteBehavior getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: The write behavior for the operation. Default is Insert.
     * 
     * @param writeBehavior the writeBehavior value to set.
     * @return the SalesforceV2Sink object itself.
     */
    @Generated
    public SalesforceV2Sink setWriteBehavior(SalesforceV2SinkWriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the externalIdFieldName property: The name of the external ID field for upsert operation. Default value is
     * 'Id' column. Type: string (or Expression with resultType string).
     * 
     * @return the externalIdFieldName value.
     */
    @Generated
    public Object getExternalIdFieldName() {
        return this.externalIdFieldName;
    }

    /**
     * Set the externalIdFieldName property: The name of the external ID field for upsert operation. Default value is
     * 'Id' column. Type: string (or Expression with resultType string).
     * 
     * @param externalIdFieldName the externalIdFieldName value to set.
     * @return the SalesforceV2Sink object itself.
     */
    @Generated
    public SalesforceV2Sink setExternalIdFieldName(Object externalIdFieldName) {
        this.externalIdFieldName = externalIdFieldName;
        return this;
    }

    /**
     * Get the ignoreNullValues property: The flag indicating whether or not to ignore null values from input dataset
     * (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave
     * the data in the destination object unchanged when doing upsert/update operation and insert defined default value
     * when doing insert operation, versus ADF will update the data in the destination object to NULL when doing
     * upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @return the ignoreNullValues value.
     */
    @Generated
    public Object getIgnoreNullValues() {
        return this.ignoreNullValues;
    }

    /**
     * Set the ignoreNullValues property: The flag indicating whether or not to ignore null values from input dataset
     * (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave
     * the data in the destination object unchanged when doing upsert/update operation and insert defined default value
     * when doing insert operation, versus ADF will update the data in the destination object to NULL when doing
     * upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @param ignoreNullValues the ignoreNullValues value to set.
     * @return the SalesforceV2Sink object itself.
     */
    @Generated
    public SalesforceV2Sink setIgnoreNullValues(Object ignoreNullValues) {
        this.ignoreNullValues = ignoreNullValues;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public SalesforceV2Sink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public SalesforceV2Sink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public SalesforceV2Sink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public SalesforceV2Sink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public SalesforceV2Sink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getWriteBatchSize() != null) {
            jsonWriter.writeUntypedField("writeBatchSize", getWriteBatchSize());
        }
        if (getWriteBatchTimeout() != null) {
            jsonWriter.writeUntypedField("writeBatchTimeout", getWriteBatchTimeout());
        }
        if (getSinkRetryCount() != null) {
            jsonWriter.writeUntypedField("sinkRetryCount", getSinkRetryCount());
        }
        if (getSinkRetryWait() != null) {
            jsonWriter.writeUntypedField("sinkRetryWait", getSinkRetryWait());
        }
        if (getMaxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        }
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("writeBehavior", this.writeBehavior == null ? null : this.writeBehavior.toString());
        if (this.externalIdFieldName != null) {
            jsonWriter.writeUntypedField("externalIdFieldName", this.externalIdFieldName);
        }
        if (this.ignoreNullValues != null) {
            jsonWriter.writeUntypedField("ignoreNullValues", this.ignoreNullValues);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SalesforceV2Sink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SalesforceV2Sink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SalesforceV2Sink.
     */
    @Generated
    public static SalesforceV2Sink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SalesforceV2Sink deserializedSalesforceV2Sink = new SalesforceV2Sink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("writeBatchSize".equals(fieldName)) {
                    deserializedSalesforceV2Sink.setWriteBatchSize(reader.readUntyped());
                } else if ("writeBatchTimeout".equals(fieldName)) {
                    deserializedSalesforceV2Sink.setWriteBatchTimeout(reader.readUntyped());
                } else if ("sinkRetryCount".equals(fieldName)) {
                    deserializedSalesforceV2Sink.setSinkRetryCount(reader.readUntyped());
                } else if ("sinkRetryWait".equals(fieldName)) {
                    deserializedSalesforceV2Sink.setSinkRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSalesforceV2Sink.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSalesforceV2Sink.type = reader.getString();
                } else if ("writeBehavior".equals(fieldName)) {
                    deserializedSalesforceV2Sink.writeBehavior
                        = SalesforceV2SinkWriteBehavior.fromString(reader.getString());
                } else if ("externalIdFieldName".equals(fieldName)) {
                    deserializedSalesforceV2Sink.externalIdFieldName = reader.readUntyped();
                } else if ("ignoreNullValues".equals(fieldName)) {
                    deserializedSalesforceV2Sink.ignoreNullValues = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSalesforceV2Sink.setAdditionalProperties(additionalProperties);

            return deserializedSalesforceV2Sink;
        });
    }
}
