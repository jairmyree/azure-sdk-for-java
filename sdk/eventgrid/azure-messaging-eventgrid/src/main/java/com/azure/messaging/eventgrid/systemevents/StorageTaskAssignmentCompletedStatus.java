// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status for a storage task.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Deprecated
public final class StorageTaskAssignmentCompletedStatus
    extends ExpandableStringEnum<StorageTaskAssignmentCompletedStatus> {

    /**
     * Static value Succeeded for StorageTaskAssignmentCompletedStatus.
     */
    @Generated
    public static final StorageTaskAssignmentCompletedStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for StorageTaskAssignmentCompletedStatus.
     */
    @Generated
    public static final StorageTaskAssignmentCompletedStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of StorageTaskAssignmentCompletedStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public StorageTaskAssignmentCompletedStatus() {
    }

    /**
     * Creates or finds a StorageTaskAssignmentCompletedStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageTaskAssignmentCompletedStatus.
     */
    @Generated
    public static StorageTaskAssignmentCompletedStatus fromString(String name) {
        return fromString(name, StorageTaskAssignmentCompletedStatus.class);
    }

    /**
     * Gets known StorageTaskAssignmentCompletedStatus values.
     *
     * @return known StorageTaskAssignmentCompletedStatus values.
     */
    @Generated
    public static Collection<StorageTaskAssignmentCompletedStatus> values() {
        return values(StorageTaskAssignmentCompletedStatus.class);
    }
}
