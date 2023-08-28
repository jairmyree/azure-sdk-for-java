// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Spark user plugins spec. */
@Fluent
public final class SparkUserPlugins {
    /*
     * Spark user plugins.
     */
    @JsonProperty(value = "plugins")
    private List<SparkUserPlugin> plugins;

    /** Creates an instance of SparkUserPlugins class. */
    public SparkUserPlugins() {
    }

    /**
     * Get the plugins property: Spark user plugins.
     *
     * @return the plugins value.
     */
    public List<SparkUserPlugin> plugins() {
        return this.plugins;
    }

    /**
     * Set the plugins property: Spark user plugins.
     *
     * @param plugins the plugins value to set.
     * @return the SparkUserPlugins object itself.
     */
    public SparkUserPlugins withPlugins(List<SparkUserPlugin> plugins) {
        this.plugins = plugins;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plugins() != null) {
            plugins().forEach(e -> e.validate());
        }
    }
}