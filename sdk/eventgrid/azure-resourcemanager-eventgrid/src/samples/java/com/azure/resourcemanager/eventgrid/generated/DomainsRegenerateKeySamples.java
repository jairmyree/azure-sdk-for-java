// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.models.DomainRegenerateKeyRequest;

/**
 * Samples for Domains RegenerateKey.
 */
public final class DomainsRegenerateKeySamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2025-04-01-preview/examples/
     * Domains_RegenerateKey.json
     */
    /**
     * Sample code: Domains_RegenerateKey.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void domainsRegenerateKey(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.domains()
            .regenerateKeyWithResponse("examplerg", "exampledomain2",
                new DomainRegenerateKeyRequest().withKeyName("fakeTokenPlaceholder"), com.azure.core.util.Context.NONE);
    }
}
