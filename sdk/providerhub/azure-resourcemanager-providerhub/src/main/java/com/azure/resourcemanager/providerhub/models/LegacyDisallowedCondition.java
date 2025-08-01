// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The LegacyDisallowedCondition model.
 */
@Fluent
public final class LegacyDisallowedCondition implements JsonSerializable<LegacyDisallowedCondition> {
    /*
     * The disallowed legacy operations.
     */
    private List<LegacyOperation> disallowedLegacyOperations;

    /*
     * Feature string.
     */
    private String feature;

    /**
     * Creates an instance of LegacyDisallowedCondition class.
     */
    public LegacyDisallowedCondition() {
    }

    /**
     * Get the disallowedLegacyOperations property: The disallowed legacy operations.
     * 
     * @return the disallowedLegacyOperations value.
     */
    public List<LegacyOperation> disallowedLegacyOperations() {
        return this.disallowedLegacyOperations;
    }

    /**
     * Set the disallowedLegacyOperations property: The disallowed legacy operations.
     * 
     * @param disallowedLegacyOperations the disallowedLegacyOperations value to set.
     * @return the LegacyDisallowedCondition object itself.
     */
    public LegacyDisallowedCondition withDisallowedLegacyOperations(List<LegacyOperation> disallowedLegacyOperations) {
        this.disallowedLegacyOperations = disallowedLegacyOperations;
        return this;
    }

    /**
     * Get the feature property: Feature string.
     * 
     * @return the feature value.
     */
    public String feature() {
        return this.feature;
    }

    /**
     * Set the feature property: Feature string.
     * 
     * @param feature the feature value to set.
     * @return the LegacyDisallowedCondition object itself.
     */
    public LegacyDisallowedCondition withFeature(String feature) {
        this.feature = feature;
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
        jsonWriter.writeArrayField("disallowedLegacyOperations", this.disallowedLegacyOperations,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("feature", this.feature);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LegacyDisallowedCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LegacyDisallowedCondition if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LegacyDisallowedCondition.
     */
    public static LegacyDisallowedCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LegacyDisallowedCondition deserializedLegacyDisallowedCondition = new LegacyDisallowedCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("disallowedLegacyOperations".equals(fieldName)) {
                    List<LegacyOperation> disallowedLegacyOperations
                        = reader.readArray(reader1 -> LegacyOperation.fromString(reader1.getString()));
                    deserializedLegacyDisallowedCondition.disallowedLegacyOperations = disallowedLegacyOperations;
                } else if ("feature".equals(fieldName)) {
                    deserializedLegacyDisallowedCondition.feature = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLegacyDisallowedCondition;
        });
    }
}
