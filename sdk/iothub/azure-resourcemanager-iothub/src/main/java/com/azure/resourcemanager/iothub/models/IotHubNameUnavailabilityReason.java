// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

/**
 * The reason for unavailability.
 */
public enum IotHubNameUnavailabilityReason {
    /**
     * Enum value Invalid.
     */
    INVALID("Invalid"),

    /**
     * Enum value AlreadyExists.
     */
    ALREADY_EXISTS("AlreadyExists");

    /**
     * The actual serialized value for a IotHubNameUnavailabilityReason instance.
     */
    private final String value;

    IotHubNameUnavailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IotHubNameUnavailabilityReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed IotHubNameUnavailabilityReason object, or null if unable to parse.
     */
    public static IotHubNameUnavailabilityReason fromString(String value) {
        if (value == null) {
            return null;
        }
        IotHubNameUnavailabilityReason[] items = IotHubNameUnavailabilityReason.values();
        for (IotHubNameUnavailabilityReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
