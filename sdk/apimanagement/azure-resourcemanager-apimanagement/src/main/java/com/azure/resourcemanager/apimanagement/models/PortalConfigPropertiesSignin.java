// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PortalConfigPropertiesSignin model. */
@Fluent
public final class PortalConfigPropertiesSignin {
    /*
     * Redirect anonymous users to the sign-in page.
     */
    @JsonProperty(value = "require")
    private Boolean require;

    /** Creates an instance of PortalConfigPropertiesSignin class. */
    public PortalConfigPropertiesSignin() {
    }

    /**
     * Get the require property: Redirect anonymous users to the sign-in page.
     *
     * @return the require value.
     */
    public Boolean require() {
        return this.require;
    }

    /**
     * Set the require property: Redirect anonymous users to the sign-in page.
     *
     * @param require the require value to set.
     * @return the PortalConfigPropertiesSignin object itself.
     */
    public PortalConfigPropertiesSignin withRequire(Boolean require) {
        this.require = require;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}