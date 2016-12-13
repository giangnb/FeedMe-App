
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyUpdate" type="{http://webservice.feedme.com/}propertyDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProperties", propOrder = {
    "propertyUpdate"
})
public class UpdateProperties {

    protected PropertyDTO propertyUpdate;

    /**
     * Gets the value of the propertyUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyDTO }
     *     
     */
    public PropertyDTO getPropertyUpdate() {
        return propertyUpdate;
    }

    /**
     * Sets the value of the propertyUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDTO }
     *     
     */
    public void setPropertyUpdate(PropertyDTO value) {
        this.propertyUpdate = value;
    }

}
