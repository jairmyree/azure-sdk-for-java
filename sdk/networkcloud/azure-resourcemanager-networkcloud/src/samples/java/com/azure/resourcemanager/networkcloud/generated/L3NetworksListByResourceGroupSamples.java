// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/**
 * Samples for L3Networks ListByResourceGroup.
 */
public final class L3NetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2025-02-01/examples/
     * L3Networks_ListByResourceGroup.json
     */
    /**
     * Sample code: List L3 networks for resource group.
     * 
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void
        listL3NetworksForResourceGroup(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.l3Networks().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}
