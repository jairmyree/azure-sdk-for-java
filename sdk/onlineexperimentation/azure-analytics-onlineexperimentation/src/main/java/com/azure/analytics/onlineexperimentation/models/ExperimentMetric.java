// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.onlineexperimentation.models;

import com.azure.analytics.onlineexperimentation.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Defines experiment metric metadata and computation details.
 */
@Fluent
public final class ExperimentMetric implements JsonSerializable<ExperimentMetric> {

    /*
     * Identifier for this experiment metric. Must start with a lowercase letter and contain only lowercase letters,
     * numbers, and underscores.
     */
    @Generated
    private String id;

    /*
     * Determines whether it is included in experiment analysis.
     */
    @Generated
    private LifecycleStage lifecycle;

    /*
     * A user-friendly display name for the experiment metric shown in reports and dashboards.
     */
    @Generated
    private String displayName;

    /*
     * A detailed description of the experiment metric.
     */
    @Generated
    private String description;

    /*
     * Categories associated with the experiment metric. Used for organizing and filtering metrics.
     */
    @Generated
    private List<String> categories;

    /*
     * The desired direction for changes in the metric value.
     */
    @Generated
    private DesiredDirection desiredDirection;

    /*
     * The metric definition specifying how the metric value is calculated from event data.
     */
    @Generated
    private ExperimentMetricDefinition definition;

    /*
     * ETag of the experiment metric.
     */
    @Generated
    private String eTag;

    /*
     * The timestamp (UTC) of the last modification to the experiment metric resource.
     */
    @Generated
    private OffsetDateTime lastModifiedAt;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setExperimentMetricAccessor(new JsonMergePatchHelper.ExperimentMetricAccessor() {

            @Override
            public ExperimentMetric prepareModelForJsonMergePatch(ExperimentMetric model,
                boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(ExperimentMetric model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of ExperimentMetric class.
     */
    @Generated
    public ExperimentMetric() {
    }

    /**
     * Get the id property: Identifier for this experiment metric. Must start with a lowercase letter and contain only
     * lowercase letters, numbers, and underscores.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the lifecycle property: Determines whether it is included in experiment analysis.
     *
     * @return the lifecycle value.
     */
    @Generated
    public LifecycleStage getLifecycle() {
        return this.lifecycle;
    }

    /**
     * Set the lifecycle property: Determines whether it is included in experiment analysis.
     * <p>Required when create the resource.</p>
     *
     * @param lifecycle the lifecycle value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setLifecycle(LifecycleStage lifecycle) {
        this.lifecycle = lifecycle;
        this.updatedProperties.add("lifecycle");
        return this;
    }

    /**
     * Get the displayName property: A user-friendly display name for the experiment metric shown in reports and
     * dashboards.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: A user-friendly display name for the experiment metric shown in reports and
     * dashboards.
     * <p>Required when create the resource.</p>
     *
     * @param displayName the displayName value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setDisplayName(String displayName) {
        this.displayName = displayName;
        this.updatedProperties.add("displayName");
        return this;
    }

    /**
     * Get the description property: A detailed description of the experiment metric.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A detailed description of the experiment metric.
     * <p>Required when create the resource.</p>
     *
     * @param description the description value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setDescription(String description) {
        this.description = description;
        this.updatedProperties.add("description");
        return this;
    }

    /**
     * Get the categories property: Categories associated with the experiment metric. Used for organizing and filtering
     * metrics.
     *
     * @return the categories value.
     */
    @Generated
    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: Categories associated with the experiment metric. Used for organizing and filtering
     * metrics.
     * <p>Required when create the resource.</p>
     *
     * @param categories the categories value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setCategories(List<String> categories) {
        this.categories = categories;
        this.updatedProperties.add("categories");
        return this;
    }

    /**
     * Get the desiredDirection property: The desired direction for changes in the metric value.
     *
     * @return the desiredDirection value.
     */
    @Generated
    public DesiredDirection getDesiredDirection() {
        return this.desiredDirection;
    }

    /**
     * Set the desiredDirection property: The desired direction for changes in the metric value.
     * <p>Required when create the resource.</p>
     *
     * @param desiredDirection the desiredDirection value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setDesiredDirection(DesiredDirection desiredDirection) {
        this.desiredDirection = desiredDirection;
        this.updatedProperties.add("desiredDirection");
        return this;
    }

    /**
     * Get the definition property: The metric definition specifying how the metric value is calculated from event data.
     *
     * @return the definition value.
     */
    @Generated
    public ExperimentMetricDefinition getDefinition() {
        return this.definition;
    }

    /**
     * Set the definition property: The metric definition specifying how the metric value is calculated from event data.
     * <p>Required when create the resource.</p>
     *
     * @param definition the definition value to set.
     * @return the ExperimentMetric object itself.
     */
    @Generated
    public ExperimentMetric setDefinition(ExperimentMetricDefinition definition) {
        this.definition = definition;
        this.updatedProperties.add("definition");
        return this;
    }

    /**
     * Get the eTag property: ETag of the experiment metric.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModifiedAt property: The timestamp (UTC) of the last modification to the experiment metric resource.
     *
     * @return the lastModifiedAt value.
     */
    @Generated
    public OffsetDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("lifecycle", this.lifecycle == null ? null : this.lifecycle.toString());
            jsonWriter.writeStringField("displayName", this.displayName);
            jsonWriter.writeStringField("description", this.description);
            jsonWriter.writeArrayField("categories", this.categories, (writer, element) -> writer.writeString(element));
            jsonWriter.writeStringField("desiredDirection",
                this.desiredDirection == null ? null : this.desiredDirection.toString());
            jsonWriter.writeJsonField("definition", this.definition);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("lifecycle")) {
            if (this.lifecycle == null) {
                jsonWriter.writeNullField("lifecycle");
            } else {
                jsonWriter.writeStringField("lifecycle", this.lifecycle.toString());
            }
        }
        if (updatedProperties.contains("displayName")) {
            if (this.displayName == null) {
                jsonWriter.writeNullField("displayName");
            } else {
                jsonWriter.writeStringField("displayName", this.displayName);
            }
        }
        if (updatedProperties.contains("description")) {
            if (this.description == null) {
                jsonWriter.writeNullField("description");
            } else {
                jsonWriter.writeStringField("description", this.description);
            }
        }
        if (updatedProperties.contains("categories")) {
            if (this.categories == null) {
                jsonWriter.writeNullField("categories");
            } else {
                jsonWriter.writeArrayField("categories", this.categories,
                    (writer, element) -> writer.writeString(element));
            }
        }
        if (updatedProperties.contains("desiredDirection")) {
            if (this.desiredDirection == null) {
                jsonWriter.writeNullField("desiredDirection");
            } else {
                jsonWriter.writeStringField("desiredDirection", this.desiredDirection.toString());
            }
        }
        if (updatedProperties.contains("definition")) {
            if (this.definition == null) {
                jsonWriter.writeNullField("definition");
            } else {
                JsonMergePatchHelper.getExperimentMetricDefinitionAccessor()
                    .prepareModelForJsonMergePatch(this.definition, true);
                jsonWriter.writeJsonField("definition", this.definition);
                JsonMergePatchHelper.getExperimentMetricDefinitionAccessor()
                    .prepareModelForJsonMergePatch(this.definition, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExperimentMetric from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentMetric if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExperimentMetric.
     */
    @Generated
    public static ExperimentMetric fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExperimentMetric deserializedExperimentMetric = new ExperimentMetric();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedExperimentMetric.id = reader.getString();
                } else if ("eTag".equals(fieldName)) {
                    deserializedExperimentMetric.eTag = reader.getString();
                } else if ("lastModifiedAt".equals(fieldName)) {
                    deserializedExperimentMetric.lastModifiedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lifecycle".equals(fieldName)) {
                    deserializedExperimentMetric.lifecycle = LifecycleStage.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedExperimentMetric.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedExperimentMetric.description = reader.getString();
                } else if ("categories".equals(fieldName)) {
                    List<String> categories = reader.readArray(reader1 -> reader1.getString());
                    deserializedExperimentMetric.categories = categories;
                } else if ("desiredDirection".equals(fieldName)) {
                    deserializedExperimentMetric.desiredDirection = DesiredDirection.fromString(reader.getString());
                } else if ("definition".equals(fieldName)) {
                    deserializedExperimentMetric.definition = ExperimentMetricDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedExperimentMetric;
        });
    }
}
