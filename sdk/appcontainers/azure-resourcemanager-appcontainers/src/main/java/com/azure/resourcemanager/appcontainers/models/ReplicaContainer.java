// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Container object under Container App Revision Replica.
 */
@Fluent
public final class ReplicaContainer implements JsonSerializable<ReplicaContainer> {
    /*
     * The Name of the Container
     */
    private String name;

    /*
     * The Id of the Container
     */
    private String containerId;

    /*
     * The container ready status
     */
    private Boolean ready;

    /*
     * The container start status
     */
    private Boolean started;

    /*
     * The container restart count
     */
    private Integer restartCount;

    /*
     * Current running state of the container
     */
    private ContainerAppContainerRunningState runningState;

    /*
     * The details of container current running state
     */
    private String runningStateDetails;

    /*
     * Log Stream endpoint
     */
    private String logStreamEndpoint;

    /*
     * Container exec endpoint
     */
    private String execEndpoint;

    /*
     * Container debug endpoint
     */
    private String debugEndpoint;

    /**
     * Creates an instance of ReplicaContainer class.
     */
    public ReplicaContainer() {
    }

    /**
     * Get the name property: The Name of the Container.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Name of the Container.
     * 
     * @param name the name value to set.
     * @return the ReplicaContainer object itself.
     */
    public ReplicaContainer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the containerId property: The Id of the Container.
     * 
     * @return the containerId value.
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set the containerId property: The Id of the Container.
     * 
     * @param containerId the containerId value to set.
     * @return the ReplicaContainer object itself.
     */
    public ReplicaContainer withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get the ready property: The container ready status.
     * 
     * @return the ready value.
     */
    public Boolean ready() {
        return this.ready;
    }

    /**
     * Set the ready property: The container ready status.
     * 
     * @param ready the ready value to set.
     * @return the ReplicaContainer object itself.
     */
    public ReplicaContainer withReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Get the started property: The container start status.
     * 
     * @return the started value.
     */
    public Boolean started() {
        return this.started;
    }

    /**
     * Set the started property: The container start status.
     * 
     * @param started the started value to set.
     * @return the ReplicaContainer object itself.
     */
    public ReplicaContainer withStarted(Boolean started) {
        this.started = started;
        return this;
    }

    /**
     * Get the restartCount property: The container restart count.
     * 
     * @return the restartCount value.
     */
    public Integer restartCount() {
        return this.restartCount;
    }

    /**
     * Set the restartCount property: The container restart count.
     * 
     * @param restartCount the restartCount value to set.
     * @return the ReplicaContainer object itself.
     */
    public ReplicaContainer withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * Get the runningState property: Current running state of the container.
     * 
     * @return the runningState value.
     */
    public ContainerAppContainerRunningState runningState() {
        return this.runningState;
    }

    /**
     * Get the runningStateDetails property: The details of container current running state.
     * 
     * @return the runningStateDetails value.
     */
    public String runningStateDetails() {
        return this.runningStateDetails;
    }

    /**
     * Get the logStreamEndpoint property: Log Stream endpoint.
     * 
     * @return the logStreamEndpoint value.
     */
    public String logStreamEndpoint() {
        return this.logStreamEndpoint;
    }

    /**
     * Get the execEndpoint property: Container exec endpoint.
     * 
     * @return the execEndpoint value.
     */
    public String execEndpoint() {
        return this.execEndpoint;
    }

    /**
     * Get the debugEndpoint property: Container debug endpoint.
     * 
     * @return the debugEndpoint value.
     */
    public String debugEndpoint() {
        return this.debugEndpoint;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("containerId", this.containerId);
        jsonWriter.writeBooleanField("ready", this.ready);
        jsonWriter.writeBooleanField("started", this.started);
        jsonWriter.writeNumberField("restartCount", this.restartCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicaContainer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicaContainer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicaContainer.
     */
    public static ReplicaContainer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicaContainer deserializedReplicaContainer = new ReplicaContainer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedReplicaContainer.name = reader.getString();
                } else if ("containerId".equals(fieldName)) {
                    deserializedReplicaContainer.containerId = reader.getString();
                } else if ("ready".equals(fieldName)) {
                    deserializedReplicaContainer.ready = reader.getNullable(JsonReader::getBoolean);
                } else if ("started".equals(fieldName)) {
                    deserializedReplicaContainer.started = reader.getNullable(JsonReader::getBoolean);
                } else if ("restartCount".equals(fieldName)) {
                    deserializedReplicaContainer.restartCount = reader.getNullable(JsonReader::getInt);
                } else if ("runningState".equals(fieldName)) {
                    deserializedReplicaContainer.runningState
                        = ContainerAppContainerRunningState.fromString(reader.getString());
                } else if ("runningStateDetails".equals(fieldName)) {
                    deserializedReplicaContainer.runningStateDetails = reader.getString();
                } else if ("logStreamEndpoint".equals(fieldName)) {
                    deserializedReplicaContainer.logStreamEndpoint = reader.getString();
                } else if ("execEndpoint".equals(fieldName)) {
                    deserializedReplicaContainer.execEndpoint = reader.getString();
                } else if ("debugEndpoint".equals(fieldName)) {
                    deserializedReplicaContainer.debugEndpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicaContainer;
        });
    }
}
