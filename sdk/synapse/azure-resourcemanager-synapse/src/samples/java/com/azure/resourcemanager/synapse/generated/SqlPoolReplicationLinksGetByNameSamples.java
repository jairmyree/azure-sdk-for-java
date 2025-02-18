// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for SqlPoolReplicationLinks GetByName.
 */
public final class SqlPoolReplicationLinksGetByNameSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * SqlPoolReplicationLinks_GetByName.json
     */
    /**
     * Sample code: Lists a Sql Analytic pool's replication links.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void
        listsASqlAnalyticPoolSReplicationLinks(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolReplicationLinks()
            .getByNameWithResponse("sqlcrudtest-4799", "sqlcrudtest-6440", "testdb",
                "5b301b68-03f6-4b26-b0f4-73ebb8634238", com.azure.core.util.Context.NONE);
    }
}
