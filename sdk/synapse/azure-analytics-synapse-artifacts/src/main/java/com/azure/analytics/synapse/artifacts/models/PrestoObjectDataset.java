// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Presto server dataset.
 */
@Fluent
public class PrestoObjectDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @Generated
    private String type = "PrestoObject";

    /*
     * This property will be retired. Please consider using schema + table properties instead.
     */
    @Generated
    private Object tableName;

    /*
     * The table name of the Presto. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object table;

    /*
     * The schema name of the Presto. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object schemaTypePropertiesSchema;

    /**
     * Creates an instance of PrestoObjectDataset class.
     */
    @Generated
    public PrestoObjectDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    @Generated
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the PrestoObjectDataset object itself.
     */
    @Generated
    public PrestoObjectDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table property: The table name of the Presto. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    @Generated
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the Presto. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the PrestoObjectDataset object itself.
     */
    @Generated
    public PrestoObjectDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schemaTypePropertiesSchema property: The schema name of the Presto. Type: string (or Expression with
     * resultType string).
     * 
     * @return the schemaTypePropertiesSchema value.
     */
    @Generated
    public Object getSchemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The schema name of the Presto. Type: string (or Expression with
     * resultType string).
     * 
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the PrestoObjectDataset object itself.
     */
    @Generated
    public PrestoObjectDataset setSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public PrestoObjectDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        if (getStructure() != null) {
            jsonWriter.writeUntypedField("structure", getStructure());
        }
        if (getSchema() != null) {
            jsonWriter.writeUntypedField("schema", getSchema());
        }
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (tableName != null || table != null || schemaTypePropertiesSchema != null) {
            jsonWriter.writeStartObject("typeProperties");
            if (this.tableName != null) {
                jsonWriter.writeUntypedField("tableName", this.tableName);
            }
            if (this.table != null) {
                jsonWriter.writeUntypedField("table", this.table);
            }
            if (this.schemaTypePropertiesSchema != null) {
                jsonWriter.writeUntypedField("schema", this.schemaTypePropertiesSchema);
            }
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrestoObjectDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrestoObjectDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrestoObjectDataset.
     */
    @Generated
    public static PrestoObjectDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrestoObjectDataset deserializedPrestoObjectDataset = new PrestoObjectDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedPrestoObjectDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedPrestoObjectDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedPrestoObjectDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedPrestoObjectDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedPrestoObjectDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedPrestoObjectDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedPrestoObjectDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedPrestoObjectDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("tableName".equals(fieldName)) {
                            deserializedPrestoObjectDataset.tableName = reader.readUntyped();
                        } else if ("table".equals(fieldName)) {
                            deserializedPrestoObjectDataset.table = reader.readUntyped();
                        } else if ("schema".equals(fieldName)) {
                            deserializedPrestoObjectDataset.schemaTypePropertiesSchema = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedPrestoObjectDataset.setAdditionalProperties(additionalProperties);

            return deserializedPrestoObjectDataset;
        });
    }
}
