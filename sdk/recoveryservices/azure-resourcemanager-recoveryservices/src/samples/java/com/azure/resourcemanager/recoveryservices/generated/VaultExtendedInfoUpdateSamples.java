// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/**
 * Samples for VaultExtendedInfo Update.
 */
public final class VaultExtendedInfoUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2025-02-01/examples/
     * UpdateVaultExtendedInfo.json
     */
    /**
     * Sample code: PATCH ExtendedInfo of Resource.
     * 
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void
        pATCHExtendedInfoOfResource(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.vaultExtendedInfoes()
            .updateWithResponse("Default-RecoveryServices-ResourceGroup", "swaggerExample", null,
                com.azure.core.util.Context.NONE);
    }
}
