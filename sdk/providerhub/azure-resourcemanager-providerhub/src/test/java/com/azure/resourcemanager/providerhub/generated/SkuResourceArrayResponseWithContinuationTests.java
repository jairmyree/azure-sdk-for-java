// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.providerhub.models.SkuCapability;
import com.azure.resourcemanager.providerhub.models.SkuCost;
import com.azure.resourcemanager.providerhub.models.SkuLocationInfo;
import com.azure.resourcemanager.providerhub.models.SkuResourceArrayResponseWithContinuation;
import com.azure.resourcemanager.providerhub.models.SkuResourceProperties;
import com.azure.resourcemanager.providerhub.models.SkuSetting;
import com.azure.resourcemanager.providerhub.models.SkuSettingCapacity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuResourceArrayResponseWithContinuationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuResourceArrayResponseWithContinuation model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"skuSettings\":[{\"name\":\"kl\",\"tier\":\"l\",\"size\":\"vcb\",\"family\":\"ezyquw\",\"kind\":\"qxutrpbrruyuua\",\"locations\":[\"mbjwcolbmxlb\",\"w\",\"pcpahprzrvxhmtf\",\"ocnxz\"],\"locationInfo\":[{\"location\":\"hngxnoqrxtd\"},{\"location\":\"sn\"}],\"requiredQuotaIds\":[\"hdlmydidwhe\"],\"requiredFeatures\":[\"wtj\",\"doesxxhmwcdb\",\"ky\",\"ikxkxhneg\"],\"capacity\":{\"minimum\":648461790},\"costs\":[{\"meterId\":\"bhtmeplvuk\"},{\"meterId\":\"obrl\"},{\"meterId\":\"pgsn\"},{\"meterId\":\"agnchjhgemuowaky\"}],\"capabilities\":[{\"name\":\"hjym\",\"value\":\"cgqtag\"},{\"name\":\"rclsso\",\"value\":\"jomevtfycnlb\"}]},{\"name\":\"gjco\",\"tier\":\"kgjiiytssikizbc\",\"size\":\"q\",\"family\":\"ntnrgmqsorh\",\"kind\":\"kxgnlykmxcpwzvmd\",\"locations\":[\"qdtiwlwxlb\",\"ncq\",\"azqicqchygtv\",\"byjanep\"],\"locationInfo\":[{\"location\":\"pkxyqvgxi\"},{\"location\":\"od\"}],\"requiredQuotaIds\":[\"ohkxdxuw\",\"aifmcwnosbzlehgc\",\"kb\"],\"requiredFeatures\":[\"jolgjyyxpvels\",\"erqzevxo\",\"eintxwaljglzobl\"],\"capacity\":{\"minimum\":1811336040},\"costs\":[{\"meterId\":\"r\"},{\"meterId\":\"ulhmzyq\"},{\"meterId\":\"hdvafjrqpjiyrqjc\"},{\"meterId\":\"gaxwmzwdfkbnrzo\"}],\"capabilities\":[{\"name\":\"ltbqctqjfgxxsaet\",\"value\":\"zdgvpyigdaqqilz\"}]},{\"name\":\"cduwjoedx\",\"tier\":\"ucaifpaurwwgilf\",\"size\":\"qacdmkxwxdcvjwcy\",\"family\":\"akeciqchx\",\"kind\":\"uicdsiwdfmmpzhzz\",\"locations\":[\"wrgyngy\",\"grpxncakiqaondjr\",\"clamgglvlmfejdoq\"],\"locationInfo\":[{\"location\":\"gltygxhqfgq\"},{\"location\":\"ayejsxtlgflwfgz\"}],\"requiredQuotaIds\":[\"ci\"],\"requiredFeatures\":[\"eatlijjjrtvamcas\",\"knxkvccxetyvkunm\",\"gno\",\"ikkgqo\"],\"capacity\":{\"minimum\":865736943},\"costs\":[{\"meterId\":\"nd\"},{\"meterId\":\"dvabbxbhmedeilb\"},{\"meterId\":\"ywfcfxzi\"}],\"capabilities\":[{\"name\":\"ihvwyp\",\"value\":\"suvjslcz\"}]}],\"provisioningState\":\"Running\"},\"id\":\"djsllfr\",\"name\":\"vdmvxadqa\",\"type\":\"frgnawbabgfbktyj\"},{\"properties\":{\"skuSettings\":[{\"name\":\"zlfsyqkfrbzgowo\",\"tier\":\"mj\",\"size\":\"jcx\",\"family\":\"qg\",\"kind\":\"lusrv\",\"locations\":[\"i\",\"jceagb\",\"qvlsumywzas\",\"xgo\"],\"locationInfo\":[{\"location\":\"jfqipubyznclkfk\"},{\"location\":\"ebgvo\"},{\"location\":\"e\"}],\"requiredQuotaIds\":[\"oqujlyegqavn\",\"gflqqbtnyjp\",\"lxdbfvabmvms\"],\"requiredFeatures\":[\"evwjcnkottlwuhv\",\"jmailfemjjzakzw\",\"iqullqxbdmvr\"],\"capacity\":{\"minimum\":1725625204},\"costs\":[{\"meterId\":\"rndb\"},{\"meterId\":\"nyeofltfnnxrk\"},{\"meterId\":\"dj\"},{\"meterId\":\"ynnfmuiii\"}],\"capabilities\":[{\"name\":\"fohyk\",\"value\":\"kxbbcbrwjiutgnj\"}]},{\"name\":\"zbeewoiymrvzbju\",\"tier\":\"srziuct\",\"size\":\"gbdsuifrev\",\"family\":\"apezkiswqjmdghs\",\"kind\":\"arybjufptbjc\",\"locations\":[\"ciuiyqvldaswv\",\"pisqqzlgcndhzx\",\"rfc\",\"srhkhgsnxuwwkpph\"],\"locationInfo\":[{\"location\":\"bzxlbzxomeikjc\"},{\"location\":\"wzacnmw\"}],\"requiredQuotaIds\":[\"uqtaazyqbxyxoyf\",\"uqqiqezxlhd\",\"zq\"],\"requiredFeatures\":[\"dwvpsozjiihjr\"],\"capacity\":{\"minimum\":77012856},\"costs\":[{\"meterId\":\"zo\"}],\"capabilities\":[{\"name\":\"xwdvwnj\",\"value\":\"gv\"},{\"name\":\"nmx\",\"value\":\"ursqf\"},{\"name\":\"ibtyibuyvpirfqjp\",\"value\":\"qnoowsbedenrex\"}]}],\"provisioningState\":\"MovingResources\"},\"id\":\"xvucnul\",\"name\":\"mnhjevdyzn\",\"type\":\"ajsvk\"},{\"properties\":{\"skuSettings\":[{\"name\":\"qozzkivyhjrliizj\",\"tier\":\"lqfhefkwabs\",\"size\":\"ron\",\"family\":\"lmgnlqxsjx\",\"kind\":\"lexhv\",\"locations\":[\"ozoolzq\"],\"locationInfo\":[{\"location\":\"rkuz\"},{\"location\":\"bc\"}],\"requiredQuotaIds\":[\"t\",\"nx\",\"wqy\",\"llhdyzm\"],\"requiredFeatures\":[\"zexnxakcky\",\"ymx\"],\"capacity\":{\"minimum\":1022688865},\"costs\":[{\"meterId\":\"kdtfohfaogz\"},{\"meterId\":\"kiwrsiw\"}],\"capabilities\":[{\"name\":\"quryk\",\"value\":\"rra\"}]},{\"name\":\"eek\",\"tier\":\"uehogdd\",\"size\":\"bcbgydlqidywmhm\",\"family\":\"yrilkfb\",\"kind\":\"qqxvztpbn\",\"locations\":[\"txjt\",\"m\",\"lswbnf\",\"depld\"],\"locationInfo\":[{\"location\":\"ns\"},{\"location\":\"zygleexahvm\"},{\"location\":\"whsbrcary\"},{\"location\":\"sjjzyvoaqajuveh\"}],\"requiredQuotaIds\":[\"dmkrrb\",\"mpfu\",\"ubefgybpmfbfunu\",\"mpzkrvfyifkd\"],\"requiredFeatures\":[\"lzvfictnkjjwg\",\"wnphbkgfyrto\",\"mhmjpjs\"],\"capacity\":{\"minimum\":329267906},\"costs\":[{\"meterId\":\"qwtygevgwmseharx\"},{\"meterId\":\"fv\"}],\"capabilities\":[{\"name\":\"x\",\"value\":\"mbpjptnvwjh\"},{\"name\":\"sidqpxlbtpakft\",\"value\":\"gatwmykyu\"},{\"name\":\"rymdwmf\",\"value\":\"hpycvjqdvdwkq\"}]},{\"name\":\"ldrlefgnaavua\",\"tier\":\"tetaoutnpdctuhs\",\"size\":\"efyihduyeuyl\",\"family\":\"hmtybkcgsuthhll\",\"kind\":\"wynefx\",\"locations\":[\"fciatxtjrr\"],\"locationInfo\":[{\"location\":\"dskjhhxdlaj\"},{\"location\":\"oxcxscvslx\"},{\"location\":\"hu\"},{\"location\":\"vkrmukmyjmkx\"}],\"requiredQuotaIds\":[\"csl\",\"jfkqidn\"],\"requiredFeatures\":[\"qxjhqxcsqhtkbtnq\"],\"capacity\":{\"minimum\":600768127},\"costs\":[{\"meterId\":\"dmbi\"}],\"capabilities\":[{\"name\":\"nawwlq\",\"value\":\"znxhhllxr\"},{\"name\":\"cctkwmuqqoajxe\",\"value\":\"y\"},{\"name\":\"lesrwva\",\"value\":\"xhdctrceqnk\"},{\"name\":\"rupobehd\",\"value\":\"lj\"}]}],\"provisioningState\":\"NotSpecified\"},\"id\":\"umepjpbibn\",\"name\":\"pphepifexl\",\"type\":\"qirccj\"}],\"nextLink\":\"ykcgxvrpjlvcz\"}")
            .toObject(SkuResourceArrayResponseWithContinuation.class);
        Assertions.assertEquals("kl", model.value().get(0).properties().skuSettings().get(0).name());
        Assertions.assertEquals("l", model.value().get(0).properties().skuSettings().get(0).tier());
        Assertions.assertEquals("vcb", model.value().get(0).properties().skuSettings().get(0).size());
        Assertions.assertEquals("ezyquw", model.value().get(0).properties().skuSettings().get(0).family());
        Assertions.assertEquals("qxutrpbrruyuua", model.value().get(0).properties().skuSettings().get(0).kind());
        Assertions.assertEquals("mbjwcolbmxlb",
            model.value().get(0).properties().skuSettings().get(0).locations().get(0));
        Assertions.assertEquals("hngxnoqrxtd",
            model.value().get(0).properties().skuSettings().get(0).locationInfo().get(0).location());
        Assertions.assertEquals("hdlmydidwhe",
            model.value().get(0).properties().skuSettings().get(0).requiredQuotaIds().get(0));
        Assertions.assertEquals("wtj",
            model.value().get(0).properties().skuSettings().get(0).requiredFeatures().get(0));
        Assertions.assertEquals(648461790, model.value().get(0).properties().skuSettings().get(0).capacity().minimum());
        Assertions.assertEquals("bhtmeplvuk",
            model.value().get(0).properties().skuSettings().get(0).costs().get(0).meterId());
        Assertions.assertEquals("hjym",
            model.value().get(0).properties().skuSettings().get(0).capabilities().get(0).name());
        Assertions.assertEquals("cgqtag",
            model.value().get(0).properties().skuSettings().get(0).capabilities().get(0).value());
        Assertions.assertEquals("ykcgxvrpjlvcz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuResourceArrayResponseWithContinuation model
            = new SkuResourceArrayResponseWithContinuation()
                .withValue(
                    Arrays
                        .asList(
                            new SkuResourceInner()
                                .withProperties(
                                    new SkuResourceProperties()
                                        .withSkuSettings(
                                            Arrays
                                                .asList(
                                                    new SkuSetting().withName("kl")
                                                        .withTier("l")
                                                        .withSize("vcb")
                                                        .withFamily("ezyquw")
                                                        .withKind("qxutrpbrruyuua")
                                                        .withLocations(Arrays.asList("mbjwcolbmxlb", "w",
                                                            "pcpahprzrvxhmtf", "ocnxz"))
                                                        .withLocationInfo(Arrays.asList(
                                                            new SkuLocationInfo().withLocation("hngxnoqrxtd"),
                                                            new SkuLocationInfo().withLocation("sn")))
                                                        .withRequiredQuotaIds(Arrays.asList("hdlmydidwhe"))
                                                        .withRequiredFeatures(
                                                            Arrays.asList("wtj", "doesxxhmwcdb", "ky", "ikxkxhneg"))
                                                        .withCapacity(new SkuSettingCapacity().withMinimum(648461790))
                                                        .withCosts(Arrays.asList(
                                                            new SkuCost().withMeterId("bhtmeplvuk"),
                                                            new SkuCost().withMeterId("obrl"),
                                                            new SkuCost()
                                                                .withMeterId("pgsn"),
                                                            new SkuCost().withMeterId("agnchjhgemuowaky")))
                                                        .withCapabilities(Arrays.asList(new SkuCapability()
                                                            .withName("hjym")
                                                            .withValue("cgqtag"),
                                                            new SkuCapability()
                                                                .withName("rclsso")
                                                                .withValue("jomevtfycnlb"))),
                                                    new SkuSetting().withName("gjco")
                                                        .withTier("kgjiiytssikizbc")
                                                        .withSize("q")
                                                        .withFamily("ntnrgmqsorh")
                                                        .withKind("kxgnlykmxcpwzvmd")
                                                        .withLocations(Arrays.asList("qdtiwlwxlb", "ncq",
                                                            "azqicqchygtv", "byjanep"))
                                                        .withLocationInfo(Arrays.asList(
                                                            new SkuLocationInfo().withLocation("pkxyqvgxi"),
                                                            new SkuLocationInfo().withLocation("od")))
                                                        .withRequiredQuotaIds(
                                                            Arrays.asList("ohkxdxuw", "aifmcwnosbzlehgc", "kb"))
                                                        .withRequiredFeatures(Arrays.asList("jolgjyyxpvels", "erqzevxo",
                                                            "eintxwaljglzobl"))
                                                        .withCapacity(new SkuSettingCapacity().withMinimum(1811336040))
                                                        .withCosts(Arrays.asList(new SkuCost().withMeterId("r"),
                                                            new SkuCost().withMeterId("ulhmzyq"),
                                                            new SkuCost().withMeterId("hdvafjrqpjiyrqjc"),
                                                            new SkuCost().withMeterId("gaxwmzwdfkbnrzo")))
                                                        .withCapabilities(Arrays.asList(new SkuCapability()
                                                            .withName("ltbqctqjfgxxsaet")
                                                            .withValue("zdgvpyigdaqqilz"))),
                                                    new SkuSetting().withName("cduwjoedx")
                                                        .withTier("ucaifpaurwwgilf")
                                                        .withSize("qacdmkxwxdcvjwcy")
                                                        .withFamily("akeciqchx")
                                                        .withKind("uicdsiwdfmmpzhzz")
                                                        .withLocations(Arrays.asList("wrgyngy", "grpxncakiqaondjr",
                                                            "clamgglvlmfejdoq"))
                                                        .withLocationInfo(Arrays.asList(
                                                            new SkuLocationInfo().withLocation("gltygxhqfgq"),
                                                            new SkuLocationInfo().withLocation("ayejsxtlgflwfgz")))
                                                        .withRequiredQuotaIds(Arrays.asList("ci"))
                                                        .withRequiredFeatures(Arrays.asList("eatlijjjrtvamcas",
                                                            "knxkvccxetyvkunm", "gno", "ikkgqo"))
                                                        .withCapacity(new SkuSettingCapacity().withMinimum(865736943))
                                                        .withCosts(Arrays.asList(new SkuCost().withMeterId("nd"),
                                                            new SkuCost().withMeterId("dvabbxbhmedeilb"),
                                                            new SkuCost().withMeterId("ywfcfxzi")))
                                                        .withCapabilities(
                                                            Arrays.asList(new SkuCapability().withName("ihvwyp")
                                                                .withValue("suvjslcz")))))),
                            new SkuResourceInner()
                                .withProperties(new SkuResourceProperties().withSkuSettings(Arrays.asList(
                                    new SkuSetting().withName("zlfsyqkfrbzgowo")
                                        .withTier("mj")
                                        .withSize("jcx")
                                        .withFamily("qg")
                                        .withKind("lusrv")
                                        .withLocations(Arrays.asList("i", "jceagb", "qvlsumywzas", "xgo"))
                                        .withLocationInfo(Arrays.asList(
                                            new SkuLocationInfo().withLocation("jfqipubyznclkfk"),
                                            new SkuLocationInfo().withLocation("ebgvo"),
                                            new SkuLocationInfo().withLocation("e")))
                                        .withRequiredQuotaIds(
                                            Arrays.asList("oqujlyegqavn", "gflqqbtnyjp", "lxdbfvabmvms"))
                                        .withRequiredFeatures(
                                            Arrays.asList("evwjcnkottlwuhv", "jmailfemjjzakzw", "iqullqxbdmvr"))
                                        .withCapacity(new SkuSettingCapacity().withMinimum(1725625204))
                                        .withCosts(Arrays.asList(new SkuCost().withMeterId("rndb"),
                                            new SkuCost().withMeterId("nyeofltfnnxrk"), new SkuCost().withMeterId("dj"),
                                            new SkuCost().withMeterId("ynnfmuiii")))
                                        .withCapabilities(
                                            Arrays.asList(
                                                new SkuCapability().withName("fohyk").withValue("kxbbcbrwjiutgnj"))),
                                    new SkuSetting().withName("zbeewoiymrvzbju")
                                        .withTier("srziuct")
                                        .withSize("gbdsuifrev")
                                        .withFamily("apezkiswqjmdghs")
                                        .withKind("arybjufptbjc")
                                        .withLocations(
                                            Arrays.asList("ciuiyqvldaswv", "pisqqzlgcndhzx", "rfc", "srhkhgsnxuwwkpph"))
                                        .withLocationInfo(
                                            Arrays.asList(new SkuLocationInfo().withLocation("bzxlbzxomeikjc"),
                                                new SkuLocationInfo().withLocation("wzacnmw")))
                                        .withRequiredQuotaIds(Arrays.asList("uqtaazyqbxyxoyf", "uqqiqezxlhd", "zq"))
                                        .withRequiredFeatures(Arrays.asList("dwvpsozjiihjr"))
                                        .withCapacity(new SkuSettingCapacity().withMinimum(77012856))
                                        .withCosts(Arrays.asList(new SkuCost().withMeterId("zo")))
                                        .withCapabilities(
                                            Arrays.asList(new SkuCapability().withName("xwdvwnj").withValue("gv"),
                                                new SkuCapability().withName("nmx").withValue("ursqf"),
                                                new SkuCapability()
                                                    .withName("ibtyibuyvpirfqjp")
                                                    .withValue("qnoowsbedenrex")))))),
                            new SkuResourceInner()
                                .withProperties(new SkuResourceProperties().withSkuSettings(Arrays.asList(
                                    new SkuSetting().withName("qozzkivyhjrliizj")
                                        .withTier("lqfhefkwabs")
                                        .withSize("ron")
                                        .withFamily("lmgnlqxsjx")
                                        .withKind("lexhv")
                                        .withLocations(Arrays.asList("ozoolzq"))
                                        .withLocationInfo(Arrays.asList(new SkuLocationInfo().withLocation("rkuz"),
                                            new SkuLocationInfo().withLocation("bc")))
                                        .withRequiredQuotaIds(Arrays.asList("t", "nx", "wqy", "llhdyzm"))
                                        .withRequiredFeatures(Arrays.asList("zexnxakcky", "ymx"))
                                        .withCapacity(new SkuSettingCapacity().withMinimum(1022688865))
                                        .withCosts(Arrays.asList(
                                            new SkuCost().withMeterId("kdtfohfaogz"),
                                            new SkuCost().withMeterId("kiwrsiw")))
                                        .withCapabilities(
                                            Arrays.asList(new SkuCapability().withName("quryk").withValue("rra"))),
                                    new SkuSetting()
                                        .withName("eek")
                                        .withTier("uehogdd")
                                        .withSize("bcbgydlqidywmhm")
                                        .withFamily("yrilkfb")
                                        .withKind("qqxvztpbn")
                                        .withLocations(Arrays.asList("txjt", "m", "lswbnf", "depld"))
                                        .withLocationInfo(Arrays.asList(new SkuLocationInfo().withLocation("ns"),
                                            new SkuLocationInfo().withLocation("zygleexahvm"),
                                            new SkuLocationInfo().withLocation("whsbrcary"),
                                            new SkuLocationInfo().withLocation("sjjzyvoaqajuveh")))
                                        .withRequiredQuotaIds(
                                            Arrays.asList("dmkrrb", "mpfu", "ubefgybpmfbfunu", "mpzkrvfyifkd"))
                                        .withRequiredFeatures(Arrays.asList("lzvfictnkjjwg", "wnphbkgfyrto", "mhmjpjs"))
                                        .withCapacity(new SkuSettingCapacity().withMinimum(329267906))
                                        .withCosts(Arrays.asList(
                                            new SkuCost().withMeterId("qwtygevgwmseharx"),
                                            new SkuCost().withMeterId("fv")))
                                        .withCapabilities(Arrays.asList(new SkuCapability()
                                            .withName("x")
                                            .withValue("mbpjptnvwjh"),
                                            new SkuCapability().withName("sidqpxlbtpakft")
                                                .withValue("gatwmykyu"),
                                            new SkuCapability().withName("rymdwmf").withValue("hpycvjqdvdwkq"))),
                                    new SkuSetting().withName("ldrlefgnaavua")
                                        .withTier("tetaoutnpdctuhs")
                                        .withSize("efyihduyeuyl")
                                        .withFamily("hmtybkcgsuthhll")
                                        .withKind("wynefx")
                                        .withLocations(Arrays.asList("fciatxtjrr"))
                                        .withLocationInfo(
                                            Arrays.asList(new SkuLocationInfo().withLocation("dskjhhxdlaj"),
                                                new SkuLocationInfo().withLocation("oxcxscvslx"),
                                                new SkuLocationInfo().withLocation("hu"),
                                                new SkuLocationInfo().withLocation("vkrmukmyjmkx")))
                                        .withRequiredQuotaIds(Arrays.asList("csl", "jfkqidn"))
                                        .withRequiredFeatures(Arrays.asList("qxjhqxcsqhtkbtnq"))
                                        .withCapacity(new SkuSettingCapacity().withMinimum(600768127))
                                        .withCosts(Arrays.asList(new SkuCost().withMeterId("dmbi")))
                                        .withCapabilities(
                                            Arrays.asList(new SkuCapability().withName("nawwlq").withValue("znxhhllxr"),
                                                new SkuCapability().withName("cctkwmuqqoajxe").withValue("y"),
                                                new SkuCapability().withName("lesrwva").withValue("xhdctrceqnk"),
                                                new SkuCapability().withName("rupobehd").withValue("lj"))))))))
                .withNextLink("ykcgxvrpjlvcz");
        model = BinaryData.fromObject(model).toObject(SkuResourceArrayResponseWithContinuation.class);
        Assertions.assertEquals("kl", model.value().get(0).properties().skuSettings().get(0).name());
        Assertions.assertEquals("l", model.value().get(0).properties().skuSettings().get(0).tier());
        Assertions.assertEquals("vcb", model.value().get(0).properties().skuSettings().get(0).size());
        Assertions.assertEquals("ezyquw", model.value().get(0).properties().skuSettings().get(0).family());
        Assertions.assertEquals("qxutrpbrruyuua", model.value().get(0).properties().skuSettings().get(0).kind());
        Assertions.assertEquals("mbjwcolbmxlb",
            model.value().get(0).properties().skuSettings().get(0).locations().get(0));
        Assertions.assertEquals("hngxnoqrxtd",
            model.value().get(0).properties().skuSettings().get(0).locationInfo().get(0).location());
        Assertions.assertEquals("hdlmydidwhe",
            model.value().get(0).properties().skuSettings().get(0).requiredQuotaIds().get(0));
        Assertions.assertEquals("wtj",
            model.value().get(0).properties().skuSettings().get(0).requiredFeatures().get(0));
        Assertions.assertEquals(648461790, model.value().get(0).properties().skuSettings().get(0).capacity().minimum());
        Assertions.assertEquals("bhtmeplvuk",
            model.value().get(0).properties().skuSettings().get(0).costs().get(0).meterId());
        Assertions.assertEquals("hjym",
            model.value().get(0).properties().skuSettings().get(0).capabilities().get(0).name());
        Assertions.assertEquals("cgqtag",
            model.value().get(0).properties().skuSettings().get(0).capabilities().get(0).value());
        Assertions.assertEquals("ykcgxvrpjlvcz", model.nextLink());
    }
}
