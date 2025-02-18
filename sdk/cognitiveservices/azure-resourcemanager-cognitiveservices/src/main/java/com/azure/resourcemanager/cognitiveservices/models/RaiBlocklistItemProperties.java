// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * RAI Custom Blocklist Item properties.
 */
@Fluent
public final class RaiBlocklistItemProperties implements JsonSerializable<RaiBlocklistItemProperties> {
    /*
     * Pattern to match against.
     */
    private String pattern;

    /*
     * If the pattern is a regex pattern.
     */
    private Boolean isRegex;

    /**
     * Creates an instance of RaiBlocklistItemProperties class.
     */
    public RaiBlocklistItemProperties() {
    }

    /**
     * Get the pattern property: Pattern to match against.
     * 
     * @return the pattern value.
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: Pattern to match against.
     * 
     * @param pattern the pattern value to set.
     * @return the RaiBlocklistItemProperties object itself.
     */
    public RaiBlocklistItemProperties withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the isRegex property: If the pattern is a regex pattern.
     * 
     * @return the isRegex value.
     */
    public Boolean isRegex() {
        return this.isRegex;
    }

    /**
     * Set the isRegex property: If the pattern is a regex pattern.
     * 
     * @param isRegex the isRegex value to set.
     * @return the RaiBlocklistItemProperties object itself.
     */
    public RaiBlocklistItemProperties withIsRegex(Boolean isRegex) {
        this.isRegex = isRegex;
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
        jsonWriter.writeStringField("pattern", this.pattern);
        jsonWriter.writeBooleanField("isRegex", this.isRegex);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RaiBlocklistItemProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RaiBlocklistItemProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RaiBlocklistItemProperties.
     */
    public static RaiBlocklistItemProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RaiBlocklistItemProperties deserializedRaiBlocklistItemProperties = new RaiBlocklistItemProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pattern".equals(fieldName)) {
                    deserializedRaiBlocklistItemProperties.pattern = reader.getString();
                } else if ("isRegex".equals(fieldName)) {
                    deserializedRaiBlocklistItemProperties.isRegex = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRaiBlocklistItemProperties;
        });
    }
}
