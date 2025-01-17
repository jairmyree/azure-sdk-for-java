// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The MongoDBDatabaseGetPropertiesOptions model.
 */
@Fluent
public final class MongoDBDatabaseGetPropertiesOptions extends OptionsResource {
    /**
     * Creates an instance of MongoDBDatabaseGetPropertiesOptions class.
     */
    public MongoDBDatabaseGetPropertiesOptions() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBDatabaseGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBDatabaseGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (autoscaleSettings() != null) {
            autoscaleSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("throughput", throughput());
        jsonWriter.writeJsonField("autoscaleSettings", autoscaleSettings());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoDBDatabaseGetPropertiesOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDBDatabaseGetPropertiesOptions if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoDBDatabaseGetPropertiesOptions.
     */
    public static MongoDBDatabaseGetPropertiesOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDBDatabaseGetPropertiesOptions deserializedMongoDBDatabaseGetPropertiesOptions
                = new MongoDBDatabaseGetPropertiesOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("throughput".equals(fieldName)) {
                    deserializedMongoDBDatabaseGetPropertiesOptions
                        .withThroughput(reader.getNullable(JsonReader::getInt));
                } else if ("autoscaleSettings".equals(fieldName)) {
                    deserializedMongoDBDatabaseGetPropertiesOptions
                        .withAutoscaleSettings(AutoscaleSettings.fromJson(reader));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoDBDatabaseGetPropertiesOptions;
        });
    }
}
