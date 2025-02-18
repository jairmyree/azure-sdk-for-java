// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.orbital.models.SpacecraftLink;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * List of Spacecraft Resource Properties.
 */
@Fluent
public final class SpacecraftsProperties implements JsonSerializable<SpacecraftsProperties> {
    /*
     * The current state of the resource's creation, deletion, or modification.
     */
    private SpacecraftsPropertiesProvisioningState provisioningState;

    /*
     * NORAD ID of the spacecraft.
     */
    private String noradId;

    /*
     * Title line of the two-line element set (TLE).
     */
    private String titleLine;

    /*
     * Line 1 of the two-line element set (TLE).
     */
    private String tleLine1;

    /*
     * Line 2 of the two-line element set (TLE).
     */
    private String tleLine2;

    /*
     * Immutable list of Spacecraft links.
     */
    private List<SpacecraftLink> links;

    /**
     * Creates an instance of SpacecraftsProperties class.
     */
    public SpacecraftsProperties() {
    }

    /**
     * Get the provisioningState property: The current state of the resource's creation, deletion, or modification.
     * 
     * @return the provisioningState value.
     */
    public SpacecraftsPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current state of the resource's creation, deletion, or modification.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withProvisioningState(SpacecraftsPropertiesProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the noradId property: NORAD ID of the spacecraft.
     * 
     * @return the noradId value.
     */
    public String noradId() {
        return this.noradId;
    }

    /**
     * Set the noradId property: NORAD ID of the spacecraft.
     * 
     * @param noradId the noradId value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withNoradId(String noradId) {
        this.noradId = noradId;
        return this;
    }

    /**
     * Get the titleLine property: Title line of the two-line element set (TLE).
     * 
     * @return the titleLine value.
     */
    public String titleLine() {
        return this.titleLine;
    }

    /**
     * Set the titleLine property: Title line of the two-line element set (TLE).
     * 
     * @param titleLine the titleLine value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTitleLine(String titleLine) {
        this.titleLine = titleLine;
        return this;
    }

    /**
     * Get the tleLine1 property: Line 1 of the two-line element set (TLE).
     * 
     * @return the tleLine1 value.
     */
    public String tleLine1() {
        return this.tleLine1;
    }

    /**
     * Set the tleLine1 property: Line 1 of the two-line element set (TLE).
     * 
     * @param tleLine1 the tleLine1 value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTleLine1(String tleLine1) {
        this.tleLine1 = tleLine1;
        return this;
    }

    /**
     * Get the tleLine2 property: Line 2 of the two-line element set (TLE).
     * 
     * @return the tleLine2 value.
     */
    public String tleLine2() {
        return this.tleLine2;
    }

    /**
     * Set the tleLine2 property: Line 2 of the two-line element set (TLE).
     * 
     * @param tleLine2 the tleLine2 value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTleLine2(String tleLine2) {
        this.tleLine2 = tleLine2;
        return this;
    }

    /**
     * Get the links property: Immutable list of Spacecraft links.
     * 
     * @return the links value.
     */
    public List<SpacecraftLink> links() {
        return this.links;
    }

    /**
     * Set the links property: Immutable list of Spacecraft links.
     * 
     * @param links the links value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withLinks(List<SpacecraftLink> links) {
        this.links = links;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (titleLine() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property titleLine in model SpacecraftsProperties"));
        }
        if (tleLine1() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tleLine1 in model SpacecraftsProperties"));
        }
        if (tleLine2() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tleLine2 in model SpacecraftsProperties"));
        }
        if (links() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property links in model SpacecraftsProperties"));
        } else {
            links().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpacecraftsProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("titleLine", this.titleLine);
        jsonWriter.writeStringField("tleLine1", this.tleLine1);
        jsonWriter.writeStringField("tleLine2", this.tleLine2);
        jsonWriter.writeArrayField("links", this.links, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("noradId", this.noradId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpacecraftsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpacecraftsProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SpacecraftsProperties.
     */
    public static SpacecraftsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SpacecraftsProperties deserializedSpacecraftsProperties = new SpacecraftsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("titleLine".equals(fieldName)) {
                    deserializedSpacecraftsProperties.titleLine = reader.getString();
                } else if ("tleLine1".equals(fieldName)) {
                    deserializedSpacecraftsProperties.tleLine1 = reader.getString();
                } else if ("tleLine2".equals(fieldName)) {
                    deserializedSpacecraftsProperties.tleLine2 = reader.getString();
                } else if ("links".equals(fieldName)) {
                    List<SpacecraftLink> links = reader.readArray(reader1 -> SpacecraftLink.fromJson(reader1));
                    deserializedSpacecraftsProperties.links = links;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSpacecraftsProperties.provisioningState
                        = SpacecraftsPropertiesProvisioningState.fromString(reader.getString());
                } else if ("noradId".equals(fieldName)) {
                    deserializedSpacecraftsProperties.noradId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpacecraftsProperties;
        });
    }
}
