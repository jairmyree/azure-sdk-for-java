// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.resourcemanager.dashboard.fluent.models.GrafanaAvailablePluginListResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of GrafanaAvailablePluginListResponse.
 */
public interface GrafanaAvailablePluginListResponse {
    /**
     * Gets the value property: The value property.
     * 
     * @return the value value.
     */
    List<GrafanaAvailablePlugin> value();

    /**
     * Gets the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.dashboard.fluent.models.GrafanaAvailablePluginListResponseInner object.
     * 
     * @return the inner object.
     */
    GrafanaAvailablePluginListResponseInner innerModel();
}
