// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.implementation;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.PasswordHashInner;
import com.azure.resourcemanager.iotfirmwaredefense.models.PasswordHash;

public final class PasswordHashImpl implements PasswordHash {
    private PasswordHashInner innerObject;

    private final com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager;

    PasswordHashImpl(
        PasswordHashInner innerObject,
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String passwordHashId() {
        return this.innerModel().passwordHashId();
    }

    public String filePath() {
        return this.innerModel().filePath();
    }

    public String salt() {
        return this.innerModel().salt();
    }

    public String hash() {
        return this.innerModel().hash();
    }

    public String context() {
        return this.innerModel().context();
    }

    public String username() {
        return this.innerModel().username();
    }

    public String algorithm() {
        return this.innerModel().algorithm();
    }

    public PasswordHashInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager() {
        return this.serviceManager;
    }
}