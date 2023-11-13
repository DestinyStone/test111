package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryProvRemandAssessmentApproveResponse", propOrder = {
        "_return"
})
public class QuiryProvRemandAssessmentApproveResponse {

    @XmlElement(name = "return")
    protected QuiryApproveResponse _return;

    /**
     * 获取return属性的值。
     *
     * @return
     *     possible object is
     *     {@link QuiryApproveResponse }
     *
     */
    public QuiryApproveResponse getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link QuiryApproveResponse }
     *
     */
    public void setReturn(QuiryApproveResponse value) {
        this._return = value;
    }

}
