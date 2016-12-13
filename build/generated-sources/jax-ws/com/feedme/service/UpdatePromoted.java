
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePromoted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePromoted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotedUpdate" type="{http://webservice.feedme.com/}promotedDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePromoted", propOrder = {
    "promotedUpdate"
})
public class UpdatePromoted {

    protected PromotedDTO promotedUpdate;

    /**
     * Gets the value of the promotedUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link PromotedDTO }
     *     
     */
    public PromotedDTO getPromotedUpdate() {
        return promotedUpdate;
    }

    /**
     * Sets the value of the promotedUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotedDTO }
     *     
     */
    public void setPromotedUpdate(PromotedDTO value) {
        this.promotedUpdate = value;
    }

}
