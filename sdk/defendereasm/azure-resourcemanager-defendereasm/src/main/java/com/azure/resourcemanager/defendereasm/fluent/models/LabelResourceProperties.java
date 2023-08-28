// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.defendereasm.models.ResourceBaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Label properties. */
@Fluent
public final class LabelResourceProperties extends ResourceBaseProperties {
    /*
     * Label display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Label color.
     */
    @JsonProperty(value = "color")
    private String color;

    /** Creates an instance of LabelResourceProperties class. */
    public LabelResourceProperties() {
    }

    /**
     * Get the displayName property: Label display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Label display name.
     *
     * @param displayName the displayName value to set.
     * @return the LabelResourceProperties object itself.
     */
    public LabelResourceProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the color property: Label color.
     *
     * @return the color value.
     */
    public String color() {
        return this.color;
    }

    /**
     * Set the color property: Label color.
     *
     * @param color the color value to set.
     * @return the LabelResourceProperties object itself.
     */
    public LabelResourceProperties withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}