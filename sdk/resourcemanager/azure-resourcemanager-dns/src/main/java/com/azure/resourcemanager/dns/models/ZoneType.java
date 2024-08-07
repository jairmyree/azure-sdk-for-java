// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.models;

/**
 * The type of this DNS zone (Public or Private).
 */
public enum ZoneType {
    /**
     * Enum value Public.
     */
    PUBLIC("Public"),

    /**
     * Enum value Private.
     */
    PRIVATE("Private");

    /**
     * The actual serialized value for a ZoneType instance.
     */
    private final String value;

    ZoneType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ZoneType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ZoneType object, or null if unable to parse.
     */
    public static ZoneType fromString(String value) {
        if (value == null) {
            return null;
        }
        ZoneType[] items = ZoneType.values();
        for (ZoneType item : items) {
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
