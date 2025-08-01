// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.resourcemanager.servicefabricmanagedclusters.models.FaultSimulationIdContent;

/**
 * Samples for NodeTypes StopFaultSimulation.
 */
public final class NodeTypesStopFaultSimulationSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/faultSimulation/NodeTypeStopFaultSimulation_example.json
     */
    /**
     * Sample code: Stop Node Type Fault Simulation.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void stopNodeTypeFaultSimulation(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        manager.nodeTypes()
            .stopFaultSimulation("resRg", "myCluster", "BE",
                new FaultSimulationIdContent().withSimulationId("1bb61ba9-8a41-4d73-b5f0-7fc93b1edfe3"),
                com.azure.core.util.Context.NONE);
    }
}
