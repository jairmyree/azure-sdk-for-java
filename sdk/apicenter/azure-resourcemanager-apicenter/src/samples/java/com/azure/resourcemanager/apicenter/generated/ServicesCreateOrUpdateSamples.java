// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/** Samples for Services CreateOrUpdate. */
public final class ServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apicenter/resource-manager/Microsoft.ApiCenter/preview/2023-07-01-preview/examples/Services_CreateOrUpdate.json
     */
    /**
     * Sample code: Services_Create.
     *
     * @param manager Entry point to ApiCenterManager.
     */
    public static void servicesCreate(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager
            .services()
            .define("contoso")
            .withRegion((String) null)
            .withExistingResourceGroup("contoso-resources")
            .create();
    }
}