
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://webservice.feedme.com/}orderDetailDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOrder", propOrder = {
    "order"
})
public class UpdateOrder {

    protected OrderDetailDTO order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetailDTO }
     *     
     */
    public OrderDetailDTO getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetailDTO }
     *     
     */
    public void setOrder(OrderDetailDTO value) {
        this.order = value;
    }

}
