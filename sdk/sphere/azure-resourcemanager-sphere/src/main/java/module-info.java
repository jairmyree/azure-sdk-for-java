// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.sphere {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.sphere;
    exports com.azure.resourcemanager.sphere.fluent;
    exports com.azure.resourcemanager.sphere.fluent.models;
    exports com.azure.resourcemanager.sphere.models;

    opens com.azure.resourcemanager.sphere.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.sphere.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}