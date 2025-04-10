// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.keyvault.jca.test;

import com.azure.security.keyvault.jca.KeyVaultJcaProvider;

/**
 * Test modularization.
 */
public class TestModularization {
    /**
     * Creates a new instance of {@link TestModularization}.
     */
    public TestModularization() {
    }

    /**
     * Simply test compiling ok.
     */
    void testCompile() {
        KeyVaultJcaProvider keyVaultJcaProvider = new KeyVaultJcaProvider();
    }
}
