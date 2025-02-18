// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.fluent.models.QueryResultInner;
import com.azure.resourcemanager.costmanagement.models.ExternalCloudProviderType;
import com.azure.resourcemanager.costmanagement.models.QueryDefinition;

/**
 * An instance of this class provides access to all the operations defined in QueriesClient.
 */
public interface QueriesClient {
    /**
     * Query the usage data for scope defined.
     * 
     * @param scope The scope associated with query and export operations. This includes
     * '/subscriptions/{subscriptionId}/' for subscription scope,
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for Management
     * Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
     * for billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryResultInner> usageWithResponse(String scope, QueryDefinition parameters, Context context);

    /**
     * Query the usage data for scope defined.
     * 
     * @param scope The scope associated with query and export operations. This includes
     * '/subscriptions/{subscriptionId}/' for subscription scope,
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for Management
     * Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
     * for billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryResultInner usage(String scope, QueryDefinition parameters);

    /**
     * Query the usage data for external cloud provider type defined.
     * 
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     * This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     * '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryResultInner> usageByExternalCloudProviderTypeWithResponse(
        ExternalCloudProviderType externalCloudProviderType, String externalCloudProviderId, QueryDefinition parameters,
        Context context);

    /**
     * Query the usage data for external cloud provider type defined.
     * 
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     * This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     * '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryResultInner usageByExternalCloudProviderType(ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId, QueryDefinition parameters);
}
