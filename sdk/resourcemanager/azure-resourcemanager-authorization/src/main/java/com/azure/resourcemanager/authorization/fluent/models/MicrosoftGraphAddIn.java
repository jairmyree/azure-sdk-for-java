// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * addIn.
 */
@Fluent
public final class MicrosoftGraphAddIn implements JsonSerializable<MicrosoftGraphAddIn> {
    /*
     * The id property.
     */
    private UUID id;

    /*
     * The properties property.
     */
    private List<MicrosoftGraphKeyValue> properties;

    /*
     * The type property.
     */
    private String type;

    /*
     * addIn
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAddIn class.
     */
    public MicrosoftGraphAddIn() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     * 
     * @param id the id value to set.
     * @return the MicrosoftGraphAddIn object itself.
     */
    public MicrosoftGraphAddIn withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     * 
     * @return the properties value.
     */
    public List<MicrosoftGraphKeyValue> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     * 
     * @param properties the properties value to set.
     * @return the MicrosoftGraphAddIn object itself.
     */
    public MicrosoftGraphAddIn withProperties(List<MicrosoftGraphKeyValue> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     * 
     * @param type the type value to set.
     * @return the MicrosoftGraphAddIn object itself.
     */
    public MicrosoftGraphAddIn withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: addIn.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: addIn.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAddIn object itself.
     */
    public MicrosoftGraphAddIn withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", Objects.toString(this.id, null));
        jsonWriter.writeArrayField("properties", this.properties, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAddIn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAddIn if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAddIn.
     */
    public static MicrosoftGraphAddIn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAddIn deserializedMicrosoftGraphAddIn = new MicrosoftGraphAddIn();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphAddIn.id
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("properties".equals(fieldName)) {
                    List<MicrosoftGraphKeyValue> properties
                        = reader.readArray(reader1 -> MicrosoftGraphKeyValue.fromJson(reader1));
                    deserializedMicrosoftGraphAddIn.properties = properties;
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftGraphAddIn.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAddIn.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAddIn;
        });
    }
}
