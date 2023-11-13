package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryProjectInfoNewApproveResponse", propOrder = {
        "_return"
})
public class QuiryProjectInfoNewApproveResponse {
    @XmlElement(name = "return")
    protected QuiryProjectInfoNewResponse _return;

    /**
     * 获取return属性的值。
     *
     * @return
     *     possible object is
     *     {@link QuiryProjectInfoNewResponse }
     *
     */
    public QuiryProjectInfoNewResponse getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link QuiryProjectInfoNewResponse }
     *
     */
    public void setReturn(QuiryProjectInfoNewResponse value) {
        this._return = value;
    }
}
