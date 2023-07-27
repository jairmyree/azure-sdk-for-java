// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.chaos.fluent.models.TargetInner;
import java.util.Map;

/** An immutable client-side representation of Target. */
public interface Target {
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
     * Gets the systemData property: The system metadata of the target resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: Location of the target resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the properties property: The properties of the target resource.
     *
     * @return the properties value.
     */
    Map<String, Object> properties();

    /**
     * Gets the inner com.azure.resourcemanager.chaos.fluent.models.TargetInner object.
     *
     * @return the inner object.
     */
    TargetInner innerModel();
}