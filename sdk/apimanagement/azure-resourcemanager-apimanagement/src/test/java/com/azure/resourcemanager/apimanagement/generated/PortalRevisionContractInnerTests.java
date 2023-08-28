// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalRevisionContractInner;
import org.junit.jupiter.api.Assertions;

public final class PortalRevisionContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortalRevisionContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"qtrotpvclp\",\"statusDetails\":\"yrlmwkptsk\",\"status\":\"publishing\",\"isCurrent\":true,\"createdDateTime\":\"2021-02-20T04:38:57Z\",\"updatedDateTime\":\"2021-05-01T02:02:22Z\"},\"id\":\"bmk\",\"name\":\"kmkook\",\"type\":\"putmgvmuyakm\"}")
                .toObject(PortalRevisionContractInner.class);
        Assertions.assertEquals("qtrotpvclp", model.description());
        Assertions.assertEquals(true, model.isCurrent());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortalRevisionContractInner model =
            new PortalRevisionContractInner().withDescription("qtrotpvclp").withIsCurrent(true);
        model = BinaryData.fromObject(model).toObject(PortalRevisionContractInner.class);
        Assertions.assertEquals("qtrotpvclp", model.description());
        Assertions.assertEquals(true, model.isCurrent());
    }
}