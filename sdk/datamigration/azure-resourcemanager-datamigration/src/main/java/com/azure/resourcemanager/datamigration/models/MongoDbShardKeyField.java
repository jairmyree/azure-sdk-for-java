// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a field reference within a MongoDB shard key.
 */
@Fluent
public final class MongoDbShardKeyField implements JsonSerializable<MongoDbShardKeyField> {
    /*
     * The name of the field
     */
    private String name;

    /*
     * The field ordering
     */
    private MongoDbShardKeyOrder order;

    /**
     * Creates an instance of MongoDbShardKeyField class.
     */
    public MongoDbShardKeyField() {
    }

    /**
     * Get the name property: The name of the field.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the field.
     * 
     * @param name the name value to set.
     * @return the MongoDbShardKeyField object itself.
     */
    public MongoDbShardKeyField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the order property: The field ordering.
     * 
     * @return the order value.
     */
    public MongoDbShardKeyOrder order() {
        return this.order;
    }

    /**
     * Set the order property: The field ordering.
     * 
     * @param order the order value to set.
     * @return the MongoDbShardKeyField object itself.
     */
    public MongoDbShardKeyField withOrder(MongoDbShardKeyOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model MongoDbShardKeyField"));
        }
        if (order() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property order in model MongoDbShardKeyField"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbShardKeyField.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("order", this.order == null ? null : this.order.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoDbShardKeyField from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDbShardKeyField if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MongoDbShardKeyField.
     */
    public static MongoDbShardKeyField fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDbShardKeyField deserializedMongoDbShardKeyField = new MongoDbShardKeyField();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMongoDbShardKeyField.name = reader.getString();
                } else if ("order".equals(fieldName)) {
                    deserializedMongoDbShardKeyField.order = MongoDbShardKeyOrder.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoDbShardKeyField;
        });
    }
}
