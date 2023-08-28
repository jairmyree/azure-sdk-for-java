// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Authorizations. */
public interface Authorizations {
    /**
     * Lists a collection of authorization providers defined within a authorization provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Authorization list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AuthorizationContract> listByAuthorizationProvider(
        String resourceGroupName, String serviceName, String authorizationProviderId);

    /**
     * Lists a collection of authorization providers defined within a authorization provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Authorization list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AuthorizationContract> listByAuthorizationProvider(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Gets the details of the authorization specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the authorization specified by its identifier.
     */
    Response<AuthorizationContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        Context context);

    /**
     * Gets the details of the authorization specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the authorization specified by its identifier.
     */
    AuthorizationContract get(
        String resourceGroupName, String serviceName, String authorizationProviderId, String authorizationId);

    /**
     * Deletes specific Authorization from the Authorization provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        String ifMatch,
        Context context);

    /**
     * Deletes specific Authorization from the Authorization provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        String ifMatch);

    /**
     * Confirm valid consent code to suppress Authorizations anti-phishing page.
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
     * @return the response.
     */
    AuthorizationsConfirmConsentCodeResponse confirmConsentCodeWithResponse(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        AuthorizationConfirmConsentCodeRequestContract parameters,
        Context context);

    /**
     * Confirm valid consent code to suppress Authorizations anti-phishing page.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param authorizationProviderId Identifier of the authorization provider.
     * @param authorizationId Identifier of the authorization.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void confirmConsentCode(
        String resourceGroupName,
        String serviceName,
        String authorizationProviderId,
        String authorizationId,
        AuthorizationConfirmConsentCodeRequestContract parameters);

    /**
     * Gets the details of the authorization specified by its identifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the authorization specified by its identifier.
     */
    AuthorizationContract getById(String id);

    /**
     * Gets the details of the authorization specified by its identifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the authorization specified by its identifier.
     */
    Response<AuthorizationContract> getByIdWithResponse(String id, Context context);

    /**
     * Deletes specific Authorization from the Authorization provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specific Authorization from the Authorization provider.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new AuthorizationContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new AuthorizationContract definition.
     */
    AuthorizationContract.DefinitionStages.Blank define(String name);
}