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
 * Synapse activity authentication properties.
 */
@Fluent
public final class SynapseActivityAuthentication implements JsonSerializable<SynapseActivityAuthentication> {
    /*
     * Synapse activity authentication (MSI/UserAssignedManagedIdentity)
     */
    @Generated
    private String type;

    /*
     * The credential reference containing authentication information.
     */
    @Generated
    private CredentialReference credential;

    /**
     * Creates an instance of SynapseActivityAuthentication class.
     */
    @Generated
    public SynapseActivityAuthentication() {
    }

    /**
     * Get the type property: Synapse activity authentication (MSI/UserAssignedManagedIdentity).
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Synapse activity authentication (MSI/UserAssignedManagedIdentity).
     * 
     * @param type the type value to set.
     * @return the SynapseActivityAuthentication object itself.
     */
    @Generated
    public SynapseActivityAuthentication setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    @Generated
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the SynapseActivityAuthentication object itself.
     */
    @Generated
    public SynapseActivityAuthentication setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SynapseActivityAuthentication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SynapseActivityAuthentication if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SynapseActivityAuthentication.
     */
    @Generated
    public static SynapseActivityAuthentication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SynapseActivityAuthentication deserializedSynapseActivityAuthentication
                = new SynapseActivityAuthentication();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedSynapseActivityAuthentication.type = reader.getString();
                } else if ("credential".equals(fieldName)) {
                    deserializedSynapseActivityAuthentication.credential = CredentialReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSynapseActivityAuthentication;
        });
    }
}
