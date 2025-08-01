// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies information about the gallery inVMAccessControlProfile that you want to update.
 */
@Fluent
public final class GalleryInVMAccessControlProfileUpdate extends UpdateResourceDefinition {
    /*
     * Describes the properties of a gallery inVMAccessControlProfile.
     */
    private GalleryInVMAccessControlProfileProperties properties;

    /*
     * Resource type
     */
    private String type;

    /*
     * Resource name
     */
    private String name;

    /*
     * Resource Id
     */
    private String id;

    /**
     * Creates an instance of GalleryInVMAccessControlProfileUpdate class.
     */
    public GalleryInVMAccessControlProfileUpdate() {
    }

    /**
     * Get the properties property: Describes the properties of a gallery inVMAccessControlProfile.
     * 
     * @return the properties value.
     */
    public GalleryInVMAccessControlProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes the properties of a gallery inVMAccessControlProfile.
     * 
     * @param properties the properties value to set.
     * @return the GalleryInVMAccessControlProfileUpdate object itself.
     */
    public GalleryInVMAccessControlProfileUpdate withProperties(GalleryInVMAccessControlProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Resource Id.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryInVMAccessControlProfileUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryInVMAccessControlProfileUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryInVMAccessControlProfileUpdate if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GalleryInVMAccessControlProfileUpdate.
     */
    public static GalleryInVMAccessControlProfileUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryInVMAccessControlProfileUpdate deserializedGalleryInVMAccessControlProfileUpdate
                = new GalleryInVMAccessControlProfileUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedGalleryInVMAccessControlProfileUpdate.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedGalleryInVMAccessControlProfileUpdate.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedGalleryInVMAccessControlProfileUpdate.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedGalleryInVMAccessControlProfileUpdate.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedGalleryInVMAccessControlProfileUpdate.properties
                        = GalleryInVMAccessControlProfileProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryInVMAccessControlProfileUpdate;
        });
    }
}
