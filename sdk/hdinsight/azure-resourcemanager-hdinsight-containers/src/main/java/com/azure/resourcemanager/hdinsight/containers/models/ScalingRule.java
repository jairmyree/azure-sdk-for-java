// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The scaling rule. */
@Fluent
public final class ScalingRule {
    /*
     * The action type.
     */
    @JsonProperty(value = "actionType", required = true)
    private ScaleActionType actionType;

    /*
     * This is an evaluation count for a scaling condition, the number of times a trigger condition should be
     * successful, before scaling activity is triggered.
     */
    @JsonProperty(value = "evaluationCount", required = true)
    private int evaluationCount;

    /*
     * Metrics name for individual workloads. For example: cpu
     */
    @JsonProperty(value = "scalingMetric", required = true)
    private String scalingMetric;

    /*
     * The comparison rule.
     */
    @JsonProperty(value = "comparisonRule", required = true)
    private ComparisonRule comparisonRule;

    /** Creates an instance of ScalingRule class. */
    public ScalingRule() {
    }

    /**
     * Get the actionType property: The action type.
     *
     * @return the actionType value.
     */
    public ScaleActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: The action type.
     *
     * @param actionType the actionType value to set.
     * @return the ScalingRule object itself.
     */
    public ScalingRule withActionType(ScaleActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the evaluationCount property: This is an evaluation count for a scaling condition, the number of times a
     * trigger condition should be successful, before scaling activity is triggered.
     *
     * @return the evaluationCount value.
     */
    public int evaluationCount() {
        return this.evaluationCount;
    }

    /**
     * Set the evaluationCount property: This is an evaluation count for a scaling condition, the number of times a
     * trigger condition should be successful, before scaling activity is triggered.
     *
     * @param evaluationCount the evaluationCount value to set.
     * @return the ScalingRule object itself.
     */
    public ScalingRule withEvaluationCount(int evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }

    /**
     * Get the scalingMetric property: Metrics name for individual workloads. For example: cpu.
     *
     * @return the scalingMetric value.
     */
    public String scalingMetric() {
        return this.scalingMetric;
    }

    /**
     * Set the scalingMetric property: Metrics name for individual workloads. For example: cpu.
     *
     * @param scalingMetric the scalingMetric value to set.
     * @return the ScalingRule object itself.
     */
    public ScalingRule withScalingMetric(String scalingMetric) {
        this.scalingMetric = scalingMetric;
        return this;
    }

    /**
     * Get the comparisonRule property: The comparison rule.
     *
     * @return the comparisonRule value.
     */
    public ComparisonRule comparisonRule() {
        return this.comparisonRule;
    }

    /**
     * Set the comparisonRule property: The comparison rule.
     *
     * @param comparisonRule the comparisonRule value to set.
     * @return the ScalingRule object itself.
     */
    public ScalingRule withComparisonRule(ComparisonRule comparisonRule) {
        this.comparisonRule = comparisonRule;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property actionType in model ScalingRule"));
        }
        if (scalingMetric() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property scalingMetric in model ScalingRule"));
        }
        if (comparisonRule() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property comparisonRule in model ScalingRule"));
        } else {
            comparisonRule().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScalingRule.class);
}