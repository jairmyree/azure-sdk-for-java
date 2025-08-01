// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderMonitorSettingInner;
import com.azure.resourcemanager.providerhub.models.ProviderMonitorSetting;
import com.azure.resourcemanager.providerhub.models.ProviderMonitorSettingProperties;
import java.util.Collections;
import java.util.Map;

public final class ProviderMonitorSettingImpl implements ProviderMonitorSetting, ProviderMonitorSetting.Definition {
    private ProviderMonitorSettingInner innerObject;

    private final com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager;

    ProviderMonitorSettingImpl(ProviderMonitorSettingInner innerObject,
        com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public ProviderMonitorSettingProperties properties() {
        return this.innerModel().properties();
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

    public ProviderMonitorSettingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.providerhub.ProviderHubManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String providerMonitorSettingName;

    public ProviderMonitorSettingImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ProviderMonitorSetting create() {
        this.innerObject = serviceManager.serviceClient()
            .getProviderMonitorSettings()
            .create(resourceGroupName, providerMonitorSettingName, this.innerModel(), Context.NONE);
        return this;
    }

    public ProviderMonitorSetting create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getProviderMonitorSettings()
            .create(resourceGroupName, providerMonitorSettingName, this.innerModel(), context);
        return this;
    }

    ProviderMonitorSettingImpl(String name, com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = new ProviderMonitorSettingInner();
        this.serviceManager = serviceManager;
        this.providerMonitorSettingName = name;
    }

    public ProviderMonitorSetting refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getProviderMonitorSettings()
            .getByResourceGroupWithResponse(resourceGroupName, providerMonitorSettingName, Context.NONE)
            .getValue();
        return this;
    }

    public ProviderMonitorSetting refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getProviderMonitorSettings()
            .getByResourceGroupWithResponse(resourceGroupName, providerMonitorSettingName, context)
            .getValue();
        return this;
    }

    public ProviderMonitorSettingImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProviderMonitorSettingImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProviderMonitorSettingImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ProviderMonitorSettingImpl withProperties(ProviderMonitorSettingProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
