// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IsNullOrUndefined Advanced Filter.
 */
@Fluent
public final class IsNullOrUndefinedAdvancedFilter extends AdvancedFilter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private AdvancedFilterOperatorType operatorType = AdvancedFilterOperatorType.IS_NULL_OR_UNDEFINED;

    /**
     * Creates an instance of IsNullOrUndefinedAdvancedFilter class.
     */
    public IsNullOrUndefinedAdvancedFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public AdvancedFilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsNullOrUndefinedAdvancedFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", key());
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IsNullOrUndefinedAdvancedFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IsNullOrUndefinedAdvancedFilter if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IsNullOrUndefinedAdvancedFilter.
     */
    public static IsNullOrUndefinedAdvancedFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IsNullOrUndefinedAdvancedFilter deserializedIsNullOrUndefinedAdvancedFilter
                = new IsNullOrUndefinedAdvancedFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedIsNullOrUndefinedAdvancedFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedIsNullOrUndefinedAdvancedFilter.operatorType
                        = AdvancedFilterOperatorType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIsNullOrUndefinedAdvancedFilter;
        });
    }
}
