// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

/**
 * Samples for PrivateEndpoints Get.
 */
public final class PrivateEndpointsGetSamples {
    /*
     * x-ms-original-file:
     * specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/
     * PrivateEndpoint_Get.json
     */
    /**
     * Sample code: Get a private endpoint.
     * 
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void getAPrivateEndpoint(com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.privateEndpoints().getWithResponse("sjrg", "testcluster", "testpe", com.azure.core.util.Context.NONE);
    }
}
