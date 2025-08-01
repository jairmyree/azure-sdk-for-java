// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.fluent.models.CapacityReservationInner;
import java.io.IOException;
import java.util.List;

/**
 * The list capacity reservation operation response.
 */
@Fluent
public final class CapacityReservationListResult implements JsonSerializable<CapacityReservationListResult> {
    /*
     * The list of capacity reservations.
     */
    private List<CapacityReservationInner> value;

    /*
     * The URI to fetch the next page of capacity reservations. Call ListNext() with this URI to fetch the next page of
     * capacity reservations.
     */
    private String nextLink;

    /**
     * Creates an instance of CapacityReservationListResult class.
     */
    public CapacityReservationListResult() {
    }

    /**
     * Get the value property: The list of capacity reservations.
     * 
     * @return the value value.
     */
    public List<CapacityReservationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of capacity reservations.
     * 
     * @param value the value value to set.
     * @return the CapacityReservationListResult object itself.
     */
    public CapacityReservationListResult withValue(List<CapacityReservationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of capacity reservations. Call ListNext() with this URI
     * to fetch the next page of capacity reservations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of capacity reservations. Call ListNext() with this URI
     * to fetch the next page of capacity reservations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CapacityReservationListResult object itself.
     */
    public CapacityReservationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model CapacityReservationListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapacityReservationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapacityReservationListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CapacityReservationListResult.
     */
    public static CapacityReservationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapacityReservationListResult deserializedCapacityReservationListResult
                = new CapacityReservationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CapacityReservationInner> value
                        = reader.readArray(reader1 -> CapacityReservationInner.fromJson(reader1));
                    deserializedCapacityReservationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCapacityReservationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapacityReservationListResult;
        });
    }
}
