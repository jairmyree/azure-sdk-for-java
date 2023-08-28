// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigContractInner;
import com.azure.resourcemanager.apimanagement.models.PortalConfigsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.PortalConfigsGetResponse;

/** An instance of this class provides access to all the operations defined in PortalConfigsClient. */
public interface PortalConfigsClient {
    /**
     * Lists the developer portal configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of the developer portal configurations along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalConfigCollectionInner> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Lists the developer portal configurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of the developer portal configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigCollectionInner listByService(String resourceGroupName, String serviceName);

    /**
     * Gets the entity state (Etag) version of the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the developer portal configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String portalConfigId, Context context);

    /**
     * Gets the entity state (Etag) version of the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String portalConfigId);

    /**
     * Get the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigsGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String portalConfigId, Context context);

    /**
     * Get the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigContractInner get(String resourceGroupName, String serviceName, String portalConfigId);

    /**
     * Update the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update the developer portal configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration contract along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalConfigContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String portalConfigId,
        String ifMatch,
        PortalConfigContractInner parameters,
        Context context);

    /**
     * Update the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update the developer portal configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration contract.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigContractInner update(
        String resourceGroupName,
        String serviceName,
        String portalConfigId,
        String ifMatch,
        PortalConfigContractInner parameters);

    /**
     * Create or update the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update the developer portal configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration contract along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalConfigContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String portalConfigId,
        String ifMatch,
        PortalConfigContractInner parameters,
        Context context);

    /**
     * Create or update the developer portal configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalConfigId Portal configuration identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update the developer portal configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal configuration contract.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalConfigContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String portalConfigId,
        String ifMatch,
        PortalConfigContractInner parameters);
}