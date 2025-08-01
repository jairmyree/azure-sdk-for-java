// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Results for schema comparison between the source and target.
 */
@Fluent
public final class SchemaComparisonValidationResult implements JsonSerializable<SchemaComparisonValidationResult> {
    /*
     * List of schema differences between the source and target databases
     */
    private SchemaComparisonValidationResultType schemaDifferences;

    /*
     * List of errors that happened while performing schema compare validation
     */
    private ValidationError validationErrors;

    /*
     * Count of source database objects
     */
    private Map<String, Long> sourceDatabaseObjectCount;

    /*
     * Count of target database objects
     */
    private Map<String, Long> targetDatabaseObjectCount;

    /**
     * Creates an instance of SchemaComparisonValidationResult class.
     */
    public SchemaComparisonValidationResult() {
    }

    /**
     * Get the schemaDifferences property: List of schema differences between the source and target databases.
     * 
     * @return the schemaDifferences value.
     */
    public SchemaComparisonValidationResultType schemaDifferences() {
        return this.schemaDifferences;
    }

    /**
     * Set the schemaDifferences property: List of schema differences between the source and target databases.
     * 
     * @param schemaDifferences the schemaDifferences value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult
        withSchemaDifferences(SchemaComparisonValidationResultType schemaDifferences) {
        this.schemaDifferences = schemaDifferences;
        return this;
    }

    /**
     * Get the validationErrors property: List of errors that happened while performing schema compare validation.
     * 
     * @return the validationErrors value.
     */
    public ValidationError validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: List of errors that happened while performing schema compare validation.
     * 
     * @param validationErrors the validationErrors value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult withValidationErrors(ValidationError validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the sourceDatabaseObjectCount property: Count of source database objects.
     * 
     * @return the sourceDatabaseObjectCount value.
     */
    public Map<String, Long> sourceDatabaseObjectCount() {
        return this.sourceDatabaseObjectCount;
    }

    /**
     * Set the sourceDatabaseObjectCount property: Count of source database objects.
     * 
     * @param sourceDatabaseObjectCount the sourceDatabaseObjectCount value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult withSourceDatabaseObjectCount(Map<String, Long> sourceDatabaseObjectCount) {
        this.sourceDatabaseObjectCount = sourceDatabaseObjectCount;
        return this;
    }

    /**
     * Get the targetDatabaseObjectCount property: Count of target database objects.
     * 
     * @return the targetDatabaseObjectCount value.
     */
    public Map<String, Long> targetDatabaseObjectCount() {
        return this.targetDatabaseObjectCount;
    }

    /**
     * Set the targetDatabaseObjectCount property: Count of target database objects.
     * 
     * @param targetDatabaseObjectCount the targetDatabaseObjectCount value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult withTargetDatabaseObjectCount(Map<String, Long> targetDatabaseObjectCount) {
        this.targetDatabaseObjectCount = targetDatabaseObjectCount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schemaDifferences() != null) {
            schemaDifferences().validate();
        }
        if (validationErrors() != null) {
            validationErrors().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("schemaDifferences", this.schemaDifferences);
        jsonWriter.writeJsonField("validationErrors", this.validationErrors);
        jsonWriter.writeMapField("sourceDatabaseObjectCount", this.sourceDatabaseObjectCount,
            (writer, element) -> writer.writeLong(element));
        jsonWriter.writeMapField("targetDatabaseObjectCount", this.targetDatabaseObjectCount,
            (writer, element) -> writer.writeLong(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SchemaComparisonValidationResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SchemaComparisonValidationResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SchemaComparisonValidationResult.
     */
    public static SchemaComparisonValidationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SchemaComparisonValidationResult deserializedSchemaComparisonValidationResult
                = new SchemaComparisonValidationResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schemaDifferences".equals(fieldName)) {
                    deserializedSchemaComparisonValidationResult.schemaDifferences
                        = SchemaComparisonValidationResultType.fromJson(reader);
                } else if ("validationErrors".equals(fieldName)) {
                    deserializedSchemaComparisonValidationResult.validationErrors = ValidationError.fromJson(reader);
                } else if ("sourceDatabaseObjectCount".equals(fieldName)) {
                    Map<String, Long> sourceDatabaseObjectCount = reader.readMap(reader1 -> reader1.getLong());
                    deserializedSchemaComparisonValidationResult.sourceDatabaseObjectCount = sourceDatabaseObjectCount;
                } else if ("targetDatabaseObjectCount".equals(fieldName)) {
                    Map<String, Long> targetDatabaseObjectCount = reader.readMap(reader1 -> reader1.getLong());
                    deserializedSchemaComparisonValidationResult.targetDatabaseObjectCount = targetDatabaseObjectCount;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchemaComparisonValidationResult;
        });
    }
}
