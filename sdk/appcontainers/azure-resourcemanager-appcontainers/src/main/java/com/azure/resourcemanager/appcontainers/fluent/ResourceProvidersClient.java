// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Get details of a single job execution.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName Job Name.
     * @param jobExecutionName Job execution name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a single job execution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobExecutionInner> jobExecutionWithResponse(
        String resourceGroupName, String jobName, String jobExecutionName, Context context);

    /**
     * Get details of a single job execution.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName Job Name.
     * @param jobExecutionName Job execution name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a single job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobExecutionInner jobExecution(String resourceGroupName, String jobName, String jobExecutionName);
}