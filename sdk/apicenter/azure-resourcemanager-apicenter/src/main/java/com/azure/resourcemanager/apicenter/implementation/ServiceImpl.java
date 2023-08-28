// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.ServiceInner;
import com.azure.resourcemanager.apicenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.apicenter.models.ProvisioningState;
import com.azure.resourcemanager.apicenter.models.Service;
import com.azure.resourcemanager.apicenter.models.ServiceUpdate;
import java.util.Collections;
import java.util.Map;

public final class ServiceImpl implements Service, Service.Definition, Service.Update {
    private ServiceInner innerObject;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private ServiceUpdate updateParameters;

    public ServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Service create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Service create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ServiceImpl(String name, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = new ServiceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public ServiceImpl update() {
        this.updateParameters = new ServiceUpdate();
        return this;
    }

    public Service apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .updateWithResponse(resourceGroupName, serviceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Service apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .updateWithResponse(resourceGroupName, serviceName, updateParameters, context)
                .getValue();
        return this;
    }

    ServiceImpl(ServiceInner innerObject, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
    }

    public Service refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, Context.NONE)
                .getValue();
        return this;
    }

    public Service refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, context)
                .getValue();
        return this;
    }

    public ServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ServiceImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }
}