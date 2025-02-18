// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of EnvironmentResource.
 */
public interface EnvironmentResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: The kind of the environment.
     * 
     * @return the kind value.
     */
    EnvironmentResourceKind kind();

    /**
     * Gets the sku property: The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1
     * environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the inner com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner object.
     * 
     * @return the inner object.
     */
    EnvironmentResourceInner innerModel();
}
