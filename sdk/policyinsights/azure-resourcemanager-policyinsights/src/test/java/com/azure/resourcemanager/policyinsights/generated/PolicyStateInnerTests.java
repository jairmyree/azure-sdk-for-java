// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyStateInner;
import com.azure.resourcemanager.policyinsights.models.ComponentStateDetails;
import com.azure.resourcemanager.policyinsights.models.ExpressionEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.IfNotExistsEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.PolicyEvaluationDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PolicyStateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyStateInner model = BinaryData.fromString(
            "{\"@odata.id\":\"hxx\",\"@odata.context\":\"yq\",\"timestamp\":\"2020-12-30T00:37:41Z\",\"resourceId\":\"eqz\",\"policyAssignmentId\":\"priolx\",\"policyDefinitionId\":\"jaltolmnc\",\"effectiveParameters\":\"obqwcsdbnwdcfh\",\"isCompliant\":true,\"subscriptionId\":\"pfuvglsbjjca\",\"resourceType\":\"xbvtvudu\",\"resourceLocation\":\"cormr\",\"resourceGroup\":\"qtvcofudflvkgj\",\"resourceTags\":\"gdknnqv\",\"policyAssignmentName\":\"znqntoru\",\"policyAssignmentOwner\":\"gsahmkycgrauw\",\"policyAssignmentParameters\":\"etaebu\",\"policyAssignmentScope\":\"vdmovsmzlxwabm\",\"policyDefinitionName\":\"efkifr\",\"policyDefinitionAction\":\"puqujmqlgkfbtn\",\"policyDefinitionCategory\":\"aongbj\",\"policySetDefinitionId\":\"tujitcjedft\",\"policySetDefinitionName\":\"ae\",\"policySetDefinitionOwner\":\"ojvdcpzfoqo\",\"policySetDefinitionCategory\":\"cybxa\",\"policySetDefinitionParameters\":\"gszufoxciqopid\",\"managementGroupIds\":\"mciodhkhazxkhn\",\"policyDefinitionReferenceId\":\"onlwntoeg\",\"complianceState\":\"dwbwhkszzcmrvexz\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{\"result\":\"gsfraoyzkoow\",\"expression\":\"mnguxawqaldsyu\",\"expressionKind\":\"imerqfobwyznk\",\"path\":\"kutwpf\",\"expressionValue\":\"dataa\",\"targetValue\":\"datahrskdsnfd\",\"operator\":\"oakgtdlmkkzev\"}],\"ifNotExistsDetails\":{\"resourceId\":\"ewpusdsttwvogvb\",\"totalResources\":2086607804}},\"policyDefinitionGroupNames\":[\"ngqqmoakuf\",\"m\",\"zr\",\"rdgrtw\"],\"components\":[{\"id\":\"uzkopbminrfd\",\"type\":\"yuhhziu\",\"name\":\"fozbhdmsmlmzqhof\",\"timestamp\":\"2021-05-05T04:42:21Z\",\"complianceState\":\"equi\",\"piyylhalnswhccsp\":\"dataicslfaoq\",\"scywuggwoluhc\":\"datakaivwit\"},{\"id\":\"wem\",\"type\":\"i\",\"name\":\"brgz\",\"timestamp\":\"2021-06-14T04:59:44Z\",\"complianceState\":\"weyp\",\"tlstvlzywem\":\"dataxggicccnxqhuexmk\",\"lusiy\":\"datazrncsdt\",\"cy\":\"databsfgytguslfea\",\"xgfpelolppv\":\"dataqukyhejhzi\"},{\"id\":\"r\",\"type\":\"vu\",\"name\":\"raehtwdwrft\",\"timestamp\":\"2021-06-07T20:23:50Z\",\"complianceState\":\"yrcdlbhshfwprac\",\"cedcpnmdy\":\"dataitykhevx\"}],\"policyDefinitionVersion\":\"nwzxltjcv\",\"policySetDefinitionVersion\":\"ltiugcxnavv\",\"policyAssignmentVersion\":\"qiby\",\"wxwlmdjrkvfgb\":\"datay\",\"acizsjqlhkrr\":\"datafvpdbo\",\"hvxndzwmkrefajpj\":\"databdeibqipqk\",\"yhgbijtjivfx\":\"datarwkq\"}")
            .toObject(PolicyStateInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T00:37:41Z"), model.timestamp());
        Assertions.assertEquals("eqz", model.resourceId());
        Assertions.assertEquals("priolx", model.policyAssignmentId());
        Assertions.assertEquals("jaltolmnc", model.policyDefinitionId());
        Assertions.assertEquals("obqwcsdbnwdcfh", model.effectiveParameters());
        Assertions.assertTrue(model.isCompliant());
        Assertions.assertEquals("pfuvglsbjjca", model.subscriptionId());
        Assertions.assertEquals("xbvtvudu", model.resourceType());
        Assertions.assertEquals("cormr", model.resourceLocation());
        Assertions.assertEquals("qtvcofudflvkgj", model.resourceGroup());
        Assertions.assertEquals("gdknnqv", model.resourceTags());
        Assertions.assertEquals("znqntoru", model.policyAssignmentName());
        Assertions.assertEquals("gsahmkycgrauw", model.policyAssignmentOwner());
        Assertions.assertEquals("etaebu", model.policyAssignmentParameters());
        Assertions.assertEquals("vdmovsmzlxwabm", model.policyAssignmentScope());
        Assertions.assertEquals("efkifr", model.policyDefinitionName());
        Assertions.assertEquals("puqujmqlgkfbtn", model.policyDefinitionAction());
        Assertions.assertEquals("aongbj", model.policyDefinitionCategory());
        Assertions.assertEquals("tujitcjedft", model.policySetDefinitionId());
        Assertions.assertEquals("ae", model.policySetDefinitionName());
        Assertions.assertEquals("ojvdcpzfoqo", model.policySetDefinitionOwner());
        Assertions.assertEquals("cybxa", model.policySetDefinitionCategory());
        Assertions.assertEquals("gszufoxciqopid", model.policySetDefinitionParameters());
        Assertions.assertEquals("mciodhkhazxkhn", model.managementGroupIds());
        Assertions.assertEquals("onlwntoeg", model.policyDefinitionReferenceId());
        Assertions.assertEquals("dwbwhkszzcmrvexz", model.complianceState());
        Assertions.assertEquals("gsfraoyzkoow", model.policyEvaluationDetails().evaluatedExpressions().get(0).result());
        Assertions.assertEquals("mnguxawqaldsyu",
            model.policyEvaluationDetails().evaluatedExpressions().get(0).expression());
        Assertions.assertEquals("kutwpf", model.policyEvaluationDetails().evaluatedExpressions().get(0).path());
        Assertions.assertEquals("oakgtdlmkkzev",
            model.policyEvaluationDetails().evaluatedExpressions().get(0).operator());
        Assertions.assertEquals("ewpusdsttwvogvb", model.policyEvaluationDetails().ifNotExistsDetails().resourceId());
        Assertions.assertEquals(2086607804, model.policyEvaluationDetails().ifNotExistsDetails().totalResources());
        Assertions.assertEquals("ngqqmoakuf", model.policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("uzkopbminrfd", model.components().get(0).id());
        Assertions.assertEquals("yuhhziu", model.components().get(0).type());
        Assertions.assertEquals("fozbhdmsmlmzqhof", model.components().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-05T04:42:21Z"), model.components().get(0).timestamp());
        Assertions.assertEquals("equi", model.components().get(0).complianceState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyStateInner model = new PolicyStateInner().withTimestamp(OffsetDateTime.parse("2020-12-30T00:37:41Z"))
            .withResourceId("eqz")
            .withPolicyAssignmentId("priolx")
            .withPolicyDefinitionId("jaltolmnc")
            .withEffectiveParameters("obqwcsdbnwdcfh")
            .withIsCompliant(true)
            .withSubscriptionId("pfuvglsbjjca")
            .withResourceType("xbvtvudu")
            .withResourceLocation("cormr")
            .withResourceGroup("qtvcofudflvkgj")
            .withResourceTags("gdknnqv")
            .withPolicyAssignmentName("znqntoru")
            .withPolicyAssignmentOwner("gsahmkycgrauw")
            .withPolicyAssignmentParameters("etaebu")
            .withPolicyAssignmentScope("vdmovsmzlxwabm")
            .withPolicyDefinitionName("efkifr")
            .withPolicyDefinitionAction("puqujmqlgkfbtn")
            .withPolicyDefinitionCategory("aongbj")
            .withPolicySetDefinitionId("tujitcjedft")
            .withPolicySetDefinitionName("ae")
            .withPolicySetDefinitionOwner("ojvdcpzfoqo")
            .withPolicySetDefinitionCategory("cybxa")
            .withPolicySetDefinitionParameters("gszufoxciqopid")
            .withManagementGroupIds("mciodhkhazxkhn")
            .withPolicyDefinitionReferenceId("onlwntoeg")
            .withComplianceState("dwbwhkszzcmrvexz")
            .withPolicyEvaluationDetails(new PolicyEvaluationDetails()
                .withEvaluatedExpressions(Arrays.asList(new ExpressionEvaluationDetails().withResult("gsfraoyzkoow")
                    .withExpression("mnguxawqaldsyu")
                    .withPath("kutwpf")
                    .withExpressionValue("dataa")
                    .withTargetValue("datahrskdsnfd")
                    .withOperator("oakgtdlmkkzev")))
                .withIfNotExistsDetails(new IfNotExistsEvaluationDetails().withResourceId("ewpusdsttwvogvb")
                    .withTotalResources(2086607804)))
            .withPolicyDefinitionGroupNames(Arrays.asList("ngqqmoakuf", "m", "zr", "rdgrtw"))
            .withComponents(Arrays.asList(new ComponentStateDetails().withId("uzkopbminrfd")
                .withType("yuhhziu")
                .withName("fozbhdmsmlmzqhof")
                .withTimestamp(OffsetDateTime.parse("2021-05-05T04:42:21Z"))
                .withComplianceState("equi")
                .withAdditionalProperties(mapOf("piyylhalnswhccsp", "dataicslfaoq", "scywuggwoluhc", "datakaivwit")),
                new ComponentStateDetails().withId("wem")
                    .withType("i")
                    .withName("brgz")
                    .withTimestamp(OffsetDateTime.parse("2021-06-14T04:59:44Z"))
                    .withComplianceState("weyp")
                    .withAdditionalProperties(mapOf("lusiy", "datazrncsdt", "cy", "databsfgytguslfea", "tlstvlzywem",
                        "dataxggicccnxqhuexmk", "xgfpelolppv", "dataqukyhejhzi")),
                new ComponentStateDetails().withId("r")
                    .withType("vu")
                    .withName("raehtwdwrft")
                    .withTimestamp(OffsetDateTime.parse("2021-06-07T20:23:50Z"))
                    .withComplianceState("yrcdlbhshfwprac")
                    .withAdditionalProperties(mapOf("cedcpnmdy", "dataitykhevx"))))
            .withAdditionalProperties(mapOf("policyDefinitionVersion", "nwzxltjcv", "@odata.id", "hxx",
                "hvxndzwmkrefajpj", "databdeibqipqk", "acizsjqlhkrr", "datafvpdbo", "wxwlmdjrkvfgb", "datay",
                "yhgbijtjivfx", "datarwkq", "policyAssignmentVersion", "qiby", "@odata.context", "yq",
                "policySetDefinitionVersion", "ltiugcxnavv"));
        model = BinaryData.fromObject(model).toObject(PolicyStateInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T00:37:41Z"), model.timestamp());
        Assertions.assertEquals("eqz", model.resourceId());
        Assertions.assertEquals("priolx", model.policyAssignmentId());
        Assertions.assertEquals("jaltolmnc", model.policyDefinitionId());
        Assertions.assertEquals("obqwcsdbnwdcfh", model.effectiveParameters());
        Assertions.assertTrue(model.isCompliant());
        Assertions.assertEquals("pfuvglsbjjca", model.subscriptionId());
        Assertions.assertEquals("xbvtvudu", model.resourceType());
        Assertions.assertEquals("cormr", model.resourceLocation());
        Assertions.assertEquals("qtvcofudflvkgj", model.resourceGroup());
        Assertions.assertEquals("gdknnqv", model.resourceTags());
        Assertions.assertEquals("znqntoru", model.policyAssignmentName());
        Assertions.assertEquals("gsahmkycgrauw", model.policyAssignmentOwner());
        Assertions.assertEquals("etaebu", model.policyAssignmentParameters());
        Assertions.assertEquals("vdmovsmzlxwabm", model.policyAssignmentScope());
        Assertions.assertEquals("efkifr", model.policyDefinitionName());
        Assertions.assertEquals("puqujmqlgkfbtn", model.policyDefinitionAction());
        Assertions.assertEquals("aongbj", model.policyDefinitionCategory());
        Assertions.assertEquals("tujitcjedft", model.policySetDefinitionId());
        Assertions.assertEquals("ae", model.policySetDefinitionName());
        Assertions.assertEquals("ojvdcpzfoqo", model.policySetDefinitionOwner());
        Assertions.assertEquals("cybxa", model.policySetDefinitionCategory());
        Assertions.assertEquals("gszufoxciqopid", model.policySetDefinitionParameters());
        Assertions.assertEquals("mciodhkhazxkhn", model.managementGroupIds());
        Assertions.assertEquals("onlwntoeg", model.policyDefinitionReferenceId());
        Assertions.assertEquals("dwbwhkszzcmrvexz", model.complianceState());
        Assertions.assertEquals("gsfraoyzkoow", model.policyEvaluationDetails().evaluatedExpressions().get(0).result());
        Assertions.assertEquals("mnguxawqaldsyu",
            model.policyEvaluationDetails().evaluatedExpressions().get(0).expression());
        Assertions.assertEquals("kutwpf", model.policyEvaluationDetails().evaluatedExpressions().get(0).path());
        Assertions.assertEquals("oakgtdlmkkzev",
            model.policyEvaluationDetails().evaluatedExpressions().get(0).operator());
        Assertions.assertEquals("ewpusdsttwvogvb", model.policyEvaluationDetails().ifNotExistsDetails().resourceId());
        Assertions.assertEquals(2086607804, model.policyEvaluationDetails().ifNotExistsDetails().totalResources());
        Assertions.assertEquals("ngqqmoakuf", model.policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("uzkopbminrfd", model.components().get(0).id());
        Assertions.assertEquals("yuhhziu", model.components().get(0).type());
        Assertions.assertEquals("fozbhdmsmlmzqhof", model.components().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-05T04:42:21Z"), model.components().get(0).timestamp());
        Assertions.assertEquals("equi", model.components().get(0).complianceState());
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
