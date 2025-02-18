// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactType;
import com.azure.resourcemanager.hybridnetwork.models.ManifestArtifactFormat;
import org.junit.jupiter.api.Assertions;

public final class ManifestArtifactFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManifestArtifactFormat model = BinaryData.fromString(
            "{\"artifactName\":\"zqljyxgtczh\",\"artifactType\":\"OCIArtifact\",\"artifactVersion\":\"sdshmkxmaehvb\"}")
            .toObject(ManifestArtifactFormat.class);
        Assertions.assertEquals("zqljyxgtczh", model.artifactName());
        Assertions.assertEquals(ArtifactType.OCIARTIFACT, model.artifactType());
        Assertions.assertEquals("sdshmkxmaehvb", model.artifactVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManifestArtifactFormat model = new ManifestArtifactFormat().withArtifactName("zqljyxgtczh")
            .withArtifactType(ArtifactType.OCIARTIFACT)
            .withArtifactVersion("sdshmkxmaehvb");
        model = BinaryData.fromObject(model).toObject(ManifestArtifactFormat.class);
        Assertions.assertEquals("zqljyxgtczh", model.artifactName());
        Assertions.assertEquals(ArtifactType.OCIARTIFACT, model.artifactType());
        Assertions.assertEquals("sdshmkxmaehvb", model.artifactVersion());
    }
}
