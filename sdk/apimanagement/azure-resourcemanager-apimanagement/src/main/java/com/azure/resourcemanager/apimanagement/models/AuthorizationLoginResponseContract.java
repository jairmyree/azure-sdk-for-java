// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationLoginResponseContractInner;

/** An immutable client-side representation of AuthorizationLoginResponseContract. */
public interface AuthorizationLoginResponseContract {
    /**
     * Gets the loginLink property: The login link.
     *
     * @return the loginLink value.
     */
    String loginLink();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationLoginResponseContractInner
     * object.
     *
     * @return the inner object.
     */
    AuthorizationLoginResponseContractInner innerModel();
}