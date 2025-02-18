// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SquareSource;

public final class SquareSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SquareSource model = BinaryData.fromString(
            "{\"type\":\"SquareSource\",\"query\":\"dataxnepub\",\"queryTimeout\":\"datainfauytmqvsdyqyj\",\"additionalColumns\":\"datafotwmxedlcxmyxt\",\"sourceRetryCount\":\"dataapoj\",\"sourceRetryWait\":\"datavxan\",\"maxConcurrentConnections\":\"datapspiipfgdn\",\"disableMetricsCollection\":\"datakvvrhoqy\",\"\":{\"xhskhkqlvocrdd\":\"datavnruodu\"}}")
            .toObject(SquareSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SquareSource model = new SquareSource().withSourceRetryCount("dataapoj")
            .withSourceRetryWait("datavxan")
            .withMaxConcurrentConnections("datapspiipfgdn")
            .withDisableMetricsCollection("datakvvrhoqy")
            .withQueryTimeout("datainfauytmqvsdyqyj")
            .withAdditionalColumns("datafotwmxedlcxmyxt")
            .withQuery("dataxnepub");
        model = BinaryData.fromObject(model).toObject(SquareSource.class);
    }
}
