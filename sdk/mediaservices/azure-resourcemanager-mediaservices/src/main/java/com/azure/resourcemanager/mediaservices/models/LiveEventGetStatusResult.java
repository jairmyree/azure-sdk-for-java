// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventStatusInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Get live event status result. */
@Fluent
public final class LiveEventGetStatusResult {
    /*
     * The result of the get live event status.
     */
    @JsonProperty(value = "value")
    private List<LiveEventStatusInner> value;

    /** Creates an instance of LiveEventGetStatusResult class. */
    public LiveEventGetStatusResult() {
    }

    /**
     * Get the value property: The result of the get live event status.
     *
     * @return the value value.
     */
    public List<LiveEventStatusInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the get live event status.
     *
     * @param value the value value to set.
     * @return the LiveEventGetStatusResult object itself.
     */
    public LiveEventGetStatusResult withValue(List<LiveEventStatusInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
