// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ChangeThresholdConditionPatch model.
 */
@Fluent
public final class ChangeThresholdConditionPatch implements JsonSerializable<ChangeThresholdConditionPatch> {
    /*
     * change percentage, value range : [0, +∞)
     */
    @Generated
    private Double changePercentage;

    /*
     * shift point, value range : [1, +∞)
     */
    @Generated
    private Integer shiftPoint;

    /*
     * if the withinRange = true, detected data is abnormal when the value falls in the range, in this case
     * anomalyDetectorDirection must be Both
     * if the withinRange = false, detected data is abnormal when the value falls out of the range
     */
    @Generated
    private Boolean withinRange;

    /*
     * detection direction
     */
    @Generated
    private AnomalyDetectorDirection anomalyDetectorDirection;

    /*
     * The suppressCondition property.
     */
    @Generated
    private SuppressConditionPatch suppressCondition;

    /**
     * Creates an instance of ChangeThresholdConditionPatch class.
     */
    @Generated
    public ChangeThresholdConditionPatch() {
    }

    /**
     * Get the changePercentage property: change percentage, value range : [0, +∞).
     * 
     * @return the changePercentage value.
     */
    @Generated
    public Double getChangePercentage() {
        return this.changePercentage;
    }

    /**
     * Set the changePercentage property: change percentage, value range : [0, +∞).
     * 
     * @param changePercentage the changePercentage value to set.
     * @return the ChangeThresholdConditionPatch object itself.
     */
    @Generated
    public ChangeThresholdConditionPatch setChangePercentage(Double changePercentage) {
        this.changePercentage = changePercentage;
        return this;
    }

    /**
     * Get the shiftPoint property: shift point, value range : [1, +∞).
     * 
     * @return the shiftPoint value.
     */
    @Generated
    public Integer getShiftPoint() {
        return this.shiftPoint;
    }

    /**
     * Set the shiftPoint property: shift point, value range : [1, +∞).
     * 
     * @param shiftPoint the shiftPoint value to set.
     * @return the ChangeThresholdConditionPatch object itself.
     */
    @Generated
    public ChangeThresholdConditionPatch setShiftPoint(Integer shiftPoint) {
        this.shiftPoint = shiftPoint;
        return this;
    }

    /**
     * Get the withinRange property: if the withinRange = true, detected data is abnormal when the value falls in the
     * range, in this case anomalyDetectorDirection must be Both
     * if the withinRange = false, detected data is abnormal when the value falls out of the range.
     * 
     * @return the withinRange value.
     */
    @Generated
    public Boolean isWithinRange() {
        return this.withinRange;
    }

    /**
     * Set the withinRange property: if the withinRange = true, detected data is abnormal when the value falls in the
     * range, in this case anomalyDetectorDirection must be Both
     * if the withinRange = false, detected data is abnormal when the value falls out of the range.
     * 
     * @param withinRange the withinRange value to set.
     * @return the ChangeThresholdConditionPatch object itself.
     */
    @Generated
    public ChangeThresholdConditionPatch setWithinRange(Boolean withinRange) {
        this.withinRange = withinRange;
        return this;
    }

    /**
     * Get the anomalyDetectorDirection property: detection direction.
     * 
     * @return the anomalyDetectorDirection value.
     */
    @Generated
    public AnomalyDetectorDirection getAnomalyDetectorDirection() {
        return this.anomalyDetectorDirection;
    }

    /**
     * Set the anomalyDetectorDirection property: detection direction.
     * 
     * @param anomalyDetectorDirection the anomalyDetectorDirection value to set.
     * @return the ChangeThresholdConditionPatch object itself.
     */
    @Generated
    public ChangeThresholdConditionPatch
        setAnomalyDetectorDirection(AnomalyDetectorDirection anomalyDetectorDirection) {
        this.anomalyDetectorDirection = anomalyDetectorDirection;
        return this;
    }

    /**
     * Get the suppressCondition property: The suppressCondition property.
     * 
     * @return the suppressCondition value.
     */
    @Generated
    public SuppressConditionPatch getSuppressCondition() {
        return this.suppressCondition;
    }

    /**
     * Set the suppressCondition property: The suppressCondition property.
     * 
     * @param suppressCondition the suppressCondition value to set.
     * @return the ChangeThresholdConditionPatch object itself.
     */
    @Generated
    public ChangeThresholdConditionPatch setSuppressCondition(SuppressConditionPatch suppressCondition) {
        this.suppressCondition = suppressCondition;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("changePercentage", this.changePercentage);
        jsonWriter.writeNumberField("shiftPoint", this.shiftPoint);
        jsonWriter.writeBooleanField("withinRange", this.withinRange);
        jsonWriter.writeStringField("anomalyDetectorDirection",
            this.anomalyDetectorDirection == null ? null : this.anomalyDetectorDirection.toString());
        jsonWriter.writeJsonField("suppressCondition", this.suppressCondition);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChangeThresholdConditionPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChangeThresholdConditionPatch if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChangeThresholdConditionPatch.
     */
    @Generated
    public static ChangeThresholdConditionPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChangeThresholdConditionPatch deserializedChangeThresholdConditionPatch
                = new ChangeThresholdConditionPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("changePercentage".equals(fieldName)) {
                    deserializedChangeThresholdConditionPatch.changePercentage
                        = reader.getNullable(JsonReader::getDouble);
                } else if ("shiftPoint".equals(fieldName)) {
                    deserializedChangeThresholdConditionPatch.shiftPoint = reader.getNullable(JsonReader::getInt);
                } else if ("withinRange".equals(fieldName)) {
                    deserializedChangeThresholdConditionPatch.withinRange = reader.getNullable(JsonReader::getBoolean);
                } else if ("anomalyDetectorDirection".equals(fieldName)) {
                    deserializedChangeThresholdConditionPatch.anomalyDetectorDirection
                        = AnomalyDetectorDirection.fromString(reader.getString());
                } else if ("suppressCondition".equals(fieldName)) {
                    deserializedChangeThresholdConditionPatch.suppressCondition
                        = SuppressConditionPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChangeThresholdConditionPatch;
        });
    }
}
