package com.example;

public class Test1 {

    static String template = "EXTRACTVALUE(xmltype(c.XMLDATA),'/Items/WFItem[@name=\"%s\"]') AS %s,";
    static String values = "PROJECT_ID\n" +
            "PROJECT_NAME\n" +
            "NEED_NAME\n" +
            "GRID_NAME\n" +
            "INVEST\n" +
            "PROJECT_ID_Z\n" +
            "PROJECT_NAME_Z\n" +
            "REPAIR_DATE\n" +
            "INVEST_GRID_DATE\n" +
            "GRID_ACCEPT_DATE\n" +
            "CUSTOMER_NAME\n" +
            "CUSTOMER_INDUSTRY\n" +
            "BUSINESS_TYPE\n" +
            "ENCUSTOMER_TYPE\n" +
            "CONTRACT_MONTH\n" +
            "MONTHLY_INCOM\n" +
            "MONTHLY_ADDINCOM\n" +
            "TOTAL_INCOM\n" +
            "ACCEPT_TIME\n" +
            "IS_CORSS_DOMIN\n" +
            "CUSTOMER_TEXT\n" +
            "OPERATE_COST\n" +
            "BUILD_ADDRESS\n" +
            "BUILD_CYCLE\n" +
            "BUILD_TEXT\n" +
            "BENEFIT_ASSESS\n" +
            "INVEST_RECYLE_YEAR\n" +
            "ASSESS_RESULT\n" +
            "PROJECT_REASON\n" +
            "REMARK\n" +
            "CONSTR_MODE\n" +
            "HT_DYN\n" +
            "HT_DEN\n" +
            "HT_DSN\n" +
            "PHONE\n" +
            "PROJECT_MANGER_OA\n" +
            "PROJECT_MANGER_NAME\n" +
            "PROJECT_STATUS\n" +
            "ECONOMIC_ASSESS\n" +
            "DEAL_DATE\n" +
            "FLOW_STATUS";

    public static void main(String[] args) {
        String[] split = values.split("\n");
        StringBuilder builder = new StringBuilder();
        for (String s : split) {
            s = s.trim();
            builder.append(String.format(template, s, s));
            builder.append("\r\n");
        }
        System.out.println(builder.toString());
    }
}
