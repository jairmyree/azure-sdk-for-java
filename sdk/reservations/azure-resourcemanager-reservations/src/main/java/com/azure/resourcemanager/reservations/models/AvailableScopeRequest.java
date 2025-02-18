// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Available scope.
 */
@Fluent
public final class AvailableScopeRequest implements JsonSerializable<AvailableScopeRequest> {
    /*
     * Available scope request properties
     */
    private AvailableScopeRequestProperties properties;

    /**
     * Creates an instance of AvailableScopeRequest class.
     */
    public AvailableScopeRequest() {
    }

    /**
     * Get the properties property: Available scope request properties.
     * 
     * @return the properties value.
     */
    public AvailableScopeRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Available scope request properties.
     * 
     * @param properties the properties value to set.
     * @return the AvailableScopeRequest object itself.
     */
    public AvailableScopeRequest withProperties(AvailableScopeRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableScopeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableScopeRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableScopeRequest.
     */
    public static AvailableScopeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableScopeRequest deserializedAvailableScopeRequest = new AvailableScopeRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAvailableScopeRequest.properties = AvailableScopeRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableScopeRequest;
        });
    }
}
