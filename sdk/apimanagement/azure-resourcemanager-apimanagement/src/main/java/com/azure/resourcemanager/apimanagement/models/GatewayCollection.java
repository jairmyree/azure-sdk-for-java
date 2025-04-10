// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractInner;
import java.io.IOException;
import java.util.List;

/**
 * Paged Gateway list representation.
 */
@Fluent
public final class GatewayCollection implements JsonSerializable<GatewayCollection> {
    /*
     * Page values.
     */
    private List<GatewayContractInner> value;

    /*
     * Total record count number across all pages.
     */
    private Long count;

    /*
     * Next page link if any.
     */
    private String nextLink;

    /**
     * Creates an instance of GatewayCollection class.
     */
    public GatewayCollection() {
    }

    /**
     * Get the value property: Page values.
     * 
     * @return the value value.
     */
    public List<GatewayContractInner> value() {
        return this.value;
    }

    /**
     * Get the count property: Total record count number across all pages.
     * 
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     * 
     * @param count the count value to set.
     * @return the GatewayCollection object itself.
     */
    public GatewayCollection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GatewayCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayCollection if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayCollection.
     */
    public static GatewayCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayCollection deserializedGatewayCollection = new GatewayCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GatewayContractInner> value
                        = reader.readArray(reader1 -> GatewayContractInner.fromJson(reader1));
                    deserializedGatewayCollection.value = value;
                } else if ("count".equals(fieldName)) {
                    deserializedGatewayCollection.count = reader.getNullable(JsonReader::getLong);
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGatewayCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayCollection;
        });
    }
}
