// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters for updating cache rule properties. */
@Fluent
public final class CacheRuleUpdateProperties {
    /*
     * The ARM resource ID of the credential store which is associated with the Cache rule.
     */
    @JsonProperty(value = "credentialSetResourceId")
    private String credentialSetResourceId;

    /** Creates an instance of CacheRuleUpdateProperties class. */
    public CacheRuleUpdateProperties() {
    }

    /**
     * Get the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the Cache rule.
     *
     * @return the credentialSetResourceId value.
     */
    public String credentialSetResourceId() {
        return this.credentialSetResourceId;
    }

    /**
     * Set the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the Cache rule.
     *
     * @param credentialSetResourceId the credentialSetResourceId value to set.
     * @return the CacheRuleUpdateProperties object itself.
     */
    public CacheRuleUpdateProperties withCredentialSetResourceId(String credentialSetResourceId) {
        this.credentialSetResourceId = credentialSetResourceId;
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