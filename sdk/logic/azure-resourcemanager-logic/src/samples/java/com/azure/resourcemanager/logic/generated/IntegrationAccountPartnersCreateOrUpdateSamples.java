// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.logic.models.B2BPartnerContent;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import com.azure.resourcemanager.logic.models.PartnerContent;
import com.azure.resourcemanager.logic.models.PartnerType;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IntegrationAccountPartners CreateOrUpdate.
 */
public final class IntegrationAccountPartnersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountPartners_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a partner.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAPartner(com.azure.resourcemanager.logic.LogicManager manager) throws IOException {
        manager.integrationAccountPartners()
            .define("testPartner")
            .withRegion("westus")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withPartnerType(PartnerType.B2B)
            .withContent(new PartnerContent().withB2B(new B2BPartnerContent()
                .withBusinessIdentities(Arrays.asList(new BusinessIdentity().withQualifier("AA").withValue("ZZ")))))
            .withTags(mapOf())
            .withMetadata(SerializerFactory.createDefaultManagementSerializerAdapter()
                .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .create();
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
