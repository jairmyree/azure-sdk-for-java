// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.SqlDbMigrationStatusDetails;

public final class SqlDbMigrationStatusDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlDbMigrationStatusDetails model = BinaryData.fromString(
            "{\"migrationState\":\"felluwfzitonpe\",\"sqlDataCopyErrors\":[\"jkjlxofpdvhpfx\",\"ypininm\",\"yhuybbkpod\"],\"listOfCopyProgressDetails\":[{\"tableName\":\"ginuvamih\",\"status\":\"gnarxzxtheo\",\"parallelCopyType\":\"si\",\"usedParallelCopies\":1045081516,\"dataRead\":7383356325506438565,\"dataWritten\":1324665084948795844,\"rowsRead\":7067055679809849954,\"rowsCopied\":6762016321184905530,\"copyStart\":\"2021-08-15T16:10:49Z\",\"copyThroughput\":19.729320262001117,\"copyDuration\":1668036347},{\"tableName\":\"gxg\",\"status\":\"pemvtzfkufubljof\",\"parallelCopyType\":\"eofjaeqjh\",\"usedParallelCopies\":158340850,\"dataRead\":25353587177068421,\"dataWritten\":7809204767921166724,\"rowsRead\":8387185057930891317,\"rowsCopied\":1770207269131464371,\"copyStart\":\"2021-11-20T09:27:06Z\",\"copyThroughput\":75.88975405760873,\"copyDuration\":588307069},{\"tableName\":\"zgcwrw\",\"status\":\"xxwr\",\"parallelCopyType\":\"douskcqvkocrcjdk\",\"usedParallelCopies\":371451274,\"dataRead\":104740040232311726,\"dataWritten\":5581291117453536479,\"rowsRead\":1460104247142162600,\"rowsCopied\":2529310746762360651,\"copyStart\":\"2021-08-17T11:42:15Z\",\"copyThroughput\":81.58642733877495,\"copyDuration\":568858007}]}")
            .toObject(SqlDbMigrationStatusDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlDbMigrationStatusDetails model = new SqlDbMigrationStatusDetails();
        model = BinaryData.fromObject(model).toObject(SqlDbMigrationStatusDetails.class);
    }
}
