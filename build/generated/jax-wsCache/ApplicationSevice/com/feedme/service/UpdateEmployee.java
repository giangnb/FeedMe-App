
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://webservice.feedme.com/}employeeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEmployee", propOrder = {
    "employee"
})
public class UpdateEmployee {

    protected EmployeeDTO employee;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDTO }
     *     
     */
    public EmployeeDTO getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDTO }
     *     
     */
    public void setEmployee(EmployeeDTO value) {
        this.employee = value;
    }

}
