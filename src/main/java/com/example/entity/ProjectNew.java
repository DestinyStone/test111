package com.example.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectNew", propOrder = {
        "prov",
        "city",
        "projectCode",
        "projectName",
        "disYear",
        "touziSubject",
        "specA",
        "specB",
        "specC",
        "legalSubject",
        "disUnit",
        "networkLevel",
        "manageAttr",
        "bulidScene",
        "custAttr",
        "remandUnit",
        "disDept",
        "projectPolicy",
        "property",
        "moneyType",
        "specManage",
        "approveType",
        "projectTrial",
        "isPurchase",
        "isTwoPdm",
        "isSociety",
        "isService",
        "isEpc",
        "isLightChange",
        "projectState",
        "outputDate",
        "manageType",
        "postDisaster",
        "createdName",
        "createdEmail",
        "managerName",
        "managerEmail",
        "moneySource",
        "lxReplymanName",
        "lxReplymanEmail",
        "lxCreatedDate",
        "lxCreatedApproveDate",
        "lxDate",
        "lxSn",
        "lxTouZi",
        "lxCapex",
        "kyReplymanName",
        "kyReplymanEmail",
        "kyCreatedDate",
        "kyCreatedApproveDate",
        "kyDate",
        "kySn",
        "kyTouZi",
        "kyCapex",
        "sjReplymanName",
        "sjReplymanEmail",
        "sjCreatedDate",
        "sjCreatedApproveDate",
        "sjDate",
        "sjSn",
        "sjTouZi",
        "sjCapex",
        "zxTouZi",
        "zxCapex",
        "kyDelegationDate",
        "kyDelegationStaff",
        "kyDelegationPartner",
        "kyDelegationStaffPhone",
        "sjDelegationDate",
        "sjDelegationStaff",
        "sjDelegationPartner",
        "sjDelegationStaffPhone",
        "checkType",
        "planStartTime",
        "planFinishTime",
        "planCyTime",
        "planZyTime",
        "planYsTime",
        "actualStartTime",
        "arrivalDate",
        "actualFinishDate",
        "inspectionDate",
        "finalDate",
        "ysDate",
        "cyTouzi",
        "zyTouzi",
        "ysTouzi",
        "projectId",
        "autoType",
        "isJtmdz",
        "carryOverYear",
        "carryOverTouzi",
        "isCarryOver",
        "projectType",
        "erpCapex",
        "erpPorjState",
        "isKhms",
        "nowBalanceTotal",
        "projectMaterialsStartTotal",
        "currentYearTotal",
        "cuyTotalInvest",
        "buildContent",
        "otherLink",
        "otherDemand",
        "foreignTouzi",
        "buildScale",
        "attr1",
        "attr2",
        "attr3",
        "attr4",
        "attr5",
        "attr6",
        "attr7",
        "attr8",
        "attr9",
        "attr10",
        "attr11",
        "attr12",
        "attr13",
        "attr14",
        "attr15",
        "attr16",
        "attr17",
        "attr18",
        "attr19",
        "attr20"
})
public class ProjectNew {
    protected String prov;
    protected String city;
    protected String projectCode;
    protected String projectName;
    protected String disYear;
    protected String touziSubject;
    protected String specA;
    protected String specB;
    protected String specC;
    protected String legalSubject;
    protected String disUnit;
    protected String networkLevel;
    protected String manageAttr;
    protected String bulidScene;
    protected String custAttr;
    protected String remandUnit;
    protected String disDept;
    protected String projectPolicy;
    protected String property;
    protected String moneyType;
    protected String specManage;
    protected String approveType;
    protected String projectTrial;
    protected String isPurchase;
    protected String isTwoPdm;
    protected String isSociety;
    protected String isService;
    protected String isEpc;
    protected String isLightChange;
    protected String projectState;
    protected Date outputDate;
    protected String manageType;
    protected String postDisaster;
    protected String createdName;
    protected String createdEmail;
    protected String managerName;
    protected String managerEmail;
    protected String moneySource;
    protected String lxReplymanName;
    protected String lxReplymanEmail;
    protected Date lxCreatedDate;
    protected Date lxCreatedApproveDate;
    protected Date lxDate;
    protected String lxSn;
    protected BigDecimal lxTouZi;
    protected BigDecimal lxCapex;
    protected String kyReplymanName;
    protected String kyReplymanEmail;
    protected Date kyCreatedDate;
    protected Date kyCreatedApproveDate;
    protected Date kyDate;
    protected String kySn;
    protected BigDecimal kyTouZi;
    protected BigDecimal kyCapex;
    protected String sjReplymanName;
    protected String sjReplymanEmail;
    protected Date sjCreatedDate;
    protected Date sjCreatedApproveDate;
    protected Date sjDate;
    protected String sjSn;
    protected BigDecimal sjTouZi;
    protected BigDecimal sjCapex;
    protected BigDecimal zxTouZi;
    protected BigDecimal zxCapex;
    protected String kyDelegationDate;
    protected String kyDelegationStaff;
    protected String kyDelegationPartner;
    protected String kyDelegationStaffPhone;
    protected String sjDelegationDate;
    protected String sjDelegationStaff;
    protected String sjDelegationPartner;
    protected String sjDelegationStaffPhone;
    protected String checkType;
    protected Date planStartTime;
    protected Date planFinishTime;
    protected Date planCyTime;
    protected Date planZyTime;
    protected Date planYsTime;
    protected Date actualStartTime;
    protected Date arrivalDate;
    protected Date actualFinishDate;
    protected Date inspectionDate;
    protected Date finalDate;
    protected Date ysDate;
    protected BigDecimal cyTouzi;
    protected BigDecimal zyTouzi;
    protected BigDecimal ysTouzi;
    protected Long projectId;
    protected String autoType;
    protected String isJtmdz;
    protected String carryOverYear;
    protected BigDecimal carryOverTouzi;
    protected String isCarryOver;
    protected String projectType;
    protected BigDecimal erpCapex;
    protected String erpPorjState;
    protected String isKhms;
    protected String nowBalanceTotal;
    protected String projectMaterialsStartTotal;
    protected String currentYearTotal;
    protected String cuyTotalInvest;
    protected String buildContent;
    protected String otherLink;
    protected String otherDemand;
    protected String foreignTouzi;
    protected String buildScale;
    protected String attr1;
    protected String attr2;
    protected String attr3;
    protected String attr4;
    protected String attr5;
    protected String attr6;
    protected String attr7;
    protected String attr8;
    protected String attr9;
    protected String attr10;
    protected String attr11;
    protected String attr12;
    protected String attr13;
    protected String attr14;
    protected String attr15;
    protected String attr16;
    protected String attr17;
    protected String attr18;
    protected String attr19;
    protected String attr20;

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDisYear() {
        return disYear;
    }

    public void setDisYear(String disYear) {
        this.disYear = disYear;
    }

    public String getTouziSubject() {
        return touziSubject;
    }

    public void setTouziSubject(String touziSubject) {
        this.touziSubject = touziSubject;
    }

    public String getSpecA() {
        return specA;
    }

    public void setSpecA(String specA) {
        this.specA = specA;
    }

    public String getSpecB() {
        return specB;
    }

    public void setSpecB(String specB) {
        this.specB = specB;
    }

    public String getSpecC() {
        return specC;
    }

    public void setSpecC(String specC) {
        this.specC = specC;
    }

    public String getLegalSubject() {
        return legalSubject;
    }

    public void setLegalSubject(String legalSubject) {
        this.legalSubject = legalSubject;
    }

    public String getDisUnit() {
        return disUnit;
    }

    public void setDisUnit(String disUnit) {
        this.disUnit = disUnit;
    }

    public String getNetworkLevel() {
        return networkLevel;
    }

    public void setNetworkLevel(String networkLevel) {
        this.networkLevel = networkLevel;
    }

    public String getManageAttr() {
        return manageAttr;
    }

    public void setManageAttr(String manageAttr) {
        this.manageAttr = manageAttr;
    }

    public String getBulidScene() {
        return bulidScene;
    }

    public void setBulidScene(String bulidScene) {
        this.bulidScene = bulidScene;
    }

    public String getCustAttr() {
        return custAttr;
    }

    public void setCustAttr(String custAttr) {
        this.custAttr = custAttr;
    }

    public String getRemandUnit() {
        return remandUnit;
    }

    public void setRemandUnit(String remandUnit) {
        this.remandUnit = remandUnit;
    }

    public String getDisDept() {
        return disDept;
    }

    public void setDisDept(String disDept) {
        this.disDept = disDept;
    }

    public String getProjectPolicy() {
        return projectPolicy;
    }

    public void setProjectPolicy(String projectPolicy) {
        this.projectPolicy = projectPolicy;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public String getSpecManage() {
        return specManage;
    }

    public void setSpecManage(String specManage) {
        this.specManage = specManage;
    }

    public String getApproveType() {
        return approveType;
    }

    public void setApproveType(String approveType) {
        this.approveType = approveType;
    }

    public String getProjectTrial() {
        return projectTrial;
    }

    public void setProjectTrial(String projectTrial) {
        this.projectTrial = projectTrial;
    }

    public String getIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(String isPurchase) {
        this.isPurchase = isPurchase;
    }

    public String getIsTwoPdm() {
        return isTwoPdm;
    }

    public void setIsTwoPdm(String isTwoPdm) {
        this.isTwoPdm = isTwoPdm;
    }

    public String getIsSociety() {
        return isSociety;
    }

    public void setIsSociety(String isSociety) {
        this.isSociety = isSociety;
    }

    public String getIsService() {
        return isService;
    }

    public void setIsService(String isService) {
        this.isService = isService;
    }

    public String getIsEpc() {
        return isEpc;
    }

    public void setIsEpc(String isEpc) {
        this.isEpc = isEpc;
    }

    public String getIsLightChange() {
        return isLightChange;
    }

    public void setIsLightChange(String isLightChange) {
        this.isLightChange = isLightChange;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    public Date getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(Date outputDate) {
        this.outputDate = outputDate;
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public String getPostDisaster() {
        return postDisaster;
    }

    public void setPostDisaster(String postDisaster) {
        this.postDisaster = postDisaster;
    }

    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    public String getCreatedEmail() {
        return createdEmail;
    }

    public void setCreatedEmail(String createdEmail) {
        this.createdEmail = createdEmail;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getMoneySource() {
        return moneySource;
    }

    public void setMoneySource(String moneySource) {
        this.moneySource = moneySource;
    }

    public String getLxReplymanName() {
        return lxReplymanName;
    }

    public void setLxReplymanName(String lxReplymanName) {
        this.lxReplymanName = lxReplymanName;
    }

    public String getLxReplymanEmail() {
        return lxReplymanEmail;
    }

    public void setLxReplymanEmail(String lxReplymanEmail) {
        this.lxReplymanEmail = lxReplymanEmail;
    }

    public Date getLxCreatedDate() {
        return lxCreatedDate;
    }

    public void setLxCreatedDate(Date lxCreatedDate) {
        this.lxCreatedDate = lxCreatedDate;
    }

    public Date getLxCreatedApproveDate() {
        return lxCreatedApproveDate;
    }

    public void setLxCreatedApproveDate(Date lxCreatedApproveDate) {
        this.lxCreatedApproveDate = lxCreatedApproveDate;
    }

    public Date getLxDate() {
        return lxDate;
    }

    public void setLxDate(Date lxDate) {
        this.lxDate = lxDate;
    }

    public String getLxSn() {
        return lxSn;
    }

    public void setLxSn(String lxSn) {
        this.lxSn = lxSn;
    }

    public BigDecimal getLxTouZi() {
        return lxTouZi;
    }

    public void setLxTouZi(BigDecimal lxTouZi) {
        this.lxTouZi = lxTouZi;
    }

    public BigDecimal getLxCapex() {
        return lxCapex;
    }

    public void setLxCapex(BigDecimal lxCapex) {
        this.lxCapex = lxCapex;
    }

    public String getKyReplymanName() {
        return kyReplymanName;
    }

    public void setKyReplymanName(String kyReplymanName) {
        this.kyReplymanName = kyReplymanName;
    }

    public String getKyReplymanEmail() {
        return kyReplymanEmail;
    }

    public void setKyReplymanEmail(String kyReplymanEmail) {
        this.kyReplymanEmail = kyReplymanEmail;
    }

    public Date getKyCreatedDate() {
        return kyCreatedDate;
    }

    public void setKyCreatedDate(Date kyCreatedDate) {
        this.kyCreatedDate = kyCreatedDate;
    }

    public Date getKyCreatedApproveDate() {
        return kyCreatedApproveDate;
    }

    public void setKyCreatedApproveDate(Date kyCreatedApproveDate) {
        this.kyCreatedApproveDate = kyCreatedApproveDate;
    }

    public Date getKyDate() {
        return kyDate;
    }

    public void setKyDate(Date kyDate) {
        this.kyDate = kyDate;
    }

    public String getKySn() {
        return kySn;
    }

    public void setKySn(String kySn) {
        this.kySn = kySn;
    }

    public BigDecimal getKyTouZi() {
        return kyTouZi;
    }

    public void setKyTouZi(BigDecimal kyTouZi) {
        this.kyTouZi = kyTouZi;
    }

    public BigDecimal getKyCapex() {
        return kyCapex;
    }

    public void setKyCapex(BigDecimal kyCapex) {
        this.kyCapex = kyCapex;
    }

    public String getSjReplymanName() {
        return sjReplymanName;
    }

    public void setSjReplymanName(String sjReplymanName) {
        this.sjReplymanName = sjReplymanName;
    }

    public String getSjReplymanEmail() {
        return sjReplymanEmail;
    }

    public void setSjReplymanEmail(String sjReplymanEmail) {
        this.sjReplymanEmail = sjReplymanEmail;
    }

    public Date getSjCreatedDate() {
        return sjCreatedDate;
    }

    public void setSjCreatedDate(Date sjCreatedDate) {
        this.sjCreatedDate = sjCreatedDate;
    }

    public Date getSjCreatedApproveDate() {
        return sjCreatedApproveDate;
    }

    public void setSjCreatedApproveDate(Date sjCreatedApproveDate) {
        this.sjCreatedApproveDate = sjCreatedApproveDate;
    }

    public Date getSjDate() {
        return sjDate;
    }

    public void setSjDate(Date sjDate) {
        this.sjDate = sjDate;
    }

    public String getSjSn() {
        return sjSn;
    }

    public void setSjSn(String sjSn) {
        this.sjSn = sjSn;
    }

    public BigDecimal getSjTouZi() {
        return sjTouZi;
    }

    public void setSjTouZi(BigDecimal sjTouZi) {
        this.sjTouZi = sjTouZi;
    }

    public BigDecimal getSjCapex() {
        return sjCapex;
    }

    public void setSjCapex(BigDecimal sjCapex) {
        this.sjCapex = sjCapex;
    }

    public BigDecimal getZxTouZi() {
        return zxTouZi;
    }

    public void setZxTouZi(BigDecimal zxTouZi) {
        this.zxTouZi = zxTouZi;
    }

    public BigDecimal getZxCapex() {
        return zxCapex;
    }

    public void setZxCapex(BigDecimal zxCapex) {
        this.zxCapex = zxCapex;
    }

    public String getKyDelegationDate() {
        return kyDelegationDate;
    }

    public void setKyDelegationDate(String kyDelegationDate) {
        this.kyDelegationDate = kyDelegationDate;
    }

    public String getKyDelegationStaff() {
        return kyDelegationStaff;
    }

    public void setKyDelegationStaff(String kyDelegationStaff) {
        this.kyDelegationStaff = kyDelegationStaff;
    }

    public String getKyDelegationPartner() {
        return kyDelegationPartner;
    }

    public void setKyDelegationPartner(String kyDelegationPartner) {
        this.kyDelegationPartner = kyDelegationPartner;
    }

    public String getKyDelegationStaffPhone() {
        return kyDelegationStaffPhone;
    }

    public void setKyDelegationStaffPhone(String kyDelegationStaffPhone) {
        this.kyDelegationStaffPhone = kyDelegationStaffPhone;
    }

    public String getSjDelegationDate() {
        return sjDelegationDate;
    }

    public void setSjDelegationDate(String sjDelegationDate) {
        this.sjDelegationDate = sjDelegationDate;
    }

    public String getSjDelegationStaff() {
        return sjDelegationStaff;
    }

    public void setSjDelegationStaff(String sjDelegationStaff) {
        this.sjDelegationStaff = sjDelegationStaff;
    }

    public String getSjDelegationPartner() {
        return sjDelegationPartner;
    }

    public void setSjDelegationPartner(String sjDelegationPartner) {
        this.sjDelegationPartner = sjDelegationPartner;
    }

    public String getSjDelegationStaffPhone() {
        return sjDelegationStaffPhone;
    }

    public void setSjDelegationStaffPhone(String sjDelegationStaffPhone) {
        this.sjDelegationStaffPhone = sjDelegationStaffPhone;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanFinishTime() {
        return planFinishTime;
    }

    public void setPlanFinishTime(Date planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    public Date getPlanCyTime() {
        return planCyTime;
    }

    public void setPlanCyTime(Date planCyTime) {
        this.planCyTime = planCyTime;
    }

    public Date getPlanZyTime() {
        return planZyTime;
    }

    public void setPlanZyTime(Date planZyTime) {
        this.planZyTime = planZyTime;
    }

    public Date getPlanYsTime() {
        return planYsTime;
    }

    public void setPlanYsTime(Date planYsTime) {
        this.planYsTime = planYsTime;
    }

    public Date getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(Date actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getActualFinishDate() {
        return actualFinishDate;
    }

    public void setActualFinishDate(Date actualFinishDate) {
        this.actualFinishDate = actualFinishDate;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Date getYsDate() {
        return ysDate;
    }

    public void setYsDate(Date ysDate) {
        this.ysDate = ysDate;
    }

    public BigDecimal getCyTouzi() {
        return cyTouzi;
    }

    public void setCyTouzi(BigDecimal cyTouzi) {
        this.cyTouzi = cyTouzi;
    }

    public BigDecimal getZyTouzi() {
        return zyTouzi;
    }

    public void setZyTouzi(BigDecimal zyTouzi) {
        this.zyTouzi = zyTouzi;
    }

    public BigDecimal getYsTouzi() {
        return ysTouzi;
    }

    public void setYsTouzi(BigDecimal ysTouzi) {
        this.ysTouzi = ysTouzi;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getAutoType() {
        return autoType;
    }

    public void setAutoType(String autoType) {
        this.autoType = autoType;
    }

    public String getIsJtmdz() {
        return isJtmdz;
    }

    public void setIsJtmdz(String isJtmdz) {
        this.isJtmdz = isJtmdz;
    }

    public String getCarryOverYear() {
        return carryOverYear;
    }

    public void setCarryOverYear(String carryOverYear) {
        this.carryOverYear = carryOverYear;
    }

    public BigDecimal getCarryOverTouzi() {
        return carryOverTouzi;
    }

    public void setCarryOverTouzi(BigDecimal carryOverTouzi) {
        this.carryOverTouzi = carryOverTouzi;
    }

    public String getIsCarryOver() {
        return isCarryOver;
    }

    public void setIsCarryOver(String isCarryOver) {
        this.isCarryOver = isCarryOver;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public BigDecimal getErpCapex() {
        return erpCapex;
    }

    public void setErpCapex(BigDecimal erpCapex) {
        this.erpCapex = erpCapex;
    }

    public String getErpPorjState() {
        return erpPorjState;
    }

    public void setErpPorjState(String erpPorjState) {
        this.erpPorjState = erpPorjState;
    }

    public String getIsKhms() {
        return isKhms;
    }

    public void setIsKhms(String isKhms) {
        this.isKhms = isKhms;
    }

    public String getNowBalanceTotal() {
        return nowBalanceTotal;
    }

    public void setNowBalanceTotal(String nowBalanceTotal) {
        this.nowBalanceTotal = nowBalanceTotal;
    }

    public String getProjectMaterialsStartTotal() {
        return projectMaterialsStartTotal;
    }

    public void setProjectMaterialsStartTotal(String projectMaterialsStartTotal) {
        this.projectMaterialsStartTotal = projectMaterialsStartTotal;
    }

    public String getCurrentYearTotal() {
        return currentYearTotal;
    }

    public void setCurrentYearTotal(String currentYearTotal) {
        this.currentYearTotal = currentYearTotal;
    }

    public String getCuyTotalInvest() {
        return cuyTotalInvest;
    }

    public void setCuyTotalInvest(String cuyTotalInvest) {
        this.cuyTotalInvest = cuyTotalInvest;
    }

    public String getBuildContent() {
        return buildContent;
    }

    public void setBuildContent(String buildContent) {
        this.buildContent = buildContent;
    }

    public String getOtherLink() {
        return otherLink;
    }

    public void setOtherLink(String otherLink) {
        this.otherLink = otherLink;
    }

    public String getOtherDemand() {
        return otherDemand;
    }

    public void setOtherDemand(String otherDemand) {
        this.otherDemand = otherDemand;
    }

    public String getForeignTouzi() {
        return foreignTouzi;
    }

    public void setForeignTouzi(String foreignTouzi) {
        this.foreignTouzi = foreignTouzi;
    }

    public String getBuildScale() {
        return buildScale;
    }

    public void setBuildScale(String buildScale) {
        this.buildScale = buildScale;
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

    public String getAttr6() {
        return attr6;
    }

    public void setAttr6(String attr6) {
        this.attr6 = attr6;
    }

    public String getAttr7() {
        return attr7;
    }

    public void setAttr7(String attr7) {
        this.attr7 = attr7;
    }

    public String getAttr8() {
        return attr8;
    }

    public void setAttr8(String attr8) {
        this.attr8 = attr8;
    }

    public String getAttr9() {
        return attr9;
    }

    public void setAttr9(String attr9) {
        this.attr9 = attr9;
    }

    public String getAttr10() {
        return attr10;
    }

    public void setAttr10(String attr10) {
        this.attr10 = attr10;
    }

    public String getAttr11() {
        return attr11;
    }

    public void setAttr11(String attr11) {
        this.attr11 = attr11;
    }

    public String getAttr12() {
        return attr12;
    }

    public void setAttr12(String attr12) {
        this.attr12 = attr12;
    }

    public String getAttr13() {
        return attr13;
    }

    public void setAttr13(String attr13) {
        this.attr13 = attr13;
    }

    public String getAttr14() {
        return attr14;
    }

    public void setAttr14(String attr14) {
        this.attr14 = attr14;
    }

    public String getAttr15() {
        return attr15;
    }

    public void setAttr15(String attr15) {
        this.attr15 = attr15;
    }

    public String getAttr16() {
        return attr16;
    }

    public void setAttr16(String attr16) {
        this.attr16 = attr16;
    }

    public String getAttr17() {
        return attr17;
    }

    public void setAttr17(String attr17) {
        this.attr17 = attr17;
    }

    public String getAttr18() {
        return attr18;
    }

    public void setAttr18(String attr18) {
        this.attr18 = attr18;
    }

    public String getAttr19() {
        return attr19;
    }

    public void setAttr19(String attr19) {
        this.attr19 = attr19;
    }

    public String getAttr20() {
        return attr20;
    }

    public void setAttr20(String attr20) {
        this.attr20 = attr20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectNew that = (ProjectNew) o;
        return Objects.equals(prov, that.prov) && Objects.equals(city, that.city) && Objects.equals(projectCode, that.projectCode) && Objects.equals(projectName, that.projectName) && Objects.equals(disYear, that.disYear) && Objects.equals(touziSubject, that.touziSubject) && Objects.equals(specA, that.specA) && Objects.equals(specB, that.specB) && Objects.equals(specC, that.specC) && Objects.equals(legalSubject, that.legalSubject) && Objects.equals(disUnit, that.disUnit) && Objects.equals(networkLevel, that.networkLevel) && Objects.equals(manageAttr, that.manageAttr) && Objects.equals(bulidScene, that.bulidScene) && Objects.equals(custAttr, that.custAttr) && Objects.equals(remandUnit, that.remandUnit) && Objects.equals(disDept, that.disDept) && Objects.equals(projectPolicy, that.projectPolicy) && Objects.equals(property, that.property) && Objects.equals(moneyType, that.moneyType) && Objects.equals(specManage, that.specManage) && Objects.equals(approveType, that.approveType) && Objects.equals(projectTrial, that.projectTrial) && Objects.equals(isPurchase, that.isPurchase) && Objects.equals(isTwoPdm, that.isTwoPdm) && Objects.equals(isSociety, that.isSociety) && Objects.equals(isService, that.isService) && Objects.equals(isEpc, that.isEpc) && Objects.equals(isLightChange, that.isLightChange) && Objects.equals(projectState, that.projectState) && Objects.equals(outputDate, that.outputDate) && Objects.equals(manageType, that.manageType) && Objects.equals(postDisaster, that.postDisaster) && Objects.equals(createdName, that.createdName) && Objects.equals(createdEmail, that.createdEmail) && Objects.equals(managerName, that.managerName) && Objects.equals(managerEmail, that.managerEmail) && Objects.equals(moneySource, that.moneySource) && Objects.equals(lxReplymanName, that.lxReplymanName) && Objects.equals(lxReplymanEmail, that.lxReplymanEmail) && Objects.equals(lxCreatedDate, that.lxCreatedDate) && Objects.equals(lxCreatedApproveDate, that.lxCreatedApproveDate) && Objects.equals(lxDate, that.lxDate) && Objects.equals(lxSn, that.lxSn) && Objects.equals(lxTouZi, that.lxTouZi) && Objects.equals(lxCapex, that.lxCapex) && Objects.equals(kyReplymanName, that.kyReplymanName) && Objects.equals(kyReplymanEmail, that.kyReplymanEmail) && Objects.equals(kyCreatedDate, that.kyCreatedDate) && Objects.equals(kyCreatedApproveDate, that.kyCreatedApproveDate) && Objects.equals(kyDate, that.kyDate) && Objects.equals(kySn, that.kySn) && Objects.equals(kyTouZi, that.kyTouZi) && Objects.equals(kyCapex, that.kyCapex) && Objects.equals(sjReplymanName, that.sjReplymanName) && Objects.equals(sjReplymanEmail, that.sjReplymanEmail) && Objects.equals(sjCreatedDate, that.sjCreatedDate) && Objects.equals(sjCreatedApproveDate, that.sjCreatedApproveDate) && Objects.equals(sjDate, that.sjDate) && Objects.equals(sjSn, that.sjSn) && Objects.equals(sjTouZi, that.sjTouZi) && Objects.equals(sjCapex, that.sjCapex) && Objects.equals(zxTouZi, that.zxTouZi) && Objects.equals(zxCapex, that.zxCapex) && Objects.equals(kyDelegationDate, that.kyDelegationDate) && Objects.equals(kyDelegationStaff, that.kyDelegationStaff) && Objects.equals(kyDelegationPartner, that.kyDelegationPartner) && Objects.equals(kyDelegationStaffPhone, that.kyDelegationStaffPhone) && Objects.equals(sjDelegationDate, that.sjDelegationDate) && Objects.equals(sjDelegationStaff, that.sjDelegationStaff) && Objects.equals(sjDelegationPartner, that.sjDelegationPartner) && Objects.equals(sjDelegationStaffPhone, that.sjDelegationStaffPhone) && Objects.equals(checkType, that.checkType) && Objects.equals(planStartTime, that.planStartTime) && Objects.equals(planFinishTime, that.planFinishTime) && Objects.equals(planCyTime, that.planCyTime) && Objects.equals(planZyTime, that.planZyTime) && Objects.equals(planYsTime, that.planYsTime) && Objects.equals(actualStartTime, that.actualStartTime) && Objects.equals(arrivalDate, that.arrivalDate) && Objects.equals(actualFinishDate, that.actualFinishDate) && Objects.equals(inspectionDate, that.inspectionDate) && Objects.equals(finalDate, that.finalDate) && Objects.equals(ysDate, that.ysDate) && Objects.equals(cyTouzi, that.cyTouzi) && Objects.equals(zyTouzi, that.zyTouzi) && Objects.equals(ysTouzi, that.ysTouzi) && Objects.equals(projectId, that.projectId) && Objects.equals(autoType, that.autoType) && Objects.equals(isJtmdz, that.isJtmdz) && Objects.equals(carryOverYear, that.carryOverYear) && Objects.equals(carryOverTouzi, that.carryOverTouzi) && Objects.equals(isCarryOver, that.isCarryOver) && Objects.equals(projectType, that.projectType) && Objects.equals(erpCapex, that.erpCapex) && Objects.equals(erpPorjState, that.erpPorjState) && Objects.equals(isKhms, that.isKhms) && Objects.equals(nowBalanceTotal, that.nowBalanceTotal) && Objects.equals(projectMaterialsStartTotal, that.projectMaterialsStartTotal) && Objects.equals(currentYearTotal, that.currentYearTotal) && Objects.equals(cuyTotalInvest, that.cuyTotalInvest) && Objects.equals(buildContent, that.buildContent) && Objects.equals(otherLink, that.otherLink) && Objects.equals(otherDemand, that.otherDemand) && Objects.equals(foreignTouzi, that.foreignTouzi) && Objects.equals(buildScale, that.buildScale) && Objects.equals(attr1, that.attr1) && Objects.equals(attr2, that.attr2) && Objects.equals(attr3, that.attr3) && Objects.equals(attr4, that.attr4) && Objects.equals(attr5, that.attr5) && Objects.equals(attr6, that.attr6) && Objects.equals(attr7, that.attr7) && Objects.equals(attr8, that.attr8) && Objects.equals(attr9, that.attr9) && Objects.equals(attr10, that.attr10) && Objects.equals(attr11, that.attr11) && Objects.equals(attr12, that.attr12) && Objects.equals(attr13, that.attr13) && Objects.equals(attr14, that.attr14) && Objects.equals(attr15, that.attr15) && Objects.equals(attr16, that.attr16) && Objects.equals(attr17, that.attr17) && Objects.equals(attr18, that.attr18) && Objects.equals(attr19, that.attr19) && Objects.equals(attr20, that.attr20);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prov, city, projectCode, projectName, disYear, touziSubject, specA, specB, specC, legalSubject, disUnit, networkLevel, manageAttr, bulidScene, custAttr, remandUnit, disDept, projectPolicy, property, moneyType, specManage, approveType, projectTrial, isPurchase, isTwoPdm, isSociety, isService, isEpc, isLightChange, projectState, outputDate, manageType, postDisaster, createdName, createdEmail, managerName, managerEmail, moneySource, lxReplymanName, lxReplymanEmail, lxCreatedDate, lxCreatedApproveDate, lxDate, lxSn, lxTouZi, lxCapex, kyReplymanName, kyReplymanEmail, kyCreatedDate, kyCreatedApproveDate, kyDate, kySn, kyTouZi, kyCapex, sjReplymanName, sjReplymanEmail, sjCreatedDate, sjCreatedApproveDate, sjDate, sjSn, sjTouZi, sjCapex, zxTouZi, zxCapex, kyDelegationDate, kyDelegationStaff, kyDelegationPartner, kyDelegationStaffPhone, sjDelegationDate, sjDelegationStaff, sjDelegationPartner, sjDelegationStaffPhone, checkType, planStartTime, planFinishTime, planCyTime, planZyTime, planYsTime, actualStartTime, arrivalDate, actualFinishDate, inspectionDate, finalDate, ysDate, cyTouzi, zyTouzi, ysTouzi, projectId, autoType, isJtmdz, carryOverYear, carryOverTouzi, isCarryOver, projectType, erpCapex, erpPorjState, isKhms, nowBalanceTotal, projectMaterialsStartTotal, currentYearTotal, cuyTotalInvest, buildContent, otherLink, otherDemand, foreignTouzi, buildScale, attr1, attr2, attr3, attr4, attr5, attr6, attr7, attr8, attr9, attr10, attr11, attr12, attr13, attr14, attr15, attr16, attr17, attr18, attr19, attr20);
    }

    @Override
    public String toString() {
        return "ProjectNew{" +
                "prov='" + prov + '\'' +
                ", city='" + city + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", projectName='" + projectName + '\'' +
                ", disYear='" + disYear + '\'' +
                ", touziSubject='" + touziSubject + '\'' +
                ", specA='" + specA + '\'' +
                ", specB='" + specB + '\'' +
                ", specC='" + specC + '\'' +
                ", legalSubject='" + legalSubject + '\'' +
                ", disUnit='" + disUnit + '\'' +
                ", networkLevel='" + networkLevel + '\'' +
                ", manageAttr='" + manageAttr + '\'' +
                ", bulidScene='" + bulidScene + '\'' +
                ", custAttr='" + custAttr + '\'' +
                ", remandUnit='" + remandUnit + '\'' +
                ", disDept='" + disDept + '\'' +
                ", projectPolicy='" + projectPolicy + '\'' +
                ", property='" + property + '\'' +
                ", moneyType='" + moneyType + '\'' +
                ", specManage='" + specManage + '\'' +
                ", approveType='" + approveType + '\'' +
                ", projectTrial='" + projectTrial + '\'' +
                ", isPurchase='" + isPurchase + '\'' +
                ", isTwoPdm='" + isTwoPdm + '\'' +
                ", isSociety='" + isSociety + '\'' +
                ", isService='" + isService + '\'' +
                ", isEpc='" + isEpc + '\'' +
                ", isLightChange='" + isLightChange + '\'' +
                ", projectState='" + projectState + '\'' +
                ", outputDate=" + outputDate +
                ", manageType='" + manageType + '\'' +
                ", postDisaster='" + postDisaster + '\'' +
                ", createdName='" + createdName + '\'' +
                ", createdEmail='" + createdEmail + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", moneySource='" + moneySource + '\'' +
                ", lxReplymanName='" + lxReplymanName + '\'' +
                ", lxReplymanEmail='" + lxReplymanEmail + '\'' +
                ", lxCreatedDate=" + lxCreatedDate +
                ", lxCreatedApproveDate=" + lxCreatedApproveDate +
                ", lxDate=" + lxDate +
                ", lxSn='" + lxSn + '\'' +
                ", lxTouZi=" + lxTouZi +
                ", lxCapex=" + lxCapex +
                ", kyReplymanName='" + kyReplymanName + '\'' +
                ", kyReplymanEmail='" + kyReplymanEmail + '\'' +
                ", kyCreatedDate=" + kyCreatedDate +
                ", kyCreatedApproveDate=" + kyCreatedApproveDate +
                ", kyDate=" + kyDate +
                ", kySn='" + kySn + '\'' +
                ", kyTouZi=" + kyTouZi +
                ", kyCapex=" + kyCapex +
                ", sjReplymanName='" + sjReplymanName + '\'' +
                ", sjReplymanEmail='" + sjReplymanEmail + '\'' +
                ", sjCreatedDate=" + sjCreatedDate +
                ", sjCreatedApproveDate=" + sjCreatedApproveDate +
                ", sjDate=" + sjDate +
                ", sjSn='" + sjSn + '\'' +
                ", sjTouZi=" + sjTouZi +
                ", sjCapex=" + sjCapex +
                ", zxTouZi=" + zxTouZi +
                ", zxCapex=" + zxCapex +
                ", kyDelegationDate='" + kyDelegationDate + '\'' +
                ", kyDelegationStaff='" + kyDelegationStaff + '\'' +
                ", kyDelegationPartner='" + kyDelegationPartner + '\'' +
                ", kyDelegationStaffPhone='" + kyDelegationStaffPhone + '\'' +
                ", sjDelegationDate='" + sjDelegationDate + '\'' +
                ", sjDelegationStaff='" + sjDelegationStaff + '\'' +
                ", sjDelegationPartner='" + sjDelegationPartner + '\'' +
                ", sjDelegationStaffPhone='" + sjDelegationStaffPhone + '\'' +
                ", checkType='" + checkType + '\'' +
                ", planStartTime=" + planStartTime +
                ", planFinishTime=" + planFinishTime +
                ", planCyTime=" + planCyTime +
                ", planZyTime=" + planZyTime +
                ", planYsTime=" + planYsTime +
                ", actualStartTime=" + actualStartTime +
                ", arrivalDate=" + arrivalDate +
                ", actualFinishDate=" + actualFinishDate +
                ", inspectionDate=" + inspectionDate +
                ", finalDate=" + finalDate +
                ", ysDate=" + ysDate +
                ", cyTouzi=" + cyTouzi +
                ", zyTouzi=" + zyTouzi +
                ", ysTouzi=" + ysTouzi +
                ", projectId=" + projectId +
                ", autoType='" + autoType + '\'' +
                ", isJtmdz='" + isJtmdz + '\'' +
                ", carryOverYear='" + carryOverYear + '\'' +
                ", carryOverTouzi=" + carryOverTouzi +
                ", isCarryOver='" + isCarryOver + '\'' +
                ", projectType='" + projectType + '\'' +
                ", erpCapex=" + erpCapex +
                ", erpPorjState='" + erpPorjState + '\'' +
                ", isKhms='" + isKhms + '\'' +
                ", nowBalanceTotal='" + nowBalanceTotal + '\'' +
                ", projectMaterialsStartTotal='" + projectMaterialsStartTotal + '\'' +
                ", currentYearTotal='" + currentYearTotal + '\'' +
                ", cuyTotalInvest='" + cuyTotalInvest + '\'' +
                ", buildContent='" + buildContent + '\'' +
                ", otherLink='" + otherLink + '\'' +
                ", otherDemand='" + otherDemand + '\'' +
                ", foreignTouzi='" + foreignTouzi + '\'' +
                ", buildScale='" + buildScale + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", attr4='" + attr4 + '\'' +
                ", attr5='" + attr5 + '\'' +
                ", attr6='" + attr6 + '\'' +
                ", attr7='" + attr7 + '\'' +
                ", attr8='" + attr8 + '\'' +
                ", attr9='" + attr9 + '\'' +
                ", attr10='" + attr10 + '\'' +
                ", attr11='" + attr11 + '\'' +
                ", attr12='" + attr12 + '\'' +
                ", attr13='" + attr13 + '\'' +
                ", attr14='" + attr14 + '\'' +
                ", attr15='" + attr15 + '\'' +
                ", attr16='" + attr16 + '\'' +
                ", attr17='" + attr17 + '\'' +
                ", attr18='" + attr18 + '\'' +
                ", attr19='" + attr19 + '\'' +
                ", attr20='" + attr20 + '\'' +
                '}';
    }
}
