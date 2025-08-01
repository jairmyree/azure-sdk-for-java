// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The CloudHsmClusterBackupStatusGetHeaders model.
 */
@Immutable
public final class CloudHsmClusterBackupStatusGetHeaders {
    /*
     * The x-ms-request-id property.
     */
    private final String xMsRequestId;

    /*
     * The Location property.
     */
    private final String location;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of CloudHsmClusterBackupStatusGetHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public CloudHsmClusterBackupStatusGetHeaders(HttpHeaders rawHeaders) {
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.location = rawHeaders.getValue(HttpHeaderName.LOCATION);
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Get the location property: The Location property.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
