// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for the AvailableGroundStations API service call.
 */
@Fluent
public final class AvailableGroundStationListResult implements JsonSerializable<AvailableGroundStationListResult> {
    /*
     * A list of ground station resources.
     */
    private List<AvailableGroundStationInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of AvailableGroundStationListResult class.
     */
    public AvailableGroundStationListResult() {
    }

    /**
     * Get the value property: A list of ground station resources.
     * 
     * @return the value value.
     */
    public List<AvailableGroundStationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ground station resources.
     * 
     * @param value the value value to set.
     * @return the AvailableGroundStationListResult object itself.
     */
    public AvailableGroundStationListResult withValue(List<AvailableGroundStationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableGroundStationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableGroundStationListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableGroundStationListResult.
     */
    public static AvailableGroundStationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableGroundStationListResult deserializedAvailableGroundStationListResult
                = new AvailableGroundStationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AvailableGroundStationInner> value
                        = reader.readArray(reader1 -> AvailableGroundStationInner.fromJson(reader1));
                    deserializedAvailableGroundStationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAvailableGroundStationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableGroundStationListResult;
        });
    }
}
