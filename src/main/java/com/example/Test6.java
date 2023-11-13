package com.example;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {

    private static String template = "builder.append(\"'\").append(item.get(\"%s\")).append(\"'\").append(\",\");";
    private static String template1 = "HEAD.add(\"%s\");";
    private static String test = "INSERT INTO \"GDBPM\".\"T_SPARK_PROJECTAPPROVE_SELECT\"(\"WF_ORUNID\", \"NAME\", \"VALUE\", \"TYPE\") VALUES ('%s', '%s', '%s', '岗位名称');";
    private static String test1 = "客户经理\n" +
            "渠道经理\n" +
            "需求经理\n" +
            "终端管理岗\n" +
            "营销策划经理\n" +
            "运营推广经理\n" +
            "行业洞察\n" +
            "解决方案经理\n" +
            "项目经理\n" +
            "交付经理\n" +
            "项目技术支撑岗\n" +
            "集约支撑服务岗\n" +
            "业务稽核岗\n" +
            "营销分析岗\n" +
            "金融运营岗\n" +
            "业务管理岗\n" +
            "生态合作管理岗\n" +
            "服务标准研发岗\n" +
            "服务建模师\n" +
            "服务产品岗\n" +
            "服务分析师\n" +
            "服务治理师\n" +
            "客户体验管理岗\n" +
            "网络质量分析师\n" +
            "问题诊治处理岗\n" +
            "业务运营岗\n" +
            "数字化创新（IT DT）产品经理\n" +
            "算网创新（CT IT）产品经理\n" +
            "网络创新（CT）产品经理\n" +
            "应用（IT）产品经理\n" +
            "融合产品（CT+IT+DT)经理\n" +
            "安全产品经理\n" +
            "行业产品经理\n" +
            "资费产品经理\n" +
            "产品架构师\n" +
            "产品设计岗\n" +
            "产品运营岗\n" +
            "产品交付岗\n" +
            "产品技术支持岗\n" +
            "产品运营管理岗\n" +
            "产品管理岗\n" +
            "产品项目管理岗\n" +
            "数据安全岗\n" +
            "数据服务岗\n" +
            "数据治理运营岗\n" +
            "数字化运营岗\n" +
            "网络架构师\n" +
            "云平台架构师\n" +
            "数据架构师\n" +
            "IT系统架构师\n" +
            "安全架构师\n" +
            "服务架构师\n" +
            "云网技术工程师\n" +
            "前端开发工程师\n" +
            "后端开发工程师\n" +
            "测试工程师\n" +
            "UI设计师\n" +
            "软件运维工程师\n" +
            "算法开发工程师\n" +
            "应用算法岗\n" +
            "硬件研发工程师\n" +
            "网络创新能力研究岗\n" +
            "数据分析岗\n" +
            "数据管理岗\n" +
            "科创项目管理岗\n" +
            "网络规划岗\n" +
            "网络建设岗\n" +
            "云资源建设岗\n" +
            "共建共享规划岗\n" +
            "局房及基础设施规划岗\n" +
            "局房及基础设施建设岗\n" +
            "能效优化管理岗\n" +
            "局房运营岗\n" +
            "网络运营工程师\n" +
            "应用平台运营工程师\n" +
            "网管平台运营工程师\n" +
            "云网平台运维工程师\n" +
            "网络工程项目管理岗\n" +
            "IDC交付岗\n" +
            "云资源维护岗\n" +
            "云资源运营岗\n" +
            "共建共享维护岗\n" +
            "管线维护与优化岗\n" +
            "网络维护与优化岗\n" +
            "网络资源管理与调度岗\n" +
            "电气工程师\n" +
            "运维工程师\n" +
            "运维监控工程师\n" +
            "造价师\n" +
            "客户感知优化岗\n" +
            "客户响应工程师\n" +
            "安全管理岗\n" +
            "安全合规岗\n" +
            "安全运维岗";

    public static void main(String[] args) {
        String[] split = test1.split("\n");
        String result = "";
        for (String s : split) {
            String format = String.format(test, UUID.randomUUID().toString(), s, s);
            result += format;
            result += "\n";
        }
        System.out.println(result);
    }

//    public static void main(String[] args) {
//        Pattern compile = Pattern.compile("item\\..*?,");
//        Matcher matcher = compile.matcher(test);
//        while (matcher.find()) {
//            String group = matcher.group().replaceAll("item.", "").replaceAll(",", "");
//            System.out.println(String.format(template1, group));
//        }
//    }
}
