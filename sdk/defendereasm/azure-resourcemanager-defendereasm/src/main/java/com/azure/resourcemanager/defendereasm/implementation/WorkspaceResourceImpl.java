// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.defendereasm.fluent.models.WorkspaceResourceInner;
import com.azure.resourcemanager.defendereasm.models.ResourceState;
import com.azure.resourcemanager.defendereasm.models.WorkspacePatchResource;
import com.azure.resourcemanager.defendereasm.models.WorkspaceResource;
import java.util.Collections;
import java.util.Map;

public final class WorkspaceResourceImpl
    implements WorkspaceResource, WorkspaceResource.Definition, WorkspaceResource.Update {
    private WorkspaceResourceInner innerObject;

    private final com.azure.resourcemanager.defendereasm.EasmManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String dataPlaneEndpoint() {
        return this.innerModel().dataPlaneEndpoint();
    }

    public ResourceState provisioningState() {
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

    public WorkspaceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.defendereasm.EasmManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspacePatchResource updateWorkspacePatchResource;

    public WorkspaceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public WorkspaceResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createAndUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkspaceResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createAndUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    WorkspaceResourceImpl(String name, com.azure.resourcemanager.defendereasm.EasmManager serviceManager) {
        this.innerObject = new WorkspaceResourceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceResourceImpl update() {
        this.updateWorkspacePatchResource = new WorkspacePatchResource();
        return this;
    }

    public WorkspaceResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateWorkspacePatchResource, Context.NONE)
                .getValue();
        return this;
    }

    public WorkspaceResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateWorkspacePatchResource, context)
                .getValue();
        return this;
    }

    WorkspaceResourceImpl(
        WorkspaceResourceInner innerObject, com.azure.resourcemanager.defendereasm.EasmManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public WorkspaceResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public WorkspaceResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public WorkspaceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWorkspacePatchResource.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}