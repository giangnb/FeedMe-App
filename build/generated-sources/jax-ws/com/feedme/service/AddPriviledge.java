
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPriviledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPriviledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priviledge" type="{http://webservice.feedme.com/}priviledgeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPriviledge", propOrder = {
    "priviledge"
})
public class AddPriviledge {

    protected PriviledgeDTO priviledge;

    /**
     * Gets the value of the priviledge property.
     * 
     * @return
     *     possible object is
     *     {@link PriviledgeDTO }
     *     
     */
    public PriviledgeDTO getPriviledge() {
        return priviledge;
    }

    /**
     * Sets the value of the priviledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriviledgeDTO }
     *     
     */
    public void setPriviledge(PriviledgeDTO value) {
        this.priviledge = value;
    }

}
