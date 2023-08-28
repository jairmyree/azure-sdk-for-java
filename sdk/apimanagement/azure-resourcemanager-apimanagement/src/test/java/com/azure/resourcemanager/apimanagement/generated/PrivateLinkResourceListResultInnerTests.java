// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateLinkResourceListResultInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"lamwmgewa\",\"requiredMembers\":[\"lnbcpjstb\"],\"requiredZoneNames\":[\"hcucsqsnx\",\"bxufeapd\",\"bzyvbsua\"]},\"id\":\"ulpodkaxpf\",\"name\":\"bkzhmhjd\",\"type\":\"lt\"},{\"properties\":{\"groupId\":\"uq\",\"requiredMembers\":[\"adhfztlray\",\"rkgzkyhudbkuw\"],\"requiredZoneNames\":[\"xl\",\"weakfecjvxfa\",\"ufqizjvppw\",\"oajeyyjmjjxizx\"]},\"id\":\"xhnzlslekcttgzkj\",\"name\":\"yqpdwadeghztld\",\"type\":\"vczdjiahuqymjzu\"},{\"properties\":{\"groupId\":\"mejjqhddwvmq\",\"requiredMembers\":[\"ookyfoz\",\"bn\",\"x\",\"ypfqpgaixw\"],\"requiredZoneNames\":[\"kkderfrswq\",\"kwepwo\",\"ggicwnxhtfmcqbs\",\"d\"]},\"id\":\"pgchzpgfqum\",\"name\":\"djxh\",\"type\":\"ghgodkynrceq\"},{\"properties\":{\"groupId\":\"dbd\",\"requiredMembers\":[\"xjdnajuo\",\"jyyqmkw\"],\"requiredZoneNames\":[\"cwlo\",\"dejkluxxrwzobuz\"]},\"id\":\"sxgamtdtkw\",\"name\":\"pt\",\"type\":\"uzdprmim\"}]}")
                .toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("hcucsqsnx", model.value().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResultInner model =
            new PrivateLinkResourceListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner()
                                .withRequiredZoneNames(Arrays.asList("hcucsqsnx", "bxufeapd", "bzyvbsua")),
                            new PrivateLinkResourceInner()
                                .withRequiredZoneNames(
                                    Arrays.asList("xl", "weakfecjvxfa", "ufqizjvppw", "oajeyyjmjjxizx")),
                            new PrivateLinkResourceInner()
                                .withRequiredZoneNames(Arrays.asList("kkderfrswq", "kwepwo", "ggicwnxhtfmcqbs", "d")),
                            new PrivateLinkResourceInner()
                                .withRequiredZoneNames(Arrays.asList("cwlo", "dejkluxxrwzobuz"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("hcucsqsnx", model.value().get(0).requiredZoneNames().get(0));
    }
}