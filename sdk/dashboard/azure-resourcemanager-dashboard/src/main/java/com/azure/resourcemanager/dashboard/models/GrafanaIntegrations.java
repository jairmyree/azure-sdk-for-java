// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * GrafanaIntegrations is a bundled observability experience (e.g. pre-configured data source, tailored Grafana
 * dashboards, alerting defaults) for common monitoring scenarios.
 */
@Fluent
public final class GrafanaIntegrations implements JsonSerializable<GrafanaIntegrations> {
    /*
     * The azureMonitorWorkspaceIntegrations property.
     */
    private List<AzureMonitorWorkspaceIntegration> azureMonitorWorkspaceIntegrations;

    /**
     * Creates an instance of GrafanaIntegrations class.
     */
    public GrafanaIntegrations() {
    }

    /**
     * Get the azureMonitorWorkspaceIntegrations property: The azureMonitorWorkspaceIntegrations property.
     * 
     * @return the azureMonitorWorkspaceIntegrations value.
     */
    public List<AzureMonitorWorkspaceIntegration> azureMonitorWorkspaceIntegrations() {
        return this.azureMonitorWorkspaceIntegrations;
    }

    /**
     * Set the azureMonitorWorkspaceIntegrations property: The azureMonitorWorkspaceIntegrations property.
     * 
     * @param azureMonitorWorkspaceIntegrations the azureMonitorWorkspaceIntegrations value to set.
     * @return the GrafanaIntegrations object itself.
     */
    public GrafanaIntegrations withAzureMonitorWorkspaceIntegrations(
        List<AzureMonitorWorkspaceIntegration> azureMonitorWorkspaceIntegrations) {
        this.azureMonitorWorkspaceIntegrations = azureMonitorWorkspaceIntegrations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureMonitorWorkspaceIntegrations() != null) {
            azureMonitorWorkspaceIntegrations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("azureMonitorWorkspaceIntegrations", this.azureMonitorWorkspaceIntegrations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GrafanaIntegrations from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GrafanaIntegrations if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GrafanaIntegrations.
     */
    public static GrafanaIntegrations fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GrafanaIntegrations deserializedGrafanaIntegrations = new GrafanaIntegrations();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azureMonitorWorkspaceIntegrations".equals(fieldName)) {
                    List<AzureMonitorWorkspaceIntegration> azureMonitorWorkspaceIntegrations
                        = reader.readArray(reader1 -> AzureMonitorWorkspaceIntegration.fromJson(reader1));
                    deserializedGrafanaIntegrations.azureMonitorWorkspaceIntegrations
                        = azureMonitorWorkspaceIntegrations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGrafanaIntegrations;
        });
    }
}
