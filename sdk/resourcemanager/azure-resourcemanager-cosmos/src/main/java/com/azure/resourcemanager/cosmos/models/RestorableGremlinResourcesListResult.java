// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableGremlinResourcesGetResultInner;
import java.io.IOException;
import java.util.List;

/**
 * The List operation response, that contains the restorable Gremlin resources.
 */
@Immutable
public final class RestorableGremlinResourcesListResult
    implements JsonSerializable<RestorableGremlinResourcesListResult> {
    /*
     * List of restorable Gremlin resources, including the gremlin database and graph names.
     */
    private List<RestorableGremlinResourcesGetResultInner> value;

    /**
     * Creates an instance of RestorableGremlinResourcesListResult class.
     */
    public RestorableGremlinResourcesListResult() {
    }

    /**
     * Get the value property: List of restorable Gremlin resources, including the gremlin database and graph names.
     * 
     * @return the value value.
     */
    public List<RestorableGremlinResourcesGetResultInner> value() {
        return this.value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableGremlinResourcesListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableGremlinResourcesListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableGremlinResourcesListResult.
     */
    public static RestorableGremlinResourcesListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableGremlinResourcesListResult deserializedRestorableGremlinResourcesListResult
                = new RestorableGremlinResourcesListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RestorableGremlinResourcesGetResultInner> value
                        = reader.readArray(reader1 -> RestorableGremlinResourcesGetResultInner.fromJson(reader1));
                    deserializedRestorableGremlinResourcesListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableGremlinResourcesListResult;
        });
    }
}
