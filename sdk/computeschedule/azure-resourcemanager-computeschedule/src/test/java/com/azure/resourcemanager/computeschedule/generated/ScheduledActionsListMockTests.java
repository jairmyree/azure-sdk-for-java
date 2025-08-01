// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.computeschedule.ComputeScheduleManager;
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.Language;
import com.azure.resourcemanager.computeschedule.models.Month;
import com.azure.resourcemanager.computeschedule.models.NotificationType;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.ResourceType;
import com.azure.resourcemanager.computeschedule.models.ScheduledAction;
import com.azure.resourcemanager.computeschedule.models.ScheduledActionType;
import com.azure.resourcemanager.computeschedule.models.WeekDay;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScheduledActionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"resourceType\":\"VirtualMachine\",\"actionType\":\"Start\",\"startTime\":\"2021-08-15T01:33:40Z\",\"endTime\":\"2021-03-28T20:58:03Z\",\"schedule\":{\"scheduledTime\":\"tdtkcn\",\"timeZone\":\"xwbpokulpiuj\",\"requestedWeekDays\":[\"Thursday\",\"Wednesday\"],\"requestedMonths\":[\"September\",\"March\",\"April\",\"September\"],\"requestedDaysOfTheMonth\":[361598801],\"executionParameters\":{\"optimizationPreference\":\"Cost\",\"retryPolicy\":{\"retryCount\":1312962595,\"retryWindowInMinutes\":270206644}},\"deadlineType\":\"Unknown\"},\"notificationSettings\":[{\"destination\":\"cciuqgbdbutau\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":false},{\"destination\":\"uwhhmhykojoxafn\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":true},{\"destination\":\"chkoymkcdyh\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":true}],\"disabled\":true,\"provisioningState\":\"Canceled\"},\"location\":\"novvqfovljxy\",\"tags\":{\"yrs\":\"w\",\"ea\":\"dsytgadgvr\",\"arrwlquu\":\"neqn\",\"e\":\"jfqka\"},\"id\":\"iipfpubj\",\"name\":\"bwwift\",\"type\":\"hqkvpuvksgplsak\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ComputeScheduleManager manager = ComputeScheduleManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<ScheduledAction> response = manager.scheduledActions().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("novvqfovljxy", response.iterator().next().location());
        Assertions.assertEquals("w", response.iterator().next().tags().get("yrs"));
        Assertions.assertEquals(ResourceType.VIRTUAL_MACHINE, response.iterator().next().properties().resourceType());
        Assertions.assertEquals(ScheduledActionType.START, response.iterator().next().properties().actionType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-15T01:33:40Z"),
            response.iterator().next().properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-28T20:58:03Z"),
            response.iterator().next().properties().endTime());
        Assertions.assertEquals("tdtkcn", response.iterator().next().properties().schedule().scheduledTime());
        Assertions.assertEquals("xwbpokulpiuj", response.iterator().next().properties().schedule().timeZone());
        Assertions.assertEquals(WeekDay.THURSDAY,
            response.iterator().next().properties().schedule().requestedWeekDays().get(0));
        Assertions.assertEquals(Month.SEPTEMBER,
            response.iterator().next().properties().schedule().requestedMonths().get(0));
        Assertions.assertEquals(361598801,
            response.iterator().next().properties().schedule().requestedDaysOfTheMonth().get(0));
        Assertions.assertEquals(OptimizationPreference.COST,
            response.iterator().next().properties().schedule().executionParameters().optimizationPreference());
        Assertions.assertEquals(1312962595,
            response.iterator().next().properties().schedule().executionParameters().retryPolicy().retryCount());
        Assertions.assertEquals(270206644,
            response.iterator()
                .next()
                .properties()
                .schedule()
                .executionParameters()
                .retryPolicy()
                .retryWindowInMinutes());
        Assertions.assertEquals(DeadlineType.UNKNOWN,
            response.iterator().next().properties().schedule().deadlineType());
        Assertions.assertEquals("cciuqgbdbutau",
            response.iterator().next().properties().notificationSettings().get(0).destination());
        Assertions.assertEquals(NotificationType.EMAIL,
            response.iterator().next().properties().notificationSettings().get(0).type());
        Assertions.assertEquals(Language.EN_US,
            response.iterator().next().properties().notificationSettings().get(0).language());
        Assertions.assertFalse(response.iterator().next().properties().notificationSettings().get(0).disabled());
        Assertions.assertTrue(response.iterator().next().properties().disabled());
    }
}
