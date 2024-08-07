// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * SSH configuration for Linux-based VMs running on Azure.
 */
@Fluent
public final class ContainerServiceSshConfiguration implements JsonSerializable<ContainerServiceSshConfiguration> {
    /*
     * The list of SSH public keys used to authenticate with Linux-based VMs. A maximum of 1 key may be specified.
     */
    private List<ContainerServiceSshPublicKey> publicKeys;

    /**
     * Creates an instance of ContainerServiceSshConfiguration class.
     */
    public ContainerServiceSshConfiguration() {
    }

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. A maximum of
     * 1 key may be specified.
     * 
     * @return the publicKeys value.
     */
    public List<ContainerServiceSshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. A maximum of
     * 1 key may be specified.
     * 
     * @param publicKeys the publicKeys value to set.
     * @return the ContainerServiceSshConfiguration object itself.
     */
    public ContainerServiceSshConfiguration withPublicKeys(List<ContainerServiceSshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publicKeys in model ContainerServiceSshConfiguration"));
        } else {
            publicKeys().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerServiceSshConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("publicKeys", this.publicKeys, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerServiceSshConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerServiceSshConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerServiceSshConfiguration.
     */
    public static ContainerServiceSshConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerServiceSshConfiguration deserializedContainerServiceSshConfiguration
                = new ContainerServiceSshConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicKeys".equals(fieldName)) {
                    List<ContainerServiceSshPublicKey> publicKeys
                        = reader.readArray(reader1 -> ContainerServiceSshPublicKey.fromJson(reader1));
                    deserializedContainerServiceSshConfiguration.publicKeys = publicKeys;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerServiceSshConfiguration;
        });
    }
}
