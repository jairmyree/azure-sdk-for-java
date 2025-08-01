// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SQL Migration Service properties.
 */
@Immutable
public final class SqlMigrationServiceProperties implements JsonSerializable<SqlMigrationServiceProperties> {
    /*
     * Provisioning state to track the async operation status.
     */
    private String provisioningState;

    /*
     * Current state of the Integration runtime.
     */
    private String integrationRuntimeState;

    /**
     * Creates an instance of SqlMigrationServiceProperties class.
     */
    public SqlMigrationServiceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the integrationRuntimeState property: Current state of the Integration runtime.
     * 
     * @return the integrationRuntimeState value.
     */
    public String integrationRuntimeState() {
        return this.integrationRuntimeState;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlMigrationServiceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlMigrationServiceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlMigrationServiceProperties.
     */
    public static SqlMigrationServiceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlMigrationServiceProperties deserializedSqlMigrationServiceProperties
                = new SqlMigrationServiceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedSqlMigrationServiceProperties.provisioningState = reader.getString();
                } else if ("integrationRuntimeState".equals(fieldName)) {
                    deserializedSqlMigrationServiceProperties.integrationRuntimeState = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlMigrationServiceProperties;
        });
    }
}
