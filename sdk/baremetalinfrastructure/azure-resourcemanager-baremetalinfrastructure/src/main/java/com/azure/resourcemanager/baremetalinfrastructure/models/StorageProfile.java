// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specifies the storage settings for the AzureBareMetal instance disks.
 */
@Fluent
public final class StorageProfile implements JsonSerializable<StorageProfile> {
    /*
     * IP Address to connect to storage.
     */
    private String nfsIpAddress;

    /*
     * Specifies information about the operating system disk used by baremetal instance.
     */
    private List<Disk> osDisks;

    /**
     * Creates an instance of StorageProfile class.
     */
    public StorageProfile() {
    }

    /**
     * Get the nfsIpAddress property: IP Address to connect to storage.
     * 
     * @return the nfsIpAddress value.
     */
    public String nfsIpAddress() {
        return this.nfsIpAddress;
    }

    /**
     * Get the osDisks property: Specifies information about the operating system disk used by baremetal instance.
     * 
     * @return the osDisks value.
     */
    public List<Disk> osDisks() {
        return this.osDisks;
    }

    /**
     * Set the osDisks property: Specifies information about the operating system disk used by baremetal instance.
     * 
     * @param osDisks the osDisks value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withOsDisks(List<Disk> osDisks) {
        this.osDisks = osDisks;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDisks() != null) {
            osDisks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("osDisks", this.osDisks, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageProfile.
     */
    public static StorageProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageProfile deserializedStorageProfile = new StorageProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nfsIpAddress".equals(fieldName)) {
                    deserializedStorageProfile.nfsIpAddress = reader.getString();
                } else if ("osDisks".equals(fieldName)) {
                    List<Disk> osDisks = reader.readArray(reader1 -> Disk.fromJson(reader1));
                    deserializedStorageProfile.osDisks = osDisks;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageProfile;
        });
    }
}
