package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", propOrder = {
        "actualFinishDate",
        "actualStartTime",
        "approveType",
        "arrivalDate",
        "attr1",
        "attr2",
        "attr3",
        "attr4",
        "attr5",
        "autoType",
        "bulidScene",
        "carryOverTouzi",
        "carryOverYear",
        "checkType",
        "city",
        "createdEmail",
        "createdName",
        "custAttr",
        "cyTouzi",
        "disDept",
        "disUnit",
        "disYear",
        "erpCapex",
        "erpPorjState",
        "finalDate",
        "inspectionDate",
        "isCarryOver",
        "isEpc",
        "isJtmdz",
        "isLightChange",
        "isPurchase",
        "isService",
        "isSociety",
        "isTwoPdm",
        "kyCapex",
        "kyCreatedApproveDate",
        "kyCreatedDate",
        "kyDate",
        "kyDelegationDate",
        "kyDelegationPartner",
        "kyDelegationStaff",
        "kyDelegationStaffPhone",
        "kyReplymanEmail",
        "kyReplymanName",
        "kySn",
        "kyTouZi",
        "legalSubject",
        "lxCapex",
        "lxCreatedApproveDate",
        "lxCreatedDate",
        "lxDate",
        "lxReplymanEmail",
        "lxReplymanName",
        "lxSn",
        "lxTouZi",
        "manageAttr",
        "manageType",
        "managerEmail",
        "managerName",
        "moneySource",
        "moneyType",
        "networkLevel",
        "outputDate",
        "planCyTime",
        "planFinishTime",
        "planStartTime",
        "planYsTime",
        "planZyTime",
        "postDisaster",
        "projectCode",
        "projectId",
        "projectName",
        "projectPolicy",
        "projectState",
        "projectTrial",
        "projectType",
        "property",
        "prov",
        "remandUnit",
        "sjCapex",
        "sjCreatedApproveDate",
        "sjCreatedDate",
        "sjDate",
        "sjDelegationDate",
        "sjDelegationPartner",
        "sjDelegationStaff",
        "sjDelegationStaffPhone",
        "sjReplymanEmail",
        "sjReplymanName",
        "sjSn",
        "sjTouZi",
        "specA",
        "specB",
        "specC",
        "specManage",
        "touziSubject",
        "ysDate",
        "ysTouzi",
        "zxCapex",
        "zxTouZi",
        "zyTouzi"
})
public class Project {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualFinishDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartTime;
    protected String approveType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    protected String attr1;
    protected String attr2;
    protected String attr3;
    protected String attr4;
    protected String attr5;
    protected String autoType;
    protected String bulidScene;
    protected BigDecimal carryOverTouzi;
    protected String carryOverYear;
    protected String checkType;
    protected String city;
    protected String createdEmail;
    protected String createdName;
    protected String custAttr;
    protected BigDecimal cyTouzi;
    protected String disDept;
    protected String disUnit;
    protected String disYear;
    protected BigDecimal erpCapex;
    protected String erpPorjState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectionDate;
    protected String isCarryOver;
    protected String isEpc;
    protected String isJtmdz;
    protected String isLightChange;
    protected String isPurchase;
    protected String isService;
    protected String isSociety;
    protected String isTwoPdm;
    protected BigDecimal kyCapex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kyCreatedApproveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kyCreatedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kyDate;
    protected String kyDelegationDate;
    protected String kyDelegationPartner;
    protected String kyDelegationStaff;
    protected String kyDelegationStaffPhone;
    protected String kyReplymanEmail;
    protected String kyReplymanName;
    protected String kySn;
    protected BigDecimal kyTouZi;
    protected String legalSubject;
    protected BigDecimal lxCapex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lxCreatedApproveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lxCreatedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lxDate;
    protected String lxReplymanEmail;
    protected String lxReplymanName;
    protected String lxSn;
    protected BigDecimal lxTouZi;
    protected String manageAttr;
    protected String manageType;
    protected String managerEmail;
    protected String managerName;
    protected String moneySource;
    protected String moneyType;
    protected String networkLevel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outputDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planCyTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planFinishTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planStartTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planYsTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planZyTime;
    protected String postDisaster;
    protected String projectCode;
    protected BigDecimal projectId;
    protected String projectName;
    protected String projectPolicy;
    protected String projectState;
    protected String projectTrial;
    protected String projectType;
    protected String property;
    protected String prov;
    protected String remandUnit;
    protected BigDecimal sjCapex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sjCreatedApproveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sjCreatedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sjDate;
    protected String sjDelegationDate;
    protected String sjDelegationPartner;
    protected String sjDelegationStaff;
    protected String sjDelegationStaffPhone;
    protected String sjReplymanEmail;
    protected String sjReplymanName;
    protected String sjSn;
    protected BigDecimal sjTouZi;
    protected String specA;
    protected String specB;
    protected String specC;
    protected String specManage;
    protected String touziSubject;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ysDate;
    protected BigDecimal ysTouzi;
    protected BigDecimal zxCapex;
    protected BigDecimal zxTouZi;
    protected BigDecimal zyTouzi;

    /**
     * 获取actualFinishDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getActualFinishDate() {
        return actualFinishDate;
    }

    /**
     * 设置actualFinishDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setActualFinishDate(XMLGregorianCalendar value) {
        this.actualFinishDate = value;
    }

    /**
     * 获取actualStartTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getActualStartTime() {
        return actualStartTime;
    }

    /**
     * 设置actualStartTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setActualStartTime(XMLGregorianCalendar value) {
        this.actualStartTime = value;
    }

    /**
     * 获取approveType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApproveType() {
        return approveType;
    }

    /**
     * 设置approveType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApproveType(String value) {
        this.approveType = value;
    }

    /**
     * 获取arrivalDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 设置arrivalDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * 获取attr1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttr1() {
        return attr1;
    }

    /**
     * 设置attr1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttr1(String value) {
        this.attr1 = value;
    }

    /**
     * 获取attr2属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttr2() {
        return attr2;
    }

    /**
     * 设置attr2属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttr2(String value) {
        this.attr2 = value;
    }

    /**
     * 获取attr3属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttr3() {
        return attr3;
    }

    /**
     * 设置attr3属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttr3(String value) {
        this.attr3 = value;
    }

    /**
     * 获取attr4属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttr4() {
        return attr4;
    }

    /**
     * 设置attr4属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttr4(String value) {
        this.attr4 = value;
    }

    /**
     * 获取attr5属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttr5() {
        return attr5;
    }

    /**
     * 设置attr5属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttr5(String value) {
        this.attr5 = value;
    }

    /**
     * 获取autoType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAutoType() {
        return autoType;
    }

    /**
     * 设置autoType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAutoType(String value) {
        this.autoType = value;
    }

    /**
     * 获取bulidScene属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBulidScene() {
        return bulidScene;
    }

    /**
     * 设置bulidScene属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBulidScene(String value) {
        this.bulidScene = value;
    }

    /**
     * 获取carryOverTouzi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCarryOverTouzi() {
        return carryOverTouzi;
    }

    /**
     * 设置carryOverTouzi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCarryOverTouzi(BigDecimal value) {
        this.carryOverTouzi = value;
    }

    /**
     * 获取carryOverYear属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCarryOverYear() {
        return carryOverYear;
    }

    /**
     * 设置carryOverYear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCarryOverYear(String value) {
        this.carryOverYear = value;
    }

    /**
     * 获取checkType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckType() {
        return checkType;
    }

    /**
     * 设置checkType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckType(String value) {
        this.checkType = value;
    }

    /**
     * 获取city属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取createdEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedEmail() {
        return createdEmail;
    }

    /**
     * 设置createdEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedEmail(String value) {
        this.createdEmail = value;
    }

    /**
     * 获取createdName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * 设置createdName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedName(String value) {
        this.createdName = value;
    }

    /**
     * 获取custAttr属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustAttr() {
        return custAttr;
    }

    /**
     * 设置custAttr属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustAttr(String value) {
        this.custAttr = value;
    }

    /**
     * 获取cyTouzi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCyTouzi() {
        return cyTouzi;
    }

    /**
     * 设置cyTouzi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCyTouzi(BigDecimal value) {
        this.cyTouzi = value;
    }

    /**
     * 获取disDept属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisDept() {
        return disDept;
    }

    /**
     * 设置disDept属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisDept(String value) {
        this.disDept = value;
    }

    /**
     * 获取disUnit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisUnit() {
        return disUnit;
    }

    /**
     * 设置disUnit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisUnit(String value) {
        this.disUnit = value;
    }

    /**
     * 获取disYear属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisYear() {
        return disYear;
    }

    /**
     * 设置disYear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisYear(String value) {
        this.disYear = value;
    }

    /**
     * 获取erpCapex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getErpCapex() {
        return erpCapex;
    }

    /**
     * 设置erpCapex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setErpCapex(BigDecimal value) {
        this.erpCapex = value;
    }

    /**
     * 获取erpPorjState属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErpPorjState() {
        return erpPorjState;
    }

    /**
     * 设置erpPorjState属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErpPorjState(String value) {
        this.erpPorjState = value;
    }

    /**
     * 获取finalDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFinalDate() {
        return finalDate;
    }

    /**
     * 设置finalDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFinalDate(XMLGregorianCalendar value) {
        this.finalDate = value;
    }

    /**
     * 获取inspectionDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInspectionDate() {
        return inspectionDate;
    }

    /**
     * 设置inspectionDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInspectionDate(XMLGregorianCalendar value) {
        this.inspectionDate = value;
    }

    /**
     * 获取isCarryOver属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsCarryOver() {
        return isCarryOver;
    }

    /**
     * 设置isCarryOver属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsCarryOver(String value) {
        this.isCarryOver = value;
    }

    /**
     * 获取isEpc属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsEpc() {
        return isEpc;
    }

    /**
     * 设置isEpc属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsEpc(String value) {
        this.isEpc = value;
    }

    /**
     * 获取isJtmdz属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsJtmdz() {
        return isJtmdz;
    }

    /**
     * 设置isJtmdz属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsJtmdz(String value) {
        this.isJtmdz = value;
    }

    /**
     * 获取isLightChange属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsLightChange() {
        return isLightChange;
    }

    /**
     * 设置isLightChange属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsLightChange(String value) {
        this.isLightChange = value;
    }

    /**
     * 获取isPurchase属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsPurchase() {
        return isPurchase;
    }

    /**
     * 设置isPurchase属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsPurchase(String value) {
        this.isPurchase = value;
    }

    /**
     * 获取isService属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsService() {
        return isService;
    }

    /**
     * 设置isService属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsService(String value) {
        this.isService = value;
    }

    /**
     * 获取isSociety属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsSociety() {
        return isSociety;
    }

    /**
     * 设置isSociety属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsSociety(String value) {
        this.isSociety = value;
    }

    /**
     * 获取isTwoPdm属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsTwoPdm() {
        return isTwoPdm;
    }

    /**
     * 设置isTwoPdm属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsTwoPdm(String value) {
        this.isTwoPdm = value;
    }

    /**
     * 获取kyCapex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getKyCapex() {
        return kyCapex;
    }

    /**
     * 设置kyCapex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setKyCapex(BigDecimal value) {
        this.kyCapex = value;
    }

    /**
     * 获取kyCreatedApproveDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getKyCreatedApproveDate() {
        return kyCreatedApproveDate;
    }

    /**
     * 设置kyCreatedApproveDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setKyCreatedApproveDate(XMLGregorianCalendar value) {
        this.kyCreatedApproveDate = value;
    }

    /**
     * 获取kyCreatedDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getKyCreatedDate() {
        return kyCreatedDate;
    }

    /**
     * 设置kyCreatedDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setKyCreatedDate(XMLGregorianCalendar value) {
        this.kyCreatedDate = value;
    }

    /**
     * 获取kyDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getKyDate() {
        return kyDate;
    }

    /**
     * 设置kyDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setKyDate(XMLGregorianCalendar value) {
        this.kyDate = value;
    }

    /**
     * 获取kyDelegationDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyDelegationDate() {
        return kyDelegationDate;
    }

    /**
     * 设置kyDelegationDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyDelegationDate(String value) {
        this.kyDelegationDate = value;
    }

    /**
     * 获取kyDelegationPartner属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyDelegationPartner() {
        return kyDelegationPartner;
    }

    /**
     * 设置kyDelegationPartner属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyDelegationPartner(String value) {
        this.kyDelegationPartner = value;
    }

    /**
     * 获取kyDelegationStaff属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyDelegationStaff() {
        return kyDelegationStaff;
    }

    /**
     * 设置kyDelegationStaff属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyDelegationStaff(String value) {
        this.kyDelegationStaff = value;
    }

    /**
     * 获取kyDelegationStaffPhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyDelegationStaffPhone() {
        return kyDelegationStaffPhone;
    }

    /**
     * 设置kyDelegationStaffPhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyDelegationStaffPhone(String value) {
        this.kyDelegationStaffPhone = value;
    }

    /**
     * 获取kyReplymanEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyReplymanEmail() {
        return kyReplymanEmail;
    }

    /**
     * 设置kyReplymanEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyReplymanEmail(String value) {
        this.kyReplymanEmail = value;
    }

    /**
     * 获取kyReplymanName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKyReplymanName() {
        return kyReplymanName;
    }

    /**
     * 设置kyReplymanName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKyReplymanName(String value) {
        this.kyReplymanName = value;
    }

    /**
     * 获取kySn属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKySn() {
        return kySn;
    }

    /**
     * 设置kySn属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKySn(String value) {
        this.kySn = value;
    }

    /**
     * 获取kyTouZi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getKyTouZi() {
        return kyTouZi;
    }

    /**
     * 设置kyTouZi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setKyTouZi(BigDecimal value) {
        this.kyTouZi = value;
    }

    /**
     * 获取legalSubject属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLegalSubject() {
        return legalSubject;
    }

    /**
     * 设置legalSubject属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLegalSubject(String value) {
        this.legalSubject = value;
    }

    /**
     * 获取lxCapex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLxCapex() {
        return lxCapex;
    }

    /**
     * 设置lxCapex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLxCapex(BigDecimal value) {
        this.lxCapex = value;
    }

    /**
     * 获取lxCreatedApproveDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLxCreatedApproveDate() {
        return lxCreatedApproveDate;
    }

    /**
     * 设置lxCreatedApproveDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLxCreatedApproveDate(XMLGregorianCalendar value) {
        this.lxCreatedApproveDate = value;
    }

    /**
     * 获取lxCreatedDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLxCreatedDate() {
        return lxCreatedDate;
    }

    /**
     * 设置lxCreatedDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLxCreatedDate(XMLGregorianCalendar value) {
        this.lxCreatedDate = value;
    }

    /**
     * 获取lxDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLxDate() {
        return lxDate;
    }

    /**
     * 设置lxDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLxDate(XMLGregorianCalendar value) {
        this.lxDate = value;
    }

    /**
     * 获取lxReplymanEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLxReplymanEmail() {
        return lxReplymanEmail;
    }

    /**
     * 设置lxReplymanEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLxReplymanEmail(String value) {
        this.lxReplymanEmail = value;
    }

    /**
     * 获取lxReplymanName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLxReplymanName() {
        return lxReplymanName;
    }

    /**
     * 设置lxReplymanName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLxReplymanName(String value) {
        this.lxReplymanName = value;
    }

    /**
     * 获取lxSn属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLxSn() {
        return lxSn;
    }

    /**
     * 设置lxSn属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLxSn(String value) {
        this.lxSn = value;
    }

    /**
     * 获取lxTouZi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLxTouZi() {
        return lxTouZi;
    }

    /**
     * 设置lxTouZi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLxTouZi(BigDecimal value) {
        this.lxTouZi = value;
    }

    /**
     * 获取manageAttr属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageAttr() {
        return manageAttr;
    }

    /**
     * 设置manageAttr属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageAttr(String value) {
        this.manageAttr = value;
    }

    /**
     * 获取manageType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageType() {
        return manageType;
    }

    /**
     * 设置manageType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageType(String value) {
        this.manageType = value;
    }

    /**
     * 获取managerEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManagerEmail() {
        return managerEmail;
    }

    /**
     * 设置managerEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManagerEmail(String value) {
        this.managerEmail = value;
    }

    /**
     * 获取managerName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * 设置managerName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManagerName(String value) {
        this.managerName = value;
    }

    /**
     * 获取moneySource属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMoneySource() {
        return moneySource;
    }

    /**
     * 设置moneySource属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMoneySource(String value) {
        this.moneySource = value;
    }

    /**
     * 获取moneyType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMoneyType() {
        return moneyType;
    }

    /**
     * 设置moneyType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMoneyType(String value) {
        this.moneyType = value;
    }

    /**
     * 获取networkLevel属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNetworkLevel() {
        return networkLevel;
    }

    /**
     * 设置networkLevel属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNetworkLevel(String value) {
        this.networkLevel = value;
    }

    /**
     * 获取outputDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getOutputDate() {
        return outputDate;
    }

    /**
     * 设置outputDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setOutputDate(XMLGregorianCalendar value) {
        this.outputDate = value;
    }

    /**
     * 获取planCyTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlanCyTime() {
        return planCyTime;
    }

    /**
     * 设置planCyTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlanCyTime(XMLGregorianCalendar value) {
        this.planCyTime = value;
    }

    /**
     * 获取planFinishTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlanFinishTime() {
        return planFinishTime;
    }

    /**
     * 设置planFinishTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlanFinishTime(XMLGregorianCalendar value) {
        this.planFinishTime = value;
    }

    /**
     * 获取planStartTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlanStartTime() {
        return planStartTime;
    }

    /**
     * 设置planStartTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlanStartTime(XMLGregorianCalendar value) {
        this.planStartTime = value;
    }

    /**
     * 获取planYsTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlanYsTime() {
        return planYsTime;
    }

    /**
     * 设置planYsTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlanYsTime(XMLGregorianCalendar value) {
        this.planYsTime = value;
    }

    /**
     * 获取planZyTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlanZyTime() {
        return planZyTime;
    }

    /**
     * 设置planZyTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlanZyTime(XMLGregorianCalendar value) {
        this.planZyTime = value;
    }

    /**
     * 获取postDisaster属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostDisaster() {
        return postDisaster;
    }

    /**
     * 设置postDisaster属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostDisaster(String value) {
        this.postDisaster = value;
    }

    /**
     * 获取projectCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置projectCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * 获取projectId属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getProjectId() {
        return projectId;
    }

    /**
     * 设置projectId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setProjectId(BigDecimal value) {
        this.projectId = value;
    }

    /**
     * 获取projectName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置projectName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * 获取projectPolicy属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectPolicy() {
        return projectPolicy;
    }

    /**
     * 设置projectPolicy属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectPolicy(String value) {
        this.projectPolicy = value;
    }

    /**
     * 获取projectState属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectState() {
        return projectState;
    }

    /**
     * 设置projectState属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectState(String value) {
        this.projectState = value;
    }

    /**
     * 获取projectTrial属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectTrial() {
        return projectTrial;
    }

    /**
     * 设置projectTrial属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectTrial(String value) {
        this.projectTrial = value;
    }

    /**
     * 获取projectType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置projectType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectType(String value) {
        this.projectType = value;
    }

    /**
     * 获取property属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * 获取prov属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProv() {
        return prov;
    }

    /**
     * 设置prov属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProv(String value) {
        this.prov = value;
    }

    /**
     * 获取remandUnit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemandUnit() {
        return remandUnit;
    }

    /**
     * 设置remandUnit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemandUnit(String value) {
        this.remandUnit = value;
    }

    /**
     * 获取sjCapex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSjCapex() {
        return sjCapex;
    }

    /**
     * 设置sjCapex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSjCapex(BigDecimal value) {
        this.sjCapex = value;
    }

    /**
     * 获取sjCreatedApproveDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSjCreatedApproveDate() {
        return sjCreatedApproveDate;
    }

    /**
     * 设置sjCreatedApproveDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSjCreatedApproveDate(XMLGregorianCalendar value) {
        this.sjCreatedApproveDate = value;
    }

    /**
     * 获取sjCreatedDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSjCreatedDate() {
        return sjCreatedDate;
    }

    /**
     * 设置sjCreatedDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSjCreatedDate(XMLGregorianCalendar value) {
        this.sjCreatedDate = value;
    }

    /**
     * 获取sjDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSjDate() {
        return sjDate;
    }

    /**
     * 设置sjDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSjDate(XMLGregorianCalendar value) {
        this.sjDate = value;
    }

    /**
     * 获取sjDelegationDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjDelegationDate() {
        return sjDelegationDate;
    }

    /**
     * 设置sjDelegationDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjDelegationDate(String value) {
        this.sjDelegationDate = value;
    }

    /**
     * 获取sjDelegationPartner属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjDelegationPartner() {
        return sjDelegationPartner;
    }

    /**
     * 设置sjDelegationPartner属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjDelegationPartner(String value) {
        this.sjDelegationPartner = value;
    }

    /**
     * 获取sjDelegationStaff属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjDelegationStaff() {
        return sjDelegationStaff;
    }

    /**
     * 设置sjDelegationStaff属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjDelegationStaff(String value) {
        this.sjDelegationStaff = value;
    }

    /**
     * 获取sjDelegationStaffPhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjDelegationStaffPhone() {
        return sjDelegationStaffPhone;
    }

    /**
     * 设置sjDelegationStaffPhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjDelegationStaffPhone(String value) {
        this.sjDelegationStaffPhone = value;
    }

    /**
     * 获取sjReplymanEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjReplymanEmail() {
        return sjReplymanEmail;
    }

    /**
     * 设置sjReplymanEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjReplymanEmail(String value) {
        this.sjReplymanEmail = value;
    }

    /**
     * 获取sjReplymanName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjReplymanName() {
        return sjReplymanName;
    }

    /**
     * 设置sjReplymanName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjReplymanName(String value) {
        this.sjReplymanName = value;
    }

    /**
     * 获取sjSn属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSjSn() {
        return sjSn;
    }

    /**
     * 设置sjSn属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSjSn(String value) {
        this.sjSn = value;
    }

    /**
     * 获取sjTouZi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSjTouZi() {
        return sjTouZi;
    }

    /**
     * 设置sjTouZi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSjTouZi(BigDecimal value) {
        this.sjTouZi = value;
    }

    /**
     * 获取specA属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecA() {
        return specA;
    }

    /**
     * 设置specA属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecA(String value) {
        this.specA = value;
    }

    /**
     * 获取specB属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecB() {
        return specB;
    }

    /**
     * 设置specB属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecB(String value) {
        this.specB = value;
    }

    /**
     * 获取specC属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecC() {
        return specC;
    }

    /**
     * 设置specC属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecC(String value) {
        this.specC = value;
    }

    /**
     * 获取specManage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecManage() {
        return specManage;
    }

    /**
     * 设置specManage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecManage(String value) {
        this.specManage = value;
    }

    /**
     * 获取touziSubject属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTouziSubject() {
        return touziSubject;
    }

    /**
     * 设置touziSubject属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTouziSubject(String value) {
        this.touziSubject = value;
    }

    /**
     * 获取ysDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getYsDate() {
        return ysDate;
    }

    /**
     * 设置ysDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setYsDate(XMLGregorianCalendar value) {
        this.ysDate = value;
    }

    /**
     * 获取ysTouzi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getYsTouzi() {
        return ysTouzi;
    }

    /**
     * 设置ysTouzi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setYsTouzi(BigDecimal value) {
        this.ysTouzi = value;
    }

    /**
     * 获取zxCapex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getZxCapex() {
        return zxCapex;
    }

    /**
     * 设置zxCapex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setZxCapex(BigDecimal value) {
        this.zxCapex = value;
    }

    /**
     * 获取zxTouZi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getZxTouZi() {
        return zxTouZi;
    }

    /**
     * 设置zxTouZi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setZxTouZi(BigDecimal value) {
        this.zxTouZi = value;
    }

    /**
     * 获取zyTouzi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getZyTouzi() {
        return zyTouzi;
    }

    /**
     * 设置zyTouzi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setZyTouzi(BigDecimal value) {
        this.zyTouzi = value;
    }


    @Override
    public String toString() {
        return "Project{" +
                "actualFinishDate=" + actualFinishDate +
                ", actualStartTime=" + actualStartTime +
                ", approveType='" + approveType + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", autoType='" + autoType + '\'' +
                ", bulidScene='" + bulidScene + '\'' +
                ", carryOverTouzi=" + carryOverTouzi +
                ", carryOverYear='" + carryOverYear + '\'' +
                ", checkType='" + checkType + '\'' +
                ", city='" + city + '\'' +
                ", createdEmail='" + createdEmail + '\'' +
                ", createdName='" + createdName + '\'' +
                ", custAttr='" + custAttr + '\'' +
                ", cyTouzi=" + cyTouzi +
                ", disDept='" + disDept + '\'' +
                ", disUnit='" + disUnit + '\'' +
                ", disYear='" + disYear + '\'' +
                ", finalDate=" + finalDate +
                ", inspectionDate=" + inspectionDate +
                ", isCarryOver='" + isCarryOver + '\'' +
                ", isEpc='" + isEpc + '\'' +
                ", isJtmdz='" + isJtmdz + '\'' +
                ", isLightChange='" + isLightChange + '\'' +
                ", isPurchase='" + isPurchase + '\'' +
                ", isService='" + isService + '\'' +
                ", isSociety='" + isSociety + '\'' +
                ", isTwoPdm='" + isTwoPdm + '\'' +
                ", kyCapex=" + kyCapex +
                ", kyCreatedApproveDate=" + kyCreatedApproveDate +
                ", kyCreatedDate=" + kyCreatedDate +
                ", kyDate=" + kyDate +
                ", kyDelegationDate='" + kyDelegationDate + '\'' +
                ", kyDelegationPartner='" + kyDelegationPartner + '\'' +
                ", kyDelegationStaff='" + kyDelegationStaff + '\'' +
                ", kyDelegationStaffPhone='" + kyDelegationStaffPhone + '\'' +
                ", kyReplymanEmail='" + kyReplymanEmail + '\'' +
                ", kyReplymanName='" + kyReplymanName + '\'' +
                ", kySn='" + kySn + '\'' +
                ", kyTouZi=" + kyTouZi +
                ", legalSubject='" + legalSubject + '\'' +
                ", lxCapex=" + lxCapex +
                ", lxCreatedApproveDate=" + lxCreatedApproveDate +
                ", lxCreatedDate=" + lxCreatedDate +
                ", lxDate=" + lxDate +
                ", lxReplymanEmail='" + lxReplymanEmail + '\'' +
                ", lxReplymanName='" + lxReplymanName + '\'' +
                ", lxSn='" + lxSn + '\'' +
                ", lxTouZi=" + lxTouZi +
                ", manageAttr='" + manageAttr + '\'' +
                ", manageType='" + manageType + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", managerName='" + managerName + '\'' +
                ", moneySource='" + moneySource + '\'' +
                ", moneyType='" + moneyType + '\'' +
                ", networkLevel='" + networkLevel + '\'' +
                ", outputDate=" + outputDate +
                ", planCyTime=" + planCyTime +
                ", planFinishTime=" + planFinishTime +
                ", planStartTime=" + planStartTime +
                ", planYsTime=" + planYsTime +
                ", planZyTime=" + planZyTime +
                ", postDisaster='" + postDisaster + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectPolicy='" + projectPolicy + '\'' +
                ", projectState='" + projectState + '\'' +
                ", projectTrial='" + projectTrial + '\'' +
                ", property='" + property + '\'' +
                ", prov='" + prov + '\'' +
                ", remandUnit='" + remandUnit + '\'' +
                ", sjCapex=" + sjCapex +
                ", sjCreatedApproveDate=" + sjCreatedApproveDate +
                ", sjCreatedDate=" + sjCreatedDate +
                ", sjDate=" + sjDate +
                ", sjDelegationDate='" + sjDelegationDate + '\'' +
                ", sjDelegationPartner='" + sjDelegationPartner + '\'' +
                ", sjDelegationStaff='" + sjDelegationStaff + '\'' +
                ", sjDelegationStaffPhone='" + sjDelegationStaffPhone + '\'' +
                ", sjReplymanEmail='" + sjReplymanEmail + '\'' +
                ", sjReplymanName='" + sjReplymanName + '\'' +
                ", sjSn='" + sjSn + '\'' +
                ", sjTouZi=" + sjTouZi +
                ", specA='" + specA + '\'' +
                ", specB='" + specB + '\'' +
                ", specC='" + specC + '\'' +
                ", specManage='" + specManage + '\'' +
                ", touziSubject='" + touziSubject + '\'' +
                ", ysDate=" + ysDate +
                ", ysTouzi=" + ysTouzi +
                ", zxCapex=" + zxCapex +
                ", zxTouZi=" + zxTouZi +
                ", zyTouzi=" + zyTouzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Project project = (Project) o;
        return Objects.equals(actualFinishDate, project.actualFinishDate) &&
                Objects.equals(actualStartTime, project.actualStartTime) &&
                Objects.equals(approveType, project.approveType) &&
                Objects.equals(arrivalDate, project.arrivalDate) &&
                Objects.equals(autoType, project.autoType) &&
                Objects.equals(bulidScene, project.bulidScene) &&
                Objects.equals(carryOverTouzi, project.carryOverTouzi) &&
                Objects.equals(carryOverYear, project.carryOverYear) &&
                Objects.equals(checkType, project.checkType) &&
                Objects.equals(city, project.city) &&
                Objects.equals(createdEmail, project.createdEmail) &&
                Objects.equals(createdName, project.createdName) &&
                Objects.equals(custAttr, project.custAttr) &&
                Objects.equals(cyTouzi, project.cyTouzi) &&
                Objects.equals(disDept, project.disDept) &&
                Objects.equals(disUnit, project.disUnit) &&
                Objects.equals(disYear, project.disYear) &&
                Objects.equals(finalDate, project.finalDate) &&
                Objects.equals(inspectionDate, project.inspectionDate) &&
                Objects.equals(isCarryOver, project.isCarryOver) &&
                Objects.equals(isEpc, project.isEpc) &&
                Objects.equals(isJtmdz, project.isJtmdz) &&
                Objects.equals(isLightChange, project.isLightChange) &&
                Objects.equals(isPurchase, project.isPurchase) &&
                Objects.equals(isService, project.isService) &&
                Objects.equals(isSociety, project.isSociety) &&
                Objects.equals(isTwoPdm, project.isTwoPdm) &&
                Objects.equals(kyCapex, project.kyCapex) &&
                Objects.equals(kyCreatedApproveDate, project.kyCreatedApproveDate) &&
                Objects.equals(kyCreatedDate, project.kyCreatedDate) &&
                Objects.equals(kyDate, project.kyDate) &&
                Objects.equals(kyDelegationDate, project.kyDelegationDate) &&
                Objects.equals(kyDelegationPartner, project.kyDelegationPartner) &&
                Objects.equals(kyDelegationStaff, project.kyDelegationStaff) &&
                Objects.equals(kyDelegationStaffPhone, project.kyDelegationStaffPhone) &&
                Objects.equals(kyReplymanEmail, project.kyReplymanEmail) &&
                Objects.equals(kyReplymanName, project.kyReplymanName) &&
                Objects.equals(kySn, project.kySn) &&
                Objects.equals(kyTouZi, project.kyTouZi) &&
                Objects.equals(legalSubject, project.legalSubject) &&
                Objects.equals(lxCapex, project.lxCapex) &&
                Objects.equals(lxCreatedApproveDate, project.lxCreatedApproveDate) &&
                Objects.equals(lxCreatedDate, project.lxCreatedDate) &&
                Objects.equals(lxDate, project.lxDate) &&
                Objects.equals(lxReplymanEmail, project.lxReplymanEmail) &&
                Objects.equals(lxReplymanName, project.lxReplymanName) &&
                Objects.equals(lxSn, project.lxSn) &&
                Objects.equals(lxTouZi, project.lxTouZi) &&
                Objects.equals(manageAttr, project.manageAttr) &&
                Objects.equals(manageType, project.manageType) &&
                Objects.equals(managerEmail, project.managerEmail) &&
                Objects.equals(managerName, project.managerName) &&
                Objects.equals(moneySource, project.moneySource) &&
                Objects.equals(moneyType, project.moneyType) &&
                Objects.equals(networkLevel, project.networkLevel) &&
                Objects.equals(outputDate, project.outputDate) &&
                Objects.equals(planCyTime, project.planCyTime) &&
                Objects.equals(planFinishTime, project.planFinishTime) &&
                Objects.equals(planStartTime, project.planStartTime) &&
                Objects.equals(planYsTime, project.planYsTime) &&
                Objects.equals(planZyTime, project.planZyTime) &&
                Objects.equals(postDisaster, project.postDisaster) &&
                Objects.equals(projectCode, project.projectCode) &&
                Objects.equals(projectId, project.projectId) &&
                Objects.equals(projectName, project.projectName) &&
                Objects.equals(projectPolicy, project.projectPolicy) &&
                Objects.equals(projectState, project.projectState) &&
                Objects.equals(projectTrial, project.projectTrial) &&
                Objects.equals(property, project.property) &&
                Objects.equals(prov, project.prov) &&
                Objects.equals(remandUnit, project.remandUnit) &&
                Objects.equals(sjCapex, project.sjCapex) &&
                Objects.equals(sjCreatedApproveDate, project.sjCreatedApproveDate) &&
                Objects.equals(sjCreatedDate, project.sjCreatedDate) &&
                Objects.equals(sjDate, project.sjDate) &&
                Objects.equals(sjDelegationDate, project.sjDelegationDate) &&
                Objects.equals(sjDelegationPartner, project.sjDelegationPartner) &&
                Objects.equals(sjDelegationStaff, project.sjDelegationStaff) &&
                Objects.equals(sjDelegationStaffPhone, project.sjDelegationStaffPhone) &&
                Objects.equals(sjReplymanEmail, project.sjReplymanEmail) &&
                Objects.equals(sjReplymanName, project.sjReplymanName) &&
                Objects.equals(sjSn, project.sjSn) &&
                Objects.equals(sjTouZi, project.sjTouZi) &&
                Objects.equals(specA, project.specA) &&
                Objects.equals(specB, project.specB) &&
                Objects.equals(specC, project.specC) &&
                Objects.equals(specManage, project.specManage) &&
                Objects.equals(touziSubject, project.touziSubject) &&
                Objects.equals(ysDate, project.ysDate) &&
                Objects.equals(ysTouzi, project.ysTouzi) &&
                Objects.equals(zxCapex, project.zxCapex) &&
                Objects.equals(zxTouZi, project.zxTouZi) &&
                Objects.equals(zyTouzi, project.zyTouzi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualFinishDate, actualStartTime, approveType, arrivalDate, autoType, bulidScene, carryOverTouzi, carryOverYear, checkType, city, createdEmail, createdName, custAttr, cyTouzi, disDept, disUnit, disYear, finalDate, inspectionDate, isCarryOver, isEpc, isJtmdz, isLightChange, isPurchase, isService, isSociety, isTwoPdm, kyCapex, kyCreatedApproveDate, kyCreatedDate, kyDate, kyDelegationDate, kyDelegationPartner, kyDelegationStaff, kyDelegationStaffPhone, kyReplymanEmail, kyReplymanName, kySn, kyTouZi, legalSubject, lxCapex, lxCreatedApproveDate, lxCreatedDate, lxDate, lxReplymanEmail, lxReplymanName, lxSn, lxTouZi, manageAttr, manageType, managerEmail, managerName, moneySource, moneyType, networkLevel, outputDate, planCyTime, planFinishTime, planStartTime, planYsTime, planZyTime, postDisaster, projectCode, projectId, projectName, projectPolicy, projectState, projectTrial, property, prov, remandUnit, sjCapex, sjCreatedApproveDate, sjCreatedDate, sjDate, sjDelegationDate, sjDelegationPartner, sjDelegationStaff, sjDelegationStaffPhone, sjReplymanEmail, sjReplymanName, sjSn, sjTouZi, specA, specB, specC, specManage, touziSubject, ysDate, ysTouzi, zxCapex, zxTouZi, zyTouzi);
    }
}
