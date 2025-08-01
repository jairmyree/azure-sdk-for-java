// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Description about the errors happen while performing migration validation.
 */
@Fluent
public final class ExecutionStatistics implements JsonSerializable<ExecutionStatistics> {
    /*
     * No. of query executions
     */
    private Long executionCount;

    /*
     * CPU Time in millisecond(s) for the query execution
     */
    private Float cpuTimeMs;

    /*
     * Time taken in millisecond(s) for executing the query
     */
    private Float elapsedTimeMs;

    /*
     * Dictionary of sql query execution wait types and the respective statistics
     */
    private Map<String, WaitStatistics> waitStats;

    /*
     * Indicates whether the query resulted in an error
     */
    private Boolean hasErrors;

    /*
     * List of sql Errors
     */
    private List<String> sqlErrors;

    /**
     * Creates an instance of ExecutionStatistics class.
     */
    public ExecutionStatistics() {
    }

    /**
     * Get the executionCount property: No. of query executions.
     * 
     * @return the executionCount value.
     */
    public Long executionCount() {
        return this.executionCount;
    }

    /**
     * Set the executionCount property: No. of query executions.
     * 
     * @param executionCount the executionCount value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withExecutionCount(Long executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * Get the cpuTimeMs property: CPU Time in millisecond(s) for the query execution.
     * 
     * @return the cpuTimeMs value.
     */
    public Float cpuTimeMs() {
        return this.cpuTimeMs;
    }

    /**
     * Set the cpuTimeMs property: CPU Time in millisecond(s) for the query execution.
     * 
     * @param cpuTimeMs the cpuTimeMs value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withCpuTimeMs(Float cpuTimeMs) {
        this.cpuTimeMs = cpuTimeMs;
        return this;
    }

    /**
     * Get the elapsedTimeMs property: Time taken in millisecond(s) for executing the query.
     * 
     * @return the elapsedTimeMs value.
     */
    public Float elapsedTimeMs() {
        return this.elapsedTimeMs;
    }

    /**
     * Set the elapsedTimeMs property: Time taken in millisecond(s) for executing the query.
     * 
     * @param elapsedTimeMs the elapsedTimeMs value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withElapsedTimeMs(Float elapsedTimeMs) {
        this.elapsedTimeMs = elapsedTimeMs;
        return this;
    }

    /**
     * Get the waitStats property: Dictionary of sql query execution wait types and the respective statistics.
     * 
     * @return the waitStats value.
     */
    public Map<String, WaitStatistics> waitStats() {
        return this.waitStats;
    }

    /**
     * Set the waitStats property: Dictionary of sql query execution wait types and the respective statistics.
     * 
     * @param waitStats the waitStats value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withWaitStats(Map<String, WaitStatistics> waitStats) {
        this.waitStats = waitStats;
        return this;
    }

    /**
     * Get the hasErrors property: Indicates whether the query resulted in an error.
     * 
     * @return the hasErrors value.
     */
    public Boolean hasErrors() {
        return this.hasErrors;
    }

    /**
     * Set the hasErrors property: Indicates whether the query resulted in an error.
     * 
     * @param hasErrors the hasErrors value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
        return this;
    }

    /**
     * Get the sqlErrors property: List of sql Errors.
     * 
     * @return the sqlErrors value.
     */
    public List<String> sqlErrors() {
        return this.sqlErrors;
    }

    /**
     * Set the sqlErrors property: List of sql Errors.
     * 
     * @param sqlErrors the sqlErrors value to set.
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withSqlErrors(List<String> sqlErrors) {
        this.sqlErrors = sqlErrors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (waitStats() != null) {
            waitStats().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("executionCount", this.executionCount);
        jsonWriter.writeNumberField("cpuTimeMs", this.cpuTimeMs);
        jsonWriter.writeNumberField("elapsedTimeMs", this.elapsedTimeMs);
        jsonWriter.writeMapField("waitStats", this.waitStats, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("hasErrors", this.hasErrors);
        jsonWriter.writeArrayField("sqlErrors", this.sqlErrors, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecutionStatistics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecutionStatistics if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExecutionStatistics.
     */
    public static ExecutionStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecutionStatistics deserializedExecutionStatistics = new ExecutionStatistics();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("executionCount".equals(fieldName)) {
                    deserializedExecutionStatistics.executionCount = reader.getNullable(JsonReader::getLong);
                } else if ("cpuTimeMs".equals(fieldName)) {
                    deserializedExecutionStatistics.cpuTimeMs = reader.getNullable(JsonReader::getFloat);
                } else if ("elapsedTimeMs".equals(fieldName)) {
                    deserializedExecutionStatistics.elapsedTimeMs = reader.getNullable(JsonReader::getFloat);
                } else if ("waitStats".equals(fieldName)) {
                    Map<String, WaitStatistics> waitStats = reader.readMap(reader1 -> WaitStatistics.fromJson(reader1));
                    deserializedExecutionStatistics.waitStats = waitStats;
                } else if ("hasErrors".equals(fieldName)) {
                    deserializedExecutionStatistics.hasErrors = reader.getNullable(JsonReader::getBoolean);
                } else if ("sqlErrors".equals(fieldName)) {
                    List<String> sqlErrors = reader.readArray(reader1 -> reader1.getString());
                    deserializedExecutionStatistics.sqlErrors = sqlErrors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExecutionStatistics;
        });
    }
}
