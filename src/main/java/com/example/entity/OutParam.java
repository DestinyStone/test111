package com.example.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>outParam complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="outParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outParam", propOrder = {
        "currentPage",
        "pageSize",
        "serviceFlag",
        "serviceMessage",
        "totalPage",
        "totalRecord"
})
@XmlSeeAlso({
        QuiryApproveResponse.class,
})
public class OutParam {

    protected Integer currentPage;
    protected Integer pageSize;
    protected String serviceFlag;
    protected String serviceMessage;
    protected Integer totalPage;
    protected Integer totalRecord;

    /**
     * 获取currentPage属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置currentPage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCurrentPage(Integer value) {
        this.currentPage = value;
    }

    /**
     * 获取pageSize属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * 获取serviceFlag属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceFlag() {
        return serviceFlag;
    }

    /**
     * 设置serviceFlag属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceFlag(String value) {
        this.serviceFlag = value;
    }

    /**
     * 获取serviceMessage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceMessage() {
        return serviceMessage;
    }

    /**
     * 设置serviceMessage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceMessage(String value) {
        this.serviceMessage = value;
    }

    /**
     * 获取totalPage属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * 设置totalPage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTotalPage(Integer value) {
        this.totalPage = value;
    }

    /**
     * 获取totalRecord属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    /**
     * 设置totalRecord属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTotalRecord(Integer value) {
        this.totalRecord = value;
    }

}
