
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://webservice.feedme.com/}employeeDTO" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="log" type="{http://webservice.feedme.com/}log" minOccurs="0"/>
 *         &lt;element name="ratingAvg" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ttoalIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDTO", propOrder = {
    "employee",
    "id",
    "log",
    "ratingAvg",
    "title",
    "totalOrders",
    "ttoalIncome"
})
public class LogDTO {

    protected EmployeeDTO employee;
    protected Integer id;
    protected Log log;
    protected float ratingAvg;
    protected String title;
    protected int totalOrders;
    protected double ttoalIncome;

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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

    /**
     * Gets the value of the ratingAvg property.
     * 
     */
    public float getRatingAvg() {
        return ratingAvg;
    }

    /**
     * Sets the value of the ratingAvg property.
     * 
     */
    public void setRatingAvg(float value) {
        this.ratingAvg = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalOrders property.
     * 
     */
    public int getTotalOrders() {
        return totalOrders;
    }

    /**
     * Sets the value of the totalOrders property.
     * 
     */
    public void setTotalOrders(int value) {
        this.totalOrders = value;
    }

    /**
     * Gets the value of the ttoalIncome property.
     * 
     */
    public double getTtoalIncome() {
        return ttoalIncome;
    }

    /**
     * Sets the value of the ttoalIncome property.
     * 
     */
    public void setTtoalIncome(double value) {
        this.ttoalIncome = value;
    }

}
