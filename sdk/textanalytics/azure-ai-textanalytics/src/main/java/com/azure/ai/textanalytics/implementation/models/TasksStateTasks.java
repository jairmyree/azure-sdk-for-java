// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The TasksStateTasks model.
 */
@Fluent
public final class TasksStateTasks implements JsonSerializable<TasksStateTasks> {
    /*
     * The completed property.
     */
    @Generated
    private int completed;

    /*
     * The failed property.
     */
    @Generated
    private int failed;

    /*
     * The inProgress property.
     */
    @Generated
    private int inProgress;

    /*
     * The total property.
     */
    @Generated
    private int total;

    /*
     * The items property.
     */
    @Generated
    private List<AnalyzeTextLROResult> items;

    /**
     * Creates an instance of TasksStateTasks class.
     */
    @Generated
    public TasksStateTasks() {
    }

    /**
     * Get the completed property: The completed property.
     * 
     * @return the completed value.
     */
    @Generated
    public int getCompleted() {
        return this.completed;
    }

    /**
     * Set the completed property: The completed property.
     * 
     * @param completed the completed value to set.
     * @return the TasksStateTasks object itself.
     */
    @Generated
    public TasksStateTasks setCompleted(int completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get the failed property: The failed property.
     * 
     * @return the failed value.
     */
    @Generated
    public int getFailed() {
        return this.failed;
    }

    /**
     * Set the failed property: The failed property.
     * 
     * @param failed the failed value to set.
     * @return the TasksStateTasks object itself.
     */
    @Generated
    public TasksStateTasks setFailed(int failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the inProgress property: The inProgress property.
     * 
     * @return the inProgress value.
     */
    @Generated
    public int getInProgress() {
        return this.inProgress;
    }

    /**
     * Set the inProgress property: The inProgress property.
     * 
     * @param inProgress the inProgress value to set.
     * @return the TasksStateTasks object itself.
     */
    @Generated
    public TasksStateTasks setInProgress(int inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * Get the total property: The total property.
     * 
     * @return the total value.
     */
    @Generated
    public int getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The total property.
     * 
     * @param total the total value to set.
     * @return the TasksStateTasks object itself.
     */
    @Generated
    public TasksStateTasks setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * Get the items property: The items property.
     * 
     * @return the items value.
     */
    @Generated
    public List<AnalyzeTextLROResult> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The items property.
     * 
     * @param items the items value to set.
     * @return the TasksStateTasks object itself.
     */
    @Generated
    public TasksStateTasks setItems(List<AnalyzeTextLROResult> items) {
        this.items = items;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("completed", this.completed);
        jsonWriter.writeIntField("failed", this.failed);
        jsonWriter.writeIntField("inProgress", this.inProgress);
        jsonWriter.writeIntField("total", this.total);
        jsonWriter.writeArrayField("items", this.items, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TasksStateTasks from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TasksStateTasks if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TasksStateTasks.
     */
    @Generated
    public static TasksStateTasks fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TasksStateTasks deserializedTasksStateTasks = new TasksStateTasks();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("completed".equals(fieldName)) {
                    deserializedTasksStateTasks.completed = reader.getInt();
                } else if ("failed".equals(fieldName)) {
                    deserializedTasksStateTasks.failed = reader.getInt();
                } else if ("inProgress".equals(fieldName)) {
                    deserializedTasksStateTasks.inProgress = reader.getInt();
                } else if ("total".equals(fieldName)) {
                    deserializedTasksStateTasks.total = reader.getInt();
                } else if ("items".equals(fieldName)) {
                    List<AnalyzeTextLROResult> items
                        = reader.readArray(reader1 -> AnalyzeTextLROResult.fromJson(reader1));
                    deserializedTasksStateTasks.items = items;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTasksStateTasks;
        });
    }
}
