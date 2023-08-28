// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A new Sas token which can be used to access the Maps REST APIs and is controlled by the specified Managed identity
 * permissions on Azure (IAM) Role Based Access Control.
 */
@Immutable
public final class MapsAccountSasTokenInner {
    /*
     * The shared access signature access token.
     */
    @JsonProperty(value = "accountSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String accountSasToken;

    /** Creates an instance of MapsAccountSasTokenInner class. */
    public MapsAccountSasTokenInner() {
    }

    /**
     * Get the accountSasToken property: The shared access signature access token.
     *
     * @return the accountSasToken value.
     */
    public String accountSasToken() {
        return this.accountSasToken;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}