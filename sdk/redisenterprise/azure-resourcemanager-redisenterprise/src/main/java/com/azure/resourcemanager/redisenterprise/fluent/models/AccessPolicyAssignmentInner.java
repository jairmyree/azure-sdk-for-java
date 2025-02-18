// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redisenterprise.models.AccessPolicyAssignmentPropertiesUser;
import com.azure.resourcemanager.redisenterprise.models.ProvisioningState;
import java.io.IOException;

/**
 * Describes the access policy assignment of Redis Enterprise database.
 */
@Fluent
public final class AccessPolicyAssignmentInner extends ProxyResource {
    /*
     * Properties of the access policy assignment.
     */
    private AccessPolicyAssignmentProperties innerProperties;

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
     * Creates an instance of AccessPolicyAssignmentInner class.
     */
    public AccessPolicyAssignmentInner() {
    }

    /**
     * Get the innerProperties property: Properties of the access policy assignment.
     * 
     * @return the innerProperties value.
     */
    private AccessPolicyAssignmentProperties innerProperties() {
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
     * Get the provisioningState property: Current provisioning status of the access policy assignment.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the accessPolicyName property: Name of access policy under specific access policy assignment. Only "default"
     * policy is supported for now.
     * 
     * @return the accessPolicyName value.
     */
    public String accessPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().accessPolicyName();
    }

    /**
     * Set the accessPolicyName property: Name of access policy under specific access policy assignment. Only "default"
     * policy is supported for now.
     * 
     * @param accessPolicyName the accessPolicyName value to set.
     * @return the AccessPolicyAssignmentInner object itself.
     */
    public AccessPolicyAssignmentInner withAccessPolicyName(String accessPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessPolicyAssignmentProperties();
        }
        this.innerProperties().withAccessPolicyName(accessPolicyName);
        return this;
    }

    /**
     * Get the user property: The user associated with the access policy.
     * 
     * @return the user value.
     */
    public AccessPolicyAssignmentPropertiesUser user() {
        return this.innerProperties() == null ? null : this.innerProperties().user();
    }

    /**
     * Set the user property: The user associated with the access policy.
     * 
     * @param user the user value to set.
     * @return the AccessPolicyAssignmentInner object itself.
     */
    public AccessPolicyAssignmentInner withUser(AccessPolicyAssignmentPropertiesUser user) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessPolicyAssignmentProperties();
        }
        this.innerProperties().withUser(user);
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
     * Reads an instance of AccessPolicyAssignmentInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccessPolicyAssignmentInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AccessPolicyAssignmentInner.
     */
    public static AccessPolicyAssignmentInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccessPolicyAssignmentInner deserializedAccessPolicyAssignmentInner = new AccessPolicyAssignmentInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAccessPolicyAssignmentInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAccessPolicyAssignmentInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAccessPolicyAssignmentInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAccessPolicyAssignmentInner.innerProperties
                        = AccessPolicyAssignmentProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccessPolicyAssignmentInner;
        });
    }
}
