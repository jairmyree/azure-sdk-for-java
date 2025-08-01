// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Capacity rule.
 */
@Fluent
public final class ResourceTypeRegistrationPropertiesCapacityRule
    implements JsonSerializable<ResourceTypeRegistrationPropertiesCapacityRule> {
    /*
     * Capacity policy.
     */
    private CapacityPolicy capacityPolicy;

    /*
     * Sku alias
     */
    private String skuAlias;

    /**
     * Creates an instance of ResourceTypeRegistrationPropertiesCapacityRule class.
     */
    public ResourceTypeRegistrationPropertiesCapacityRule() {
    }

    /**
     * Get the capacityPolicy property: Capacity policy.
     * 
     * @return the capacityPolicy value.
     */
    public CapacityPolicy capacityPolicy() {
        return this.capacityPolicy;
    }

    /**
     * Set the capacityPolicy property: Capacity policy.
     * 
     * @param capacityPolicy the capacityPolicy value to set.
     * @return the ResourceTypeRegistrationPropertiesCapacityRule object itself.
     */
    public ResourceTypeRegistrationPropertiesCapacityRule withCapacityPolicy(CapacityPolicy capacityPolicy) {
        this.capacityPolicy = capacityPolicy;
        return this;
    }

    /**
     * Get the skuAlias property: Sku alias.
     * 
     * @return the skuAlias value.
     */
    public String skuAlias() {
        return this.skuAlias;
    }

    /**
     * Set the skuAlias property: Sku alias.
     * 
     * @param skuAlias the skuAlias value to set.
     * @return the ResourceTypeRegistrationPropertiesCapacityRule object itself.
     */
    public ResourceTypeRegistrationPropertiesCapacityRule withSkuAlias(String skuAlias) {
        this.skuAlias = skuAlias;
        return this;
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
        jsonWriter.writeStringField("capacityPolicy",
            this.capacityPolicy == null ? null : this.capacityPolicy.toString());
        jsonWriter.writeStringField("skuAlias", this.skuAlias);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceTypeRegistrationPropertiesCapacityRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceTypeRegistrationPropertiesCapacityRule if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceTypeRegistrationPropertiesCapacityRule.
     */
    public static ResourceTypeRegistrationPropertiesCapacityRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceTypeRegistrationPropertiesCapacityRule deserializedResourceTypeRegistrationPropertiesCapacityRule
                = new ResourceTypeRegistrationPropertiesCapacityRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("capacityPolicy".equals(fieldName)) {
                    deserializedResourceTypeRegistrationPropertiesCapacityRule.capacityPolicy
                        = CapacityPolicy.fromString(reader.getString());
                } else if ("skuAlias".equals(fieldName)) {
                    deserializedResourceTypeRegistrationPropertiesCapacityRule.skuAlias = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceTypeRegistrationPropertiesCapacityRule;
        });
    }
}
