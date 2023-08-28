// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PortalConfigsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigContractInner;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCollection;
import com.azure.resourcemanager.apimanagement.models.PortalConfigContract;
import com.azure.resourcemanager.apimanagement.models.PortalConfigs;
import com.azure.resourcemanager.apimanagement.models.PortalConfigsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.PortalConfigsGetResponse;

public final class PortalConfigsImpl implements PortalConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(PortalConfigsImpl.class);

    private final PortalConfigsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public PortalConfigsImpl(
        PortalConfigsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PortalConfigCollection> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PortalConfigCollectionInner> inner =
            this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalConfigCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PortalConfigCollection listByService(String resourceGroupName, String serviceName) {
        PortalConfigCollectionInner inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        if (inner != null) {
            return new PortalConfigCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PortalConfigsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String portalConfigId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, portalConfigId, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String portalConfigId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, portalConfigId);
    }

    public Response<PortalConfigContract> getWithResponse(
        String resourceGroupName, String serviceName, String portalConfigId, Context context) {
        PortalConfigsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, portalConfigId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalConfigContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PortalConfigContract get(String resourceGroupName, String serviceName, String portalConfigId) {
        PortalConfigContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, portalConfigId);
        if (inner != null) {
            return new PortalConfigContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PortalConfigContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String portalConfigId = Utils.getValueFromIdByName(id, "portalconfigs");
        if (portalConfigId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'portalconfigs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, portalConfigId, Context.NONE).getValue();
    }

    public Response<PortalConfigContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String portalConfigId = Utils.getValueFromIdByName(id, "portalconfigs");
        if (portalConfigId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'portalconfigs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, portalConfigId, context);
    }

    private PortalConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public PortalConfigContractImpl define(String name) {
        return new PortalConfigContractImpl(name, this.manager());
    }
}