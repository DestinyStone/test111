package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryProvOrderInfoNewApproveResponse", propOrder = {
        "_return"
})
public class QuiryProvOrderInfoNewApproveResponse {
    @XmlElement(name = "return")
    protected QuiryProvOrderInfoNewResponse _return;

    /**
     * 获取return属性的值。
     *
     * @return
     *     possible object is
     *     {@link QuiryProvOrderInfoNewResponse }
     *
     */
    public QuiryProvOrderInfoNewResponse getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link QuiryProvOrderInfoNewResponse }
     *
     */
    public void setReturn(QuiryProvOrderInfoNewResponse value) {
        this._return = value;
    }
}
