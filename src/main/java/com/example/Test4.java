package com.example;

public class Test4 {

    private static String values = "GD_CREATE_STAFF, GD_CREATE_NAME, GD_CREATE_OA,\n" +
            "            MOULD_CODE, JS_MS, GD_CREATE_DATE,\n" +
            "            GD_STATUS, IS_SJPF, GL_XM_DATE,\n" +
            "            CREATE_DATE, CREATE_STAFF, LAST_MOD_DATE,\n" +
            "            LAST_MOD_STAFF, PROJECT_MANAGER, IS_YSQR,\n" +
            "            GD_FQMS, GD_FQR, GD_FQ_OA,\n" +
            "            SS_ZZ, SJPFR_NAME, SJPFR_ZZMC,\n" +
            "            YSQRR_NAME, YSQRR_ZZMC, GD_TYPE,\n" +
            "            GD_ID, MP_NUMBER, ZZXQ_NAME,\n" +
            "            ZZXQ_CODE, DY_TYPE, QY_TYPE,\n" +
            "            XZ_JR, KD_DK_S_XQ, KD_DK_S_SJ,\n" +
            "            KD_DK_S_YS, KD_DK_ZYS_XQ, KD_DK_ZYS_SJ,\n" +
            "            KD_DK_ZYS_YS, YY_DKS_XQ, YY_DKS_SJ,\n" +
            "            YY_DKS_YS, YY_DK_ZYS_XQ, YY_DK_ZYS_SJ,\n" +
            "            YY_DK_ZYS_YS, OLT_JDSL_XQ, OLT_JDSL_SJ,\n" +
            "            XY_PON_KY_XQ, XY_PON_KY_SJ, XY_PON_KY_YS,\n" +
            "            XY_PON_SZL_XQ, XY_PON_SZL_SJ, XY_PON_SZL_YS,\n" +
            "            XZ_PON_XQ, XZ_PON_SJ, XZ_PON_EPON_XQ,\n" +
            "            XZ_PON_EPON_SJ, XZ_PON_GPON_XQ, XZ_PON_GPON_SJ,\n" +
            "            XZ_PON10EPON_XQ, XZ_PON10EPON_SJ, XZ_PON10GPON_XQ,\n" +
            "            XZ_PON10GPON_SJ, OLT_TYPE_XQ, OLT_TYPE_SJ,\n" +
            "            OLT_SL_XQ, OLT_SL_SJ, JS_JHJ_XQ,\n" +
            "            JS_JHJ_SJ, XZWG_MS_XQ, XZWG_MS_SJ,\n" +
            "            XZWG_MS_YS, BQJS_MS_XQ, BQJS_MS_SJ,\n" +
            "            BQJS_MS_YS, JSGM_MS_XQ, JSGM_MS_SJ,\n" +
            "            JSGM_MS_YS, KH_NAME, KH_HY,\n" +
            "            YW_LX, HTYXQ, YBY_SY,\n" +
            "            YXZ_SY, ZSY, NL_YS_DATE,\n" +
            "            YYX_CB, IS_KYXQ, KHXQ_MS,\n" +
            "            YYW_CB, HC_JG, JS_DZ,\n" +
            "            JS_ZQ, JS_MS_SJ, JLXY_PG,\n" +
            "            PG_JG, LX_YY, NOTES,\n" +
            "            HT_DYN, HT_DEN, HT_DSN,\n" +
            "            TOU_ZI, ZQKH_LX, WGJD_NAME,\n" +
            "            XJ_KD_DKS, JS_YWLX, KH_LX,\n" +
            "            GLZD_WZ, SF_CZBX, JR_SB,\n" +
            "            FGQ_DK, IS_KH_MS, GQ_YQ,\n" +
            "            C_MANAGER_LEVEL, GS_FL, FN_BZ_BM,\n" +
            "            FN_BZ_R, XJ_KD_PON_SJ, XJ_KD_PON_YS,\n" +
            "            XQ_GD_SBF, XQ_GD_GCF, XQ_GD_SCF,\n" +
            "            KC_SJF_TOUZI, GC_JLF_TOUZI, ZBH_LX_TOUZI,\n" +
            "            KD_DK_ZHZJ_SJ, KD_DK_ZHZJ_YS, OLT_TZ_SJ,\n" +
            "            OLT_TZ_YS, JHJ_TZ_SJ, JHJ_TZ_YS,\n" +
            "            SBF, AQ_SCF, PON_ZJ,\n" +
            "            JS_DZ_SJ, JS_MS_YS, SJ_WC_LS,\n" +
            "            SJ_LS_PL, SJ_PF_DATE, SJ_WT_ZQ,\n" +
            "            SJPFZZBM, SJPFOA, SG_WC_LS,\n" +
            "            SG_LS_PL, SG_YQ_ZQ, YS_JL,\n" +
            "            YS_WT, YS_TOU_ZI, XQ_GD_SBF_YS,\n" +
            "            XZ_PON, XZ_PON_EPON, XZ_PON_GPON,\n" +
            "            XZ_PON10EPON, XZ_PON10GPON, OLT_TYPE,\n" +
            "            OLT_SL, JS_JHJ, YBF,\n" +
            "            OLT_JDSL, YSR, YSRZZ,\n" +
            "            YSROA, VILLAGE_ID, PROJECT_NAME,\n" +
            "            PROJECT_CODE, GD_NAME, GD_CODE, DEAL_DATE,\n" +
            "            ATTR1, ATTR2, ATTR3,\n" +
            "            ATTR4, ATTR5, ATTR6,\n" +
            "            ATTR7, ATTR8, ATTR9,\n" +
            "            ATTR10";

    private static String tableName = "TB_YTH_PMS_PROJECT_INFO";


    public static void main(String[] args) {
        String currentValue = values.replaceAll("\n", "").replaceAll("\n", "");
        String[] split = currentValue.split(",");

        StringBuilder builder = new StringBuilder();
        builder.append("create table ").append(tableName).append(" ");
        builder.append("(");

        for (String s : split) {
            builder.append(s.trim()).append(" varchar(255)").append(",").append("\n");
        }

        builder.append(")");

        System.out.println(builder.toString());

    }
}
