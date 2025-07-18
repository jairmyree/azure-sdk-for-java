// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.onlineexperimentation.models;

import com.azure.analytics.onlineexperimentation.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * The definition of a UserRate metric definition. Calculates the percentage of users who encounter a start event and
 * subsequently an end event. Users must encounter events in the specified order.
 */
@Fluent
public final class UserRateMetricDefinition extends ExperimentMetricDefinition {

    /*
     * Discriminator property for ExperimentMetricDefinition.
     */
    @Generated
    private ExperimentMetricType type = ExperimentMetricType.USER_RATE;

    /*
     * The start event to observe as the rate denominator.
     */
    @Generated
    private ObservedEvent startEvent;

    /*
     * The end event to observe, which is a condition for the rate numerator.
     */
    @Generated
    private ObservedEvent endEvent;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of UserRateMetricDefinition class.
     */
    @Generated
    public UserRateMetricDefinition() {
    }

    /**
     * Get the type property: Discriminator property for ExperimentMetricDefinition.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public ExperimentMetricType getType() {
        return this.type;
    }

    /**
     * Get the startEvent property: The start event to observe as the rate denominator.
     *
     * @return the startEvent value.
     */
    @Generated
    public ObservedEvent getStartEvent() {
        return this.startEvent;
    }

    /**
     * Set the startEvent property: The start event to observe as the rate denominator.
     * <p>Required when create the resource.</p>
     *
     * @param startEvent the startEvent value to set.
     * @return the UserRateMetricDefinition object itself.
     */
    @Generated
    public UserRateMetricDefinition setStartEvent(ObservedEvent startEvent) {
        this.startEvent = startEvent;
        this.updatedProperties.add("startEvent");
        return this;
    }

    /**
     * Get the endEvent property: The end event to observe, which is a condition for the rate numerator.
     *
     * @return the endEvent value.
     */
    @Generated
    public ObservedEvent getEndEvent() {
        return this.endEvent;
    }

    /**
     * Set the endEvent property: The end event to observe, which is a condition for the rate numerator.
     * <p>Required when create the resource.</p>
     *
     * @param endEvent the endEvent value to set.
     * @return the UserRateMetricDefinition object itself.
     */
    @Generated
    public UserRateMetricDefinition setEndEvent(ObservedEvent endEvent) {
        this.endEvent = endEvent;
        this.updatedProperties.add("endEvent");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getExperimentMetricDefinitionAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
            jsonWriter.writeJsonField("startEvent", this.startEvent);
            jsonWriter.writeJsonField("endEvent", this.endEvent);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type.toString());
        if (updatedProperties.contains("startEvent")) {
            if (this.startEvent == null) {
                jsonWriter.writeNullField("startEvent");
            } else {
                JsonMergePatchHelper.getObservedEventAccessor().prepareModelForJsonMergePatch(this.startEvent, true);
                jsonWriter.writeJsonField("startEvent", this.startEvent);
                JsonMergePatchHelper.getObservedEventAccessor().prepareModelForJsonMergePatch(this.startEvent, false);
            }
        }
        if (updatedProperties.contains("endEvent")) {
            if (this.endEvent == null) {
                jsonWriter.writeNullField("endEvent");
            } else {
                JsonMergePatchHelper.getObservedEventAccessor().prepareModelForJsonMergePatch(this.endEvent, true);
                jsonWriter.writeJsonField("endEvent", this.endEvent);
                JsonMergePatchHelper.getObservedEventAccessor().prepareModelForJsonMergePatch(this.endEvent, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserRateMetricDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserRateMetricDefinition if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserRateMetricDefinition.
     */
    @Generated
    public static UserRateMetricDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserRateMetricDefinition deserializedUserRateMetricDefinition = new UserRateMetricDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedUserRateMetricDefinition.type = ExperimentMetricType.fromString(reader.getString());
                } else if ("startEvent".equals(fieldName)) {
                    deserializedUserRateMetricDefinition.startEvent = ObservedEvent.fromJson(reader);
                } else if ("endEvent".equals(fieldName)) {
                    deserializedUserRateMetricDefinition.endEvent = ObservedEvent.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedUserRateMetricDefinition;
        });
    }
}
