// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Target Location details for optional copy of backups.
 */
@Fluent
public final class TargetLocation implements JsonSerializable<TargetLocation> {
    /*
     * Resource Id of the storage account copying backups.
     */
    private String storageAccountResourceId;

    /*
     * Storage Account Key.
     */
    private String accountKey;

    /**
     * Creates an instance of TargetLocation class.
     */
    public TargetLocation() {
    }

    /**
     * Get the storageAccountResourceId property: Resource Id of the storage account copying backups.
     * 
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set the storageAccountResourceId property: Resource Id of the storage account copying backups.
     * 
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the TargetLocation object itself.
     */
    public TargetLocation withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get the accountKey property: Storage Account Key.
     * 
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Storage Account Key.
     * 
     * @param accountKey the accountKey value to set.
     * @return the TargetLocation object itself.
     */
    public TargetLocation withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageAccountResourceId", this.storageAccountResourceId);
        jsonWriter.writeStringField("accountKey", this.accountKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TargetLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TargetLocation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TargetLocation.
     */
    public static TargetLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TargetLocation deserializedTargetLocation = new TargetLocation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageAccountResourceId".equals(fieldName)) {
                    deserializedTargetLocation.storageAccountResourceId = reader.getString();
                } else if ("accountKey".equals(fieldName)) {
                    deserializedTargetLocation.accountKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTargetLocation;
        });
    }
}
