package com.example;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.GkAssessment;
import com.example.entity.JkAssessment;
import com.example.entity.Project;
import com.example.util.Func;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    // 宽带接入
    private static final String SPEC_ONE = "1";
    // 大客户接入
    private static final String SPEC_TWO = "2";

    // 前评估阶段
    private static final String STAGE_ONE = "1";
    // 设计阶段 stage
    private static final String STAGE_TWO = "2";

    public static void main(String[] args) {
        List<JkAssessment> projects = Func.generateTestData(JkAssessment.class, 2);
        JSONArray jsonArray = new JSONArray(new ArrayList<>(projects));
        String insertSql = getInsertSql(jsonArray.toJavaList(JSONObject.class), "20201010", SPEC_TWO);
        System.out.println(insertSql);
    }

    private static String getInsertSql(List<JSONObject> approveList, String dealDate, String spec) {
        StringBuilder builder = new StringBuilder("insert all\n");
        if (SPEC_ONE.equals(spec)) {

            for (int i = 0; i < approveList.size(); i++) {
                JSONObject item = approveList.get(i);

                String sql = "        into TB_YTH_PMS_GK_ASSESSMENT (DEAL_DATE,PROJECT_NAME, PROJECT_CODE, REMAND_NAME,\n" +
                        "      REMAND_CODE, CREATE_NAME, CREATE_EMAIL,\n" +
                        "      CREATE_DATE, PROV, CITY,\n" +
                        "      COUNTY, STREET, ROAD,\n" +
                        "      NUMBER_PLATE, GRID_NAME, VILLAGE_NAME,\n" +
                        "      VILLAGE_CODE, REGION_TYPE, AREA_TYPE,\n" +
                        "      BUILD_SCENE, ROOM_NUMBER, HOUSE_NUMBER,\n" +
                        "      TENANT_NUMBER, FLOOR_NUMBER, FLOOR_CODE,\n" +
                        "      HOUSE_NUM, TENANT_NUM, COVER_RATE,\n" +
                        "      COVER3G, COVER4G, OPERATOR_NAME,\n" +
                        "      OPERATOR_USER_NUM, DEVICE_NAME, DEVICE_ADDRESS,\n" +
                        "      DEVICE_TYPE, ACCESS_TYPE, PORT_NUM,\n" +
                        "      PORT_OCCUPY_NUM, VOICE_PORT_NUM, VOICE_OCCUPY_NUM,\n" +
                        "      LIGHT_SEAT, LIGHT_VOL, FIBRE_NUM,\n" +
                        "      BD_USER_SIXMONTH, BD_USER_CUTOVER, BD_USER_GROWTH,\n" +
                        "      BD_USER_ONEYEAR, BD_USER_GROWTH_ONEYEAR, BD_USER_TWOYEAR,\n" +
                        "      BD_USER_GROWTH_TWOYEAR, VC_USER_SIXMONTH, VC_USER_CUTOVER,\n" +
                        "      VC_USER_GROWTH, VC_USER_ONEYEAR, VC_USER_GROWTH_ONEYEAR,\n" +
                        "      VC_USER_TWOYEAR, VC_USER_GROWTH_TWOYEAR, VC_USER_NUM,\n" +
                        "      BD_ARPU, NB_ARPU, BD_NB_PROPORTION,\n" +
                        "      BULID_TYPE, JOIN_TYPE, BD_PORT_BULID,\n" +
                        "      VC_PORT_BULID, TOU_ZI, CAPEX,\n" +
                        "      BULID_DATE, BD_USER_COST, BD_USER_COST_ONEYEAR,\n" +
                        "      BD_USER_COST_TWOYEAR, BD_INCOME_SIXMONTH, VC_INCOME_SIXMONTH,\n" +
                        "      INCOME_SIXMONTH, BD_INCOME_ONEYEAR, VC_INCOME_ONEYEAR,\n" +
                        "      INCOME_ONEYEAR, BD_INCOME_TWOYEAR, VC_INCOME_TWOYEAR,\n" +
                        "      INCOME_TWOYEAR, CASH_FLOW_SIXMONTH, CASH_OUTFLOW_SIXMONTH,\n" +
                        "      CASH_NET_FLOW_SIXMONTH, CASH_ACC_FLOW_SIXMONTH,\n" +
                        "      CASH_FLOW_ONEYEAR, CASH_OUTFLOW_ONEYEAR, CASH_NET_FLOW_ONEYEAR,\n" +
                        "      CASH_ACC_FLOW_ONEYEAR, CASH_FLOW_TWOYEAR, CASH_OUTFLOW_TWOYEAR,\n" +
                        "      CASH_NET_FLOW_TWOYEAR, CASH_ACC_FLOW_TWOYEAR,\n" +
                        "      PORT_INTE_COST, TOUZI_PERIOD, BD_PORT_PERM,\n" +
                        "      BD_PORT_RATE_TARGET, WORD_DATE, PROCSINSTID) ";

                builder.append(sql);
                builder.append("values ( ");
                builder.append("'").append(dealDate).append("'").append(",");
                builder.append("'").append(item.get("projectName")).append("'").append(",");
                builder.append("'").append(item.get("projectCode")).append("'").append(",");
                builder.append("'").append(item.get("remandName")).append("'").append(",");
                builder.append("'").append(item.get("remandCode")).append("'").append(",");
                builder.append("'").append(item.get("createName")).append("'").append(",");
                builder.append("'").append(item.get("createEmail")).append("'").append(",");
                builder.append("'").append(item.get("createDate")).append("'").append(",");
                builder.append("'").append(item.get("prov")).append("'").append(",");
                builder.append("'").append(item.get("city")).append("'").append(",");
                builder.append("'").append(item.get("county")).append("'").append(",");
                builder.append("'").append(item.get("street")).append("'").append(",");
                builder.append("'").append(item.get("road")).append("'").append(",");
                builder.append("'").append(item.get("numberPlate")).append("'").append(",");
                builder.append("'").append(item.get("gridName")).append("'").append(",");
                builder.append("'").append(item.get("villageName")).append("'").append(",");
                builder.append("'").append(item.get("villageCode")).append("'").append(",");
                builder.append("'").append(item.get("regionType")).append("'").append(",");
                builder.append("'").append(item.get("areaType")).append("'").append(",");
                builder.append("'").append(item.get("buildScene")).append("'").append(",");
                builder.append("'").append(item.get("roomNumber")).append("'").append(",");
                builder.append("'").append(item.get("houseNumber")).append("'").append(",");
                builder.append("'").append(item.get("tenantNumber")).append("'").append(",");
                builder.append("'").append(item.get("floorNumber")).append("'").append(",");
                builder.append("'").append(item.get("floorCode")).append("'").append(",");
                builder.append("'").append(item.get("houseNum")).append("'").append(",");
                builder.append("'").append(item.get("tenantNum")).append("'").append(",");
                builder.append("'").append(item.get("coverRate")).append("'").append(",");
                builder.append("'").append(item.get("cover3g")).append("'").append(",");
                builder.append("'").append(item.get("cover4g")).append("'").append(",");
                builder.append("'").append(item.get("operatorName")).append("'").append(",");
                builder.append("'").append(item.get("operatorUserNum")).append("'").append(",");
                builder.append("'").append(item.get("deviceName")).append("'").append(",");
                builder.append("'").append(item.get("deviceAddress")).append("'").append(",");
                builder.append("'").append(item.get("deviceType")).append("'").append(",");
                builder.append("'").append(item.get("accessType")).append("'").append(",");
                builder.append("'").append(item.get("portNum")).append("'").append(",");
                builder.append("'").append(item.get("portOccupyNum")).append("'").append(",");
                builder.append("'").append(item.get("voicePortNum")).append("'").append(",");
                builder.append("'").append(item.get("voiceOccupyNum")).append("'").append(",");
                builder.append("'").append(item.get("lightSeat")).append("'").append(",");
                builder.append("'").append(item.get("lightVol")).append("'").append(",");
                builder.append("'").append(item.get("fibreNum")).append("'").append(",");
                builder.append("'").append(item.get("bdUserSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("bdUserCutover")).append("'").append(",");
                builder.append("'").append(item.get("bdUserGrowth")).append("'").append(",");
                builder.append("'").append(item.get("bdUserOneyear")).append("'").append(",");
                builder.append("'").append(item.get("bdUserGrowthOneyear")).append("'").append(",");
                builder.append("'").append(item.get("bdUserTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("bdUserGrowthTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("vcUserSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("vcUserCutover")).append("'").append(",");
                builder.append("'").append(item.get("vcUserGrowth")).append("'").append(",");
                builder.append("'").append(item.get("vcUserOneyear")).append("'").append(",");
                builder.append("'").append(item.get("vcUserGrowthOneyear")).append("'").append(",");
                builder.append("'").append(item.get("vcUserTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("vcUserGrowthTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("vcUserNum")).append("'").append(",");
                builder.append("'").append(item.get("bdArpu")).append("'").append(",");
                builder.append("'").append(item.get("nbArpu")).append("'").append(",");
                builder.append("'").append(item.get("bdNbProportion")).append("'").append(",");
                builder.append("'").append(item.get("bulidType")).append("'").append(",");
                builder.append("'").append(item.get("joinType")).append("'").append(",");
                builder.append("'").append(item.get("bdPortBulid")).append("'").append(",");
                builder.append("'").append(item.get("vcPortBulid")).append("'").append(",");
                builder.append("'").append(item.get("touZi")).append("'").append(",");
                builder.append("'").append(item.get("capex")).append("'").append(",");
                builder.append("'").append(item.get("bulidDate")).append("'").append(",");
                builder.append("'").append(item.get("bdUserCost")).append("'").append(",");
                builder.append("'").append(item.get("bdUserCostOneyear")).append("'").append(",");
                builder.append("'").append(item.get("bdUserCostTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("bdIncomeSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("vcIncomeSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("incomeSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("bdIncomeOneyear")).append("'").append(",");
                builder.append("'").append(item.get("vcIncomeOneyear")).append("'").append(",");
                builder.append("'").append(item.get("incomeOneyear")).append("'").append(",");
                builder.append("'").append(item.get("bdIncomeTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("vcIncomeTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("incomeTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("cashFlowSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("cashOutflowSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("cashNetFlowSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("cashAccFlowSixmonth")).append("'").append(",");
                builder.append("'").append(item.get("cashFlowOneyear")).append("'").append(",");
                builder.append("'").append(item.get("cashOutflowOneyear")).append("'").append(",");
                builder.append("'").append(item.get("cashNetFlowOneyear")).append("'").append(",");
                builder.append("'").append(item.get("cashAccFlowOneyear")).append("'").append(",");
                builder.append("'").append(item.get("cashFlowTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("cashOutflowTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("cashNetFlowTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("cashAccFlowTwoyear")).append("'").append(",");
                builder.append("'").append(item.get("portInteCost")).append("'").append(",");
                builder.append("'").append(item.get("touziPeriod")).append("'").append(",");
                builder.append("'").append(item.get("bdPortPerm")).append("'").append(",");
                builder.append("'").append(item.get("bdPortRateTarget")).append("'").append(",");
                builder.append("'").append(item.get("wordDate")).append("'").append(",");
                builder.append("'").append(item.get("procsinstid")).append("'").append(")");
            }
            builder.append(" select 1 from dual");
            return builder.toString();
        }


        if (SPEC_TWO.equals(spec)) {

            for (int i = 0; i < approveList.size(); i++) {
                JSONObject item = approveList.get(i);

                String sql = " into TB_YTH_PMS_JK_ASSESSMENT (deal_date,PROJECT_NAME, PROJECT_CODE, REMAND_NAME,\n" +
                        "      REMAND_ID, PROV, CITY, \n" +
                        "      GRID_NAME, NETWORK_LEVEL, BUILD_TYPE, \n" +
                        "      BUSINESS_TYPE, DIS_UNIT, CREATED_DATE,\n" +
                        "      CREATED_BY, CREATED_BY_EMAIL, CREATED_BY_TEL, \n" +
                        "      CUSTOMER_NAME, CUSTOMER_INDUSTRY, CONTRACT_INTENTION_TIME, \n" +
                        "      OLD_INCOME, NEW_INCOME, TOTAL_INCOME, \n" +
                        "      ABLILITY_CHECK_TIME, MONTH_MARKETING_COST, \n" +
                        "      GRID_INFO_NAME, POST_DISASTER, IS_CROSSDOMAIN, \n" +
                        "      DEMAND_DESCRIBE, RESOURCE_DEPT, INSPECT_STAFF_NAME, \n" +
                        "      INSPECT_STAFF_EMAIL, INSPECT_STAFF_TEL, OPER_AND_MAINTEN_COST, \n" +
                        "      INSPECT_RESULT, BULID_ADD, TOU_ZI, \n" +
                        "      FIRST_INVESTMENT, SECOND_INVESTMENT, THIRD_INVESTMENT, \n" +
                        "      FOURTHLY_INVESTMENT, FIFTH_INVESTMENT, BUILD_PERIOD, \n" +
                        "      MBODIMENT_DEPT, SCHEME_PRINCIPAL_NAME, SCHEME_PRINCIPAL_EMAIL, \n" +
                        "      SCHEME_PRINCIPAL_TEL, MAIN_BUILD_DESC, BENE_EVALUATION, \n" +
                        "      PAYBACK_MOUTH, IS_STAND, BUILD_REASON, \n" +
                        "      REMARK, CDI_TOTLE, CDI_FIRST, \n" +
                        "      CDI_SECOND, CDI_THIRD, CDI_FOURTH, \n" +
                        "      CDI_FIFTH, PROCSINSTID) ";

                builder.append(sql);
                builder.append("values ( ");
                builder.append(dealDate) .append(",");
                builder.append("'").append(item.get("projectName")).append("'").append(",");
                builder.append("'").append(item.get("projectCode")).append("'").append(",");
                builder.append("'").append(item.get("remandName")).append("'").append(",");
                builder.append("'").append(item.get("remandId")).append("'").append(",");
                builder.append("'").append(item.get("prov")).append("'").append(",");
                builder.append("'").append(item.get("city")).append("'").append(",");
                builder.append("'").append(item.get("gridName")).append("'").append(",");
                builder.append("'").append(item.get("networkLevel")).append("'").append(",");
                builder.append("'").append(item.get("buildType")).append("'").append(",");
                builder.append("'").append(item.get("businessType")).append("'").append(",");
                builder.append("'").append(item.get("disUnit")).append("'").append(",");
                builder.append("'").append(item.get("createdDate")).append("'").append(",");
                builder.append("'").append(item.get("createdBy")).append("'").append(",");
                builder.append("'").append(item.get("createdByEmail")).append("'").append(",");
                builder.append("'").append(item.get("createdByTel")).append("'").append(",");
                builder.append("'").append(item.get("customerName")).append("'").append(",");
                builder.append("'").append(item.get("customerIndustry")).append("'").append(",");
                builder.append("'").append(item.get("contractIntentionTime")).append("'").append(",");
                builder.append("'").append(item.get("oldIncome")).append("'").append(",");
                builder.append("'").append(item.get("newIncome")).append("'").append(",");
                builder.append("'").append(item.get("totalIncome")).append("'").append(",");
                builder.append("'").append(item.get("ablilityCheckTime")).append("'").append(",");
                builder.append("'").append(item.get("monthMarketingCost")).append("'").append(",");
                builder.append("'").append(item.get("gridInfoName")).append("'").append(",");
                builder.append("'").append(item.get("postDisaster")).append("'").append(",");
                builder.append("'").append(item.get("isCrossdomain")).append("'").append(",");
                builder.append("'").append(item.get("demandDescribe")).append("'").append(",");
                builder.append("'").append(item.get("resourceDept")).append("'").append(",");
                builder.append("'").append(item.get("inspectStaffName")).append("'").append(",");
                builder.append("'").append(item.get("inspectStaffEmail")).append("'").append(",");
                builder.append("'").append(item.get("inspectStaffTel")).append("'").append(",");
                builder.append("'").append(item.get("operAndMaintenCost")).append("'").append(",");
                builder.append("'").append(item.get("inspectResult")).append("'").append(",");
                builder.append("'").append(item.get("bulidAdd")).append("'").append(",");
                builder.append("'").append(item.get("touZi")).append("'").append(",");
                builder.append("'").append(item.get("firstInvestment")).append("'").append(",");
                builder.append("'").append(item.get("secondInvestment")).append("'").append(",");
                builder.append("'").append(item.get("thirdInvestment")).append("'").append(",");
                builder.append("'").append(item.get("fourthlyInvestment")).append("'").append(",");
                builder.append("'").append(item.get("fifthInvestment")).append("'").append(",");
                builder.append("'").append(item.get("buildPeriod")).append("'").append(",");
                builder.append("'").append(item.get("mbodimentDept")).append("'").append(",");
                builder.append("'").append(item.get("schemePrincipalName")).append("'").append(",");
                builder.append("'").append(item.get("schemePrincipalEmail")).append("'").append(",");
                builder.append("'").append(item.get("schemePrincipalTel")).append("'").append(",");
                builder.append("'").append(item.get("mainBuildDesc")).append("'").append(",");
                builder.append("'").append(item.get("beneEvaluation")).append("'").append(",");
                builder.append("'").append(item.get("paybackMouth")).append("'").append(",");
                builder.append("'").append(item.get("isStand")).append("'").append(",");
                builder.append("'").append(item.get("buildReason")).append("'").append(",");
                builder.append("'").append(item.get("remark")).append("'").append(",");
                builder.append("'").append(item.get("cdiTotle")).append("'").append(",");
                builder.append("'").append(item.get("cdiFirst")).append("'").append(",");
                builder.append("'").append(item.get("cdiSecond")).append("'").append(",");
                builder.append("'").append(item.get("cdiThird")).append("'").append(",");
                builder.append("'").append(item.get("cdiFourth")).append("'").append(",");
                builder.append("'").append(item.get("cdiFifth")).append("'").append(",");
                builder.append("'").append(item.get("procsinstid")).append("'").append(")");
            }
            builder.append(" select 1 from dual");
            return builder.toString();
        }

        return "";

    }
}
