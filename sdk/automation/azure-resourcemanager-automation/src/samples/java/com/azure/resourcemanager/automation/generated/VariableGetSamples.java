// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for Variable Get.
 */
public final class VariableGetSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/getVariable.
     * json
     */
    /**
     * Sample code: Get a variable.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getAVariable(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.variables().getWithResponse("rg", "sampleAccount9", "sampleVariable", com.azure.core.util.Context.NONE);
    }
}
