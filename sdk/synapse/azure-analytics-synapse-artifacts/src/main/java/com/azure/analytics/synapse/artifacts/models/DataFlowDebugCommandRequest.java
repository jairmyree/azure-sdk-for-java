// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request body structure for data flow expression preview.
 */
@Fluent
public final class DataFlowDebugCommandRequest implements JsonSerializable<DataFlowDebugCommandRequest> {
    /*
     * The ID of data flow debug session.
     */
    @Generated
    private String sessionId;

    /*
     * The command type.
     */
    @Generated
    private DataFlowDebugCommandType command;

    /*
     * The command payload object.
     */
    @Generated
    private DataFlowDebugCommandPayload commandPayload;

    /**
     * Creates an instance of DataFlowDebugCommandRequest class.
     */
    @Generated
    public DataFlowDebugCommandRequest() {
    }

    /**
     * Get the sessionId property: The ID of data flow debug session.
     * 
     * @return the sessionId value.
     */
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     * 
     * @param sessionId the sessionId value to set.
     * @return the DataFlowDebugCommandRequest object itself.
     */
    @Generated
    public DataFlowDebugCommandRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the command property: The command type.
     * 
     * @return the command value.
     */
    @Generated
    public DataFlowDebugCommandType getCommand() {
        return this.command;
    }

    /**
     * Set the command property: The command type.
     * 
     * @param command the command value to set.
     * @return the DataFlowDebugCommandRequest object itself.
     */
    @Generated
    public DataFlowDebugCommandRequest setCommand(DataFlowDebugCommandType command) {
        this.command = command;
        return this;
    }

    /**
     * Get the commandPayload property: The command payload object.
     * 
     * @return the commandPayload value.
     */
    @Generated
    public DataFlowDebugCommandPayload getCommandPayload() {
        return this.commandPayload;
    }

    /**
     * Set the commandPayload property: The command payload object.
     * 
     * @param commandPayload the commandPayload value to set.
     * @return the DataFlowDebugCommandRequest object itself.
     */
    @Generated
    public DataFlowDebugCommandRequest setCommandPayload(DataFlowDebugCommandPayload commandPayload) {
        this.commandPayload = commandPayload;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sessionId", this.sessionId);
        jsonWriter.writeStringField("command", this.command == null ? null : this.command.toString());
        jsonWriter.writeJsonField("commandPayload", this.commandPayload);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFlowDebugCommandRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFlowDebugCommandRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataFlowDebugCommandRequest.
     */
    @Generated
    public static DataFlowDebugCommandRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataFlowDebugCommandRequest deserializedDataFlowDebugCommandRequest = new DataFlowDebugCommandRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sessionId".equals(fieldName)) {
                    deserializedDataFlowDebugCommandRequest.sessionId = reader.getString();
                } else if ("command".equals(fieldName)) {
                    deserializedDataFlowDebugCommandRequest.command
                        = DataFlowDebugCommandType.fromString(reader.getString());
                } else if ("commandPayload".equals(fieldName)) {
                    deserializedDataFlowDebugCommandRequest.commandPayload
                        = DataFlowDebugCommandPayload.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataFlowDebugCommandRequest;
        });
    }
}
