// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the private endpoint connection.
 */
@Fluent
public final class PrivateEndpointConnectionProperties
    implements JsonSerializable<PrivateEndpointConnectionProperties> {
    /*
     * The private endpoint resource.
     */
    private PrivateEndpoint privateEndpoint;

    /*
     * A collection of information about the state of the connection between service consumer and provider.
     */
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * The provisioning state of the private endpoint connection resource.
     */
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /*
     * The group ids for the private endpoint resource.
     */
    private List<String> groupIds;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

    /**
     * Get the privateEndpoint property: The private endpoint resource.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The private endpoint resource.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection resource.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the groupIds property: The group ids for the private endpoint resource.
     * 
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property privateLinkServiceConnectionState in model PrivateEndpointConnectionProperties"));
        } else {
            privateLinkServiceConnectionState().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("privateLinkServiceConnectionState", this.privateLinkServiceConnectionState);
        jsonWriter.writeJsonField("privateEndpoint", this.privateEndpoint);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionProperties.
     */
    public static PrivateEndpointConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionProperties deserializedPrivateEndpointConnectionProperties
                = new PrivateEndpointConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateLinkServiceConnectionState
                        = PrivateLinkServiceConnectionState.fromJson(reader);
                } else if ("privateEndpoint".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateEndpoint = PrivateEndpoint.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.provisioningState
                        = PrivateEndpointConnectionProvisioningState.fromString(reader.getString());
                } else if ("groupIds".equals(fieldName)) {
                    List<String> groupIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateEndpointConnectionProperties.groupIds = groupIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionProperties;
        });
    }
}
