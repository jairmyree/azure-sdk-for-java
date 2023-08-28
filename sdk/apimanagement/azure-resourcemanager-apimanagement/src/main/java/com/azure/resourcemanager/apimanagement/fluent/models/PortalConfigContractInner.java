// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCorsProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCspProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigDelegationProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigPropertiesSignin;
import com.azure.resourcemanager.apimanagement.models.PortalConfigPropertiesSignup;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The developer portal configuration contract. */
@Fluent
public final class PortalConfigContractInner extends ProxyResource {
    /*
     * The developer portal configuration contract properties.
     */
    @JsonProperty(value = "properties")
    private PortalConfigProperties innerProperties;

    /** Creates an instance of PortalConfigContractInner class. */
    public PortalConfigContractInner() {
    }

    /**
     * Get the innerProperties property: The developer portal configuration contract properties.
     *
     * @return the innerProperties value.
     */
    private PortalConfigProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enableBasicAuth property: Enable or disable Basic authentication method.
     *
     * @return the enableBasicAuth value.
     */
    public Boolean enableBasicAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBasicAuth();
    }

    /**
     * Set the enableBasicAuth property: Enable or disable Basic authentication method.
     *
     * @param enableBasicAuth the enableBasicAuth value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withEnableBasicAuth(Boolean enableBasicAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * Get the signin property: The signin property.
     *
     * @return the signin value.
     */
    public PortalConfigPropertiesSignin signin() {
        return this.innerProperties() == null ? null : this.innerProperties().signin();
    }

    /**
     * Set the signin property: The signin property.
     *
     * @param signin the signin value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withSignin(PortalConfigPropertiesSignin signin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withSignin(signin);
        return this;
    }

    /**
     * Get the signup property: The signup property.
     *
     * @return the signup value.
     */
    public PortalConfigPropertiesSignup signup() {
        return this.innerProperties() == null ? null : this.innerProperties().signup();
    }

    /**
     * Set the signup property: The signup property.
     *
     * @param signup the signup value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withSignup(PortalConfigPropertiesSignup signup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withSignup(signup);
        return this;
    }

    /**
     * Get the delegation property: The developer portal delegation settings.
     *
     * @return the delegation value.
     */
    public PortalConfigDelegationProperties delegation() {
        return this.innerProperties() == null ? null : this.innerProperties().delegation();
    }

    /**
     * Set the delegation property: The developer portal delegation settings.
     *
     * @param delegation the delegation value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withDelegation(PortalConfigDelegationProperties delegation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withDelegation(delegation);
        return this;
    }

    /**
     * Get the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value.
     */
    public PortalConfigCorsProperties cors() {
        return this.innerProperties() == null ? null : this.innerProperties().cors();
    }

    /**
     * Set the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings.
     *
     * @param cors the cors value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withCors(PortalConfigCorsProperties cors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withCors(cors);
        return this;
    }

    /**
     * Get the csp property: The developer portal Content Security Policy (CSP) settings.
     *
     * @return the csp value.
     */
    public PortalConfigCspProperties csp() {
        return this.innerProperties() == null ? null : this.innerProperties().csp();
    }

    /**
     * Set the csp property: The developer portal Content Security Policy (CSP) settings.
     *
     * @param csp the csp value to set.
     * @return the PortalConfigContractInner object itself.
     */
    public PortalConfigContractInner withCsp(PortalConfigCspProperties csp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalConfigProperties();
        }
        this.innerProperties().withCsp(csp);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}