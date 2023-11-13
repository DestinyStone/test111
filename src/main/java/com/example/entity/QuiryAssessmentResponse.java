package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryAssessmentResponse", propOrder = {
        "currentPage",
        "gkServiceList",
        "jkServiceList",
        "pageSize",
        "serviceFlag",
        "serviceMessage",
        "totalPage",
        "totalRecord"
})
public class QuiryAssessmentResponse {

    protected Integer currentPage;
    @XmlElement(nillable = true)
    protected List<GkAssessment> gkServiceList;
    @XmlElement(nillable = true)
    protected List<JkAssessment> jkServiceList;
    protected Integer pageSize;
    protected String serviceFlag;
    protected String serviceMessage;
    protected Integer totalPage;
    protected Integer totalRecord;


    public void setGkServiceList(List<GkAssessment> gkServiceList) {
        this.gkServiceList = gkServiceList;
    }

    public void setJkServiceList(List<JkAssessment> jkServiceList) {
        this.jkServiceList = jkServiceList;
    }

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
     * Gets the value of the gkServiceList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gkServiceList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGkServiceList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GkAssessment }
     *
     *
     */
    public List<GkAssessment> getGkServiceList() {
        if (gkServiceList == null) {
            gkServiceList = new ArrayList<GkAssessment>();
        }
        return this.gkServiceList;
    }

    /**
     * Gets the value of the jkServiceList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jkServiceList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJkServiceList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JkAssessment }
     *
     *
     */
    public List<JkAssessment> getJkServiceList() {
        if (jkServiceList == null) {
            jkServiceList = new ArrayList<JkAssessment>();
        }
        return this.jkServiceList;
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


    @Override
    public String toString() {
        return "QuiryAssessmentResponse{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", serviceFlag='" + serviceFlag + '\'' +
                ", serviceMessage='" + serviceMessage + '\'' +
                ", totalPage=" + totalPage +
                ", totalRecord=" + totalRecord +
                '}';
    }
}