package com.example.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>quiryProvRemandAssessment complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="quiryProvRemandAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgHeader" type="{http://service.pmseffectservice.sdunicomsi.com/}msgHeader" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="spec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryProvRemandAssessment", propOrder = {
        "msgHeader",
        "startTime",
        "endTime",
        "spec",
        "stage"
})
public class QuiryProvRemandAssessment {

    protected MsgHeader msgHeader;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected String spec;
    protected String stage;

    /**
     * 获取msgHeader属性的值。
     *
     * @return
     *     possible object is
     *     {@link MsgHeader }
     *
     */
    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    /**
     * 设置msgHeader属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MsgHeader }
     *
     */
    public void setMsgHeader(MsgHeader value) {
        this.msgHeader = value;
    }

    /**
     * 获取startTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * 获取spec属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置spec属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpec(String value) {
        this.spec = value;
    }

    /**
     * 获取stage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStage() {
        return stage;
    }

    /**
     * 设置stage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStage(String value) {
        this.stage = value;
    }

}
