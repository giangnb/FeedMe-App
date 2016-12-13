
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removePriviledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removePriviledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priviledId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePriviledge", propOrder = {
    "priviledId"
})
public class RemovePriviledge {

    protected short priviledId;

    /**
     * Gets the value of the priviledId property.
     * 
     */
    public short getPriviledId() {
        return priviledId;
    }

    /**
     * Sets the value of the priviledId property.
     * 
     */
    public void setPriviledId(short value) {
        this.priviledId = value;
    }

}
