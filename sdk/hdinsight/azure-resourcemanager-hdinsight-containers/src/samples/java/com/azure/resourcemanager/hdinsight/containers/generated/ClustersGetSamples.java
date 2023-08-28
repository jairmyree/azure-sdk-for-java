// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/** Samples for Clusters Get. */
public final class ClustersGetSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/GetCluster.json
     */
    /**
     * Sample code: HDInsightClusterGet.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void hDInsightClusterGet(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager
            .clusters()
            .getWithResponse("hiloResourcegroup", "clusterpool1", "cluster1", com.azure.core.util.Context.NONE);
    }
}