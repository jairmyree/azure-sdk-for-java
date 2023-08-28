// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCorsProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCspProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigDelegationProperties;
import com.azure.resourcemanager.apimanagement.models.PortalConfigPropertiesSignin;
import com.azure.resourcemanager.apimanagement.models.PortalConfigPropertiesSignup;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The developer portal configuration contract properties. */
@Fluent
public final class PortalConfigProperties {
    /*
     * Enable or disable Basic authentication method.
     */
    @JsonProperty(value = "enableBasicAuth")
    private Boolean enableBasicAuth;

    /*
     * The signin property.
     */
    @JsonProperty(value = "signin")
    private PortalConfigPropertiesSignin signin;

    /*
     * The signup property.
     */
    @JsonProperty(value = "signup")
    private PortalConfigPropertiesSignup signup;

    /*
     * The developer portal delegation settings.
     */
    @JsonProperty(value = "delegation")
    private PortalConfigDelegationProperties delegation;

    /*
     * The developer portal Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "cors")
    private PortalConfigCorsProperties cors;

    /*
     * The developer portal Content Security Policy (CSP) settings.
     */
    @JsonProperty(value = "csp")
    private PortalConfigCspProperties csp;

    /** Creates an instance of PortalConfigProperties class. */
    public PortalConfigProperties() {
    }

    /**
     * Get the enableBasicAuth property: Enable or disable Basic authentication method.
     *
     * @return the enableBasicAuth value.
     */
    public Boolean enableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * Set the enableBasicAuth property: Enable or disable Basic authentication method.
     *
     * @param enableBasicAuth the enableBasicAuth value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * Get the signin property: The signin property.
     *
     * @return the signin value.
     */
    public PortalConfigPropertiesSignin signin() {
        return this.signin;
    }

    /**
     * Set the signin property: The signin property.
     *
     * @param signin the signin value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withSignin(PortalConfigPropertiesSignin signin) {
        this.signin = signin;
        return this;
    }

    /**
     * Get the signup property: The signup property.
     *
     * @return the signup value.
     */
    public PortalConfigPropertiesSignup signup() {
        return this.signup;
    }

    /**
     * Set the signup property: The signup property.
     *
     * @param signup the signup value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withSignup(PortalConfigPropertiesSignup signup) {
        this.signup = signup;
        return this;
    }

    /**
     * Get the delegation property: The developer portal delegation settings.
     *
     * @return the delegation value.
     */
    public PortalConfigDelegationProperties delegation() {
        return this.delegation;
    }

    /**
     * Set the delegation property: The developer portal delegation settings.
     *
     * @param delegation the delegation value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withDelegation(PortalConfigDelegationProperties delegation) {
        this.delegation = delegation;
        return this;
    }

    /**
     * Get the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value.
     */
    public PortalConfigCorsProperties cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings.
     *
     * @param cors the cors value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withCors(PortalConfigCorsProperties cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the csp property: The developer portal Content Security Policy (CSP) settings.
     *
     * @return the csp value.
     */
    public PortalConfigCspProperties csp() {
        return this.csp;
    }

    /**
     * Set the csp property: The developer portal Content Security Policy (CSP) settings.
     *
     * @param csp the csp value to set.
     * @return the PortalConfigProperties object itself.
     */
    public PortalConfigProperties withCsp(PortalConfigCspProperties csp) {
        this.csp = csp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (signin() != null) {
            signin().validate();
        }
        if (signup() != null) {
            signup().validate();
        }
        if (delegation() != null) {
            delegation().validate();
        }
        if (cors() != null) {
            cors().validate();
        }
        if (csp() != null) {
            csp().validate();
        }
    }
}