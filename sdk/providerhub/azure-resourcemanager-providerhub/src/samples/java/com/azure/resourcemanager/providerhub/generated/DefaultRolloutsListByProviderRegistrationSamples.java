// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/**
 * Samples for DefaultRollouts ListByProviderRegistration.
 */
public final class DefaultRolloutsListByProviderRegistrationSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2024-09-01/examples/
     * DefaultRollouts_ListByProviderRegistration.json
     */
    /**
     * Sample code: DefaultRollouts_ListByProviderRegistration.
     * 
     * @param manager Entry point to ProviderHubManager.
     */
    public static void
        defaultRolloutsListByProviderRegistration(com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager.defaultRollouts().listByProviderRegistration("Microsoft.Contoso", com.azure.core.util.Context.NONE);
    }
}
