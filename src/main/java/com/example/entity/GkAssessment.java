package com.example.entity;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gkAssessment", propOrder = {
        "accessType",
        "areaType",
        "bdArpu",
        "bdIncomeOneyear",
        "bdIncomeSixmonth",
        "bdIncomeTwoyear",
        "bdNbProportion",
        "bdPortBulid",
        "bdPortPerm",
        "bdPortRateTarget",
        "bdUserCost",
        "bdUserCostOneyear",
        "bdUserCostTwoyear",
        "bdUserCutover",
        "bdUserGrowth",
        "bdUserGrowthOneyear",
        "bdUserGrowthTwoyear",
        "bdUserOneyear",
        "bdUserSixmonth",
        "bdUserTwoyear",
        "buildScene",
        "bulidDate",
        "bulidType",
        "capex",
        "cashAccFlowOneyear",
        "cashAccFlowSixmonth",
        "cashAccFlowTwoyear",
        "cashFlowOneyear",
        "cashFlowSixmonth",
        "cashFlowTwoyear",
        "cashNetFlowOneyear",
        "cashNetFlowSixmonth",
        "cashNetFlowTwoyear",
        "cashOutflowOneyear",
        "cashOutflowSixmonth",
        "cashOutflowTwoyear",
        "city",
        "county",
        "cover3G",
        "cover4G",
        "coverRate",
        "createDate",
        "createEmail",
        "createName",
        "deviceAddress",
        "deviceName",
        "deviceType",
        "fibreNum",
        "floorCode",
        "floorNumber",
        "gridName",
        "houseNum",
        "houseNumber",
        "incomeOneyear",
        "incomeSixmonth",
        "incomeTwoyear",
        "joinType",
        "lightSeat",
        "lightVol",
        "nbArpu",
        "numberPlate",
        "operatorName",
        "operatorUserNum",
        "portInteCost",
        "portNum",
        "portOccupyNum",
        "procsinstid",
        "projectCode",
        "projectName",
        "prov",
        "regionType",
        "remandCode",
        "remandName",
        "road",
        "roomNumber",
        "street",
        "tenantNum",
        "tenantNumber",
        "touZi",
        "touziPeriod",
        "vcIncomeOneyear",
        "vcIncomeSixmonth",
        "vcIncomeTwoyear",
        "vcPortBulid",
        "vcUserCutover",
        "vcUserGrowth",
        "vcUserGrowthOneyear",
        "vcUserGrowthTwoyear",
        "vcUserNum",
        "vcUserOneyear",
        "vcUserSixmonth",
        "vcUserTwoyear",
        "villageCode",
        "villageName",
        "voiceOccupyNum",
        "voicePortNum",
        "wordDate",
        "remandState",
        "attr1",
        "attr2",
        "attr3",
        "attr4",
        "attr5"
})
public class GkAssessment {

    protected String accessType;
    protected String areaType;
    protected BigDecimal bdArpu;
    protected BigDecimal bdIncomeOneyear;
    protected BigDecimal bdIncomeSixmonth;
    protected BigDecimal bdIncomeTwoyear;
    protected BigDecimal bdNbProportion;
    protected BigDecimal bdPortBulid;
    protected BigDecimal bdPortPerm;
    protected BigDecimal bdPortRateTarget;
    protected BigDecimal bdUserCost;
    protected BigDecimal bdUserCostOneyear;
    protected BigDecimal bdUserCostTwoyear;
    protected BigDecimal bdUserCutover;
    protected BigDecimal bdUserGrowth;
    protected BigDecimal bdUserGrowthOneyear;
    protected BigDecimal bdUserGrowthTwoyear;
    protected BigDecimal bdUserOneyear;
    protected BigDecimal bdUserSixmonth;
    protected BigDecimal bdUserTwoyear;
    protected String buildScene;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bulidDate;
    protected String bulidType;
    protected BigDecimal capex;
    protected BigDecimal cashAccFlowOneyear;
    protected BigDecimal cashAccFlowSixmonth;
    protected BigDecimal cashAccFlowTwoyear;
    protected BigDecimal cashFlowOneyear;
    protected BigDecimal cashFlowSixmonth;
    protected BigDecimal cashFlowTwoyear;
    protected BigDecimal cashNetFlowOneyear;
    protected BigDecimal cashNetFlowSixmonth;
    protected BigDecimal cashNetFlowTwoyear;
    protected BigDecimal cashOutflowOneyear;
    protected BigDecimal cashOutflowSixmonth;
    protected BigDecimal cashOutflowTwoyear;
    protected String city;
    protected String county;
    @XmlElement(name = "cover3g")
    protected String cover3G;
    @XmlElement(name = "cover4g")
    protected String cover4G;
    protected BigDecimal coverRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected String createEmail;
    protected String createName;
    protected String deviceAddress;
    protected String deviceName;
    protected String deviceType;
    protected BigDecimal fibreNum;
    protected String floorCode;
    protected BigDecimal floorNumber;
    protected String gridName;
    protected BigDecimal houseNum;
    protected BigDecimal houseNumber;
    protected BigDecimal incomeOneyear;
    protected BigDecimal incomeSixmonth;
    protected BigDecimal incomeTwoyear;
    protected String joinType;
    protected String lightSeat;
    protected BigDecimal lightVol;
    protected BigDecimal nbArpu;
    protected String numberPlate;
    protected String operatorName;
    protected BigDecimal operatorUserNum;
    protected BigDecimal portInteCost;
    protected BigDecimal portNum;
    protected BigDecimal portOccupyNum;
    protected Long procsinstid;
    protected String projectCode;
    protected String projectName;
    protected String prov;
    protected String regionType;
    protected Integer remandCode;
    protected String remandName;
    protected String road;
    protected BigDecimal roomNumber;
    protected String street;
    protected BigDecimal tenantNum;
    protected BigDecimal tenantNumber;
    protected BigDecimal touZi;
    protected BigDecimal touziPeriod;
    protected BigDecimal vcIncomeOneyear;
    protected BigDecimal vcIncomeSixmonth;
    protected BigDecimal vcIncomeTwoyear;
    protected BigDecimal vcPortBulid;
    protected BigDecimal vcUserCutover;
    protected BigDecimal vcUserGrowth;
    protected BigDecimal vcUserGrowthOneyear;
    protected BigDecimal vcUserGrowthTwoyear;
    protected BigDecimal vcUserNum;
    protected BigDecimal vcUserOneyear;
    protected BigDecimal vcUserSixmonth;
    protected BigDecimal vcUserTwoyear;
    protected String villageCode;
    protected String villageName;
    protected BigDecimal voiceOccupyNum;
    protected BigDecimal voicePortNum;
    protected BigDecimal wordDate;
    protected String remandState;
    protected String attr1;
    protected String attr2;
    protected String attr3;
    protected String attr4;
    protected String attr5;

    /**
     * 获取accessType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * 设置accessType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * 获取areaType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * 设置areaType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAreaType(String value) {
        this.areaType = value;
    }

    /**
     * 获取bdArpu属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdArpu() {
        return bdArpu;
    }

    /**
     * 设置bdArpu属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdArpu(BigDecimal value) {
        this.bdArpu = value;
    }

    /**
     * 获取bdIncomeOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdIncomeOneyear() {
        return bdIncomeOneyear;
    }

    /**
     * 设置bdIncomeOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdIncomeOneyear(BigDecimal value) {
        this.bdIncomeOneyear = value;
    }

    /**
     * 获取bdIncomeSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdIncomeSixmonth() {
        return bdIncomeSixmonth;
    }

    /**
     * 设置bdIncomeSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdIncomeSixmonth(BigDecimal value) {
        this.bdIncomeSixmonth = value;
    }

    /**
     * 获取bdIncomeTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdIncomeTwoyear() {
        return bdIncomeTwoyear;
    }

    /**
     * 设置bdIncomeTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdIncomeTwoyear(BigDecimal value) {
        this.bdIncomeTwoyear = value;
    }

    /**
     * 获取bdNbProportion属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdNbProportion() {
        return bdNbProportion;
    }

    /**
     * 设置bdNbProportion属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdNbProportion(BigDecimal value) {
        this.bdNbProportion = value;
    }

    /**
     * 获取bdPortBulid属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdPortBulid() {
        return bdPortBulid;
    }

    /**
     * 设置bdPortBulid属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdPortBulid(BigDecimal value) {
        this.bdPortBulid = value;
    }

    /**
     * 获取bdPortPerm属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdPortPerm() {
        return bdPortPerm;
    }

    /**
     * 设置bdPortPerm属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdPortPerm(BigDecimal value) {
        this.bdPortPerm = value;
    }

    /**
     * 获取bdPortRateTarget属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdPortRateTarget() {
        return bdPortRateTarget;
    }

    /**
     * 设置bdPortRateTarget属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdPortRateTarget(BigDecimal value) {
        this.bdPortRateTarget = value;
    }

    /**
     * 获取bdUserCost属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserCost() {
        return bdUserCost;
    }

    /**
     * 设置bdUserCost属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserCost(BigDecimal value) {
        this.bdUserCost = value;
    }

    /**
     * 获取bdUserCostOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserCostOneyear() {
        return bdUserCostOneyear;
    }

    /**
     * 设置bdUserCostOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserCostOneyear(BigDecimal value) {
        this.bdUserCostOneyear = value;
    }

    /**
     * 获取bdUserCostTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserCostTwoyear() {
        return bdUserCostTwoyear;
    }

    /**
     * 设置bdUserCostTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserCostTwoyear(BigDecimal value) {
        this.bdUserCostTwoyear = value;
    }

    /**
     * 获取bdUserCutover属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserCutover() {
        return bdUserCutover;
    }

    /**
     * 设置bdUserCutover属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserCutover(BigDecimal value) {
        this.bdUserCutover = value;
    }

    /**
     * 获取bdUserGrowth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserGrowth() {
        return bdUserGrowth;
    }

    /**
     * 设置bdUserGrowth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserGrowth(BigDecimal value) {
        this.bdUserGrowth = value;
    }

    /**
     * 获取bdUserGrowthOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserGrowthOneyear() {
        return bdUserGrowthOneyear;
    }

    /**
     * 设置bdUserGrowthOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserGrowthOneyear(BigDecimal value) {
        this.bdUserGrowthOneyear = value;
    }

    /**
     * 获取bdUserGrowthTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserGrowthTwoyear() {
        return bdUserGrowthTwoyear;
    }

    /**
     * 设置bdUserGrowthTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserGrowthTwoyear(BigDecimal value) {
        this.bdUserGrowthTwoyear = value;
    }

    /**
     * 获取bdUserOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserOneyear() {
        return bdUserOneyear;
    }

    /**
     * 设置bdUserOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserOneyear(BigDecimal value) {
        this.bdUserOneyear = value;
    }

    /**
     * 获取bdUserSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserSixmonth() {
        return bdUserSixmonth;
    }

    /**
     * 设置bdUserSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserSixmonth(BigDecimal value) {
        this.bdUserSixmonth = value;
    }

    /**
     * 获取bdUserTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdUserTwoyear() {
        return bdUserTwoyear;
    }

    /**
     * 设置bdUserTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdUserTwoyear(BigDecimal value) {
        this.bdUserTwoyear = value;
    }

    /**
     * 获取buildScene属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuildScene() {
        return buildScene;
    }

    /**
     * 设置buildScene属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuildScene(String value) {
        this.buildScene = value;
    }

    /**
     * 获取bulidDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBulidDate() {
        return bulidDate;
    }

    /**
     * 设置bulidDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBulidDate(XMLGregorianCalendar value) {
        this.bulidDate = value;
    }

    /**
     * 获取bulidType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBulidType() {
        return bulidType;
    }

    /**
     * 设置bulidType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBulidType(String value) {
        this.bulidType = value;
    }

    /**
     * 获取capex属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapex() {
        return capex;
    }

    /**
     * 设置capex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapex(BigDecimal value) {
        this.capex = value;
    }

    /**
     * 获取cashAccFlowOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashAccFlowOneyear() {
        return cashAccFlowOneyear;
    }

    /**
     * 设置cashAccFlowOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashAccFlowOneyear(BigDecimal value) {
        this.cashAccFlowOneyear = value;
    }

    /**
     * 获取cashAccFlowSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashAccFlowSixmonth() {
        return cashAccFlowSixmonth;
    }

    /**
     * 设置cashAccFlowSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashAccFlowSixmonth(BigDecimal value) {
        this.cashAccFlowSixmonth = value;
    }

    /**
     * 获取cashAccFlowTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashAccFlowTwoyear() {
        return cashAccFlowTwoyear;
    }

    /**
     * 设置cashAccFlowTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashAccFlowTwoyear(BigDecimal value) {
        this.cashAccFlowTwoyear = value;
    }

    /**
     * 获取cashFlowOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashFlowOneyear() {
        return cashFlowOneyear;
    }

    /**
     * 设置cashFlowOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashFlowOneyear(BigDecimal value) {
        this.cashFlowOneyear = value;
    }

    /**
     * 获取cashFlowSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashFlowSixmonth() {
        return cashFlowSixmonth;
    }

    /**
     * 设置cashFlowSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashFlowSixmonth(BigDecimal value) {
        this.cashFlowSixmonth = value;
    }

    /**
     * 获取cashFlowTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashFlowTwoyear() {
        return cashFlowTwoyear;
    }

    /**
     * 设置cashFlowTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashFlowTwoyear(BigDecimal value) {
        this.cashFlowTwoyear = value;
    }

    /**
     * 获取cashNetFlowOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashNetFlowOneyear() {
        return cashNetFlowOneyear;
    }

    /**
     * 设置cashNetFlowOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashNetFlowOneyear(BigDecimal value) {
        this.cashNetFlowOneyear = value;
    }

    /**
     * 获取cashNetFlowSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashNetFlowSixmonth() {
        return cashNetFlowSixmonth;
    }

    /**
     * 设置cashNetFlowSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashNetFlowSixmonth(BigDecimal value) {
        this.cashNetFlowSixmonth = value;
    }

    /**
     * 获取cashNetFlowTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashNetFlowTwoyear() {
        return cashNetFlowTwoyear;
    }

    /**
     * 设置cashNetFlowTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashNetFlowTwoyear(BigDecimal value) {
        this.cashNetFlowTwoyear = value;
    }

    /**
     * 获取cashOutflowOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashOutflowOneyear() {
        return cashOutflowOneyear;
    }

    /**
     * 设置cashOutflowOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashOutflowOneyear(BigDecimal value) {
        this.cashOutflowOneyear = value;
    }

    /**
     * 获取cashOutflowSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashOutflowSixmonth() {
        return cashOutflowSixmonth;
    }

    /**
     * 设置cashOutflowSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashOutflowSixmonth(BigDecimal value) {
        this.cashOutflowSixmonth = value;
    }

    /**
     * 获取cashOutflowTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashOutflowTwoyear() {
        return cashOutflowTwoyear;
    }

    /**
     * 设置cashOutflowTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashOutflowTwoyear(BigDecimal value) {
        this.cashOutflowTwoyear = value;
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
     * 获取county属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置county属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * 获取cover3G属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCover3G() {
        return cover3G;
    }

    /**
     * 设置cover3G属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCover3G(String value) {
        this.cover3G = value;
    }

    /**
     * 获取cover4G属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCover4G() {
        return cover4G;
    }

    /**
     * 设置cover4G属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCover4G(String value) {
        this.cover4G = value;
    }

    /**
     * 获取coverRate属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCoverRate() {
        return coverRate;
    }

    /**
     * 设置coverRate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCoverRate(BigDecimal value) {
        this.coverRate = value;
    }

    /**
     * 获取createDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
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
     * 获取deviceAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * 设置deviceAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeviceAddress(String value) {
        this.deviceAddress = value;
    }

    /**
     * 获取deviceName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置deviceName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * 获取deviceType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置deviceType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * 获取fibreNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFibreNum() {
        return fibreNum;
    }

    /**
     * 设置fibreNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFibreNum(BigDecimal value) {
        this.fibreNum = value;
    }

    /**
     * 获取floorCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFloorCode() {
        return floorCode;
    }

    /**
     * 设置floorCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFloorCode(String value) {
        this.floorCode = value;
    }

    /**
     * 获取floorNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFloorNumber() {
        return floorNumber;
    }

    /**
     * 设置floorNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFloorNumber(BigDecimal value) {
        this.floorNumber = value;
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
     * 获取houseNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getHouseNum() {
        return houseNum;
    }

    /**
     * 设置houseNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setHouseNum(BigDecimal value) {
        this.houseNum = value;
    }

    /**
     * 获取houseNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getHouseNumber() {
        return houseNumber;
    }

    /**
     * 设置houseNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setHouseNumber(BigDecimal value) {
        this.houseNumber = value;
    }

    /**
     * 获取incomeOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIncomeOneyear() {
        return incomeOneyear;
    }

    /**
     * 设置incomeOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIncomeOneyear(BigDecimal value) {
        this.incomeOneyear = value;
    }

    /**
     * 获取incomeSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIncomeSixmonth() {
        return incomeSixmonth;
    }

    /**
     * 设置incomeSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIncomeSixmonth(BigDecimal value) {
        this.incomeSixmonth = value;
    }

    /**
     * 获取incomeTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIncomeTwoyear() {
        return incomeTwoyear;
    }

    /**
     * 设置incomeTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIncomeTwoyear(BigDecimal value) {
        this.incomeTwoyear = value;
    }

    /**
     * 获取joinType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJoinType() {
        return joinType;
    }

    /**
     * 设置joinType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJoinType(String value) {
        this.joinType = value;
    }

    /**
     * 获取lightSeat属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLightSeat() {
        return lightSeat;
    }

    /**
     * 设置lightSeat属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLightSeat(String value) {
        this.lightSeat = value;
    }

    /**
     * 获取lightVol属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLightVol() {
        return lightVol;
    }

    /**
     * 设置lightVol属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLightVol(BigDecimal value) {
        this.lightVol = value;
    }

    /**
     * 获取nbArpu属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNbArpu() {
        return nbArpu;
    }

    /**
     * 设置nbArpu属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNbArpu(BigDecimal value) {
        this.nbArpu = value;
    }

    /**
     * 获取numberPlate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * 设置numberPlate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberPlate(String value) {
        this.numberPlate = value;
    }

    /**
     * 获取operatorName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置operatorName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * 获取operatorUserNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOperatorUserNum() {
        return operatorUserNum;
    }

    /**
     * 设置operatorUserNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOperatorUserNum(BigDecimal value) {
        this.operatorUserNum = value;
    }

    /**
     * 获取portInteCost属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPortInteCost() {
        return portInteCost;
    }

    /**
     * 设置portInteCost属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPortInteCost(BigDecimal value) {
        this.portInteCost = value;
    }

    /**
     * 获取portNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPortNum() {
        return portNum;
    }

    /**
     * 设置portNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPortNum(BigDecimal value) {
        this.portNum = value;
    }

    /**
     * 获取portOccupyNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPortOccupyNum() {
        return portOccupyNum;
    }

    /**
     * 设置portOccupyNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPortOccupyNum(BigDecimal value) {
        this.portOccupyNum = value;
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
     * 获取regionType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegionType() {
        return regionType;
    }

    /**
     * 设置regionType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegionType(String value) {
        this.regionType = value;
    }

    /**
     * 获取remandCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRemandCode() {
        return remandCode;
    }

    /**
     * 设置remandCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRemandCode(Integer value) {
        this.remandCode = value;
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
     * 获取road属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRoad() {
        return road;
    }

    /**
     * 设置road属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRoad(String value) {
        this.road = value;
    }

    /**
     * 获取roomNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRoomNumber() {
        return roomNumber;
    }

    /**
     * 设置roomNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRoomNumber(BigDecimal value) {
        this.roomNumber = value;
    }

    /**
     * 获取street属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置street属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * 获取tenantNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTenantNum() {
        return tenantNum;
    }

    /**
     * 设置tenantNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTenantNum(BigDecimal value) {
        this.tenantNum = value;
    }

    /**
     * 获取tenantNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTenantNumber() {
        return tenantNumber;
    }

    /**
     * 设置tenantNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTenantNumber(BigDecimal value) {
        this.tenantNumber = value;
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

    /**
     * 获取touziPeriod属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTouziPeriod() {
        return touziPeriod;
    }

    /**
     * 设置touziPeriod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTouziPeriod(BigDecimal value) {
        this.touziPeriod = value;
    }

    /**
     * 获取vcIncomeOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcIncomeOneyear() {
        return vcIncomeOneyear;
    }

    /**
     * 设置vcIncomeOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcIncomeOneyear(BigDecimal value) {
        this.vcIncomeOneyear = value;
    }

    /**
     * 获取vcIncomeSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcIncomeSixmonth() {
        return vcIncomeSixmonth;
    }

    /**
     * 设置vcIncomeSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcIncomeSixmonth(BigDecimal value) {
        this.vcIncomeSixmonth = value;
    }

    /**
     * 获取vcIncomeTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcIncomeTwoyear() {
        return vcIncomeTwoyear;
    }

    /**
     * 设置vcIncomeTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcIncomeTwoyear(BigDecimal value) {
        this.vcIncomeTwoyear = value;
    }

    /**
     * 获取vcPortBulid属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcPortBulid() {
        return vcPortBulid;
    }

    /**
     * 设置vcPortBulid属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcPortBulid(BigDecimal value) {
        this.vcPortBulid = value;
    }

    /**
     * 获取vcUserCutover属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserCutover() {
        return vcUserCutover;
    }

    /**
     * 设置vcUserCutover属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserCutover(BigDecimal value) {
        this.vcUserCutover = value;
    }

    /**
     * 获取vcUserGrowth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserGrowth() {
        return vcUserGrowth;
    }

    /**
     * 设置vcUserGrowth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserGrowth(BigDecimal value) {
        this.vcUserGrowth = value;
    }

    /**
     * 获取vcUserGrowthOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserGrowthOneyear() {
        return vcUserGrowthOneyear;
    }

    /**
     * 设置vcUserGrowthOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserGrowthOneyear(BigDecimal value) {
        this.vcUserGrowthOneyear = value;
    }

    /**
     * 获取vcUserGrowthTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserGrowthTwoyear() {
        return vcUserGrowthTwoyear;
    }

    /**
     * 设置vcUserGrowthTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserGrowthTwoyear(BigDecimal value) {
        this.vcUserGrowthTwoyear = value;
    }

    /**
     * 获取vcUserNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserNum() {
        return vcUserNum;
    }

    /**
     * 设置vcUserNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserNum(BigDecimal value) {
        this.vcUserNum = value;
    }

    /**
     * 获取vcUserOneyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserOneyear() {
        return vcUserOneyear;
    }

    /**
     * 设置vcUserOneyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserOneyear(BigDecimal value) {
        this.vcUserOneyear = value;
    }

    /**
     * 获取vcUserSixmonth属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserSixmonth() {
        return vcUserSixmonth;
    }

    /**
     * 设置vcUserSixmonth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserSixmonth(BigDecimal value) {
        this.vcUserSixmonth = value;
    }

    /**
     * 获取vcUserTwoyear属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVcUserTwoyear() {
        return vcUserTwoyear;
    }

    /**
     * 设置vcUserTwoyear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVcUserTwoyear(BigDecimal value) {
        this.vcUserTwoyear = value;
    }

    /**
     * 获取villageCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVillageCode() {
        return villageCode;
    }

    /**
     * 设置villageCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVillageCode(String value) {
        this.villageCode = value;
    }

    /**
     * 获取villageName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * 设置villageName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVillageName(String value) {
        this.villageName = value;
    }

    /**
     * 获取voiceOccupyNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVoiceOccupyNum() {
        return voiceOccupyNum;
    }

    /**
     * 设置voiceOccupyNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVoiceOccupyNum(BigDecimal value) {
        this.voiceOccupyNum = value;
    }

    /**
     * 获取voicePortNum属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVoicePortNum() {
        return voicePortNum;
    }

    /**
     * 设置voicePortNum属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVoicePortNum(BigDecimal value) {
        this.voicePortNum = value;
    }

    /**
     * 获取wordDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWordDate() {
        return wordDate;
    }

    /**
     * 设置wordDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWordDate(BigDecimal value) {
        this.wordDate = value;
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
}