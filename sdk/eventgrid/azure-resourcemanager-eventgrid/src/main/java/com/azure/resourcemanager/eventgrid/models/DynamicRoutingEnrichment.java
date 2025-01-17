// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The DynamicRoutingEnrichment model.
 */
@Fluent
public final class DynamicRoutingEnrichment implements JsonSerializable<DynamicRoutingEnrichment> {
    /*
     * Dynamic routing enrichment key.
     */
    private String key;

    /*
     * Dynamic routing enrichment value.
     */
    private String value;

    /**
     * Creates an instance of DynamicRoutingEnrichment class.
     */
    public DynamicRoutingEnrichment() {
    }

    /**
     * Get the key property: Dynamic routing enrichment key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Dynamic routing enrichment key.
     * 
     * @param key the key value to set.
     * @return the DynamicRoutingEnrichment object itself.
     */
    public DynamicRoutingEnrichment withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Dynamic routing enrichment value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Dynamic routing enrichment value.
     * 
     * @param value the value value to set.
     * @return the DynamicRoutingEnrichment object itself.
     */
    public DynamicRoutingEnrichment withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DynamicRoutingEnrichment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicRoutingEnrichment if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DynamicRoutingEnrichment.
     */
    public static DynamicRoutingEnrichment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DynamicRoutingEnrichment deserializedDynamicRoutingEnrichment = new DynamicRoutingEnrichment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedDynamicRoutingEnrichment.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedDynamicRoutingEnrichment.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDynamicRoutingEnrichment;
        });
    }
}
