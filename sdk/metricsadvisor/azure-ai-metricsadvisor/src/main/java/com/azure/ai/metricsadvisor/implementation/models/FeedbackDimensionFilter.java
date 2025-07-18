// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The FeedbackDimensionFilter model.
 */
@Fluent
public final class FeedbackDimensionFilter implements JsonSerializable<FeedbackDimensionFilter> {
    /*
     * metric dimension filter
     */
    @Generated
    private Map<String, String> dimension;

    /**
     * Creates an instance of FeedbackDimensionFilter class.
     */
    @Generated
    public FeedbackDimensionFilter() {
    }

    /**
     * Get the dimension property: metric dimension filter.
     * 
     * @return the dimension value.
     */
    @Generated
    public Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: metric dimension filter.
     * 
     * @param dimension the dimension value to set.
     * @return the FeedbackDimensionFilter object itself.
     */
    @Generated
    public FeedbackDimensionFilter setDimension(Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("dimension", this.dimension, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeedbackDimensionFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeedbackDimensionFilter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FeedbackDimensionFilter.
     */
    @Generated
    public static FeedbackDimensionFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FeedbackDimensionFilter deserializedFeedbackDimensionFilter = new FeedbackDimensionFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dimension".equals(fieldName)) {
                    Map<String, String> dimension = reader.readMap(reader1 -> reader1.getString());
                    deserializedFeedbackDimensionFilter.dimension = dimension;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeedbackDimensionFilter;
        });
    }
}
