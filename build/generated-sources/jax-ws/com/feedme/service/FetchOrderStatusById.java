
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchOrderStatusById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchOrderStatusById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderStatusId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchOrderStatusById", propOrder = {
    "orderStatusId"
})
public class FetchOrderStatusById {

    protected short orderStatusId;

    /**
     * Gets the value of the orderStatusId property.
     * 
     */
    public short getOrderStatusId() {
        return orderStatusId;
    }

    /**
     * Sets the value of the orderStatusId property.
     * 
     */
    public void setOrderStatusId(short value) {
        this.orderStatusId = value;
    }

}
