// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.containers.fluent.ClustersClient;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInner;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInstanceViewResultInner;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ServiceConfigResultInner;
import com.azure.resourcemanager.hdinsight.containers.models.Cluster;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewResult;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterResizeData;
import com.azure.resourcemanager.hdinsight.containers.models.Clusters;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceConfigResult;

public final class ClustersImpl implements Clusters {
    private static final ClientLogger LOGGER = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager;

    public ClustersImpl(
        ClustersClient innerClient,
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Cluster> listByClusterPoolName(String resourceGroupName, String clusterPoolName) {
        PagedIterable<ClusterInner> inner =
            this.serviceClient().listByClusterPoolName(resourceGroupName, clusterPoolName);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByClusterPoolName(
        String resourceGroupName, String clusterPoolName, Context context) {
        PagedIterable<ClusterInner> inner =
            this.serviceClient().listByClusterPoolName(resourceGroupName, clusterPoolName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public Cluster resize(
        String resourceGroupName, String clusterPoolName, String clusterName, ClusterResizeData clusterResizeRequest) {
        ClusterInner inner =
            this.serviceClient().resize(resourceGroupName, clusterPoolName, clusterName, clusterResizeRequest);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Cluster resize(
        String resourceGroupName,
        String clusterPoolName,
        String clusterName,
        ClusterResizeData clusterResizeRequest,
        Context context) {
        ClusterInner inner =
            this.serviceClient().resize(resourceGroupName, clusterPoolName, clusterName, clusterResizeRequest, context);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cluster> getWithResponse(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context) {
        Response<ClusterInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterPoolName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Cluster get(String resourceGroupName, String clusterPoolName, String clusterName) {
        ClusterInner inner = this.serviceClient().get(resourceGroupName, clusterPoolName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterPoolName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterPoolName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterPoolName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterPoolName, clusterName, context);
    }

    public PagedIterable<ServiceConfigResult> listServiceConfigs(
        String resourceGroupName, String clusterPoolName, String clusterName) {
        PagedIterable<ServiceConfigResultInner> inner =
            this.serviceClient().listServiceConfigs(resourceGroupName, clusterPoolName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ServiceConfigResultImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceConfigResult> listServiceConfigs(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context) {
        PagedIterable<ServiceConfigResultInner> inner =
            this.serviceClient().listServiceConfigs(resourceGroupName, clusterPoolName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ServiceConfigResultImpl(inner1, this.manager()));
    }

    public PagedIterable<ClusterInstanceViewResult> listInstanceViews(
        String resourceGroupName, String clusterPoolName, String clusterName) {
        PagedIterable<ClusterInstanceViewResultInner> inner =
            this.serviceClient().listInstanceViews(resourceGroupName, clusterPoolName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ClusterInstanceViewResultImpl(inner1, this.manager()));
    }

    public PagedIterable<ClusterInstanceViewResult> listInstanceViews(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context) {
        PagedIterable<ClusterInstanceViewResultInner> inner =
            this.serviceClient().listInstanceViews(resourceGroupName, clusterPoolName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterInstanceViewResultImpl(inner1, this.manager()));
    }

    public Response<ClusterInstanceViewResult> getInstanceViewWithResponse(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context) {
        Response<ClusterInstanceViewResultInner> inner =
            this.serviceClient().getInstanceViewWithResponse(resourceGroupName, clusterPoolName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterInstanceViewResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterInstanceViewResult getInstanceView(
        String resourceGroupName, String clusterPoolName, String clusterName) {
        ClusterInstanceViewResultInner inner =
            this.serviceClient().getInstanceView(resourceGroupName, clusterPoolName, clusterName);
        if (inner != null) {
            return new ClusterInstanceViewResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Cluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterPoolName = Utils.getValueFromIdByName(id, "clusterpools");
        if (clusterPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusterpools'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterPoolName, clusterName, Context.NONE).getValue();
    }

    public Response<Cluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterPoolName = Utils.getValueFromIdByName(id, "clusterpools");
        if (clusterPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusterpools'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterPoolName, clusterName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterPoolName = Utils.getValueFromIdByName(id, "clusterpools");
        if (clusterPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusterpools'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        this.delete(resourceGroupName, clusterPoolName, clusterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterPoolName = Utils.getValueFromIdByName(id, "clusterpools");
        if (clusterPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusterpools'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        this.delete(resourceGroupName, clusterPoolName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}