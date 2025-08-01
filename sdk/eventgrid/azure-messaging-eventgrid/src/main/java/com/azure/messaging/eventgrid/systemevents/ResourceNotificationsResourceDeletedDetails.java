// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the schema of the properties under resource info which are common across all ARN system topic delete
 * events.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class ResourceNotificationsResourceDeletedDetails
    implements JsonSerializable<ResourceNotificationsResourceDeletedDetails> {

    /*
     * id of the resource for which the event is being emitted
     */
    @Generated
    private String id;

    /*
     * name of the resource for which the event is being emitted
     */
    @Generated
    private String name;

    /*
     * the type of the resource for which the event is being emitted
     */
    @Generated
    private String type;

    /**
     * Creates an instance of ResourceNotificationsResourceDeletedDetails class.
     */
    @Generated
    public ResourceNotificationsResourceDeletedDetails() {
    }

    /**
     * Get the id property: id of the resource for which the event is being emitted.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: id of the resource for which the event is being emitted.
     *
     * @param id the id value to set.
     * @return the ResourceNotificationsResourceDeletedDetails object itself.
     */
    @Generated
    public ResourceNotificationsResourceDeletedDetails setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: name of the resource for which the event is being emitted.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: name of the resource for which the event is being emitted.
     *
     * @param name the name value to set.
     * @return the ResourceNotificationsResourceDeletedDetails object itself.
     */
    @Generated
    public ResourceNotificationsResourceDeletedDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: the type of the resource for which the event is being emitted.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: the type of the resource for which the event is being emitted.
     *
     * @param type the type value to set.
     * @return the ResourceNotificationsResourceDeletedDetails object itself.
     */
    @Generated
    public ResourceNotificationsResourceDeletedDetails setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceNotificationsResourceDeletedDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceNotificationsResourceDeletedDetails if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceNotificationsResourceDeletedDetails.
     */
    @Generated
    public static ResourceNotificationsResourceDeletedDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceNotificationsResourceDeletedDetails deserializedResourceNotificationsResourceDeletedDetails
                = new ResourceNotificationsResourceDeletedDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedResourceNotificationsResourceDeletedDetails.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedResourceNotificationsResourceDeletedDetails.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedResourceNotificationsResourceDeletedDetails.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedResourceNotificationsResourceDeletedDetails;
        });
    }
}
