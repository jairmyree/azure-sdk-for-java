// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ProviderMonitorSettings.
 */
public interface ProviderMonitorSettings {
    /**
     * Gets the provider monitor setting details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider monitor setting details along with {@link Response}.
     */
    Response<ProviderMonitorSetting> getByResourceGroupWithResponse(String resourceGroupName,
        String providerMonitorSettingName, Context context);

    /**
     * Gets the provider monitor setting details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider monitor setting details.
     */
    ProviderMonitorSetting getByResourceGroup(String resourceGroupName, String providerMonitorSettingName);

    /**
     * Updates the provider monitor setting properties as specified in the request body. Update fails if the specified
     * provider monitor setting does not already exist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ProviderMonitorSetting> updateWithResponse(String resourceGroupName, String providerMonitorSettingName,
        Context context);

    /**
     * Updates the provider monitor setting properties as specified in the request body. Update fails if the specified
     * provider monitor setting does not already exist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ProviderMonitorSetting update(String resourceGroupName, String providerMonitorSettingName);

    /**
     * Deletes a provider monitor setting.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String providerMonitorSettingName,
        Context context);

    /**
     * Deletes a provider monitor setting.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerMonitorSettingName The name of the provider monitor setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String providerMonitorSettingName);

    /**
     * Gets the list of the provider monitor settings in the resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider monitor settings in the resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ProviderMonitorSetting> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the list of the provider monitor settings in the resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider monitor settings in the resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ProviderMonitorSetting> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the list of the provider monitor settings in the subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider monitor settings in the subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ProviderMonitorSetting> list();

    /**
     * Gets the list of the provider monitor settings in the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider monitor settings in the subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ProviderMonitorSetting> list(Context context);

    /**
     * Gets the provider monitor setting details.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider monitor setting details along with {@link Response}.
     */
    ProviderMonitorSetting getById(String id);

    /**
     * Gets the provider monitor setting details.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider monitor setting details along with {@link Response}.
     */
    Response<ProviderMonitorSetting> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a provider monitor setting.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a provider monitor setting.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ProviderMonitorSetting resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ProviderMonitorSetting definition.
     */
    ProviderMonitorSetting.DefinitionStages.Blank define(String name);
}
