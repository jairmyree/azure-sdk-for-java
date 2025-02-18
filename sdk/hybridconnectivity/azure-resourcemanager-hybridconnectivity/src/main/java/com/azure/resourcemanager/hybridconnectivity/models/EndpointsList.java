// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.EndpointResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of endpoints.
 */
@Fluent
public final class EndpointsList implements JsonSerializable<EndpointsList> {
    /*
     * The link used to get the next page of endpoints list.
     */
    private String nextLink;

    /*
     * The list of endpoint.
     */
    private List<EndpointResourceInner> value;

    /**
     * Creates an instance of EndpointsList class.
     */
    public EndpointsList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of endpoints list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of endpoints list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the EndpointsList object itself.
     */
    public EndpointsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of endpoint.
     * 
     * @return the value value.
     */
    public List<EndpointResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of endpoint.
     * 
     * @param value the value value to set.
     * @return the EndpointsList object itself.
     */
    public EndpointsList withValue(List<EndpointResourceInner> value) {
        this.value = value;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointsList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointsList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointsList.
     */
    public static EndpointsList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointsList deserializedEndpointsList = new EndpointsList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedEndpointsList.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<EndpointResourceInner> value
                        = reader.readArray(reader1 -> EndpointResourceInner.fromJson(reader1));
                    deserializedEndpointsList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointsList;
        });
    }
}
