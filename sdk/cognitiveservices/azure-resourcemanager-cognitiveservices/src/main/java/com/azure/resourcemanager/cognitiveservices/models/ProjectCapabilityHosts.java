// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CapabilityHostInner;

/**
 * Resource collection API of ProjectCapabilityHosts.
 */
public interface ProjectCapabilityHosts {
    /**
     * Delete project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String projectName, String capabilityHostname);

    /**
     * Delete project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String projectName, String capabilityHostname,
        Context context);

    /**
     * Get project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return project capabilityHost along with {@link Response}.
     */
    Response<CapabilityHost> getWithResponse(String resourceGroupName, String accountName, String projectName,
        String capabilityHostname, Context context);

    /**
     * Get project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return project capabilityHost.
     */
    CapabilityHost get(String resourceGroupName, String accountName, String projectName, String capabilityHostname);

    /**
     * Create or update project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @param capabilityHost CapabilityHost definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    CapabilityHost createOrUpdate(String resourceGroupName, String accountName, String projectName,
        String capabilityHostname, CapabilityHostInner capabilityHost);

    /**
     * Create or update project capabilityHost.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param projectName The name of Cognitive Services account's project.
     * @param capabilityHostname The name of the capability host associated with the Cognitive Services Resource.
     * @param capabilityHost CapabilityHost definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    CapabilityHost createOrUpdate(String resourceGroupName, String accountName, String projectName,
        String capabilityHostname, CapabilityHostInner capabilityHost, Context context);
}
