// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.GroupConnectivityInformation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GroupConnectivityInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupConnectivityInformation model = BinaryData.fromString(
            "{\"groupId\":\"ybycnunvj\",\"memberName\":\"tkfa\",\"customerVisibleFqdns\":[\"pqgik\",\"zirtxdyuxzejntps\",\"wgioilqukry\",\"xtqmieoxor\"],\"internalFqdn\":\"ufhyaomtbgh\",\"redirectMapId\":\"vgrvkffo\",\"privateLinkServiceArmRegion\":\"zh\"}")
            .toObject(GroupConnectivityInformation.class);
        Assertions.assertEquals("ybycnunvj", model.groupId());
        Assertions.assertEquals("tkfa", model.memberName());
        Assertions.assertEquals("pqgik", model.customerVisibleFqdns().get(0));
        Assertions.assertEquals("ufhyaomtbgh", model.internalFqdn());
        Assertions.assertEquals("vgrvkffo", model.redirectMapId());
        Assertions.assertEquals("zh", model.privateLinkServiceArmRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupConnectivityInformation model = new GroupConnectivityInformation().withGroupId("ybycnunvj")
            .withMemberName("tkfa")
            .withCustomerVisibleFqdns(Arrays.asList("pqgik", "zirtxdyuxzejntps", "wgioilqukry", "xtqmieoxor"))
            .withInternalFqdn("ufhyaomtbgh")
            .withRedirectMapId("vgrvkffo")
            .withPrivateLinkServiceArmRegion("zh");
        model = BinaryData.fromObject(model).toObject(GroupConnectivityInformation.class);
        Assertions.assertEquals("ybycnunvj", model.groupId());
        Assertions.assertEquals("tkfa", model.memberName());
        Assertions.assertEquals("pqgik", model.customerVisibleFqdns().get(0));
        Assertions.assertEquals("ufhyaomtbgh", model.internalFqdn());
        Assertions.assertEquals("vgrvkffo", model.redirectMapId());
        Assertions.assertEquals("zh", model.privateLinkServiceArmRegion());
    }
}
