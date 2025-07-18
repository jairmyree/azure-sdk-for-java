// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The SparkSessionState model.
 */
@Fluent
public final class SparkSessionState implements JsonSerializable<SparkSessionState> {
    /*
     * The notStartedAt property.
     */
    @Generated
    private OffsetDateTime notStartedAt;

    /*
     * The startingAt property.
     */
    @Generated
    private OffsetDateTime startingAt;

    /*
     * The idleAt property.
     */
    @Generated
    private OffsetDateTime idleAt;

    /*
     * The deadAt property.
     */
    @Generated
    private OffsetDateTime deadAt;

    /*
     * The shuttingDownAt property.
     */
    @Generated
    private OffsetDateTime shuttingDownAt;

    /*
     * The killedAt property.
     */
    @Generated
    private OffsetDateTime terminatedAt;

    /*
     * The recoveringAt property.
     */
    @Generated
    private OffsetDateTime recoveringAt;

    /*
     * The busyAt property.
     */
    @Generated
    private OffsetDateTime busyAt;

    /*
     * The errorAt property.
     */
    @Generated
    private OffsetDateTime errorAt;

    /*
     * The currentState property.
     */
    @Generated
    private String currentState;

    /*
     * The jobCreationRequest property.
     */
    @Generated
    private SparkRequest jobCreationRequest;

    /**
     * Creates an instance of SparkSessionState class.
     */
    @Generated
    public SparkSessionState() {
    }

    /**
     * Get the notStartedAt property: The notStartedAt property.
     * 
     * @return the notStartedAt value.
     */
    @Generated
    public OffsetDateTime getNotStartedAt() {
        return this.notStartedAt;
    }

    /**
     * Set the notStartedAt property: The notStartedAt property.
     * 
     * @param notStartedAt the notStartedAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setNotStartedAt(OffsetDateTime notStartedAt) {
        this.notStartedAt = notStartedAt;
        return this;
    }

    /**
     * Get the startingAt property: The startingAt property.
     * 
     * @return the startingAt value.
     */
    @Generated
    public OffsetDateTime getStartingAt() {
        return this.startingAt;
    }

    /**
     * Set the startingAt property: The startingAt property.
     * 
     * @param startingAt the startingAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setStartingAt(OffsetDateTime startingAt) {
        this.startingAt = startingAt;
        return this;
    }

    /**
     * Get the idleAt property: The idleAt property.
     * 
     * @return the idleAt value.
     */
    @Generated
    public OffsetDateTime getIdleAt() {
        return this.idleAt;
    }

    /**
     * Set the idleAt property: The idleAt property.
     * 
     * @param idleAt the idleAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setIdleAt(OffsetDateTime idleAt) {
        this.idleAt = idleAt;
        return this;
    }

    /**
     * Get the deadAt property: The deadAt property.
     * 
     * @return the deadAt value.
     */
    @Generated
    public OffsetDateTime getDeadAt() {
        return this.deadAt;
    }

    /**
     * Set the deadAt property: The deadAt property.
     * 
     * @param deadAt the deadAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setDeadAt(OffsetDateTime deadAt) {
        this.deadAt = deadAt;
        return this;
    }

    /**
     * Get the shuttingDownAt property: The shuttingDownAt property.
     * 
     * @return the shuttingDownAt value.
     */
    @Generated
    public OffsetDateTime getShuttingDownAt() {
        return this.shuttingDownAt;
    }

    /**
     * Set the shuttingDownAt property: The shuttingDownAt property.
     * 
     * @param shuttingDownAt the shuttingDownAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setShuttingDownAt(OffsetDateTime shuttingDownAt) {
        this.shuttingDownAt = shuttingDownAt;
        return this;
    }

    /**
     * Get the terminatedAt property: The killedAt property.
     * 
     * @return the terminatedAt value.
     */
    @Generated
    public OffsetDateTime getTerminatedAt() {
        return this.terminatedAt;
    }

    /**
     * Set the terminatedAt property: The killedAt property.
     * 
     * @param terminatedAt the terminatedAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }

    /**
     * Get the recoveringAt property: The recoveringAt property.
     * 
     * @return the recoveringAt value.
     */
    @Generated
    public OffsetDateTime getRecoveringAt() {
        return this.recoveringAt;
    }

    /**
     * Set the recoveringAt property: The recoveringAt property.
     * 
     * @param recoveringAt the recoveringAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setRecoveringAt(OffsetDateTime recoveringAt) {
        this.recoveringAt = recoveringAt;
        return this;
    }

    /**
     * Get the busyAt property: The busyAt property.
     * 
     * @return the busyAt value.
     */
    @Generated
    public OffsetDateTime getBusyAt() {
        return this.busyAt;
    }

    /**
     * Set the busyAt property: The busyAt property.
     * 
     * @param busyAt the busyAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setBusyAt(OffsetDateTime busyAt) {
        this.busyAt = busyAt;
        return this;
    }

    /**
     * Get the errorAt property: The errorAt property.
     * 
     * @return the errorAt value.
     */
    @Generated
    public OffsetDateTime getErrorAt() {
        return this.errorAt;
    }

    /**
     * Set the errorAt property: The errorAt property.
     * 
     * @param errorAt the errorAt value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setErrorAt(OffsetDateTime errorAt) {
        this.errorAt = errorAt;
        return this;
    }

    /**
     * Get the currentState property: The currentState property.
     * 
     * @return the currentState value.
     */
    @Generated
    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * Set the currentState property: The currentState property.
     * 
     * @param currentState the currentState value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setCurrentState(String currentState) {
        this.currentState = currentState;
        return this;
    }

    /**
     * Get the jobCreationRequest property: The jobCreationRequest property.
     * 
     * @return the jobCreationRequest value.
     */
    @Generated
    public SparkRequest getJobCreationRequest() {
        return this.jobCreationRequest;
    }

    /**
     * Set the jobCreationRequest property: The jobCreationRequest property.
     * 
     * @param jobCreationRequest the jobCreationRequest value to set.
     * @return the SparkSessionState object itself.
     */
    @Generated
    public SparkSessionState setJobCreationRequest(SparkRequest jobCreationRequest) {
        this.jobCreationRequest = jobCreationRequest;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("notStartedAt",
            this.notStartedAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.notStartedAt));
        jsonWriter.writeStringField("startingAt",
            this.startingAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startingAt));
        jsonWriter.writeStringField("idleAt",
            this.idleAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.idleAt));
        jsonWriter.writeStringField("deadAt",
            this.deadAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.deadAt));
        jsonWriter.writeStringField("shuttingDownAt",
            this.shuttingDownAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.shuttingDownAt));
        jsonWriter.writeStringField("killedAt",
            this.terminatedAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.terminatedAt));
        jsonWriter.writeStringField("recoveringAt",
            this.recoveringAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.recoveringAt));
        jsonWriter.writeStringField("busyAt",
            this.busyAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.busyAt));
        jsonWriter.writeStringField("errorAt",
            this.errorAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.errorAt));
        jsonWriter.writeStringField("currentState", this.currentState);
        jsonWriter.writeJsonField("jobCreationRequest", this.jobCreationRequest);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SparkSessionState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SparkSessionState if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SparkSessionState.
     */
    @Generated
    public static SparkSessionState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SparkSessionState deserializedSparkSessionState = new SparkSessionState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("notStartedAt".equals(fieldName)) {
                    deserializedSparkSessionState.notStartedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("startingAt".equals(fieldName)) {
                    deserializedSparkSessionState.startingAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("idleAt".equals(fieldName)) {
                    deserializedSparkSessionState.idleAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("deadAt".equals(fieldName)) {
                    deserializedSparkSessionState.deadAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("shuttingDownAt".equals(fieldName)) {
                    deserializedSparkSessionState.shuttingDownAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("killedAt".equals(fieldName)) {
                    deserializedSparkSessionState.terminatedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("recoveringAt".equals(fieldName)) {
                    deserializedSparkSessionState.recoveringAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("busyAt".equals(fieldName)) {
                    deserializedSparkSessionState.busyAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("errorAt".equals(fieldName)) {
                    deserializedSparkSessionState.errorAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("currentState".equals(fieldName)) {
                    deserializedSparkSessionState.currentState = reader.getString();
                } else if ("jobCreationRequest".equals(fieldName)) {
                    deserializedSparkSessionState.jobCreationRequest = SparkRequest.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSparkSessionState;
        });
    }
}
