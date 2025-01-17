// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ResourceProviderManifestManagement model.
 */
@Fluent
public final class ResourceProviderManifestManagement extends ResourceProviderManagement {
    /**
     * Creates an instance of ResourceProviderManifestManagement class.
     */
    public ResourceProviderManifestManagement() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withSchemaOwners(List<String> schemaOwners) {
        super.withSchemaOwners(schemaOwners);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withManifestOwners(List<String> manifestOwners) {
        super.withManifestOwners(manifestOwners);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withIncidentRoutingService(String incidentRoutingService) {
        super.withIncidentRoutingService(incidentRoutingService);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withIncidentRoutingTeam(String incidentRoutingTeam) {
        super.withIncidentRoutingTeam(incidentRoutingTeam);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withIncidentContactEmail(String incidentContactEmail) {
        super.withIncidentContactEmail(incidentContactEmail);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withServiceTreeInfos(List<ServiceTreeInfo> serviceTreeInfos) {
        super.withServiceTreeInfos(serviceTreeInfos);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withResourceAccessPolicy(ResourceAccessPolicy resourceAccessPolicy) {
        super.withResourceAccessPolicy(resourceAccessPolicy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceProviderManifestManagement withResourceAccessRoles(List<Object> resourceAccessRoles) {
        super.withResourceAccessRoles(resourceAccessRoles);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (serviceTreeInfos() != null) {
            serviceTreeInfos().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("schemaOwners", schemaOwners(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("manifestOwners", manifestOwners(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("incidentRoutingService", incidentRoutingService());
        jsonWriter.writeStringField("incidentRoutingTeam", incidentRoutingTeam());
        jsonWriter.writeStringField("incidentContactEmail", incidentContactEmail());
        jsonWriter.writeArrayField("serviceTreeInfos", serviceTreeInfos(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("resourceAccessPolicy",
            resourceAccessPolicy() == null ? null : resourceAccessPolicy().toString());
        jsonWriter.writeArrayField("resourceAccessRoles", resourceAccessRoles(),
            (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceProviderManifestManagement from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceProviderManifestManagement if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceProviderManifestManagement.
     */
    public static ResourceProviderManifestManagement fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceProviderManifestManagement deserializedResourceProviderManifestManagement
                = new ResourceProviderManifestManagement();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schemaOwners".equals(fieldName)) {
                    List<String> schemaOwners = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceProviderManifestManagement.withSchemaOwners(schemaOwners);
                } else if ("manifestOwners".equals(fieldName)) {
                    List<String> manifestOwners = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceProviderManifestManagement.withManifestOwners(manifestOwners);
                } else if ("incidentRoutingService".equals(fieldName)) {
                    deserializedResourceProviderManifestManagement.withIncidentRoutingService(reader.getString());
                } else if ("incidentRoutingTeam".equals(fieldName)) {
                    deserializedResourceProviderManifestManagement.withIncidentRoutingTeam(reader.getString());
                } else if ("incidentContactEmail".equals(fieldName)) {
                    deserializedResourceProviderManifestManagement.withIncidentContactEmail(reader.getString());
                } else if ("serviceTreeInfos".equals(fieldName)) {
                    List<ServiceTreeInfo> serviceTreeInfos
                        = reader.readArray(reader1 -> ServiceTreeInfo.fromJson(reader1));
                    deserializedResourceProviderManifestManagement.withServiceTreeInfos(serviceTreeInfos);
                } else if ("resourceAccessPolicy".equals(fieldName)) {
                    deserializedResourceProviderManifestManagement
                        .withResourceAccessPolicy(ResourceAccessPolicy.fromString(reader.getString()));
                } else if ("resourceAccessRoles".equals(fieldName)) {
                    List<Object> resourceAccessRoles = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedResourceProviderManifestManagement.withResourceAccessRoles(resourceAccessRoles);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceProviderManifestManagement;
        });
    }
}
