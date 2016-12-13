
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPromoted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPromoted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promoted" type="{http://webservice.feedme.com/}promotedDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPromoted", propOrder = {
    "promoted"
})
public class AddPromoted {

    protected PromotedDTO promoted;

    /**
     * Gets the value of the promoted property.
     * 
     * @return
     *     possible object is
     *     {@link PromotedDTO }
     *     
     */
    public PromotedDTO getPromoted() {
        return promoted;
    }

    /**
     * Sets the value of the promoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotedDTO }
     *     
     */
    public void setPromoted(PromotedDTO value) {
        this.promoted = value;
    }

}
