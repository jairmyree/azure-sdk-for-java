// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.healthcareapis.fluent.models.ServicesPropertiesUpdateParameters;
import java.io.IOException;
import java.util.Map;

/**
 * The description of the service.
 */
@Fluent
public final class ServicesPatchDescription implements JsonSerializable<ServicesPatchDescription> {
    /*
     * Instance tags
     */
    private Map<String, String> tags;

    /*
     * The properties for updating a service instance.
     */
    private ServicesPropertiesUpdateParameters innerProperties;

    /**
     * Creates an instance of ServicesPatchDescription class.
     */
    public ServicesPatchDescription() {
    }

    /**
     * Get the tags property: Instance tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Instance tags.
     * 
     * @param tags the tags value to set.
     * @return the ServicesPatchDescription object itself.
     */
    public ServicesPatchDescription withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties for updating a service instance.
     * 
     * @return the innerProperties value.
     */
    private ServicesPropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServicesPatchDescription object itself.
     */
    public ServicesPatchDescription withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServicesPropertiesUpdateParameters();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicesPatchDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicesPatchDescription if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServicesPatchDescription.
     */
    public static ServicesPatchDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicesPatchDescription deserializedServicesPatchDescription = new ServicesPatchDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedServicesPatchDescription.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedServicesPatchDescription.innerProperties
                        = ServicesPropertiesUpdateParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicesPatchDescription;
        });
    }
}
