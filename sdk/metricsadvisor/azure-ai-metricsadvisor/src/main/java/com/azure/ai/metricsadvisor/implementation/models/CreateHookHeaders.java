// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The CreateHookHeaders model.
 */
@Fluent
public final class CreateHookHeaders {
    /*
     * The Location property.
     */
    @Generated
    private String location;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of CreateHookHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public CreateHookHeaders(HttpHeaders rawHeaders) {
        this.location = rawHeaders.getValue(HttpHeaderName.LOCATION);
    }

    /**
     * Get the location property: The Location property.
     * 
     * @return the location value.
     */
    @Generated
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     * 
     * @param location the location value to set.
     * @return the CreateHookHeaders object itself.
     */
    @Generated
    public CreateHookHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
