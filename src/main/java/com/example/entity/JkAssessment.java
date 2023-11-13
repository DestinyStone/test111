package com.example.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * <p>jkAssessment complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="jkAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ablilityCheckTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="beneEvaluation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buildPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buildReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bulidAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdiFifth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdiFirst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdiFourth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdiSecond" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdiThird" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdiTotle" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractIntentionTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demandDescribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fifthInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fourthlyInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gridInfoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gridName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inspectResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inspectStaffEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inspectStaffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inspectStaffTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCrossdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isStand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainBuildDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbodimentDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthMarketingCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="networkLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oldIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="operAndMaintenCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paybackMouth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="postDisaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procsinstid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remandId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemePrincipalEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemePrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemePrincipalTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="thirdInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="touZi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jkAssessment", propOrder = {
        "ablilityCheckTime",
        "beneEvaluation",
        "buildPeriod",
        "buildReason",
        "buildType",
        "bulidAdd",
        "businessType",
        "cdiFifth",
        "cdiFirst",
        "cdiFourth",
        "cdiSecond",
        "cdiThird",
        "cdiTotle",
        "city",
        "contractIntentionTime",
        "createdBy",
        "createdByEmail",
        "createdByTel",
        "createdDate",
        "customerIndustry",
        "customerName",
        "demandDescribe",
        "disUnit",
        "fifthInvestment",
        "firstInvestment",
        "fourthlyInvestment",
        "gridInfoName",
        "gridName",
        "inspectResult",
        "inspectStaffEmail",
        "inspectStaffName",
        "inspectStaffTel",
        "isCrossdomain",
        "isStand",
        "mainBuildDesc",
        "mbodimentDept",
        "monthMarketingCost",
        "networkLevel",
        "newIncome",
        "oldIncome",
        "operAndMaintenCost",
        "paybackMouth",
        "postDisaster",
        "procsinstid",
        "projectCode",
        "projectName",
        "prov",
        "remandId",
        "remandName",
        "remark",
        "resourceDept",
        "schemePrincipalEmail",
        "schemePrincipalName",
        "schemePrincipalTel",
        "secondInvestment",
        "thirdInvestment",
        "totalIncome",
        "touZi",
        "remandState",
        "attr1",
        "attr2",
        "attr3",
        "attr4",
        "attr5"
})
public class JkAssessment {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ablilityCheckTime;
    protected BigDecimal beneEvaluation;
    protected BigDecimal buildPeriod;
    protected String buildReason;
    protected String buildType;
    protected String bulidAdd;
    protected String businessType;
    protected BigDecimal cdiFifth;
    protected BigDecimal cdiFirst;
    protected BigDecimal cdiFourth;
    protected BigDecimal cdiSecond;
    protected BigDecimal cdiThird;
    protected BigDecimal cdiTotle;
    protected String city;
    protected BigDecimal contractIntentionTime;
    protected String createdBy;
    protected String createdByEmail;
    protected String createdByTel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String customerIndustry;
    protected String customerName;
    protected String demandDescribe;
    protected String disUnit;
    protected BigDecimal fifthInvestment;
    protected BigDecimal firstInvestment;
    protected BigDecimal fourthlyInvestment;
    protected String gridInfoName;
    protected String gridName;
    protected String inspectResult;
    protected String inspectStaffEmail;
    protected String inspectStaffName;
    protected String inspectStaffTel;
    protected String isCrossdomain;
    protected String isStand;
    protected String mainBuildDesc;
    protected String mbodimentDept;
    protected BigDecimal monthMarketingCost;
    protected String networkLevel;
    protected BigDecimal newIncome;
    protected BigDecimal oldIncome;
    protected BigDecimal operAndMaintenCost;
    protected BigDecimal paybackMouth;
    protected String postDisaster;
    protected Long procsinstid;
    protected String projectCode;
    protected String projectName;
    protected String prov;
    protected Integer remandId;
    protected String remandName;
    protected String remark;
    protected String resourceDept;
    protected String schemePrincipalEmail;
    protected String schemePrincipalName;
    protected String schemePrincipalTel;
    protected BigDecimal secondInvestment;
    protected BigDecimal thirdInvestment;
    protected BigDecimal totalIncome;
    protected BigDecimal touZi;
    protected String remandState;
    protected String attr1;
    protected String attr2;
    protected String attr3;
    protected String attr4;
    protected String attr5;

    /**
     * 获取ablilityCheckTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAblilityCheckTime() {
        return ablilityCheckTime;
    }

    /**
     * 设置ablilityCheckTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAblilityCheckTime(XMLGregorianCalendar value) {
        this.ablilityCheckTime = value;
    }

    /**
     * 获取beneEvaluation属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBeneEvaluation() {
        return beneEvaluation;
    }

    /**
     * 设置beneEvaluation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBeneEvaluation(BigDecimal value) {
        this.beneEvaluation = value;
    }

    /**
     * 获取buildPeriod属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBuildPeriod() {
        return buildPeriod;
    }

    /**
     * 设置buildPeriod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBuildPeriod(BigDecimal value) {
        this.buildPeriod = value;
    }

    /**
     * 获取buildReason属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuildReason() {
        return buildReason;
    }

    /**
     * 设置buildReason属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuildReason(String value) {
        this.buildReason = value;
    }

    /**
     * 获取buildType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuildType() {
        return buildType;
    }

    /**
     * 设置buildType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuildType(String value) {
        this.buildType = value;
    }

    /**
     * 获取bulidAdd属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBulidAdd() {
        return bulidAdd;
    }

    /**
     * 设置bulidAdd属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBulidAdd(String value) {
        this.bulidAdd = value;
    }

    /**
     * 获取businessType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置businessType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * 获取cdiFifth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiFifth() {
        return cdiFifth;
    }

    /**
     * 设置cdiFifth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiFifth(BigDecimal value) {
        this.cdiFifth = value;
    }

    /**
     * 获取cdiFirst属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiFirst() {
        return cdiFirst;
    }

    /**
     * 设置cdiFirst属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiFirst(BigDecimal value) {
        this.cdiFirst = value;
    }

    /**
     * 获取cdiFourth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiFourth() {
        return cdiFourth;
    }

    /**
     * 设置cdiFourth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiFourth(BigDecimal value) {
        this.cdiFourth = value;
    }

    /**
     * 获取cdiSecond属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiSecond() {
        return cdiSecond;
    }

    /**
     * 设置cdiSecond属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiSecond(BigDecimal value) {
        this.cdiSecond = value;
    }

    /**
     * 获取cdiThird属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiThird() {
        return cdiThird;
    }

    /**
     * 设置cdiThird属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiThird(BigDecimal value) {
        this.cdiThird = value;
    }

    /**
     * 获取cdiTotle属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCdiTotle() {
        return cdiTotle;
    }

    /**
     * 设置cdiTotle属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCdiTotle(BigDecimal value) {
        this.cdiTotle = value;
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
     * 获取contractIntentionTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getContractIntentionTime() {
        return contractIntentionTime;
    }

    /**
     * 设置contractIntentionTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setContractIntentionTime(BigDecimal value) {
        this.contractIntentionTime = value;
    }

    /**
     * 获取createdBy属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置createdBy属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * 获取createdByEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedByEmail() {
        return createdByEmail;
    }

    /**
     * 设置createdByEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedByEmail(String value) {
        this.createdByEmail = value;
    }

    /**
     * 获取createdByTel属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedByTel() {
        return createdByTel;
    }

    /**
     * 设置createdByTel属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedByTel(String value) {
        this.createdByTel = value;
    }

    /**
     * 获取createdDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取customerIndustry属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerIndustry() {
        return customerIndustry;
    }

    /**
     * 设置customerIndustry属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerIndustry(String value) {
        this.customerIndustry = value;
    }

    /**
     * 获取customerName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取demandDescribe属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDemandDescribe() {
        return demandDescribe;
    }

    /**
     * 设置demandDescribe属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDemandDescribe(String value) {
        this.demandDescribe = value;
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
     * 获取fifthInvestment属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFifthInvestment() {
        return fifthInvestment;
    }

    /**
     * 设置fifthInvestment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFifthInvestment(BigDecimal value) {
        this.fifthInvestment = value;
    }

    /**
     * 获取firstInvestment属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFirstInvestment() {
        return firstInvestment;
    }

    /**
     * 设置firstInvestment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFirstInvestment(BigDecimal value) {
        this.firstInvestment = value;
    }

    /**
     * 获取fourthlyInvestment属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFourthlyInvestment() {
        return fourthlyInvestment;
    }

    /**
     * 设置fourthlyInvestment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFourthlyInvestment(BigDecimal value) {
        this.fourthlyInvestment = value;
    }

    /**
     * 获取gridInfoName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGridInfoName() {
        return gridInfoName;
    }

    /**
     * 设置gridInfoName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGridInfoName(String value) {
        this.gridInfoName = value;
    }

    /**
     * 获取gridName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGridName() {
        return gridName;
    }

    /**
     * 设置gridName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGridName(String value) {
        this.gridName = value;
    }

    /**
     * 获取inspectResult属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInspectResult() {
        return inspectResult;
    }

    /**
     * 设置inspectResult属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInspectResult(String value) {
        this.inspectResult = value;
    }

    /**
     * 获取inspectStaffEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInspectStaffEmail() {
        return inspectStaffEmail;
    }

    /**
     * 设置inspectStaffEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInspectStaffEmail(String value) {
        this.inspectStaffEmail = value;
    }

    /**
     * 获取inspectStaffName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInspectStaffName() {
        return inspectStaffName;
    }

    /**
     * 设置inspectStaffName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInspectStaffName(String value) {
        this.inspectStaffName = value;
    }

    /**
     * 获取inspectStaffTel属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInspectStaffTel() {
        return inspectStaffTel;
    }

    /**
     * 设置inspectStaffTel属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInspectStaffTel(String value) {
        this.inspectStaffTel = value;
    }

    /**
     * 获取isCrossdomain属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsCrossdomain() {
        return isCrossdomain;
    }

    /**
     * 设置isCrossdomain属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsCrossdomain(String value) {
        this.isCrossdomain = value;
    }

    /**
     * 获取isStand属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsStand() {
        return isStand;
    }

    /**
     * 设置isStand属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsStand(String value) {
        this.isStand = value;
    }

    /**
     * 获取mainBuildDesc属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMainBuildDesc() {
        return mainBuildDesc;
    }

    /**
     * 设置mainBuildDesc属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainBuildDesc(String value) {
        this.mainBuildDesc = value;
    }

    /**
     * 获取mbodimentDept属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMbodimentDept() {
        return mbodimentDept;
    }

    /**
     * 设置mbodimentDept属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMbodimentDept(String value) {
        this.mbodimentDept = value;
    }

    /**
     * 获取monthMarketingCost属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMonthMarketingCost() {
        return monthMarketingCost;
    }

    /**
     * 设置monthMarketingCost属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMonthMarketingCost(BigDecimal value) {
        this.monthMarketingCost = value;
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
     * 获取newIncome属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNewIncome() {
        return newIncome;
    }

    /**
     * 设置newIncome属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNewIncome(BigDecimal value) {
        this.newIncome = value;
    }

    /**
     * 获取oldIncome属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOldIncome() {
        return oldIncome;
    }

    /**
     * 设置oldIncome属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOldIncome(BigDecimal value) {
        this.oldIncome = value;
    }

    /**
     * 获取operAndMaintenCost属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOperAndMaintenCost() {
        return operAndMaintenCost;
    }

    /**
     * 设置operAndMaintenCost属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOperAndMaintenCost(BigDecimal value) {
        this.operAndMaintenCost = value;
    }

    /**
     * 获取paybackMouth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPaybackMouth() {
        return paybackMouth;
    }

    /**
     * 设置paybackMouth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPaybackMouth(BigDecimal value) {
        this.paybackMouth = value;
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
     * 获取remandId属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRemandId() {
        return remandId;
    }

    /**
     * 设置remandId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRemandId(Integer value) {
        this.remandId = value;
    }

    /**
     * 获取remandName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemandName() {
        return remandName;
    }

    /**
     * 设置remandName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemandName(String value) {
        this.remandName = value;
    }

    /**
     * 获取remark属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取resourceDept属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResourceDept() {
        return resourceDept;
    }

    /**
     * 设置resourceDept属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResourceDept(String value) {
        this.resourceDept = value;
    }

    /**
     * 获取schemePrincipalEmail属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemePrincipalEmail() {
        return schemePrincipalEmail;
    }

    /**
     * 设置schemePrincipalEmail属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemePrincipalEmail(String value) {
        this.schemePrincipalEmail = value;
    }

    /**
     * 获取schemePrincipalName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemePrincipalName() {
        return schemePrincipalName;
    }

    /**
     * 设置schemePrincipalName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemePrincipalName(String value) {
        this.schemePrincipalName = value;
    }

    /**
     * 获取schemePrincipalTel属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemePrincipalTel() {
        return schemePrincipalTel;
    }

    /**
     * 设置schemePrincipalTel属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemePrincipalTel(String value) {
        this.schemePrincipalTel = value;
    }

    /**
     * 获取secondInvestment属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSecondInvestment() {
        return secondInvestment;
    }

    /**
     * 设置secondInvestment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSecondInvestment(BigDecimal value) {
        this.secondInvestment = value;
    }

    /**
     * 获取thirdInvestment属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getThirdInvestment() {
        return thirdInvestment;
    }

    /**
     * 设置thirdInvestment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setThirdInvestment(BigDecimal value) {
        this.thirdInvestment = value;
    }

    /**
     * 获取totalIncome属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    /**
     * 设置totalIncome属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalIncome(BigDecimal value) {
        this.totalIncome = value;
    }

    /**
     * 获取touZi属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTouZi() {
        return touZi;
    }

    /**
     * 设置touZi属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTouZi(BigDecimal value) {
        this.touZi = value;
    }

    public String getRemandState() {
        return remandState;
    }

    public void setRemandState(String remandState) {
        this.remandState = remandState;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JkAssessment that = (JkAssessment) o;
        return Objects.equals(ablilityCheckTime, that.ablilityCheckTime) &&
                Objects.equals(beneEvaluation, that.beneEvaluation) &&
                Objects.equals(buildPeriod, that.buildPeriod) &&
                Objects.equals(buildReason, that.buildReason) &&
                Objects.equals(buildType, that.buildType) &&
                Objects.equals(bulidAdd, that.bulidAdd) &&
                Objects.equals(businessType, that.businessType) &&
                Objects.equals(cdiFifth, that.cdiFifth) &&
                Objects.equals(cdiFirst, that.cdiFirst) &&
                Objects.equals(cdiFourth, that.cdiFourth) &&
                Objects.equals(cdiSecond, that.cdiSecond) &&
                Objects.equals(cdiThird, that.cdiThird) &&
                Objects.equals(cdiTotle, that.cdiTotle) &&
                Objects.equals(city, that.city) &&
                Objects.equals(contractIntentionTime, that.contractIntentionTime) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdByEmail, that.createdByEmail) &&
                Objects.equals(createdByTel, that.createdByTel) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(customerIndustry, that.customerIndustry) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(demandDescribe, that.demandDescribe) &&
                Objects.equals(disUnit, that.disUnit) &&
                Objects.equals(fifthInvestment, that.fifthInvestment) &&
                Objects.equals(firstInvestment, that.firstInvestment) &&
                Objects.equals(fourthlyInvestment, that.fourthlyInvestment) &&
                Objects.equals(gridInfoName, that.gridInfoName) &&
                Objects.equals(gridName, that.gridName) &&
                Objects.equals(inspectResult, that.inspectResult) &&
                Objects.equals(inspectStaffEmail, that.inspectStaffEmail) &&
                Objects.equals(inspectStaffName, that.inspectStaffName) &&
                Objects.equals(inspectStaffTel, that.inspectStaffTel) &&
                Objects.equals(isCrossdomain, that.isCrossdomain) &&
                Objects.equals(isStand, that.isStand) &&
                Objects.equals(mainBuildDesc, that.mainBuildDesc) &&
                Objects.equals(mbodimentDept, that.mbodimentDept) &&
                Objects.equals(monthMarketingCost, that.monthMarketingCost) &&
                Objects.equals(networkLevel, that.networkLevel) &&
                Objects.equals(newIncome, that.newIncome) &&
                Objects.equals(oldIncome, that.oldIncome) &&
                Objects.equals(operAndMaintenCost, that.operAndMaintenCost) &&
                Objects.equals(paybackMouth, that.paybackMouth) &&
                Objects.equals(postDisaster, that.postDisaster) &&
                Objects.equals(procsinstid, that.procsinstid) &&
                Objects.equals(projectCode, that.projectCode) &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(prov, that.prov) &&
                Objects.equals(remandId, that.remandId) &&
                Objects.equals(remandName, that.remandName) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(resourceDept, that.resourceDept) &&
                Objects.equals(schemePrincipalEmail, that.schemePrincipalEmail) &&
                Objects.equals(schemePrincipalName, that.schemePrincipalName) &&
                Objects.equals(schemePrincipalTel, that.schemePrincipalTel) &&
                Objects.equals(secondInvestment, that.secondInvestment) &&
                Objects.equals(thirdInvestment, that.thirdInvestment) &&
                Objects.equals(totalIncome, that.totalIncome) &&
                Objects.equals(touZi, that.touZi) &&
                Objects.equals(remandState, that.remandState) &&
                Objects.equals(attr1, that.attr1) &&
                Objects.equals(attr2, that.attr2) &&
                Objects.equals(attr3, that.attr3) &&
                Objects.equals(attr4, that.attr4) &&
                Objects.equals(attr5, that.attr5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ablilityCheckTime, beneEvaluation, buildPeriod, buildReason, buildType, bulidAdd, businessType, cdiFifth, cdiFirst, cdiFourth, cdiSecond, cdiThird, cdiTotle, city, contractIntentionTime, createdBy, createdByEmail, createdByTel, createdDate, customerIndustry, customerName, demandDescribe, disUnit, fifthInvestment, firstInvestment, fourthlyInvestment, gridInfoName, gridName, inspectResult, inspectStaffEmail, inspectStaffName, inspectStaffTel, isCrossdomain, isStand, mainBuildDesc, mbodimentDept, monthMarketingCost, networkLevel, newIncome, oldIncome, operAndMaintenCost, paybackMouth, postDisaster, procsinstid, projectCode, projectName, prov, remandId, remandName, remark, resourceDept, schemePrincipalEmail, schemePrincipalName, schemePrincipalTel, secondInvestment, thirdInvestment, totalIncome, touZi, remandState, attr1, attr2, attr3, attr4, attr5);
    }

    @Override
    public String toString() {
        return "JkAssessment{" +
                "ablilityCheckTime=" + ablilityCheckTime +
                ", beneEvaluation=" + beneEvaluation +
                ", buildPeriod=" + buildPeriod +
                ", buildReason='" + buildReason + '\'' +
                ", buildType='" + buildType + '\'' +
                ", bulidAdd='" + bulidAdd + '\'' +
                ", businessType='" + businessType + '\'' +
                ", cdiFifth=" + cdiFifth +
                ", cdiFirst=" + cdiFirst +
                ", cdiFourth=" + cdiFourth +
                ", cdiSecond=" + cdiSecond +
                ", cdiThird=" + cdiThird +
                ", cdiTotle=" + cdiTotle +
                ", city='" + city + '\'' +
                ", contractIntentionTime=" + contractIntentionTime +
                ", createdBy='" + createdBy + '\'' +
                ", createdByEmail='" + createdByEmail + '\'' +
                ", createdByTel='" + createdByTel + '\'' +
                ", createdDate=" + createdDate +
                ", customerIndustry='" + customerIndustry + '\'' +
                ", customerName='" + customerName + '\'' +
                ", demandDescribe='" + demandDescribe + '\'' +
                ", disUnit='" + disUnit + '\'' +
                ", fifthInvestment=" + fifthInvestment +
                ", firstInvestment=" + firstInvestment +
                ", fourthlyInvestment=" + fourthlyInvestment +
                ", gridInfoName='" + gridInfoName + '\'' +
                ", gridName='" + gridName + '\'' +
                ", inspectResult='" + inspectResult + '\'' +
                ", inspectStaffEmail='" + inspectStaffEmail + '\'' +
                ", inspectStaffName='" + inspectStaffName + '\'' +
                ", inspectStaffTel='" + inspectStaffTel + '\'' +
                ", isCrossdomain='" + isCrossdomain + '\'' +
                ", isStand='" + isStand + '\'' +
                ", mainBuildDesc='" + mainBuildDesc + '\'' +
                ", mbodimentDept='" + mbodimentDept + '\'' +
                ", monthMarketingCost=" + monthMarketingCost +
                ", networkLevel='" + networkLevel + '\'' +
                ", newIncome=" + newIncome +
                ", oldIncome=" + oldIncome +
                ", operAndMaintenCost=" + operAndMaintenCost +
                ", paybackMouth=" + paybackMouth +
                ", postDisaster='" + postDisaster + '\'' +
                ", procsinstid=" + procsinstid +
                ", projectCode='" + projectCode + '\'' +
                ", projectName='" + projectName + '\'' +
                ", prov='" + prov + '\'' +
                ", remandId=" + remandId +
                ", remandName='" + remandName + '\'' +
                ", remark='" + remark + '\'' +
                ", resourceDept='" + resourceDept + '\'' +
                ", schemePrincipalEmail='" + schemePrincipalEmail + '\'' +
                ", schemePrincipalName='" + schemePrincipalName + '\'' +
                ", schemePrincipalTel='" + schemePrincipalTel + '\'' +
                ", remandState='" + remandState + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", attr4='" + attr4 + '\'' +
                ", attr5='" + attr5 + '\'' +
                ", secondInvestment=" + secondInvestment +
                ", thirdInvestment=" + thirdInvestment +
                ", totalIncome=" + totalIncome +
                ", touZi=" + touZi +
                '}';
    }
}
