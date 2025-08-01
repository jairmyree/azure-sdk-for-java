// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Properties for the task that collects user tables for the given list of databases.
 */
@Fluent
public final class GetUserTablesMySqlTaskProperties extends ProjectTaskProperties {
    /*
     * Task type.
     */
    private TaskType taskType = TaskType.GET_USER_TABLES_MY_SQL;

    /*
     * Task input
     */
    private GetUserTablesMySqlTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    private List<GetUserTablesMySqlTaskOutput> output;

    /**
     * Creates an instance of GetUserTablesMySqlTaskProperties class.
     */
    public GetUserTablesMySqlTaskProperties() {
    }

    /**
     * Get the taskType property: Task type.
     * 
     * @return the taskType value.
     */
    @Override
    public TaskType taskType() {
        return this.taskType;
    }

    /**
     * Get the input property: Task input.
     * 
     * @return the input value.
     */
    public GetUserTablesMySqlTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     * 
     * @param input the input value to set.
     * @return the GetUserTablesMySqlTaskProperties object itself.
     */
    public GetUserTablesMySqlTaskProperties withInput(GetUserTablesMySqlTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     * 
     * @return the output value.
     */
    public List<GetUserTablesMySqlTaskOutput> output() {
        return this.output;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUserTablesMySqlTaskProperties withClientData(Map<String, String> clientData) {
        super.withClientData(clientData);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
        if (commands() != null) {
            commands().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("clientData", clientData(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("taskType", this.taskType == null ? null : this.taskType.toString());
        jsonWriter.writeJsonField("input", this.input);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetUserTablesMySqlTaskProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetUserTablesMySqlTaskProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GetUserTablesMySqlTaskProperties.
     */
    public static GetUserTablesMySqlTaskProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetUserTablesMySqlTaskProperties deserializedGetUserTablesMySqlTaskProperties
                = new GetUserTablesMySqlTaskProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<ManagementError> errors = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedGetUserTablesMySqlTaskProperties.withErrors(errors);
                } else if ("state".equals(fieldName)) {
                    deserializedGetUserTablesMySqlTaskProperties.withState(TaskState.fromString(reader.getString()));
                } else if ("commands".equals(fieldName)) {
                    List<CommandPropertiesInner> commands
                        = reader.readArray(reader1 -> CommandPropertiesInner.fromJson(reader1));
                    deserializedGetUserTablesMySqlTaskProperties.withCommands(commands);
                } else if ("clientData".equals(fieldName)) {
                    Map<String, String> clientData = reader.readMap(reader1 -> reader1.getString());
                    deserializedGetUserTablesMySqlTaskProperties.withClientData(clientData);
                } else if ("taskType".equals(fieldName)) {
                    deserializedGetUserTablesMySqlTaskProperties.taskType = TaskType.fromString(reader.getString());
                } else if ("input".equals(fieldName)) {
                    deserializedGetUserTablesMySqlTaskProperties.input = GetUserTablesMySqlTaskInput.fromJson(reader);
                } else if ("output".equals(fieldName)) {
                    List<GetUserTablesMySqlTaskOutput> output
                        = reader.readArray(reader1 -> GetUserTablesMySqlTaskOutput.fromJson(reader1));
                    deserializedGetUserTablesMySqlTaskProperties.output = output;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetUserTablesMySqlTaskProperties;
        });
    }
}
