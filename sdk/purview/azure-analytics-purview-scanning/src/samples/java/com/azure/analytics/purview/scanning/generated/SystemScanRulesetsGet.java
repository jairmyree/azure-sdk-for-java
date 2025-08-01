// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.PurviewScanningClientBuilder;
import com.azure.analytics.purview.scanning.SystemScanRulesetsClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class SystemScanRulesetsGet {
    public static void main(String[] args) {
        SystemScanRulesetsClient systemScanRulesetsClient
            = new PurviewScanningClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("{Endpoint}")
                .buildSystemScanRulesetsClient();
        // BEGIN:com.azure.analytics.purview.scanning.generated.system-scan-rulesets-get.system-scan-rulesets-get
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = systemScanRulesetsClient.getWithResponse("AzureStorage", requestOptions);
        // END:com.azure.analytics.purview.scanning.generated.system-scan-rulesets-get.system-scan-rulesets-get
    }
}
