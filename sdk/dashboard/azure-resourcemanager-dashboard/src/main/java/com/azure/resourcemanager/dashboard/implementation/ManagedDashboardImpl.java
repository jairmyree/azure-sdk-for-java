// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dashboard.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dashboard.fluent.models.ManagedDashboardInner;
import com.azure.resourcemanager.dashboard.models.ManagedDashboard;
import com.azure.resourcemanager.dashboard.models.ManagedDashboardUpdateParameters;
import com.azure.resourcemanager.dashboard.models.ProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class ManagedDashboardImpl
    implements ManagedDashboard, ManagedDashboard.Definition, ManagedDashboard.Update {
    private ManagedDashboardInner innerObject;

    private final com.azure.resourcemanager.dashboard.DashboardManager serviceManager;

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

    public ManagedDashboardInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dashboard.DashboardManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dashboardName;

    private ManagedDashboardUpdateParameters updateRequestBodyParameters;

    public ManagedDashboardImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ManagedDashboard create() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .create(resourceGroupName, dashboardName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedDashboard create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .create(resourceGroupName, dashboardName, this.innerModel(), context);
        return this;
    }

    ManagedDashboardImpl(String name, com.azure.resourcemanager.dashboard.DashboardManager serviceManager) {
        this.innerObject = new ManagedDashboardInner();
        this.serviceManager = serviceManager;
        this.dashboardName = name;
    }

    public ManagedDashboardImpl update() {
        this.updateRequestBodyParameters = new ManagedDashboardUpdateParameters();
        return this;
    }

    public ManagedDashboard apply() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .updateWithResponse(resourceGroupName, dashboardName, updateRequestBodyParameters, Context.NONE)
            .getValue();
        return this;
    }

    public ManagedDashboard apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .updateWithResponse(resourceGroupName, dashboardName, updateRequestBodyParameters, context)
            .getValue();
        return this;
    }

    ManagedDashboardImpl(ManagedDashboardInner innerObject,
        com.azure.resourcemanager.dashboard.DashboardManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dashboardName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dashboards");
    }

    public ManagedDashboard refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .getByResourceGroupWithResponse(resourceGroupName, dashboardName, Context.NONE)
            .getValue();
        return this;
    }

    public ManagedDashboard refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedDashboards()
            .getByResourceGroupWithResponse(resourceGroupName, dashboardName, context)
            .getValue();
        return this;
    }

    public ManagedDashboardImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ManagedDashboardImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ManagedDashboardImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateRequestBodyParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}
