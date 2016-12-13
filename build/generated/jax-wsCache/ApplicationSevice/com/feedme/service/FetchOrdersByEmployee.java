
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchOrdersByEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchOrdersByEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchOrdersByEmployee", propOrder = {
    "fromTime",
    "toTime",
    "employeeId"
})
public class FetchOrdersByEmployee {

    protected long fromTime;
    protected long toTime;
    protected short employeeId;

    /**
     * Gets the value of the fromTime property.
     * 
     */
    public long getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     */
    public void setFromTime(long value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     */
    public long getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     */
    public void setToTime(long value) {
        this.toTime = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     */
    public short getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     */
    public void setEmployeeId(short value) {
        this.employeeId = value;
    }

}
