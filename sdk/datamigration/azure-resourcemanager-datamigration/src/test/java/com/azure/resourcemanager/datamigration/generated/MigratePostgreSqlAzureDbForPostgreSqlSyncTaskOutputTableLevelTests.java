// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel;

public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel model = BinaryData.fromString(
            "{\"resultType\":\"TableLevelOutput\",\"tableName\":\"ohzjqatucoigeb\",\"databaseName\":\"cnwfepbnwgfmxjg\",\"cdcInsertCounter\":2410617396148437383,\"cdcUpdateCounter\":6612948564311319364,\"cdcDeleteCounter\":2744924050874109810,\"fullLoadEstFinishTime\":\"2021-06-01T23:54:49Z\",\"fullLoadStartedOn\":\"2021-01-06T12:40:34Z\",\"fullLoadEndedOn\":\"2021-08-14T22:27:05Z\",\"fullLoadTotalRows\":8416021990822633732,\"state\":\"CANCELED\",\"totalChangesApplied\":3526339684780682940,\"dataErrorsCounter\":3703277346132308031,\"lastModifiedTime\":\"2021-10-07T19:49:42Z\",\"id\":\"rwd\"}")
            .toObject(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel model
            = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel();
        model = BinaryData.fromObject(model)
            .toObject(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevel.class);
    }
}
