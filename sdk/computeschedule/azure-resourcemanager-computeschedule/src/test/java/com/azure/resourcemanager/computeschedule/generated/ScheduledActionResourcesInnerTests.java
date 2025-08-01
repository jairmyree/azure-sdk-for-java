// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computeschedule.fluent.models.ScheduledActionResourcesInner;
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.Language;
import com.azure.resourcemanager.computeschedule.models.Month;
import com.azure.resourcemanager.computeschedule.models.NotificationType;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.ResourceType;
import com.azure.resourcemanager.computeschedule.models.ScheduledActionType;
import com.azure.resourcemanager.computeschedule.models.WeekDay;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ScheduledActionResourcesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduledActionResourcesInner model = BinaryData.fromString(
            "{\"properties\":{\"resourceType\":\"VirtualMachine\",\"actionType\":\"Deallocate\",\"startTime\":\"2021-07-31T13:07:30Z\",\"endTime\":\"2021-07-23T09:06:10Z\",\"schedule\":{\"scheduledTime\":\"baiuebbaumny\",\"timeZone\":\"upedeojnabckhs\",\"requestedWeekDays\":[\"Sunday\"],\"requestedMonths\":[\"March\",\"June\",\"September\"],\"requestedDaysOfTheMonth\":[2000521047,74737899,1146165631],\"executionParameters\":{\"optimizationPreference\":\"Cost\",\"retryPolicy\":{\"retryCount\":1942912661,\"retryWindowInMinutes\":1589846269}},\"deadlineType\":\"Unknown\"},\"notificationSettings\":[{\"destination\":\"mhjjdhtldwkyzx\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":true},{\"destination\":\"cwscwsvlx\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":true},{\"destination\":\"wrupqsxvnmicykvc\",\"type\":\"Email\",\"language\":\"en-us\",\"disabled\":false}],\"disabled\":true,\"provisioningState\":\"Deleting\"},\"id\":\"tyfjfcnjbkcnxdhb\",\"name\":\"tkphywpnvjtoqn\",\"type\":\"rmclfplphoxu\"}")
            .toObject(ScheduledActionResourcesInner.class);
        Assertions.assertEquals(ResourceType.VIRTUAL_MACHINE, model.properties().resourceType());
        Assertions.assertEquals(ScheduledActionType.DEALLOCATE, model.properties().actionType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-31T13:07:30Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T09:06:10Z"), model.properties().endTime());
        Assertions.assertEquals("baiuebbaumny", model.properties().schedule().scheduledTime());
        Assertions.assertEquals("upedeojnabckhs", model.properties().schedule().timeZone());
        Assertions.assertEquals(WeekDay.SUNDAY, model.properties().schedule().requestedWeekDays().get(0));
        Assertions.assertEquals(Month.MARCH, model.properties().schedule().requestedMonths().get(0));
        Assertions.assertEquals(2000521047, model.properties().schedule().requestedDaysOfTheMonth().get(0));
        Assertions.assertEquals(OptimizationPreference.COST,
            model.properties().schedule().executionParameters().optimizationPreference());
        Assertions.assertEquals(1942912661,
            model.properties().schedule().executionParameters().retryPolicy().retryCount());
        Assertions.assertEquals(1589846269,
            model.properties().schedule().executionParameters().retryPolicy().retryWindowInMinutes());
        Assertions.assertEquals(DeadlineType.UNKNOWN, model.properties().schedule().deadlineType());
        Assertions.assertEquals("mhjjdhtldwkyzx", model.properties().notificationSettings().get(0).destination());
        Assertions.assertEquals(NotificationType.EMAIL, model.properties().notificationSettings().get(0).type());
        Assertions.assertEquals(Language.EN_US, model.properties().notificationSettings().get(0).language());
        Assertions.assertTrue(model.properties().notificationSettings().get(0).disabled());
        Assertions.assertTrue(model.properties().disabled());
    }
}
