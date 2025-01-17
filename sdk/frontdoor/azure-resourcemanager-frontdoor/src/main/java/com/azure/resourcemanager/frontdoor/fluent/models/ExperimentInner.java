// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.models.Endpoint;
import com.azure.resourcemanager.frontdoor.models.NetworkExperimentResourceState;
import com.azure.resourcemanager.frontdoor.models.State;
import java.io.IOException;
import java.util.Map;

/**
 * Defines the properties of an Experiment.
 */
@Fluent
public final class ExperimentInner extends Resource {
    /*
     * The properties of an Experiment
     */
    private ExperimentProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ExperimentInner class.
     */
    public ExperimentInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Experiment.
     * 
     * @return the innerProperties value.
     */
    private ExperimentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of the details or intents of the Experiment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the details or intents of the Experiment.
     * 
     * @param description the description value to set.
     * @return the ExperimentInner object itself.
     */
    public ExperimentInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the endpointA property: The endpoint A of an experiment.
     * 
     * @return the endpointA value.
     */
    public Endpoint endpointA() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointA();
    }

    /**
     * Set the endpointA property: The endpoint A of an experiment.
     * 
     * @param endpointA the endpointA value to set.
     * @return the ExperimentInner object itself.
     */
    public ExperimentInner withEndpointA(Endpoint endpointA) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentProperties();
        }
        this.innerProperties().withEndpointA(endpointA);
        return this;
    }

    /**
     * Get the endpointB property: The endpoint B of an experiment.
     * 
     * @return the endpointB value.
     */
    public Endpoint endpointB() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointB();
    }

    /**
     * Set the endpointB property: The endpoint B of an experiment.
     * 
     * @param endpointB the endpointB value to set.
     * @return the ExperimentInner object itself.
     */
    public ExperimentInner withEndpointB(Endpoint endpointB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentProperties();
        }
        this.innerProperties().withEndpointB(endpointB);
        return this;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     * 
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     * 
     * @param enabledState the enabledState value to set.
     * @return the ExperimentInner object itself.
     */
    public ExperimentInner withEnabledState(State enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     * 
     * @return the resourceState value.
     */
    public NetworkExperimentResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the status property: The description of Experiment status from the server side.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the scriptFileUri property: The uri to the Script used in the Experiment.
     * 
     * @return the scriptFileUri value.
     */
    public String scriptFileUri() {
        return this.innerProperties() == null ? null : this.innerProperties().scriptFileUri();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExperimentInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExperimentInner.
     */
    public static ExperimentInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExperimentInner deserializedExperimentInner = new ExperimentInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedExperimentInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedExperimentInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExperimentInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedExperimentInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedExperimentInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedExperimentInner.innerProperties = ExperimentProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExperimentInner;
        });
    }
}
