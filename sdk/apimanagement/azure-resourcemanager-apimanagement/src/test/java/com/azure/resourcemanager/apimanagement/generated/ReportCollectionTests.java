// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.ReportRecordContractInner;
import com.azure.resourcemanager.apimanagement.models.ReportCollection;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReportCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReportCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"chnzrsbkkzo\",\"timestamp\":\"2021-03-10T22:52:59Z\",\"interval\":\"mnfmfwsxafofuw\",\"country\":\"immovzwd\",\"region\":\"kkmvhzfovanyrva\",\"zip\":\"tgelgwewikfy\",\"userId\":\"a\",\"productId\":\"mymnqoqjumovsf\",\"apiId\":\"bvzo\",\"operationId\":\"x\",\"apiRegion\":\"m\",\"subscriptionId\":\"mcwoxfaxd\",\"callCountSuccess\":508434914,\"callCountBlocked\":2045146808,\"callCountFailed\":1857407814,\"callCountOther\":829785504,\"callCountTotal\":1464125582,\"bandwidth\":7033583756566739721,\"cacheHitCount\":574618809,\"cacheMissCount\":1992627485,\"apiTimeAvg\":33.04326656386544,\"apiTimeMin\":31.063954715335072,\"apiTimeMax\":18.903407749538705,\"serviceTimeAvg\":82.71435178729172,\"serviceTimeMin\":56.20450946235111,\"serviceTimeMax\":77.25084213043519},{\"name\":\"dsiuorin\",\"timestamp\":\"2021-07-21T03:16:08Z\",\"interval\":\"dpk\",\"country\":\"iwm\",\"region\":\"mqr\",\"zip\":\"zqv\",\"userId\":\"czyayubtgmbxi\",\"productId\":\"hragpxmib\",\"apiId\":\"nupoyryefqmwovyz\",\"operationId\":\"lnomfpb\",\"apiRegion\":\"eegvyieztkutnj\",\"subscriptionId\":\"l\",\"callCountSuccess\":45461465,\"callCountBlocked\":828288950,\"callCountFailed\":403280686,\"callCountOther\":274091210,\"callCountTotal\":1937548392,\"bandwidth\":3191288232183322798,\"cacheHitCount\":407747956,\"cacheMissCount\":578702715,\"apiTimeAvg\":49.53894841603898,\"apiTimeMin\":52.33968153218105,\"apiTimeMax\":38.05811012077521,\"serviceTimeAvg\":71.35574876192564,\"serviceTimeMin\":12.543409131805427,\"serviceTimeMax\":34.341555527456414},{\"name\":\"hoyiyaxqvjweiw\",\"timestamp\":\"2021-11-12T20:24:02Z\",\"interval\":\"ddnvovbooqbmdq\",\"country\":\"yglae\",\"region\":\"cflwtjdtlr\",\"zip\":\"fooy\",\"userId\":\"uxdtzcq\",\"productId\":\"sdudgcoz\",\"apiId\":\"meh\",\"operationId\":\"antolamlbijuxkq\",\"apiRegion\":\"czipvwdtgck\",\"subscriptionId\":\"qiqdlratrkwxoau\",\"callCountSuccess\":843567475,\"callCountBlocked\":1509320297,\"callCountFailed\":1251314501,\"callCountOther\":1618531774,\"callCountTotal\":1217001354,\"bandwidth\":5588879302005587936,\"cacheHitCount\":1329306721,\"cacheMissCount\":2060252494,\"apiTimeAvg\":28.37559843565004,\"apiTimeMin\":52.00451239815527,\"apiTimeMax\":61.174312411916745,\"serviceTimeAvg\":18.29859178176295,\"serviceTimeMin\":39.33181562875401,\"serviceTimeMax\":82.62945609704938}],\"count\":4251967743512546220,\"nextLink\":\"kbdgddkrh\"}")
                .toObject(ReportCollection.class);
        Assertions.assertEquals("chnzrsbkkzo", model.value().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T22:52:59Z"), model.value().get(0).timestamp());
        Assertions.assertEquals("mnfmfwsxafofuw", model.value().get(0).interval());
        Assertions.assertEquals("immovzwd", model.value().get(0).country());
        Assertions.assertEquals("kkmvhzfovanyrva", model.value().get(0).region());
        Assertions.assertEquals("tgelgwewikfy", model.value().get(0).zip());
        Assertions.assertEquals("bvzo", model.value().get(0).apiId());
        Assertions.assertEquals("x", model.value().get(0).operationId());
        Assertions.assertEquals("m", model.value().get(0).apiRegion());
        Assertions.assertEquals("mcwoxfaxd", model.value().get(0).subscriptionId());
        Assertions.assertEquals(508434914, model.value().get(0).callCountSuccess());
        Assertions.assertEquals(2045146808, model.value().get(0).callCountBlocked());
        Assertions.assertEquals(1857407814, model.value().get(0).callCountFailed());
        Assertions.assertEquals(829785504, model.value().get(0).callCountOther());
        Assertions.assertEquals(1464125582, model.value().get(0).callCountTotal());
        Assertions.assertEquals(7033583756566739721L, model.value().get(0).bandwidth());
        Assertions.assertEquals(574618809, model.value().get(0).cacheHitCount());
        Assertions.assertEquals(1992627485, model.value().get(0).cacheMissCount());
        Assertions.assertEquals(33.04326656386544D, model.value().get(0).apiTimeAvg());
        Assertions.assertEquals(31.063954715335072D, model.value().get(0).apiTimeMin());
        Assertions.assertEquals(18.903407749538705D, model.value().get(0).apiTimeMax());
        Assertions.assertEquals(82.71435178729172D, model.value().get(0).serviceTimeAvg());
        Assertions.assertEquals(56.20450946235111D, model.value().get(0).serviceTimeMin());
        Assertions.assertEquals(77.25084213043519D, model.value().get(0).serviceTimeMax());
        Assertions.assertEquals(4251967743512546220L, model.count());
        Assertions.assertEquals("kbdgddkrh", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReportCollection model =
            new ReportCollection()
                .withValue(
                    Arrays
                        .asList(
                            new ReportRecordContractInner()
                                .withName("chnzrsbkkzo")
                                .withTimestamp(OffsetDateTime.parse("2021-03-10T22:52:59Z"))
                                .withInterval("mnfmfwsxafofuw")
                                .withCountry("immovzwd")
                                .withRegion("kkmvhzfovanyrva")
                                .withZip("tgelgwewikfy")
                                .withApiId("bvzo")
                                .withOperationId("x")
                                .withApiRegion("m")
                                .withSubscriptionId("mcwoxfaxd")
                                .withCallCountSuccess(508434914)
                                .withCallCountBlocked(2045146808)
                                .withCallCountFailed(1857407814)
                                .withCallCountOther(829785504)
                                .withCallCountTotal(1464125582)
                                .withBandwidth(7033583756566739721L)
                                .withCacheHitCount(574618809)
                                .withCacheMissCount(1992627485)
                                .withApiTimeAvg(33.04326656386544D)
                                .withApiTimeMin(31.063954715335072D)
                                .withApiTimeMax(18.903407749538705D)
                                .withServiceTimeAvg(82.71435178729172D)
                                .withServiceTimeMin(56.20450946235111D)
                                .withServiceTimeMax(77.25084213043519D),
                            new ReportRecordContractInner()
                                .withName("dsiuorin")
                                .withTimestamp(OffsetDateTime.parse("2021-07-21T03:16:08Z"))
                                .withInterval("dpk")
                                .withCountry("iwm")
                                .withRegion("mqr")
                                .withZip("zqv")
                                .withApiId("nupoyryefqmwovyz")
                                .withOperationId("lnomfpb")
                                .withApiRegion("eegvyieztkutnj")
                                .withSubscriptionId("l")
                                .withCallCountSuccess(45461465)
                                .withCallCountBlocked(828288950)
                                .withCallCountFailed(403280686)
                                .withCallCountOther(274091210)
                                .withCallCountTotal(1937548392)
                                .withBandwidth(3191288232183322798L)
                                .withCacheHitCount(407747956)
                                .withCacheMissCount(578702715)
                                .withApiTimeAvg(49.53894841603898D)
                                .withApiTimeMin(52.33968153218105D)
                                .withApiTimeMax(38.05811012077521D)
                                .withServiceTimeAvg(71.35574876192564D)
                                .withServiceTimeMin(12.543409131805427D)
                                .withServiceTimeMax(34.341555527456414D),
                            new ReportRecordContractInner()
                                .withName("hoyiyaxqvjweiw")
                                .withTimestamp(OffsetDateTime.parse("2021-11-12T20:24:02Z"))
                                .withInterval("ddnvovbooqbmdq")
                                .withCountry("yglae")
                                .withRegion("cflwtjdtlr")
                                .withZip("fooy")
                                .withApiId("meh")
                                .withOperationId("antolamlbijuxkq")
                                .withApiRegion("czipvwdtgck")
                                .withSubscriptionId("qiqdlratrkwxoau")
                                .withCallCountSuccess(843567475)
                                .withCallCountBlocked(1509320297)
                                .withCallCountFailed(1251314501)
                                .withCallCountOther(1618531774)
                                .withCallCountTotal(1217001354)
                                .withBandwidth(5588879302005587936L)
                                .withCacheHitCount(1329306721)
                                .withCacheMissCount(2060252494)
                                .withApiTimeAvg(28.37559843565004D)
                                .withApiTimeMin(52.00451239815527D)
                                .withApiTimeMax(61.174312411916745D)
                                .withServiceTimeAvg(18.29859178176295D)
                                .withServiceTimeMin(39.33181562875401D)
                                .withServiceTimeMax(82.62945609704938D)))
                .withCount(4251967743512546220L)
                .withNextLink("kbdgddkrh");
        model = BinaryData.fromObject(model).toObject(ReportCollection.class);
        Assertions.assertEquals("chnzrsbkkzo", model.value().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T22:52:59Z"), model.value().get(0).timestamp());
        Assertions.assertEquals("mnfmfwsxafofuw", model.value().get(0).interval());
        Assertions.assertEquals("immovzwd", model.value().get(0).country());
        Assertions.assertEquals("kkmvhzfovanyrva", model.value().get(0).region());
        Assertions.assertEquals("tgelgwewikfy", model.value().get(0).zip());
        Assertions.assertEquals("bvzo", model.value().get(0).apiId());
        Assertions.assertEquals("x", model.value().get(0).operationId());
        Assertions.assertEquals("m", model.value().get(0).apiRegion());
        Assertions.assertEquals("mcwoxfaxd", model.value().get(0).subscriptionId());
        Assertions.assertEquals(508434914, model.value().get(0).callCountSuccess());
        Assertions.assertEquals(2045146808, model.value().get(0).callCountBlocked());
        Assertions.assertEquals(1857407814, model.value().get(0).callCountFailed());
        Assertions.assertEquals(829785504, model.value().get(0).callCountOther());
        Assertions.assertEquals(1464125582, model.value().get(0).callCountTotal());
        Assertions.assertEquals(7033583756566739721L, model.value().get(0).bandwidth());
        Assertions.assertEquals(574618809, model.value().get(0).cacheHitCount());
        Assertions.assertEquals(1992627485, model.value().get(0).cacheMissCount());
        Assertions.assertEquals(33.04326656386544D, model.value().get(0).apiTimeAvg());
        Assertions.assertEquals(31.063954715335072D, model.value().get(0).apiTimeMin());
        Assertions.assertEquals(18.903407749538705D, model.value().get(0).apiTimeMax());
        Assertions.assertEquals(82.71435178729172D, model.value().get(0).serviceTimeAvg());
        Assertions.assertEquals(56.20450946235111D, model.value().get(0).serviceTimeMin());
        Assertions.assertEquals(77.25084213043519D, model.value().get(0).serviceTimeMax());
        Assertions.assertEquals(4251967743512546220L, model.count());
        Assertions.assertEquals("kbdgddkrh", model.nextLink());
    }
}