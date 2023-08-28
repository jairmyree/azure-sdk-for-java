// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.ConnectivityCheckResponseInner;

public final class ConnectivityCheckResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectivityCheckResponseInner model =
            BinaryData
                .fromString(
                    "{\"hops\":[{\"type\":\"kwseivmakxhyso\",\"id\":\"juxlkbectvtfjm\",\"address\":\"dchmaiubavlz\",\"resourceId\":\"vgmfalkzazmgok\",\"nextHopIds\":[\"jqafkmkro\",\"zrthqet\",\"pqrtvaoznqni\",\"iezeagm\"],\"issues\":[{\"origin\":\"Inbound\",\"severity\":\"Warning\",\"type\":\"AgentStopped\",\"context\":[{\"eolctaebf\":\"jstlzmblsyj\"},{\"tb\":\"rledjcu\"},{\"vsgeafgf\":\"qigdx\"}]}]},{\"type\":\"ehxlzsxezppk\",\"id\":\"aaeskyfjlpze\",\"address\":\"oyrplixl\",\"resourceId\":\"mllpquevhamfowg\",\"nextHopIds\":[\"mkekxpkzwaqxo\"],\"issues\":[{\"origin\":\"Outbound\",\"severity\":\"Warning\",\"type\":\"UserDefinedRoute\",\"context\":[{\"fepxyihpqadag\":\"fidusztekxbyjgm\"},{\"x\":\"rdi\",\"bi\":\"wyjfowxwyovcxjs\",\"dveksbuhoduch\":\"cu\"},{\"bfdyjduss\":\"scrdp\",\"ggkrehbf\":\"yszekbhwlka\",\"ybff\":\"n\",\"sqtaadusrexxfa\":\"jfiimreoa\"},{\"i\":\"qwudoh\",\"eypofqpm\":\"fmnlikpsims\",\"phgerhsmvgoh\":\"hyqgsdrmmttjx\",\"ilrixysf\":\"wzm\"}]},{\"origin\":\"Inbound\",\"severity\":\"Error\",\"type\":\"GuestFirewall\",\"context\":[{\"nhzd\":\"hkruwaedrympmlqo\",\"knjdiqfliejhp\":\"ewihapfji\",\"eivbvz\":\"lbiedfsbw\",\"rad\":\"pbwxgoooxz\"},{\"igjsugswhgs\":\"kxknpdg\"},{\"afoctohz\":\"dkwwn\",\"hoadhrsxqvzv\":\"aquvwsxbgnvkervq\",\"ajglzrsubklr\":\"pabdsrg\",\"etjdvqydieqqkwa\":\"hjnlt\"},{\"xbibanbaupw\":\"wdxvqzxoebwg\",\"lssan\":\"zvpaklozkxbzrpej\",\"s\":\"tttk\",\"kebhuhkslgw\":\"xunrswgkpjhboy\"}]},{\"origin\":\"Local\",\"severity\":\"Error\",\"type\":\"NetworkSecurityRule\",\"context\":[{\"jyvdwtfxptpqayam\":\"zcqypzqzufgsyf\",\"ullojk\":\"ncfgybmxsnxoc\",\"g\":\"oy\"}]},{\"origin\":\"Outbound\",\"severity\":\"Warning\",\"type\":\"UserDefinedRoute\",\"context\":[{\"uqbsgzlrqhb\":\"jzgdyrc\",\"gdxwbsfpyxx\":\"nq\"},{\"minxojjluxxdh\":\"lflec\"},{\"ibqlotokhtvwtaz\":\"zzdzzqjmuezayov\",\"kbtlwljssm\":\"kcqwwxwjyofgwh\"}]}]},{\"type\":\"sn\",\"id\":\"kpwolg\",\"address\":\"ubxbteogfgfiijr\",\"resourceId\":\"wlefksxqceazfpxg\",\"nextHopIds\":[\"vzvluyq\",\"aiossscyvaifp\"],\"issues\":[{\"origin\":\"Inbound\",\"severity\":\"Warning\",\"type\":\"Unknown\",\"context\":[{\"pvtyqfttehdpbouj\":\"fxtjdhsoym\",\"dedsuenygnxcgjtf\":\"tkfvvdshx\"}]},{\"origin\":\"Inbound\",\"severity\":\"Error\",\"type\":\"NetworkSecurityRule\",\"context\":[{\"trwntfmtbgw\":\"lnlrxsmy\"},{\"urrdreyzjwhsetww\":\"xwnaz\",\"hyqqzzdcy\":\"wzzqseuzuukykcy\",\"tewfopazdazgbsq\":\"ey\"},{\"mdpv\":\"ewqcfu\"},{\"bknlzcl\":\"glq\"}]},{\"origin\":\"Local\",\"severity\":\"Warning\",\"type\":\"Platform\",\"context\":[{\"a\":\"covdwzqaux\"}]}]},{\"type\":\"mk\",\"id\":\"ruw\",\"address\":\"drbcp\",\"resourceId\":\"xudqyemebunaucmc\",\"nextHopIds\":[\"nee\",\"mjauwcgx\",\"fnohaitran\",\"zerwgudas\"],\"issues\":[{\"origin\":\"Local\",\"severity\":\"Warning\",\"type\":\"NetworkSecurityRule\",\"context\":[{\"aud\":\"cefhpriylfmpzt\",\"dculregp\":\"vhl\",\"dgrtwmew\":\"tmojhvrztnvgyshq\",\"rzrr\":\"zlpykcfazzwjcay\"}]}]}],\"connectionStatus\":\"Unknown\",\"avgLatencyInMs\":731782111712565274,\"minLatencyInMs\":4614521242809041963,\"maxLatencyInMs\":3233308304384556689,\"probesSent\":7936342143743830572,\"probesFailed\":4888652417648856523}")
                .toObject(ConnectivityCheckResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectivityCheckResponseInner model = new ConnectivityCheckResponseInner();
        model = BinaryData.fromObject(model).toObject(ConnectivityCheckResponseInner.class);
    }
}