// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for MetadataSchemas CreateOrUpdate.
 */
public final class MetadataSchemasCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/
     * MetadataSchemas_CreateOrUpdate.json
     */
    /**
     * Sample code: MetadataSchemas_CreateOrUpdate.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void metadataSchemasCreateOrUpdate(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.metadataSchemas().define("author").withExistingService("contoso-resources", "contoso").create();
    }
}
