package com.example;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.MsgHeader;
import com.example.entity.QuiryApproveResponse;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;

@WebService(serviceName = "QuiryProvProjectEffectSrvImplService",
        targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/"
)
public class Main {

    public QuiryApproveResponse quiryProvRemandAssessmentApprove (MsgHeader msgHeader) {
        QuiryApproveResponse quiryApproveResponse = new QuiryApproveResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setServiceList(new ArrayList<>());

        return quiryApproveResponse;
    }

    public static void main(String[] args) {
        //发布一个WebService
        String path = "http://127.0.0.1:9090/pms-service/services/QuiryProvProjectEffectSrv";
        Endpoint.publish(path, new Main());
    }
}
