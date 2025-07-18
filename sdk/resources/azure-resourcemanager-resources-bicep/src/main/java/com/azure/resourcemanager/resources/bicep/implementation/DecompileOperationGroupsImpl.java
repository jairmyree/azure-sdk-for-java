// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.resources.bicep.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.bicep.fluent.DecompileOperationGroupsClient;
import com.azure.resourcemanager.resources.bicep.fluent.models.DecompileOperationSuccessResponseInner;
import com.azure.resourcemanager.resources.bicep.models.DecompileOperationGroups;
import com.azure.resourcemanager.resources.bicep.models.DecompileOperationRequest;
import com.azure.resourcemanager.resources.bicep.models.DecompileOperationSuccessResponse;

public final class DecompileOperationGroupsImpl implements DecompileOperationGroups {
    private static final ClientLogger LOGGER = new ClientLogger(DecompileOperationGroupsImpl.class);

    private final DecompileOperationGroupsClient innerClient;

    private final com.azure.resourcemanager.resources.bicep.BicepProviderManager serviceManager;

    public DecompileOperationGroupsImpl(DecompileOperationGroupsClient innerClient,
        com.azure.resourcemanager.resources.bicep.BicepProviderManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DecompileOperationSuccessResponse>
        bicepWithResponse(DecompileOperationRequest decompileOperationRequest, Context context) {
        Response<DecompileOperationSuccessResponseInner> inner
            = this.serviceClient().bicepWithResponse(decompileOperationRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DecompileOperationSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DecompileOperationSuccessResponse bicep(DecompileOperationRequest decompileOperationRequest) {
        DecompileOperationSuccessResponseInner inner = this.serviceClient().bicep(decompileOperationRequest);
        if (inner != null) {
            return new DecompileOperationSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DecompileOperationGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resources.bicep.BicepProviderManager manager() {
        return this.serviceManager;
    }
}
