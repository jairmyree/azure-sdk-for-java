// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/** Samples for ClusterPools GetByResourceGroup. */
public final class ClusterPoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/GetClusterPool.json
     */
    /**
     * Sample code: ClusterPoolGet.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void clusterPoolGet(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager
            .clusterPools()
            .getByResourceGroupWithResponse("hiloResourcegroup", "clusterpool1", com.azure.core.util.Context.NONE);
    }
}