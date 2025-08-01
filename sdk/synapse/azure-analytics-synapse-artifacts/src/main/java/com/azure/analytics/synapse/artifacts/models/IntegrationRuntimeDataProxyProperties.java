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
 * Data proxy properties for a managed dedicated integration runtime.
 */
@Fluent
public final class IntegrationRuntimeDataProxyProperties
    implements JsonSerializable<IntegrationRuntimeDataProxyProperties> {
    /*
     * The self-hosted integration runtime reference.
     */
    @Generated
    private EntityReference connectVia;

    /*
     * The staging linked service reference.
     */
    @Generated
    private EntityReference stagingLinkedService;

    /*
     * The path to contain the staged data in the Blob storage.
     */
    @Generated
    private String path;

    /**
     * Creates an instance of IntegrationRuntimeDataProxyProperties class.
     */
    @Generated
    public IntegrationRuntimeDataProxyProperties() {
    }

    /**
     * Get the connectVia property: The self-hosted integration runtime reference.
     * 
     * @return the connectVia value.
     */
    @Generated
    public EntityReference getConnectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The self-hosted integration runtime reference.
     * 
     * @param connectVia the connectVia value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    @Generated
    public IntegrationRuntimeDataProxyProperties setConnectVia(EntityReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the stagingLinkedService property: The staging linked service reference.
     * 
     * @return the stagingLinkedService value.
     */
    @Generated
    public EntityReference getStagingLinkedService() {
        return this.stagingLinkedService;
    }

    /**
     * Set the stagingLinkedService property: The staging linked service reference.
     * 
     * @param stagingLinkedService the stagingLinkedService value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    @Generated
    public IntegrationRuntimeDataProxyProperties setStagingLinkedService(EntityReference stagingLinkedService) {
        this.stagingLinkedService = stagingLinkedService;
        return this;
    }

    /**
     * Get the path property: The path to contain the staged data in the Blob storage.
     * 
     * @return the path value.
     */
    @Generated
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path to contain the staged data in the Blob storage.
     * 
     * @param path the path value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    @Generated
    public IntegrationRuntimeDataProxyProperties setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("connectVia", this.connectVia);
        jsonWriter.writeJsonField("stagingLinkedService", this.stagingLinkedService);
        jsonWriter.writeStringField("path", this.path);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeDataProxyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeDataProxyProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeDataProxyProperties.
     */
    @Generated
    public static IntegrationRuntimeDataProxyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeDataProxyProperties deserializedIntegrationRuntimeDataProxyProperties
                = new IntegrationRuntimeDataProxyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataProxyProperties.connectVia = EntityReference.fromJson(reader);
                } else if ("stagingLinkedService".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataProxyProperties.stagingLinkedService
                        = EntityReference.fromJson(reader);
                } else if ("path".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataProxyProperties.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationRuntimeDataProxyProperties;
        });
    }
}
