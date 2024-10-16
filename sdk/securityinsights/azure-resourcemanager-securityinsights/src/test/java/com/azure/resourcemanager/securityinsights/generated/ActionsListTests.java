// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.ActionResponseInner;
import com.azure.resourcemanager.securityinsights.models.ActionsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ActionsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActionsList model = BinaryData.fromString(
            "{\"nextLink\":\"jpsq\",\"value\":[{\"properties\":{\"workflowId\":\"o\",\"logicAppResourceId\":\"fdkfogk\"},\"etag\":\"gjofjd\",\"id\":\"qs\",\"name\":\"deupewnwrei\",\"type\":\"jzyflu\"},{\"properties\":{\"workflowId\":\"hmofc\",\"logicAppResourceId\":\"hs\"},\"etag\":\"urkdtmlx\",\"id\":\"kuksjtxukcdm\",\"name\":\"arcryuanzwuxzdxt\",\"type\":\"yrlhmwhfpmrqobm\"},{\"properties\":{\"workflowId\":\"knryrtihfxtij\",\"logicAppResourceId\":\"pzvgnwzsymglzufc\"},\"etag\":\"kohdbiha\",\"id\":\"fhfcb\",\"name\":\"y\",\"type\":\"a\"},{\"properties\":{\"workflowId\":\"hxqh\",\"logicAppResourceId\":\"bifpikxwczb\"},\"etag\":\"cnpqxuhivyqniwby\",\"id\":\"k\",\"name\":\"vd\",\"type\":\"mjgr\"}]}")
            .toObject(ActionsList.class);
        Assertions.assertEquals("gjofjd", model.value().get(0).etag());
        Assertions.assertEquals("o", model.value().get(0).workflowId());
        Assertions.assertEquals("fdkfogk", model.value().get(0).logicAppResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActionsList model = new ActionsList().withValue(Arrays.asList(
            new ActionResponseInner().withEtag("gjofjd").withWorkflowId("o").withLogicAppResourceId("fdkfogk"),
            new ActionResponseInner().withEtag("urkdtmlx").withWorkflowId("hmofc").withLogicAppResourceId("hs"),
            new ActionResponseInner().withEtag("kohdbiha")
                .withWorkflowId("knryrtihfxtij")
                .withLogicAppResourceId("pzvgnwzsymglzufc"),
            new ActionResponseInner().withEtag("cnpqxuhivyqniwby")
                .withWorkflowId("hxqh")
                .withLogicAppResourceId("bifpikxwczb")));
        model = BinaryData.fromObject(model).toObject(ActionsList.class);
        Assertions.assertEquals("gjofjd", model.value().get(0).etag());
        Assertions.assertEquals("o", model.value().get(0).workflowId());
        Assertions.assertEquals("fdkfogk", model.value().get(0).logicAppResourceId());
    }
}
