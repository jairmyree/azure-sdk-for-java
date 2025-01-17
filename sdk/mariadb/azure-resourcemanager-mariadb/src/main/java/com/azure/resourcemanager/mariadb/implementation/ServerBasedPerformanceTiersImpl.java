// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.ServerBasedPerformanceTiersClient;
import com.azure.resourcemanager.mariadb.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mariadb.models.PerformanceTierProperties;
import com.azure.resourcemanager.mariadb.models.ServerBasedPerformanceTiers;

public final class ServerBasedPerformanceTiersImpl implements ServerBasedPerformanceTiers {
    private static final ClientLogger LOGGER = new ClientLogger(ServerBasedPerformanceTiersImpl.class);

    private final ServerBasedPerformanceTiersClient innerClient;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    public ServerBasedPerformanceTiersImpl(ServerBasedPerformanceTiersClient innerClient,
        com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PerformanceTierProperties> list(String resourceGroupName, String serverName) {
        PagedIterable<PerformanceTierPropertiesInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<PerformanceTierProperties> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<PerformanceTierPropertiesInner> inner
            = this.serviceClient().list(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    private ServerBasedPerformanceTiersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}
