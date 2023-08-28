// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.fluent.models.TagRuleInner;
import com.azure.resourcemanager.dynatrace.models.FilteringTag;
import com.azure.resourcemanager.dynatrace.models.LogRules;
import com.azure.resourcemanager.dynatrace.models.MetricRules;
import com.azure.resourcemanager.dynatrace.models.SendAadLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendActivityLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendingMetricsStatus;
import com.azure.resourcemanager.dynatrace.models.TagRuleListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagRuleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagRuleListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{},{}]},\"metricRules\":{\"sendingMetrics\":\"Enabled\",\"filteringTags\":[{},{}]},\"provisioningState\":\"Deleted\"},\"id\":\"lnrosfqp\",\"name\":\"eeh\",\"type\":\"zvypyqrimzinp\"},{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{},{},{}]},\"metricRules\":{\"sendingMetrics\":\"Enabled\",\"filteringTags\":[{}]},\"provisioningState\":\"Failed\"},\"id\":\"nohjt\",\"name\":\"kwh\",\"type\":\"soifiyipjxsqw\"},{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{},{},{}]},\"metricRules\":{\"sendingMetrics\":\"Enabled\",\"filteringTags\":[{}]},\"provisioningState\":\"Succeeded\"},\"id\":\"qabnmoc\",\"name\":\"cyshurzafbljjgp\",\"type\":\"toqcjmklja\"},{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Enabled\",\"filteringTags\":[{},{}]},\"metricRules\":{\"sendingMetrics\":\"Enabled\",\"filteringTags\":[{},{},{}]},\"provisioningState\":\"Succeeded\"},\"id\":\"krlkhbzhfepg\",\"name\":\"gqexzlocxs\",\"type\":\"paierh\"}],\"nextLink\":\"csglum\"}")
                .toObject(TagRuleListResult.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.value().get(0).logRules().sendAadLogs());
        Assertions
            .assertEquals(SendSubscriptionLogsStatus.ENABLED, model.value().get(0).logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.value().get(0).logRules().sendActivityLogs());
        Assertions.assertEquals(SendingMetricsStatus.ENABLED, model.value().get(0).metricRules().sendingMetrics());
        Assertions.assertEquals("csglum", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagRuleListResult model =
            new TagRuleListResult()
                .withValue(
                    Arrays
                        .asList(
                            new TagRuleInner()
                                .withLogRules(
                                    new LogRules()
                                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                                        .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag())))
                                .withMetricRules(
                                    new MetricRules()
                                        .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                        .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag()))),
                            new TagRuleInner()
                                .withLogRules(
                                    new LogRules()
                                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                                        .withFilteringTags(
                                            Arrays.asList(new FilteringTag(), new FilteringTag(), new FilteringTag())))
                                .withMetricRules(
                                    new MetricRules()
                                        .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                        .withFilteringTags(Arrays.asList(new FilteringTag()))),
                            new TagRuleInner()
                                .withLogRules(
                                    new LogRules()
                                        .withSendAadLogs(SendAadLogsStatus.ENABLED)
                                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                                        .withFilteringTags(
                                            Arrays.asList(new FilteringTag(), new FilteringTag(), new FilteringTag())))
                                .withMetricRules(
                                    new MetricRules()
                                        .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                        .withFilteringTags(Arrays.asList(new FilteringTag()))),
                            new TagRuleInner()
                                .withLogRules(
                                    new LogRules()
                                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                                        .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                                        .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag())))
                                .withMetricRules(
                                    new MetricRules()
                                        .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                        .withFilteringTags(
                                            Arrays
                                                .asList(new FilteringTag(), new FilteringTag(), new FilteringTag())))))
                .withNextLink("csglum");
        model = BinaryData.fromObject(model).toObject(TagRuleListResult.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.value().get(0).logRules().sendAadLogs());
        Assertions
            .assertEquals(SendSubscriptionLogsStatus.ENABLED, model.value().get(0).logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.value().get(0).logRules().sendActivityLogs());
        Assertions.assertEquals(SendingMetricsStatus.ENABLED, model.value().get(0).metricRules().sendingMetrics());
        Assertions.assertEquals("csglum", model.nextLink());
    }
}