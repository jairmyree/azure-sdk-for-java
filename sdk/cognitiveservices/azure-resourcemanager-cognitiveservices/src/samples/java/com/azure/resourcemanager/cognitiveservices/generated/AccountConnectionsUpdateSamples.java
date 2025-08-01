// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.resourcemanager.cognitiveservices.models.AccessKeyAuthTypeConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.ConnectionAccessKey;
import com.azure.resourcemanager.cognitiveservices.models.ConnectionCategory;
import com.azure.resourcemanager.cognitiveservices.models.ConnectionPropertiesV2BasicResource;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AccountConnections Update.
 */
public final class AccountConnectionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2025-06-01/examples/
     * AccountConnection/update.json
     */
    /**
     * Sample code: UpdateAccountConnection.
     * 
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void
        updateAccountConnection(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        ConnectionPropertiesV2BasicResource resource = manager.accountConnections()
            .getWithResponse("test-rg", "account-1", "connection-1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new AccessKeyAuthTypeConnectionProperties().withCategory(ConnectionCategory.ADLSGEN2)
                .withExpiryTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .withMetadata(mapOf())
                .withTarget("some_string")
                .withCredentials(new ConnectionAccessKey().withAccessKeyId("fakeTokenPlaceholder")
                    .withSecretAccessKey("fakeTokenPlaceholder")))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
