// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterJobInner;
import com.azure.resourcemanager.hdinsight.containers.models.Action;
import com.azure.resourcemanager.hdinsight.containers.models.FlinkJobProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for ClusterJobs RunJob. */
public final class ClusterJobsRunJobSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/RunClusterJob.json
     */
    /**
     * Sample code: RunClusterJob.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void runClusterJob(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager
            .clusterJobs()
            .runJob(
                "hiloResourcegroup",
                "clusterpool1",
                "cluster1",
                new ClusterJobInner()
                    .withProperties(
                        new FlinkJobProperties()
                            .withJobName("flink-job-name")
                            .withJobJarDirectory("abfs://flinkjob@hilosa.dfs.core.windows.net/jars")
                            .withJarName("flink-sleep-job-0.0.1-SNAPSHOT.jar")
                            .withEntryClass("com.microsoft.hilo.flink.job.streaming.SleepJob")
                            .withAction(Action.START)
                            .withFlinkConfiguration(
                                mapOf(
                                    "parallelism",
                                    "1",
                                    "savepoint.directory",
                                    "abfs://flinkjob@hilosa.dfs.core.windows.net/savepoint"))),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}