
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateProduct" type="{http://webservice.feedme.com/}productDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProduct", propOrder = {
    "updateProduct"
})
public class UpdateProduct {

    protected ProductDTO updateProduct;

    /**
     * Gets the value of the updateProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getUpdateProduct() {
        return updateProduct;
    }

    /**
     * Sets the value of the updateProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setUpdateProduct(ProductDTO value) {
        this.updateProduct = value;
    }

}
