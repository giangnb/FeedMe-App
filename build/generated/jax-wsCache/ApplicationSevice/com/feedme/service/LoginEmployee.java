
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manager" type="{http://webservice.feedme.com/}managerDTO" minOccurs="0"/>
 *         &lt;element name="employeeUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginEmployee", propOrder = {
    "manager",
    "employeeUsername"
})
public class LoginEmployee {

    protected ManagerDTO manager;
    protected String employeeUsername;

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagerDTO }
     *     
     */
    public ManagerDTO getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagerDTO }
     *     
     */
    public void setManager(ManagerDTO value) {
        this.manager = value;
    }

    /**
     * Gets the value of the employeeUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeUsername() {
        return employeeUsername;
    }

    /**
     * Sets the value of the employeeUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeUsername(String value) {
        this.employeeUsername = value;
    }

}
