package com.example;

public class Test {

    static String template = "EXTRACTVALUE(xmltype(c.XMLDATA),'/Items/WFItem[@name=\"%s\"]') AS %s,";
    static String template1 = "    builder.append(document.g(%s)).append(SEPARATE);";
    static String values = "PROJECT_ID\t需求编号\n" +
            "LIGHT_CONTAINER_NAME\t线路侧--最近光交名称\n" +
            "DISTANCE\t线路侧--光交距离项目归属地距离KM\n" +
            "FREE_FIBERCORE_NUM\t线路侧--闲置纤芯数(个)\n" +
            "FREE_LIGHT_NUM\t线路侧--分光器闲置端口数(个)\n" +
            "OLT_NAME\t线路侧--可上联OLT名称\n" +
            "OLT_PORT\t线路侧--上联OLT板块闲置端口序号\n" +
            "OLT_ROOM_NAME\t线路侧--上联OLT机房名称\n" +
            "LINE_OTHER\t线路侧--其他\n" +
            "EQUIPMENT_NAME\t设备侧--可上联设备名称\n" +
            "EQUIPMENT_MODEL\t设备侧--可上联设备型号\n" +
            "FREE_EQUIPMENT_SLOT\t设备侧--设备闲置槽位\n" +
            "EQUIPMENT_PORT\t设备侧--板块闲置端口序号\n" +
            "EQUIPMENT_ROOM_NAME\t设备侧--上联设备机房名称\n" +
            "EQUIPMENT_OTHER\t设备侧--其他\n" +
            "HAS_RESOURCE\t是否有资源 1是\n" +
            "DEAL_DATE\t账期字段";

    public static void main(String[] args) {
        printf1();
        printf2();
    }

    public static void printf1() {
        String[] split = values.split("\n");
        StringBuilder builder = new StringBuilder();
        for (String s : split) {
            s = s.trim().split("\t")[0];
            builder.append(String.format(template, s, s));
            builder.append("\r\n");
        }
        System.out.println(builder.toString());
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void printf2() {
        String[] split = values.split("\n");
        StringBuilder builder = new StringBuilder();
        for (String s : split) {
            String remark = s.trim().split("\t")[1];
            String key =  s.trim().split("\t")[0];
            builder.append("    // " + remark);
            builder.append("\r\n");
            builder.append(String.format(template1, "\"" + key + "\""));
            builder.append("\r\n");
            builder.append("\r\n");
        }
        System.out.println(builder.toString());
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
