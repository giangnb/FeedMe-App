
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchPriviledgeById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchPriviledgeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priviledgeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchPriviledgeById", propOrder = {
    "priviledgeId"
})
public class FetchPriviledgeById {

    protected short priviledgeId;

    /**
     * Gets the value of the priviledgeId property.
     * 
     */
    public short getPriviledgeId() {
        return priviledgeId;
    }

    /**
     * Sets the value of the priviledgeId property.
     * 
     */
    public void setPriviledgeId(short value) {
        this.priviledgeId = value;
    }

}
