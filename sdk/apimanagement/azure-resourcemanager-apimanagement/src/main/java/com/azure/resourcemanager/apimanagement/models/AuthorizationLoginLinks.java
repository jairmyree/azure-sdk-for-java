// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AuthorizationLoginLinks. */
public interface AuthorizationLoginLinks {
    /**
     * Gets authorization login links.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param parameters Create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization login links.
     */
    Response<AuthorizationLoginResponseContract> postWithResponse(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        AuthorizationLoginRequestContract parameters,
        Context context);

    /**
     * Gets authorization login links.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization login links.
     */
    AuthorizationLoginResponseContract post(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        AuthorizationLoginRequestContract parameters);
}