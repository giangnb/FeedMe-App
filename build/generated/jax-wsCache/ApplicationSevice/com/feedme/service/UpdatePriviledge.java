
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePriviledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePriviledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatePriviledge" type="{http://webservice.feedme.com/}priviledgeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePriviledge", propOrder = {
    "updatePriviledge"
})
public class UpdatePriviledge {

    protected PriviledgeDTO updatePriviledge;

    /**
     * Gets the value of the updatePriviledge property.
     * 
     * @return
     *     possible object is
     *     {@link PriviledgeDTO }
     *     
     */
    public PriviledgeDTO getUpdatePriviledge() {
        return updatePriviledge;
    }

    /**
     * Sets the value of the updatePriviledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriviledgeDTO }
     *     
     */
    public void setUpdatePriviledge(PriviledgeDTO value) {
        this.updatePriviledge = value;
    }

}
