// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.fluent.models.LoadBalancingSettingsProperties;
import java.io.IOException;

/**
 * Load balancing settings for a backend pool.
 */
@Fluent
public final class LoadBalancingSettingsModel extends SubResource {
    /*
     * Properties of the load balancing settings
     */
    private LoadBalancingSettingsProperties innerProperties;

    /*
     * Resource name.
     */
    private String name;

    /*
     * Resource type.
     */
    private String type;

    /**
     * Creates an instance of LoadBalancingSettingsModel class.
     */
    public LoadBalancingSettingsModel() {
    }

    /**
     * Get the innerProperties property: Properties of the load balancing settings.
     * 
     * @return the innerProperties value.
     */
    private LoadBalancingSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     * 
     * @param name the name value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancingSettingsModel withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @return the sampleSize value.
     */
    public Integer sampleSize() {
        return this.innerProperties() == null ? null : this.innerProperties().sampleSize();
    }

    /**
     * Set the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @param sampleSize the sampleSize value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withSampleSize(Integer sampleSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingSettingsProperties();
        }
        this.innerProperties().withSampleSize(sampleSize);
        return this;
    }

    /**
     * Get the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @return the successfulSamplesRequired value.
     */
    public Integer successfulSamplesRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().successfulSamplesRequired();
    }

    /**
     * Set the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @param successfulSamplesRequired the successfulSamplesRequired value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withSuccessfulSamplesRequired(Integer successfulSamplesRequired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingSettingsProperties();
        }
        this.innerProperties().withSuccessfulSamplesRequired(successfulSamplesRequired);
        return this;
    }

    /**
     * Get the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     * 
     * @return the additionalLatencyMilliseconds value.
     */
    public Integer additionalLatencyMilliseconds() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalLatencyMilliseconds();
    }

    /**
     * Set the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     * 
     * @param additionalLatencyMilliseconds the additionalLatencyMilliseconds value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withAdditionalLatencyMilliseconds(Integer additionalLatencyMilliseconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingSettingsProperties();
        }
        this.innerProperties().withAdditionalLatencyMilliseconds(additionalLatencyMilliseconds);
        return this;
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancingSettingsModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancingSettingsModel if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancingSettingsModel.
     */
    public static LoadBalancingSettingsModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancingSettingsModel deserializedLoadBalancingSettingsModel = new LoadBalancingSettingsModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLoadBalancingSettingsModel.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedLoadBalancingSettingsModel.innerProperties
                        = LoadBalancingSettingsProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedLoadBalancingSettingsModel.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLoadBalancingSettingsModel.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancingSettingsModel;
        });
    }
}
