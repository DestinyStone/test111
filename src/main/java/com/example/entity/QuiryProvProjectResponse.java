package com.example.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiryProvProjectResponse", propOrder = {
        "serviceList"
})
public class QuiryProvProjectResponse
        extends OutParam
{

    @XmlElement(nillable = true)
    protected List<Project> serviceList;

    public void setServiceList(List<Project> serviceList) {
        this.serviceList = serviceList;
    }

    /**
     * Gets the value of the serviceList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project }
     *
     *
     */
    public List<Project> getServiceList() {
        if (serviceList == null) {
            serviceList = new ArrayList<Project>();
        }
        return this.serviceList;
    }

    @Override
    public String toString() {
        return "QuiryProvProjectResponse{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", serviceFlag='" + serviceFlag + '\'' +
                ", serviceMessage='" + serviceMessage + '\'' +
                ", totalPage=" + totalPage +
                ", totalRecord=" + totalRecord +
                ", listSize=" + getServiceList().size() +
                ", eg. =" + (getServiceList().size() > 0 ? getServiceList().get(0) :" -- ") +
                '}';
    }
}
