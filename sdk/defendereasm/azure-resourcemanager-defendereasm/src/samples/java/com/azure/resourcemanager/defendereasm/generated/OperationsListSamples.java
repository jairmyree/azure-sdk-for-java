// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/riskiq/resource-manager/Microsoft.Easm/preview/2023-04-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations.
     *
     * @param manager Entry point to EasmManager.
     */
    public static void operations(com.azure.resourcemanager.defendereasm.EasmManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}