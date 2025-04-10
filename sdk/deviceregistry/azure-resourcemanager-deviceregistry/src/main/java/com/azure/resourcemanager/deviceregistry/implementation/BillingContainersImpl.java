// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceregistry.fluent.BillingContainersClient;
import com.azure.resourcemanager.deviceregistry.fluent.models.BillingContainerInner;
import com.azure.resourcemanager.deviceregistry.models.BillingContainer;
import com.azure.resourcemanager.deviceregistry.models.BillingContainers;

public final class BillingContainersImpl implements BillingContainers {
    private static final ClientLogger LOGGER = new ClientLogger(BillingContainersImpl.class);

    private final BillingContainersClient innerClient;

    private final com.azure.resourcemanager.deviceregistry.DeviceRegistryManager serviceManager;

    public BillingContainersImpl(BillingContainersClient innerClient,
        com.azure.resourcemanager.deviceregistry.DeviceRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BillingContainer> getWithResponse(String billingContainerName, Context context) {
        Response<BillingContainerInner> inner = this.serviceClient().getWithResponse(billingContainerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingContainer get(String billingContainerName) {
        BillingContainerInner inner = this.serviceClient().get(billingContainerName);
        if (inner != null) {
            return new BillingContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<BillingContainer> list() {
        PagedIterable<BillingContainerInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingContainer> list(Context context) {
        PagedIterable<BillingContainerInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingContainerImpl(inner1, this.manager()));
    }

    private BillingContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deviceregistry.DeviceRegistryManager manager() {
        return this.serviceManager;
    }
}
