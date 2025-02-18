// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The developer portal Content Security Policy (CSP) settings.
 */
@Fluent
public final class PortalConfigCspProperties implements JsonSerializable<PortalConfigCspProperties> {
    /*
     * The mode of the developer portal Content Security Policy (CSP).
     */
    private PortalSettingsCspMode mode;

    /*
     * The URLs used by the browser to report CSP violations.
     */
    private List<String> reportUri;

    /*
     * Allowed sources, e.g. `*.trusted.com`, `trusted.com`, `https://`.
     */
    private List<String> allowedSources;

    /**
     * Creates an instance of PortalConfigCspProperties class.
     */
    public PortalConfigCspProperties() {
    }

    /**
     * Get the mode property: The mode of the developer portal Content Security Policy (CSP).
     * 
     * @return the mode value.
     */
    public PortalSettingsCspMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The mode of the developer portal Content Security Policy (CSP).
     * 
     * @param mode the mode value to set.
     * @return the PortalConfigCspProperties object itself.
     */
    public PortalConfigCspProperties withMode(PortalSettingsCspMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the reportUri property: The URLs used by the browser to report CSP violations.
     * 
     * @return the reportUri value.
     */
    public List<String> reportUri() {
        return this.reportUri;
    }

    /**
     * Set the reportUri property: The URLs used by the browser to report CSP violations.
     * 
     * @param reportUri the reportUri value to set.
     * @return the PortalConfigCspProperties object itself.
     */
    public PortalConfigCspProperties withReportUri(List<String> reportUri) {
        this.reportUri = reportUri;
        return this;
    }

    /**
     * Get the allowedSources property: Allowed sources, e.g. `*.trusted.com`, `trusted.com`, `https://`.
     * 
     * @return the allowedSources value.
     */
    public List<String> allowedSources() {
        return this.allowedSources;
    }

    /**
     * Set the allowedSources property: Allowed sources, e.g. `*.trusted.com`, `trusted.com`, `https://`.
     * 
     * @param allowedSources the allowedSources value to set.
     * @return the PortalConfigCspProperties object itself.
     */
    public PortalConfigCspProperties withAllowedSources(List<String> allowedSources) {
        this.allowedSources = allowedSources;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeArrayField("reportUri", this.reportUri, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedSources", this.allowedSources,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PortalConfigCspProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PortalConfigCspProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PortalConfigCspProperties.
     */
    public static PortalConfigCspProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PortalConfigCspProperties deserializedPortalConfigCspProperties = new PortalConfigCspProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mode".equals(fieldName)) {
                    deserializedPortalConfigCspProperties.mode = PortalSettingsCspMode.fromString(reader.getString());
                } else if ("reportUri".equals(fieldName)) {
                    List<String> reportUri = reader.readArray(reader1 -> reader1.getString());
                    deserializedPortalConfigCspProperties.reportUri = reportUri;
                } else if ("allowedSources".equals(fieldName)) {
                    List<String> allowedSources = reader.readArray(reader1 -> reader1.getString());
                    deserializedPortalConfigCspProperties.allowedSources = allowedSources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPortalConfigCspProperties;
        });
    }
}
