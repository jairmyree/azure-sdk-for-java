// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Pool properties.
 */
@Fluent
public final class PoolProperties implements JsonSerializable<PoolProperties> {
    /*
     * The status of the current operation.
     */
    private ProvisioningState provisioningState;

    /*
     * Defines how many resources can there be created at any given time.
     */
    private int maximumConcurrency;

    /*
     * Defines the organization in which the pool will be used.
     */
    private OrganizationProfile organizationProfile;

    /*
     * Defines how the machine will be handled once it executed a job.
     */
    private AgentProfile agentProfile;

    /*
     * Defines the type of fabric the agent will run on.
     */
    private FabricProfile fabricProfile;

    /*
     * The resource id of the DevCenter Project the pool belongs to.
     */
    private String devCenterProjectResourceId;

    /**
     * Creates an instance of PoolProperties class.
     */
    public PoolProperties() {
    }

    /**
     * Get the provisioningState property: The status of the current operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The status of the current operation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the maximumConcurrency property: Defines how many resources can there be created at any given time.
     * 
     * @return the maximumConcurrency value.
     */
    public int maximumConcurrency() {
        return this.maximumConcurrency;
    }

    /**
     * Set the maximumConcurrency property: Defines how many resources can there be created at any given time.
     * 
     * @param maximumConcurrency the maximumConcurrency value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withMaximumConcurrency(int maximumConcurrency) {
        this.maximumConcurrency = maximumConcurrency;
        return this;
    }

    /**
     * Get the organizationProfile property: Defines the organization in which the pool will be used.
     * 
     * @return the organizationProfile value.
     */
    public OrganizationProfile organizationProfile() {
        return this.organizationProfile;
    }

    /**
     * Set the organizationProfile property: Defines the organization in which the pool will be used.
     * 
     * @param organizationProfile the organizationProfile value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withOrganizationProfile(OrganizationProfile organizationProfile) {
        this.organizationProfile = organizationProfile;
        return this;
    }

    /**
     * Get the agentProfile property: Defines how the machine will be handled once it executed a job.
     * 
     * @return the agentProfile value.
     */
    public AgentProfile agentProfile() {
        return this.agentProfile;
    }

    /**
     * Set the agentProfile property: Defines how the machine will be handled once it executed a job.
     * 
     * @param agentProfile the agentProfile value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withAgentProfile(AgentProfile agentProfile) {
        this.agentProfile = agentProfile;
        return this;
    }

    /**
     * Get the fabricProfile property: Defines the type of fabric the agent will run on.
     * 
     * @return the fabricProfile value.
     */
    public FabricProfile fabricProfile() {
        return this.fabricProfile;
    }

    /**
     * Set the fabricProfile property: Defines the type of fabric the agent will run on.
     * 
     * @param fabricProfile the fabricProfile value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withFabricProfile(FabricProfile fabricProfile) {
        this.fabricProfile = fabricProfile;
        return this;
    }

    /**
     * Get the devCenterProjectResourceId property: The resource id of the DevCenter Project the pool belongs to.
     * 
     * @return the devCenterProjectResourceId value.
     */
    public String devCenterProjectResourceId() {
        return this.devCenterProjectResourceId;
    }

    /**
     * Set the devCenterProjectResourceId property: The resource id of the DevCenter Project the pool belongs to.
     * 
     * @param devCenterProjectResourceId the devCenterProjectResourceId value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withDevCenterProjectResourceId(String devCenterProjectResourceId) {
        this.devCenterProjectResourceId = devCenterProjectResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (organizationProfile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property organizationProfile in model PoolProperties"));
        } else {
            organizationProfile().validate();
        }
        if (agentProfile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property agentProfile in model PoolProperties"));
        } else {
            agentProfile().validate();
        }
        if (fabricProfile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property fabricProfile in model PoolProperties"));
        } else {
            fabricProfile().validate();
        }
        if (devCenterProjectResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property devCenterProjectResourceId in model PoolProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("maximumConcurrency", this.maximumConcurrency);
        jsonWriter.writeJsonField("organizationProfile", this.organizationProfile);
        jsonWriter.writeJsonField("agentProfile", this.agentProfile);
        jsonWriter.writeJsonField("fabricProfile", this.fabricProfile);
        jsonWriter.writeStringField("devCenterProjectResourceId", this.devCenterProjectResourceId);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PoolProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PoolProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PoolProperties.
     */
    public static PoolProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PoolProperties deserializedPoolProperties = new PoolProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maximumConcurrency".equals(fieldName)) {
                    deserializedPoolProperties.maximumConcurrency = reader.getInt();
                } else if ("organizationProfile".equals(fieldName)) {
                    deserializedPoolProperties.organizationProfile = OrganizationProfile.fromJson(reader);
                } else if ("agentProfile".equals(fieldName)) {
                    deserializedPoolProperties.agentProfile = AgentProfile.fromJson(reader);
                } else if ("fabricProfile".equals(fieldName)) {
                    deserializedPoolProperties.fabricProfile = FabricProfile.fromJson(reader);
                } else if ("devCenterProjectResourceId".equals(fieldName)) {
                    deserializedPoolProperties.devCenterProjectResourceId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPoolProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPoolProperties;
        });
    }
}
