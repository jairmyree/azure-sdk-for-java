// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of schema registry cluster spec.
 */
@Fluent
public final class SchemaRegistryClusterSpecEntity implements JsonSerializable<SchemaRegistryClusterSpecEntity> {
    /*
     * Name of the schema registry cluster
     */
    private String name;

    /*
     * Http endpoint of the cluster
     */
    private String httpEndpoint;

    /*
     * Type of the cluster package Advanced, essentials
     */
    private String packageProperty;

    /*
     * Region details of the schema registry cluster
     */
    private SchemaRegistryClusterEnvironmentRegionEntity region;

    /*
     * Environment details of the schema registry cluster
     */
    private SchemaRegistryClusterEnvironmentRegionEntity environment;

    /*
     * The cloud service provider
     */
    private String cloud;

    /**
     * Creates an instance of SchemaRegistryClusterSpecEntity class.
     */
    public SchemaRegistryClusterSpecEntity() {
    }

    /**
     * Get the name property: Name of the schema registry cluster.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the schema registry cluster.
     * 
     * @param name the name value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the httpEndpoint property: Http endpoint of the cluster.
     * 
     * @return the httpEndpoint value.
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * Set the httpEndpoint property: Http endpoint of the cluster.
     * 
     * @param httpEndpoint the httpEndpoint value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    /**
     * Get the packageProperty property: Type of the cluster package Advanced, essentials.
     * 
     * @return the packageProperty value.
     */
    public String packageProperty() {
        return this.packageProperty;
    }

    /**
     * Set the packageProperty property: Type of the cluster package Advanced, essentials.
     * 
     * @param packageProperty the packageProperty value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withPackageProperty(String packageProperty) {
        this.packageProperty = packageProperty;
        return this;
    }

    /**
     * Get the region property: Region details of the schema registry cluster.
     * 
     * @return the region value.
     */
    public SchemaRegistryClusterEnvironmentRegionEntity region() {
        return this.region;
    }

    /**
     * Set the region property: Region details of the schema registry cluster.
     * 
     * @param region the region value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withRegion(SchemaRegistryClusterEnvironmentRegionEntity region) {
        this.region = region;
        return this;
    }

    /**
     * Get the environment property: Environment details of the schema registry cluster.
     * 
     * @return the environment value.
     */
    public SchemaRegistryClusterEnvironmentRegionEntity environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Environment details of the schema registry cluster.
     * 
     * @param environment the environment value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withEnvironment(SchemaRegistryClusterEnvironmentRegionEntity environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the cloud property: The cloud service provider.
     * 
     * @return the cloud value.
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * Set the cloud property: The cloud service provider.
     * 
     * @param cloud the cloud value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (region() != null) {
            region().validate();
        }
        if (environment() != null) {
            environment().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("httpEndpoint", this.httpEndpoint);
        jsonWriter.writeStringField("package", this.packageProperty);
        jsonWriter.writeJsonField("region", this.region);
        jsonWriter.writeJsonField("environment", this.environment);
        jsonWriter.writeStringField("cloud", this.cloud);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SchemaRegistryClusterSpecEntity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SchemaRegistryClusterSpecEntity if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SchemaRegistryClusterSpecEntity.
     */
    public static SchemaRegistryClusterSpecEntity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SchemaRegistryClusterSpecEntity deserializedSchemaRegistryClusterSpecEntity
                = new SchemaRegistryClusterSpecEntity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.name = reader.getString();
                } else if ("httpEndpoint".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.httpEndpoint = reader.getString();
                } else if ("package".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.packageProperty = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.region
                        = SchemaRegistryClusterEnvironmentRegionEntity.fromJson(reader);
                } else if ("environment".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.environment
                        = SchemaRegistryClusterEnvironmentRegionEntity.fromJson(reader);
                } else if ("cloud".equals(fieldName)) {
                    deserializedSchemaRegistryClusterSpecEntity.cloud = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchemaRegistryClusterSpecEntity;
        });
    }
}
