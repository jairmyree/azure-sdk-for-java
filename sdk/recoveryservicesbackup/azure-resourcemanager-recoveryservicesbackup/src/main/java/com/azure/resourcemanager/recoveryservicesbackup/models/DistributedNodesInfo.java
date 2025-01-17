// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This is used to represent the various nodes of the distributed container.
 */
@Fluent
public final class DistributedNodesInfo implements JsonSerializable<DistributedNodesInfo> {
    /*
     * Name of the node under a distributed container.
     */
    private String nodeName;

    /*
     * Status of this Node.
     * Failed | Succeeded
     */
    private String status;

    /*
     * Error Details if the Status is non-success.
     */
    private ErrorDetail errorDetail;

    /*
     * ARM resource id of the node
     */
    private String sourceResourceId;

    /**
     * Creates an instance of DistributedNodesInfo class.
     */
    public DistributedNodesInfo() {
    }

    /**
     * Get the nodeName property: Name of the node under a distributed container.
     * 
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node under a distributed container.
     * 
     * @param nodeName the nodeName value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the status property: Status of this Node.
     * Failed | Succeeded.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of this Node.
     * Failed | Succeeded.
     * 
     * @param status the status value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorDetail property: Error Details if the Status is non-success.
     * 
     * @return the errorDetail value.
     */
    public ErrorDetail errorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: Error Details if the Status is non-success.
     * 
     * @param errorDetail the errorDetail value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Get the sourceResourceId property: ARM resource id of the node.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: ARM resource id of the node.
     * 
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetail() != null) {
            errorDetail().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nodeName", this.nodeName);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeJsonField("errorDetail", this.errorDetail);
        jsonWriter.writeStringField("sourceResourceId", this.sourceResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DistributedNodesInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DistributedNodesInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DistributedNodesInfo.
     */
    public static DistributedNodesInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DistributedNodesInfo deserializedDistributedNodesInfo = new DistributedNodesInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nodeName".equals(fieldName)) {
                    deserializedDistributedNodesInfo.nodeName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedDistributedNodesInfo.status = reader.getString();
                } else if ("errorDetail".equals(fieldName)) {
                    deserializedDistributedNodesInfo.errorDetail = ErrorDetail.fromJson(reader);
                } else if ("sourceResourceId".equals(fieldName)) {
                    deserializedDistributedNodesInfo.sourceResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDistributedNodesInfo;
        });
    }
}
