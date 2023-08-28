// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;

/** Resource collection API of GraphQLApiResolverPolicies. */
public interface GraphQLApiResolverPolicies {
    /**
     * Get the list of policy configuration at the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policy configuration at the GraphQL API Resolver level as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PolicyContract> listByResolver(
        String resourceGroupName, String serviceName, String apiId, String resolverId);

    /**
     * Get the list of policy configuration at the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policy configuration at the GraphQL API Resolver level as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PolicyContract> listByResolver(
        String resourceGroupName, String serviceName, String apiId, String resolverId, Context context);

    /**
     * Gets the entity state (Etag) version of the GraphQL API resolver policy specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the GraphQL API resolver policy specified by its identifier.
     */
    GraphQLApiResolverPoliciesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        Context context);

    /**
     * Gets the entity state (Etag) version of the GraphQL API resolver policy specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(
        String resourceGroupName, String serviceName, String apiId, String resolverId, PolicyIdName policyId);

    /**
     * Get the policy configuration at the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param format Policy Export Format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy configuration at the GraphQL API Resolver level.
     */
    Response<PolicyContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        PolicyExportFormat format,
        Context context);

    /**
     * Get the policy configuration at the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy configuration at the GraphQL API Resolver level.
     */
    PolicyContract get(
        String resourceGroupName, String serviceName, String apiId, String resolverId, PolicyIdName policyId);

    /**
     * Creates or updates policy configuration for the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param parameters The policy contents to apply.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy Contract details.
     */
    Response<PolicyContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        PolicyContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Creates or updates policy configuration for the GraphQL API Resolver level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param parameters The policy contents to apply.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy Contract details.
     */
    PolicyContract createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        PolicyContractInner parameters);

    /**
     * Deletes the policy configuration at the GraphQL Api Resolver.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
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
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        String ifMatch,
        Context context);

    /**
     * Deletes the policy configuration at the GraphQL Api Resolver.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param resolverId Resolver identifier within a GraphQL API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        PolicyIdName policyId,
        String ifMatch);
}