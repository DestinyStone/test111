package com.example.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _QuiryProvRemandAssessmentApprove_QNAME = new QName("http://service.pmseffectservice.sdunicomsi.com/", "quiryProvRemandAssessmentApprove");
    private final static QName _QuiryProvRemandAssessmentApproveResponse_QNAME = new QName("http://service.pmseffectservice.sdunicomsi.com/", "quiryProvRemandAssessmentApproveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hx.timing.tasks.pms.yjs.other
     *
     */
    public ObjectFactory() {
    }


    /**
     * Create an instance of {@link QuiryProvRemandAssessmentApproveResponse }
     *
     */
    public QuiryProvRemandAssessmentApproveResponse createQuiryProvRemandAssessmentApproveResponse() {
        return new QuiryProvRemandAssessmentApproveResponse();
    }


    /**
     * Create an instance of {@link QuiryProvRemandAssessmentApprove }
     *
     */
    public QuiryProvRemandAssessmentApprove createQuiryProvRemandAssessmentApprove() {
        return new QuiryProvRemandAssessmentApprove();
    }


    /**
     * Create an instance of {@link MsgHeader }
     *
     */
    public MsgHeader createMsgHeader() {
        return new MsgHeader();
    }



    /**
     * Create an instance of {@link AssessmentApprove }
     *
     */
    public AssessmentApprove createAssessmentApprove() {
        return new AssessmentApprove();
    }


    /**
     * Create an instance of {@link OutParam }
     *
     */
    public OutParam createOutParam() {
        return new OutParam();
    }

    /**
     * Create an instance of {@link QuiryApproveResponse }
     *
     */
    public QuiryApproveResponse createQuiryApproveResponse() {
        return new QuiryApproveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuiryProvRemandAssessmentApprove }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.pmseffectservice.sdunicomsi.com/", name = "quiryProvRemandAssessmentApprove")
    public JAXBElement<QuiryProvRemandAssessmentApprove> createQuiryProvRemandAssessmentApprove(QuiryProvRemandAssessmentApprove value) {
        return new JAXBElement<QuiryProvRemandAssessmentApprove>(_QuiryProvRemandAssessmentApprove_QNAME, QuiryProvRemandAssessmentApprove.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuiryProvRemandAssessmentApproveResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.pmseffectservice.sdunicomsi.com/", name = "quiryProvRemandAssessmentApproveResponse")
    public JAXBElement<QuiryProvRemandAssessmentApproveResponse> createQuiryProvRemandAssessmentApproveResponse(QuiryProvRemandAssessmentApproveResponse value) {
        return new JAXBElement<QuiryProvRemandAssessmentApproveResponse>(_QuiryProvRemandAssessmentApproveResponse_QNAME, QuiryProvRemandAssessmentApproveResponse.class, null, value);
    }



}
