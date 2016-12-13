
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removePromoted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removePromoted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotedId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePromoted", propOrder = {
    "promotedId"
})
public class RemovePromoted {

    protected int promotedId;

    /**
     * Gets the value of the promotedId property.
     * 
     */
    public int getPromotedId() {
        return promotedId;
    }

    /**
     * Sets the value of the promotedId property.
     * 
     */
    public void setPromotedId(int value) {
        this.promotedId = value;
    }

}
