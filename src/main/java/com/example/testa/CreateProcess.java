package com.example.testa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for createProcess complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="createProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlcontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createProcess", propOrder = { "pass", "xmlcontent" })
public class CreateProcess {

	protected String pass;
	protected String xmlcontent;

	/**
	 * Gets the value of the pass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Sets the value of the pass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPass(String value) {
		this.pass = value;
	}

	/**
	 * Gets the value of the xmlcontent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXmlcontent() {
		return xmlcontent;
	}

	/**
	 * Sets the value of the xmlcontent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXmlcontent(String value) {
		this.xmlcontent = value;
	}

}
