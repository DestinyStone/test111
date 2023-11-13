package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RunWith(SpringRunner.class)
public class ProjectBaseInfoTask {

    /**
     * PMS3.0系统授权码
     **/
    @Value("${pms.systemId}")
    private String systemId;

    /**
     * PMS3.0系统名
     **/
    @Value("${pms.systemName}")
    private String systemName;

    @Test
    public void test() throws DatatypeConfigurationException {

//        // 日期处理
//        Calendar instance = Calendar.getInstance();
//        GregorianCalendar start = new GregorianCalendar();
//        int year = instance.get(Calendar.YEAR);
//        int monthNum = instance.get(Calendar.MONTH) + 1;
//        String month = monthNum >= 10 ? "" + monthNum : "0" + monthNum;
//        int dayNum = instance.get(Calendar.DAY_OF_MONTH);
//        String day = dayNum >= 10 ? "" + dayNum : "0" + dayNum;
//        start.add(Calendar.DATE, -1);
//
//        QuiryProvProjectEffectSrvImplService locator = new QuiryProvProjectEffectSrvImplService();
//        QuiryProvProjectEffectSrv service = locator.getQuiryProvProjectEffectSrvImplPort();
//
//        // 拼装请求参数
//        int requsetPageSize = 1000;
//        int requestCurrentPage = 1;
//
//        MsgHeader msgHeader = new MsgHeader();
//        msgHeader.setSourceSystemId(systemId);
//        msgHeader.setSourceSystemName(systemName);
//        msgHeader.setPageSize(requsetPageSize);
//        msgHeader.setCurrentPage(requestCurrentPage);
//
//        XMLGregorianCalendar startTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(start);
//
//        XMLGregorianCalendar endTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(start);
//
//        // 查询pms数据
//        QuiryProvProjectResponse quiryProvProjectResponse = service.quiryProjectInfo(msgHeader, startTime, endTime);
//        System.out.println(quiryProvProjectResponse);

    }
}
