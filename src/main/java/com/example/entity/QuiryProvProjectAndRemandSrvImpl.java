package com.example.entity;

import cn.hutool.core.util.RandomUtil;
import com.example.util.Func;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Random;

@Service
@WebService(name = "QuiryProvProjectEffectSrv",
        endpointInterface = "com.example.entity.QuiryProvProjectEffectSrv",
        targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/")
public class QuiryProvProjectAndRemandSrvImpl implements QuiryProvProjectEffectSrv {
    @Override
    public QuiryAssessmentResponse quiryProvRemandAssessment(MsgHeader msgHeader, XMLGregorianCalendar startTime, XMLGregorianCalendar endTime, String spec, String stage) {
        QuiryAssessmentResponse quiryApproveResponse = new QuiryAssessmentResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setGkServiceList(Func.generateTestData(GkAssessment.class, 20));
        quiryApproveResponse.setJkServiceList(Func.generateTestData(JkAssessment.class, 20));
        return quiryApproveResponse;
    }

    @Override
    public QuiryProvProjectResponse quiryProjectInfo(MsgHeader msgHeader, XMLGregorianCalendar startTime, XMLGregorianCalendar endTime) {
        QuiryProvProjectResponse quiryApproveResponse = new QuiryProvProjectResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setServiceList(Func.generateTestData(Project.class, 20));
        for (Project project : quiryApproveResponse.getServiceList()) {
            project.setProv(RandomUtil.randomString(20));
        }
        return quiryApproveResponse;
    }

    @Override
    @WebMethod
    public QuiryApproveResponse quiryProvRemandAssessmentApprove(MsgHeader msgHeader,
                                                                 XMLGregorianCalendar startTime,
                                                                 XMLGregorianCalendar endTime,
                                                                 String spec) {
        QuiryApproveResponse quiryApproveResponse = new QuiryApproveResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setServiceList(Func.generateTestData(AssessmentApprove.class, 20));

        return quiryApproveResponse;
    }

    @Override
    public QuiryProjectInfoNewResponse quiryProjectInfoNew(MsgHeader msgHeader, XMLGregorianCalendar startTime, XMLGregorianCalendar endTime) {
        QuiryProjectInfoNewResponse quiryApproveResponse = new QuiryProjectInfoNewResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setServiceList(Func.generateTestData(ProjectNew.class, 20));

        return quiryApproveResponse;
    }

    @Override
    public QuiryProvOrderInfoNewResponse quiryProvOrderInfoNew(MsgHeader msgHeader, XMLGregorianCalendar startTime, XMLGregorianCalendar endTime) {
        QuiryProvOrderInfoNewResponse quiryApproveResponse = new QuiryProvOrderInfoNewResponse();
        quiryApproveResponse.setCurrentPage(1);
        quiryApproveResponse.setTotalPage(10);
        quiryApproveResponse.setServiceList(Func.generateTestData(OrderInfoNew.class, 20));

        return quiryApproveResponse;
    }
}
