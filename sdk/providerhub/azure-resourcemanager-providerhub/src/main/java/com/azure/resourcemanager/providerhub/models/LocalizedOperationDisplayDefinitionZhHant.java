// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Display information of the operation for zh-Hant locale.
 */
@Fluent
public final class LocalizedOperationDisplayDefinitionZhHant extends OperationsDisplayDefinition {
    /**
     * Creates an instance of LocalizedOperationDisplayDefinitionZhHant class.
     */
    public LocalizedOperationDisplayDefinitionZhHant() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalizedOperationDisplayDefinitionZhHant withProvider(String provider) {
        super.withProvider(provider);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalizedOperationDisplayDefinitionZhHant withResource(String resource) {
        super.withResource(resource);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalizedOperationDisplayDefinitionZhHant withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalizedOperationDisplayDefinitionZhHant withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (provider() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property provider in model LocalizedOperationDisplayDefinitionZhHant"));
        }
        if (resource() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resource in model LocalizedOperationDisplayDefinitionZhHant"));
        }
        if (operation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operation in model LocalizedOperationDisplayDefinitionZhHant"));
        }
        if (description() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property description in model LocalizedOperationDisplayDefinitionZhHant"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LocalizedOperationDisplayDefinitionZhHant.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("provider", provider());
        jsonWriter.writeStringField("resource", resource());
        jsonWriter.writeStringField("operation", operation());
        jsonWriter.writeStringField("description", description());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocalizedOperationDisplayDefinitionZhHant from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalizedOperationDisplayDefinitionZhHant if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LocalizedOperationDisplayDefinitionZhHant.
     */
    public static LocalizedOperationDisplayDefinitionZhHant fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalizedOperationDisplayDefinitionZhHant deserializedLocalizedOperationDisplayDefinitionZhHant
                = new LocalizedOperationDisplayDefinitionZhHant();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    deserializedLocalizedOperationDisplayDefinitionZhHant.withProvider(reader.getString());
                } else if ("resource".equals(fieldName)) {
                    deserializedLocalizedOperationDisplayDefinitionZhHant.withResource(reader.getString());
                } else if ("operation".equals(fieldName)) {
                    deserializedLocalizedOperationDisplayDefinitionZhHant.withOperation(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedLocalizedOperationDisplayDefinitionZhHant.withDescription(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalizedOperationDisplayDefinitionZhHant;
        });
    }
}
