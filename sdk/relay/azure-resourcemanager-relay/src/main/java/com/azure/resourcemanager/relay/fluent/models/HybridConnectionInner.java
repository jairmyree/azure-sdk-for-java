// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Description of hybrid connection resource.
 */
@Fluent
public final class HybridConnectionInner extends ProxyResource {
    /*
     * Properties of the HybridConnection.
     */
    private HybridConnectionProperties innerProperties;

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
     * Creates an instance of HybridConnectionInner class.
     */
    public HybridConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the HybridConnection.
     * 
     * @return the innerProperties value.
     */
    private HybridConnectionProperties innerProperties() {
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
     * Get the createdAt property: The time the hybrid connection was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the listenerCount property: The number of listeners for this hybrid connection. Note that min : 1 and max:25
     * are supported.
     * 
     * @return the listenerCount value.
     */
    public Integer listenerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().listenerCount();
    }

    /**
     * Get the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     * 
     * @return the requiresClientAuthorization value.
     */
    public Boolean requiresClientAuthorization() {
        return this.innerProperties() == null ? null : this.innerProperties().requiresClientAuthorization();
    }

    /**
     * Set the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     * 
     * @param requiresClientAuthorization the requiresClientAuthorization value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRequiresClientAuthorization(Boolean requiresClientAuthorization) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withRequiresClientAuthorization(requiresClientAuthorization);
        return this;
    }

    /**
     * Get the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the hybrid
     * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their
     * contact information. Also, user-defined configuration settings can be stored.
     * 
     * @return the userMetadata value.
     */
    public String userMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().userMetadata();
    }

    /**
     * Set the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the hybrid
     * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their
     * contact information. Also, user-defined configuration settings can be stored.
     * 
     * @param userMetadata the userMetadata value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withUserMetadata(String userMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withUserMetadata(userMetadata);
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridConnectionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HybridConnectionInner.
     */
    public static HybridConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridConnectionInner deserializedHybridConnectionInner = new HybridConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHybridConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedHybridConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedHybridConnectionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedHybridConnectionInner.innerProperties = HybridConnectionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridConnectionInner;
        });
    }
}
