// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.botservice.models.MsTeamsChannel;
import com.azure.resourcemanager.botservice.models.MsTeamsChannelProperties;
import org.junit.jupiter.api.Assertions;

public final class MsTeamsChannelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MsTeamsChannel model = BinaryData.fromString(
            "{\"channelName\":\"MsTeamsChannel\",\"properties\":{\"enableCalling\":false,\"callingWebhook\":\"sbkyvpycanuzbp\",\"isEnabled\":true,\"incomingCallRoute\":\"fkuwbcrnwbmehhse\",\"deploymentEnvironment\":\"jusrtslhspk\",\"acceptedTerms\":true},\"etag\":\"aofmxagkvtme\",\"provisioningState\":\"qkrhahvljua\",\"location\":\"quhcdhmduala\"}")
            .toObject(MsTeamsChannel.class);
        Assertions.assertEquals("aofmxagkvtme", model.etag());
        Assertions.assertEquals("quhcdhmduala", model.location());
        Assertions.assertEquals(false, model.properties().enableCalling());
        Assertions.assertEquals("sbkyvpycanuzbp", model.properties().callingWebhook());
        Assertions.assertEquals(true, model.properties().isEnabled());
        Assertions.assertEquals("fkuwbcrnwbmehhse", model.properties().incomingCallRoute());
        Assertions.assertEquals("jusrtslhspk", model.properties().deploymentEnvironment());
        Assertions.assertEquals(true, model.properties().acceptedTerms());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MsTeamsChannel model = new MsTeamsChannel().withEtag("aofmxagkvtme")
            .withLocation("quhcdhmduala")
            .withProperties(new MsTeamsChannelProperties().withEnableCalling(false)
                .withCallingWebhook("sbkyvpycanuzbp")
                .withIsEnabled(true)
                .withIncomingCallRoute("fkuwbcrnwbmehhse")
                .withDeploymentEnvironment("jusrtslhspk")
                .withAcceptedTerms(true));
        model = BinaryData.fromObject(model).toObject(MsTeamsChannel.class);
        Assertions.assertEquals("aofmxagkvtme", model.etag());
        Assertions.assertEquals("quhcdhmduala", model.location());
        Assertions.assertEquals(false, model.properties().enableCalling());
        Assertions.assertEquals("sbkyvpycanuzbp", model.properties().callingWebhook());
        Assertions.assertEquals(true, model.properties().isEnabled());
        Assertions.assertEquals("fkuwbcrnwbmehhse", model.properties().incomingCallRoute());
        Assertions.assertEquals("jusrtslhspk", model.properties().deploymentEnvironment());
        Assertions.assertEquals(true, model.properties().acceptedTerms());
    }
}
