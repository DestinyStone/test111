package com.example.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>assessmentApprove complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="assessmentApprove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procsinstid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentApprove", propOrder = {
        "beginTime",
        "createEmail",
        "createName",
        "createTime",
        "linkName",
        "opAdvice",
        "orgName",
        "procsinstid"
})
public class AssessmentApprove {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    protected String createEmail;
    protected String createName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String linkName;
    protected String opAdvice;
    protected String orgName;
    protected Long procsinstid;

    /**
     * 获取beginTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * 获取createEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateEmail() {
        return createEmail;
    }

    /**
     * 设置createEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateEmail(String value) {
        this.createEmail = value;
    }

    /**
     * 获取createName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置createName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateName(String value) {
        this.createName = value;
    }

    /**
     * 获取createTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * 获取linkName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * 设置linkName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * 获取opAdvice属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOpAdvice() {
        return opAdvice;
    }

    /**
     * 设置opAdvice属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOpAdvice(String value) {
        this.opAdvice = value;
    }

    /**
     * 获取orgName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置orgName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * 获取procsinstid属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getProcsinstid() {
        return procsinstid;
    }

    /**
     * 设置procsinstid属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setProcsinstid(Long value) {
        this.procsinstid = value;
    }

}
