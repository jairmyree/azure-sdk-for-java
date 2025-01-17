// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ComputeResourceInner;
import com.azure.resourcemanager.machinelearningservices.models.AmlComputeNodeInformation;
import com.azure.resourcemanager.machinelearningservices.models.ClusterUpdateParameters;
import com.azure.resourcemanager.machinelearningservices.models.Compute;
import com.azure.resourcemanager.machinelearningservices.models.ComputeResource;
import com.azure.resourcemanager.machinelearningservices.models.ComputeSecrets;
import com.azure.resourcemanager.machinelearningservices.models.Identity;
import com.azure.resourcemanager.machinelearningservices.models.ScaleSettings;
import com.azure.resourcemanager.machinelearningservices.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class ComputeResourceImpl implements ComputeResource, ComputeResource.Definition, ComputeResource.Update {
    private ComputeResourceInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

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

    public Compute properties() {
        return this.innerModel().properties();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ComputeResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String computeName;

    private ClusterUpdateParameters updateParameters;

    public ComputeResourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public ComputeResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .createOrUpdate(resourceGroupName, workspaceName, computeName, this.innerModel(), Context.NONE);
        return this;
    }

    public ComputeResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .createOrUpdate(resourceGroupName, workspaceName, computeName, this.innerModel(), context);
        return this;
    }

    ComputeResourceImpl(String name,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = new ComputeResourceInner();
        this.serviceManager = serviceManager;
        this.computeName = name;
    }

    public ComputeResourceImpl update() {
        this.updateParameters = new ClusterUpdateParameters();
        return this;
    }

    public ComputeResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .update(resourceGroupName, workspaceName, computeName, updateParameters, Context.NONE);
        return this;
    }

    public ComputeResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .update(resourceGroupName, workspaceName, computeName, updateParameters, context);
        return this;
    }

    ComputeResourceImpl(ComputeResourceInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.computeName = Utils.getValueFromIdByName(innerObject.id(), "computes");
    }

    public ComputeResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .getWithResponse(resourceGroupName, workspaceName, computeName, Context.NONE)
            .getValue();
        return this;
    }

    public ComputeResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineLearningComputes()
            .getWithResponse(resourceGroupName, workspaceName, computeName, context)
            .getValue();
        return this;
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes() {
        return serviceManager.machineLearningComputes().listNodes(resourceGroupName, workspaceName, computeName);
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes(Context context) {
        return serviceManager.machineLearningComputes()
            .listNodes(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeSecrets listKeys() {
        return serviceManager.machineLearningComputes().listKeys(resourceGroupName, workspaceName, computeName);
    }

    public Response<ComputeSecrets> listKeysWithResponse(Context context) {
        return serviceManager.machineLearningComputes()
            .listKeysWithResponse(resourceGroupName, workspaceName, computeName, context);
    }

    public void start() {
        serviceManager.machineLearningComputes().start(resourceGroupName, workspaceName, computeName);
    }

    public void start(Context context) {
        serviceManager.machineLearningComputes().start(resourceGroupName, workspaceName, computeName, context);
    }

    public void stop() {
        serviceManager.machineLearningComputes().stop(resourceGroupName, workspaceName, computeName);
    }

    public void stop(Context context) {
        serviceManager.machineLearningComputes().stop(resourceGroupName, workspaceName, computeName, context);
    }

    public void restart() {
        serviceManager.machineLearningComputes().restart(resourceGroupName, workspaceName, computeName);
    }

    public Response<Void> restartWithResponse(Context context) {
        return serviceManager.machineLearningComputes()
            .restartWithResponse(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ComputeResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ComputeResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ComputeResourceImpl withProperties(Compute properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ComputeResourceImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ComputeResourceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ComputeResourceImpl withScaleSettings(ScaleSettings scaleSettings) {
        this.updateParameters.withScaleSettings(scaleSettings);
        return this;
    }
}
