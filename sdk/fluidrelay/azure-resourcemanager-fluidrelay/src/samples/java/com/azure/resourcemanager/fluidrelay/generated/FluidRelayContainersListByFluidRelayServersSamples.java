// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

/**
 * Samples for FluidRelayContainers ListByFluidRelayServers.
 */
public final class FluidRelayContainersListByFluidRelayServersSamples {
    /*
     * x-ms-original-file: specification/fluidrelay/resource-manager/Microsoft.FluidRelay/stable/2022-06-01/examples/
     * FluidRelayContainers_ListByFluidRelayServer.json
     */
    /**
     * Sample code: List all Fluid Relay containers in a Fluid Relay server.
     * 
     * @param manager Entry point to FluidRelayManager.
     */
    public static void
        listAllFluidRelayContainersInAFluidRelayServer(com.azure.resourcemanager.fluidrelay.FluidRelayManager manager) {
        manager.fluidRelayContainers()
            .listByFluidRelayServers("myResourceGroup", "myFluidRelayServer", com.azure.core.util.Context.NONE);
    }
}
