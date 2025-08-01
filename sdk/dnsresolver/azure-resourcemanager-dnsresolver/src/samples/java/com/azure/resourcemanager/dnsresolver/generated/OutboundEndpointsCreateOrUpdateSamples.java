// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for OutboundEndpoints CreateOrUpdate.
 */
public final class OutboundEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/dnsresolver/resource-manager/Microsoft.Network/stable/2025-05-01/examples/OutboundEndpoint_Put.json
     */
    /**
     * Sample code: Upsert outbound endpoint for DNS resolver.
     * 
     * @param manager Entry point to DnsResolverManager.
     */
    public static void
        upsertOutboundEndpointForDNSResolver(com.azure.resourcemanager.dnsresolver.DnsResolverManager manager) {
        manager.outboundEndpoints()
            .define("sampleOutboundEndpoint")
            .withRegion("westus2")
            .withExistingDnsResolver("sampleResourceGroup", "sampleDnsResolver")
            .withSubnet(new SubResource().withId(
                "/subscriptions/0403cfa9-9659-4f33-9f30-1f191c51d111/resourceGroups/sampleVnetResourceGroupName/providers/Microsoft.Network/virtualNetworks/sampleVirtualNetwork/subnets/sampleSubnet"))
            .withTags(mapOf("key1", "fakeTokenPlaceholder"))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
