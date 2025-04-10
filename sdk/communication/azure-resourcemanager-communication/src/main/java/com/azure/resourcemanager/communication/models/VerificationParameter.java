// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Input parameter for verification APIs.
 */
@Fluent
public final class VerificationParameter implements JsonSerializable<VerificationParameter> {
    /*
     * Type of verification.
     */
    private VerificationType verificationType;

    /**
     * Creates an instance of VerificationParameter class.
     */
    public VerificationParameter() {
    }

    /**
     * Get the verificationType property: Type of verification.
     * 
     * @return the verificationType value.
     */
    public VerificationType verificationType() {
        return this.verificationType;
    }

    /**
     * Set the verificationType property: Type of verification.
     * 
     * @param verificationType the verificationType value to set.
     * @return the VerificationParameter object itself.
     */
    public VerificationParameter withVerificationType(VerificationType verificationType) {
        this.verificationType = verificationType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (verificationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property verificationType in model VerificationParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VerificationParameter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("verificationType",
            this.verificationType == null ? null : this.verificationType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VerificationParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VerificationParameter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VerificationParameter.
     */
    public static VerificationParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VerificationParameter deserializedVerificationParameter = new VerificationParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("verificationType".equals(fieldName)) {
                    deserializedVerificationParameter.verificationType
                        = VerificationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVerificationParameter;
        });
    }
}
