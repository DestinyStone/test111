package com.example.entity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "QuiryProvProjectEffectSrv", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface QuiryProvProjectEffectSrv {

    /**
     *
     * @param stage
     * @param msgHeader
     * @param startTime
     * @param endTime
     * @param spec
     * @return
     *     returns QuiryAssessmentResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quiryProvRemandAssessment", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvRemandAssessment")
    @ResponseWrapper(localName = "quiryProvRemandAssessmentResponse", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvRemandAssessmentResponse")
    public QuiryAssessmentResponse quiryProvRemandAssessment(
            @WebParam(name = "msgHeader", targetNamespace = "")
                    MsgHeader msgHeader,
            @WebParam(name = "startTime", targetNamespace = "")
                    XMLGregorianCalendar startTime,
            @WebParam(name = "endTime", targetNamespace = "")
                    XMLGregorianCalendar endTime,
            @WebParam(name = "spec", targetNamespace = "")
                    String spec,
            @WebParam(name = "stage", targetNamespace = "")
                    String stage);

    /**
     *
     * @param msgHeader
     * @param startTime
     * @param endTime
     * @return
     *     returns QuiryProvProjectResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quiryProjectInfo", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProjectInfo")
    @ResponseWrapper(localName = "quiryProjectInfoResponse", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProjectInfoResponse")
    public QuiryProvProjectResponse quiryProjectInfo(
            @WebParam(name = "msgHeader", targetNamespace = "")
                    MsgHeader msgHeader,
            @WebParam(name = "startTime", targetNamespace = "")
                    XMLGregorianCalendar startTime,
            @WebParam(name = "endTime", targetNamespace = "")
                    XMLGregorianCalendar endTime);

    /**
     *
     * @param msgHeader
     * @param startTime
     * @param endTime
     * @param spec
     * @return
     *     returns QuiryApproveResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quiryProvRemandAssessmentApprove", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvRemandAssessmentApprove")
    @ResponseWrapper(localName = "quiryProvRemandAssessmentApproveResponse", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvRemandAssessmentApproveResponse")
    public QuiryApproveResponse quiryProvRemandAssessmentApprove(
            @WebParam(name = "msgHeader", targetNamespace = "")
                    MsgHeader msgHeader,
            @WebParam(name = "startTime", targetNamespace = "")
                    XMLGregorianCalendar startTime,
            @WebParam(name = "endTime", targetNamespace = "")
                    XMLGregorianCalendar endTime,
            @WebParam(name = "spec", targetNamespace = "")
                    String spec);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quiryProjectInfoNew", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProjectInfoNew")
    @ResponseWrapper(localName = "quiryProjectInfoNewResponse", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProjectInfoNewApproveResponse")
    public QuiryProjectInfoNewResponse quiryProjectInfoNew(
            @WebParam(name = "msgHeader", targetNamespace = "")
                    MsgHeader msgHeader,
            @WebParam(name = "startTime", targetNamespace = "")
                    XMLGregorianCalendar startTime,
            @WebParam(name = "endTime", targetNamespace = "")
                    XMLGregorianCalendar endTime);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quiryProvOrderInfoNew", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvOrderInfoNew")
    @ResponseWrapper(localName = "quiryProvOrderInfoNewResponse", targetNamespace = "http://service.pmseffectservice.sdunicomsi.com/", className = "com.example.entity.QuiryProvOrderInfoNewApproveResponse")
    public QuiryProvOrderInfoNewResponse quiryProvOrderInfoNew(
            @WebParam(name = "msgHeader", targetNamespace = "")
                    MsgHeader msgHeader,
            @WebParam(name = "startTime", targetNamespace = "")
                    XMLGregorianCalendar startTime,
            @WebParam(name = "endTime", targetNamespace = "")
                    XMLGregorianCalendar endTime);
}
