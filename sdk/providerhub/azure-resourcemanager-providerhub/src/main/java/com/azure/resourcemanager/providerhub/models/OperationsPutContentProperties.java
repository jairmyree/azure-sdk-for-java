// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The OperationsPutContentProperties model.
 */
@Fluent
public final class OperationsPutContentProperties extends OperationsContentProperties {
    /**
     * Creates an instance of OperationsPutContentProperties class.
     */
    public OperationsPutContentProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationsPutContentProperties withContents(List<LocalizedOperationDefinition> contents) {
        super.withContents(contents);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (contents() != null) {
            contents().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("contents", contents(), (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationsPutContentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationsPutContentProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationsPutContentProperties.
     */
    public static OperationsPutContentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationsPutContentProperties deserializedOperationsPutContentProperties
                = new OperationsPutContentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("contents".equals(fieldName)) {
                    List<LocalizedOperationDefinition> contents
                        = reader.readArray(reader1 -> LocalizedOperationDefinition.fromJson(reader1));
                    deserializedOperationsPutContentProperties.withContents(contents);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationsPutContentProperties;
        });
    }
}
