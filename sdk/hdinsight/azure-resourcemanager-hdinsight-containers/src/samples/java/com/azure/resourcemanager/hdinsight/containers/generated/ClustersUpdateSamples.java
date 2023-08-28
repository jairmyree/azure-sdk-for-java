// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.resourcemanager.hdinsight.containers.models.AuthorizationProfile;
import com.azure.resourcemanager.hdinsight.containers.models.AutoscaleProfile;
import com.azure.resourcemanager.hdinsight.containers.models.AutoscaleType;
import com.azure.resourcemanager.hdinsight.containers.models.Cluster;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterConfigFile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterLogAnalyticsApplicationLogs;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterLogAnalyticsProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterServiceConfig;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterServiceConfigsProfile;
import com.azure.resourcemanager.hdinsight.containers.models.Schedule;
import com.azure.resourcemanager.hdinsight.containers.models.ScheduleBasedConfig;
import com.azure.resourcemanager.hdinsight.containers.models.ScheduleDay;
import com.azure.resourcemanager.hdinsight.containers.models.SshProfile;
import com.azure.resourcemanager.hdinsight.containers.models.UpdatableClusterProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters Update. */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/PatchCluster.json
     */
    /**
     * Sample code: HDInsightClustersPatchTags.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void hDInsightClustersPatchTags(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getWithResponse("hiloResourcegroup", "clusterpool1", "cluster1", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withClusterProfile(
                new UpdatableClusterProfile()
                    .withServiceConfigsProfiles(
                        Arrays
                            .asList(
                                new ClusterServiceConfigsProfile()
                                    .withServiceName("TestService1")
                                    .withConfigs(
                                        Arrays
                                            .asList(
                                                new ClusterServiceConfig()
                                                    .withComponent("TestComp1")
                                                    .withFiles(
                                                        Arrays
                                                            .asList(
                                                                new ClusterConfigFile()
                                                                    .withFileName("TestFile1")
                                                                    .withValues(
                                                                        mapOf(
                                                                            "Test.config.1",
                                                                            "1",
                                                                            "Test.config.2",
                                                                            "2")),
                                                                new ClusterConfigFile()
                                                                    .withFileName("TestFile2")
                                                                    .withValues(
                                                                        mapOf(
                                                                            "Test.config.3",
                                                                            "3",
                                                                            "Test.config.4",
                                                                            "4")))),
                                                new ClusterServiceConfig()
                                                    .withComponent("TestComp2")
                                                    .withFiles(
                                                        Arrays
                                                            .asList(
                                                                new ClusterConfigFile()
                                                                    .withFileName("TestFile3")
                                                                    .withContent("TestContent")
                                                                    .withPath("TestPath"),
                                                                new ClusterConfigFile()
                                                                    .withFileName("TestFile4")
                                                                    .withValues(
                                                                        mapOf(
                                                                            "Test.config.7",
                                                                            "7",
                                                                            "Test.config.8",
                                                                            "8")))))),
                                new ClusterServiceConfigsProfile()
                                    .withServiceName("TestService2")
                                    .withConfigs(
                                        Arrays
                                            .asList(
                                                new ClusterServiceConfig()
                                                    .withComponent("TestComp3")
                                                    .withFiles(
                                                        Arrays
                                                            .asList(
                                                                new ClusterConfigFile()
                                                                    .withFileName("TestFile5")
                                                                    .withValues(mapOf("Test.config.9", "9"))))))))
                    .withSshProfile(new SshProfile().withCount(2))
                    .withAutoscaleProfile(
                        new AutoscaleProfile()
                            .withEnabled(true)
                            .withGracefulDecommissionTimeout(-1)
                            .withAutoscaleType(AutoscaleType.SCHEDULE_BASED)
                            .withScheduleBasedConfig(
                                new ScheduleBasedConfig()
                                    .withTimeZone("Cen. Australia Standard Time")
                                    .withDefaultCount(3)
                                    .withSchedules(
                                        Arrays
                                            .asList(
                                                new Schedule()
                                                    .withStartTime("00:00")
                                                    .withEndTime("12:00")
                                                    .withCount(3)
                                                    .withDays(
                                                        Arrays
                                                            .asList(
                                                                ScheduleDay.fromString("Monday, Tuesday, Wednesday"))),
                                                new Schedule()
                                                    .withStartTime("00:00")
                                                    .withEndTime("12:00")
                                                    .withCount(3)
                                                    .withDays(Arrays.asList(ScheduleDay.SUNDAY))))))
                    .withAuthorizationProfile(
                        new AuthorizationProfile().withUserIds(Arrays.asList("Testuser1", "Testuser2")))
                    .withLogAnalyticsProfile(
                        new ClusterLogAnalyticsProfile()
                            .withEnabled(true)
                            .withApplicationLogs(
                                new ClusterLogAnalyticsApplicationLogs()
                                    .withStdOutEnabled(true)
                                    .withStdErrorEnabled(true))
                            .withMetricsEnabled(true)))
            .apply();
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