// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.neonpostgres.implementation.models.NeonRoleListResult;
import org.junit.jupiter.api.Assertions;

public final class NeonRoleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NeonRoleListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"entityId\":\"naz\",\"entityName\":\"ohzrsqalsx\",\"createdAt\":\"nwqapfgsdpcvess\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"uuipldq\",\"value\":\"ctekval\"}],\"branchId\":\"htjqvqyvw\",\"permissions\":[\"a\"],\"isSuperUser\":false},\"id\":\"zzy\",\"name\":\"ev\",\"type\":\"sxivzrrryvei\"},{\"properties\":{\"entityId\":\"sk\",\"entityName\":\"zatvfuzka\",\"createdAt\":\"jvvruxwigsyei\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"jtgrqgdgkkileplk\",\"value\":\"smk\"},{\"name\":\"hwtbbaedorvvm\",\"value\":\"floygbdgwumg\"}],\"branchId\":\"gdhpabgdexjddv\",\"permissions\":[\"qwotmmwllcol\",\"rsxaptefh\",\"xcgjokjljnhvlq\"],\"isSuperUser\":false},\"id\":\"peeksnbksdqhjv\",\"name\":\"klxesl\",\"type\":\"hhus\"},{\"properties\":{\"entityId\":\"oqmavnwqjwgo\",\"entityName\":\"lejjjkxy\",\"createdAt\":\"fdb\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"ensvkzykjtj\",\"value\":\"nsxfwu\"},{\"name\":\"hcdpkupnqrmgj\",\"value\":\"bpkuwxeoio\"},{\"name\":\"fiz\",\"value\":\"av\"}],\"branchId\":\"zwfbcyaykmmfzs\",\"permissions\":[\"xrzxmdewsrsxkrp\",\"bjazejwwviy\",\"y\",\"suhbrnn\"],\"isSuperUser\":false},\"id\":\"qwjhqkbiwetpozyc\",\"name\":\"qiqyhgfsetzlexbs\",\"type\":\"ledynojpz\"}],\"nextLink\":\"wfbzkkdt\"}")
            .toObject(NeonRoleListResult.class);
        Assertions.assertEquals("ohzrsqalsx", model.value().get(0).properties().entityName());
        Assertions.assertEquals("uuipldq", model.value().get(0).properties().attributes().get(0).name());
        Assertions.assertEquals("ctekval", model.value().get(0).properties().attributes().get(0).value());
        Assertions.assertEquals("htjqvqyvw", model.value().get(0).properties().branchId());
        Assertions.assertEquals("a", model.value().get(0).properties().permissions().get(0));
        Assertions.assertFalse(model.value().get(0).properties().isSuperUser());
        Assertions.assertEquals("wfbzkkdt", model.nextLink());
    }
}
