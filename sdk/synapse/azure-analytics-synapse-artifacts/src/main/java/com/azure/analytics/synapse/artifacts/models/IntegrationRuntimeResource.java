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

/**
 * Integration runtime resource type.
 */
@Fluent
public final class IntegrationRuntimeResource extends SubResource {
    /*
     * Integration runtime properties.
     */
    @Generated
    private IntegrationRuntime properties;

    /*
     * Resource Etag.
     */
    @Generated
    private String etag;

    /*
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     */
    @Generated
    private String type;

    /*
     * The name of the resource
     */
    @Generated
    private String name;

    /*
     * Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{
     * resourceType}/{resourceName}
     */
    @Generated
    private String id;

    /**
     * Creates an instance of IntegrationRuntimeResource class.
     */
    @Generated
    public IntegrationRuntimeResource() {
    }

    /**
     * Get the properties property: Integration runtime properties.
     * 
     * @return the properties value.
     */
    @Generated
    public IntegrationRuntime getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     * 
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeResource object itself.
     */
    @Generated
    public IntegrationRuntimeResource setProperties(IntegrationRuntime properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Resource Etag.
     * 
     * @return the etag value.
     */
    @Generated
    @Override
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the type property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Generated
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     * 
     * @return the id value.
     */
    @Generated
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeResource.
     */
    @Generated
    public static IntegrationRuntimeResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeResource deserializedIntegrationRuntimeResource = new IntegrationRuntimeResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIntegrationRuntimeResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedIntegrationRuntimeResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIntegrationRuntimeResource.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedIntegrationRuntimeResource.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedIntegrationRuntimeResource.properties = IntegrationRuntime.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationRuntimeResource;
        });
    }
}
