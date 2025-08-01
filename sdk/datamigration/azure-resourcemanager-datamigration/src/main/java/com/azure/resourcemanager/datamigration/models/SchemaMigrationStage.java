// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Current stage of schema migration.
 */
public final class SchemaMigrationStage extends ExpandableStringEnum<SchemaMigrationStage> {
    /**
     * Static value NotStarted for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage NOT_STARTED = fromString("NotStarted");

    /**
     * Static value ValidatingInputs for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage VALIDATING_INPUTS = fromString("ValidatingInputs");

    /**
     * Static value CollectingObjects for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage COLLECTING_OBJECTS = fromString("CollectingObjects");

    /**
     * Static value DownloadingScript for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage DOWNLOADING_SCRIPT = fromString("DownloadingScript");

    /**
     * Static value GeneratingScript for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage GENERATING_SCRIPT = fromString("GeneratingScript");

    /**
     * Static value UploadingScript for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage UPLOADING_SCRIPT = fromString("UploadingScript");

    /**
     * Static value DeployingSchema for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage DEPLOYING_SCHEMA = fromString("DeployingSchema");

    /**
     * Static value Completed for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage COMPLETED = fromString("Completed");

    /**
     * Static value CompletedWithWarnings for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage COMPLETED_WITH_WARNINGS = fromString("CompletedWithWarnings");

    /**
     * Static value Failed for SchemaMigrationStage.
     */
    public static final SchemaMigrationStage FAILED = fromString("Failed");

    /**
     * Creates a new instance of SchemaMigrationStage value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SchemaMigrationStage() {
    }

    /**
     * Creates or finds a SchemaMigrationStage from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SchemaMigrationStage.
     */
    public static SchemaMigrationStage fromString(String name) {
        return fromString(name, SchemaMigrationStage.class);
    }

    /**
     * Gets known SchemaMigrationStage values.
     * 
     * @return known SchemaMigrationStage values.
     */
    public static Collection<SchemaMigrationStage> values() {
        return values(SchemaMigrationStage.class);
    }
}
