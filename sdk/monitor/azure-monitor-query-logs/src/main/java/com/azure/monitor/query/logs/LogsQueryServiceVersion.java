// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.monitor.query.logs;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of LogsQueryClient.
 */
public enum LogsQueryServiceVersion implements ServiceVersion {
    /**
     * Enum value v1.
     */
    V1("v1");

    private final String version;

    LogsQueryServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link LogsQueryServiceVersion}.
     */
    public static LogsQueryServiceVersion getLatest() {
        return V1;
    }
}
