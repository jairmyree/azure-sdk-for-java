// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ResolverUpdateContract;
import org.junit.jupiter.api.Assertions;

public final class ResolverUpdateContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResolverUpdateContract model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"isglrrc\",\"path\":\"zkhhltnjadhqo\",\"description\":\"jqoyueayfbpcm\"}}")
                .toObject(ResolverUpdateContract.class);
        Assertions.assertEquals("isglrrc", model.displayName());
        Assertions.assertEquals("zkhhltnjadhqo", model.path());
        Assertions.assertEquals("jqoyueayfbpcm", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResolverUpdateContract model =
            new ResolverUpdateContract()
                .withDisplayName("isglrrc")
                .withPath("zkhhltnjadhqo")
                .withDescription("jqoyueayfbpcm");
        model = BinaryData.fromObject(model).toObject(ResolverUpdateContract.class);
        Assertions.assertEquals("isglrrc", model.displayName());
        Assertions.assertEquals("zkhhltnjadhqo", model.path());
        Assertions.assertEquals("jqoyueayfbpcm", model.description());
    }
}