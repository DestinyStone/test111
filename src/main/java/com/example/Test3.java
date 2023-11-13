package com.example;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {

    private static final String TEMPLATE_PATH = "E:\\temp\\2023-09\\template.txt";
    private static final String FIELD_PATH = "E:\\temp\\2023-09\\%s.txt";
    private static final String WRITE_PATH = "E:\\temp\\2023-09\\class\\%s.java";
    private static final String DATAS_SQLS_TEMPLATE = "SELECT * FROM %s";
    private static final String REMARK_TEMPLATE = "        builder.append(document.g(%s)).append(SEPARATE);";

    private static final String CLASS_NAME = "R_S029_T_YTH_BASE_TOSFTP";
    private static final String FILE_TEMPLATE = "SRC_GD_D_YTH_PROBASE";
    private static final String TABLE_NAME = "";
    private static final String REMARK = "";

    @Data
    @AllArgsConstructor
    static class Param {
        private String className;
        private String fileTemplate;
        private String tableName;
        private String remark;

    }

    public static void main(String[] args) {

        ArrayList<Param> reads = new ArrayList<>();
        reads.add(new Param("R_S029_T_YTH_BASE_TOSFTP", "SRC_GD_D_YTH_PROBASE", "TB_YTH_BRO_GRID", "政企客户工程工单基本信息"));
        reads.add(new Param("R_S029_T_YTH_WORK_DESIGN_INFO_TOSFTP", "SRC_GD_D_YTH_PRODESIGN", "TB_YTH_WORK_DESIGN_INFO", "政企客户工程项目设计信息"));
        reads.add(new Param("R_S029_T_YTH_WORK_ACCEP_INFO_TOSFTP", "SRC_GD_D_YTH_PROWORKACCEPT", "TB_YTH_WORK_ACCEP_INFO", "政企客户工程项目验收信息"));
        reads.add(new Param("R_S029_T_YTH_SYNTH_INCOME_TOSFTP", "SRC_GD_D_YTH_PROSYNTHINCOME", "TB_YTH_SYNTH_INCOME", "小型项目测算"));
        reads.add(new Param("R_S029_T_YTH_WORK_CONSTRUT_INFO_TOSFTP", "SRC_GD_D_YTH_PROCONSTRUT", "TB_YTH_WORK_CONSTRUT_INFO", "项目实施信息接口"));
        reads.add(new Param("R_S029_T_YTH_WORK_RESOURCE_INFO_TOSFTP", "SRC_GD_D_YTH_PRORESOURCE", "TB_YTH_WORK_RESOURCE_INFO", "项目资源信息接口"));
        reads.add(new Param("R_S029_T_PMS_TOSFTP", "SRC_GD_D_PMS_PROBASE", "TF_PMS", "宽带项目接入工单基本信息"));
        reads.add(new Param("R_S029_T_PMS_BUILDING_TOSFTP", "SRC_GD_D_PMS_PROBUILDING", "TF_PMS_BUILDING", "宽带项目接入工单楼宇信息"));
        reads.add(new Param("R_S029_T_PMS_EXTINFO_TOSFTP", "SRC_GD_D_PMS_PROEXTINFO", "TF_PMS_EXTINFO", "宽带项目接入工单立项信息"));
        reads.add(new Param("R_S029_T_PMS_RES_CHECK_TOSFTP", "SRC_GD_D_PMS_PRORESCHECK", "TF_PMS_RES_CHECK", "宽带项目接入工单资源核查信息"));
        reads.add(new Param("R_S029_T_PMS_ESTIMATE_TOSFTP", "SRC_GD_D_PMS_PROESTIMATE", "TF_PMS_ESTIMATE", "宽带项目接入投资预估信息"));
        reads.add(new Param("R_S029_T_PMS_CONTRACT_TOSFTP", "SRC_GD_D_PMS_PROCONTRACT", "TF_PMS_CONTRACT", "宽带项目接入合同信息"));
        reads.add(new Param("R_S029_T_PMS_WORKING_ALLOCATION_TOSFTP", "SRC_GD_D_PMS_PROWORKINGALLOCATION", "TF_PMS_WORKING_ALLOCATION", "宽带项目接入投资界面信息"));
        reads.add(new Param("R_S029_T_PMS_ACCEPT_RESULT_TOSFTP", "SRC_GD_D_PMS_PROACCEPTRESULT", "TF_PMS_ACCEPT_RESULT", "宽带项目接入验收信息 "));
        reads.add(new Param("R_S029_T_PMS_MARKET_TOSFTP", "SRC_GD_D_PMS_PROMARKET", "TF_PMS_MARKET", "宽带项目接入目标市场信息"));

        for (Param read : reads) {
            operator(read);
        }
    }

    public static void operator(Param param) {
        String template = FileUtil.readUtf8String(TEMPLATE_PATH);
        HashMap<String, String> params = new HashMap<>();
        params.put("className", param.getClassName());
        params.put("DATAS_SQLS", String.format(DATAS_SQLS_TEMPLATE, param.getTableName()));
        params.put("FILE_TEMPLATE", FILE_TEMPLATE);
        params.put("REMARK", param.getRemark());
        params.put("toString", printfRemark(param));

        String format = StrUtil.format(template, params);
        FileUtil.writeUtf8String(format, String.format(WRITE_PATH, param.getClassName()));
    }


    public static String printfRemark(Param param) {
        String values = FileUtil.readUtf8String(String.format(FIELD_PATH, param.getTableName()));
        String[] split = values.split("\n");
        StringBuilder builder = new StringBuilder();
        for (String s : split) {
            String remark = s.trim().split("\t")[1];
            String key =  s.trim().split("\t")[0];
            builder.append("        // " + remark);
            builder.append("\r\n");
            builder.append(String.format(REMARK_TEMPLATE, "\"" + key + "\""));
            builder.append("\r\n");
            builder.append("\r\n");
        }
        return builder.toString();
    }
}
