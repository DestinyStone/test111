package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgHeader", propOrder = {
        "sourceSystemId",
        "sourceSystemName",
        "pageSize",
        "currentPage"
})
public class MsgHeader {

    protected String sourceSystemId;
    protected String sourceSystemName;
    protected Integer pageSize;
    protected Integer currentPage;

    /**
     * 获取sourceSystemId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * 设置sourceSystemId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceSystemId(String value) {
        this.sourceSystemId = value;
    }

    /**
     * 获取sourceSystemName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceSystemName() {
        return sourceSystemName;
    }

    /**
     * 设置sourceSystemName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceSystemName(String value) {
        this.sourceSystemName = value;
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

}

