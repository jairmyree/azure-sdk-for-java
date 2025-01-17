// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ProxyArtifactOverviewPropertiesValue model.
 */
@Fluent
public final class ProxyArtifactOverviewPropertiesValue
    implements JsonSerializable<ProxyArtifactOverviewPropertiesValue> {
    /*
     * The artifact type.
     */
    private ArtifactType artifactType;

    /*
     * The artifact version.
     */
    private String artifactVersion;

    /*
     * The artifact state
     */
    private ArtifactState artifactState;

    /**
     * Creates an instance of ProxyArtifactOverviewPropertiesValue class.
     */
    public ProxyArtifactOverviewPropertiesValue() {
    }

    /**
     * Get the artifactType property: The artifact type.
     * 
     * @return the artifactType value.
     */
    public ArtifactType artifactType() {
        return this.artifactType;
    }

    /**
     * Set the artifactType property: The artifact type.
     * 
     * @param artifactType the artifactType value to set.
     * @return the ProxyArtifactOverviewPropertiesValue object itself.
     */
    public ProxyArtifactOverviewPropertiesValue withArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * Get the artifactVersion property: The artifact version.
     * 
     * @return the artifactVersion value.
     */
    public String artifactVersion() {
        return this.artifactVersion;
    }

    /**
     * Set the artifactVersion property: The artifact version.
     * 
     * @param artifactVersion the artifactVersion value to set.
     * @return the ProxyArtifactOverviewPropertiesValue object itself.
     */
    public ProxyArtifactOverviewPropertiesValue withArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }

    /**
     * Get the artifactState property: The artifact state.
     * 
     * @return the artifactState value.
     */
    public ArtifactState artifactState() {
        return this.artifactState;
    }

    /**
     * Set the artifactState property: The artifact state.
     * 
     * @param artifactState the artifactState value to set.
     * @return the ProxyArtifactOverviewPropertiesValue object itself.
     */
    public ProxyArtifactOverviewPropertiesValue withArtifactState(ArtifactState artifactState) {
        this.artifactState = artifactState;
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
        jsonWriter.writeStringField("artifactType", this.artifactType == null ? null : this.artifactType.toString());
        jsonWriter.writeStringField("artifactVersion", this.artifactVersion);
        jsonWriter.writeStringField("artifactState", this.artifactState == null ? null : this.artifactState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProxyArtifactOverviewPropertiesValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProxyArtifactOverviewPropertiesValue if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProxyArtifactOverviewPropertiesValue.
     */
    public static ProxyArtifactOverviewPropertiesValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProxyArtifactOverviewPropertiesValue deserializedProxyArtifactOverviewPropertiesValue
                = new ProxyArtifactOverviewPropertiesValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("artifactType".equals(fieldName)) {
                    deserializedProxyArtifactOverviewPropertiesValue.artifactType
                        = ArtifactType.fromString(reader.getString());
                } else if ("artifactVersion".equals(fieldName)) {
                    deserializedProxyArtifactOverviewPropertiesValue.artifactVersion = reader.getString();
                } else if ("artifactState".equals(fieldName)) {
                    deserializedProxyArtifactOverviewPropertiesValue.artifactState
                        = ArtifactState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProxyArtifactOverviewPropertiesValue;
        });
    }
}
