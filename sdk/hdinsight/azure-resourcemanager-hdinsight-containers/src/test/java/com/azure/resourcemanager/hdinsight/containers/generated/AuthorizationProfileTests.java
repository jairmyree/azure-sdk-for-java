// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.AuthorizationProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AuthorizationProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthorizationProfile model =
            BinaryData
                .fromString(
                    "{\"userIds\":[\"kacspkw\",\"hzdobpxjmflbvvnc\"],\"groupIds\":[\"cciw\",\"zjuqkhrsaj\",\"wkuofoskghsauu\",\"mjmvxieduugidyjr\"]}")
                .toObject(AuthorizationProfile.class);
        Assertions.assertEquals("kacspkw", model.userIds().get(0));
        Assertions.assertEquals("cciw", model.groupIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthorizationProfile model =
            new AuthorizationProfile()
                .withUserIds(Arrays.asList("kacspkw", "hzdobpxjmflbvvnc"))
                .withGroupIds(Arrays.asList("cciw", "zjuqkhrsaj", "wkuofoskghsauu", "mjmvxieduugidyjr"));
        model = BinaryData.fromObject(model).toObject(AuthorizationProfile.class);
        Assertions.assertEquals("kacspkw", model.userIds().get(0));
        Assertions.assertEquals("cciw", model.groupIds().get(0));
    }
}