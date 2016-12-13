
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for promotedDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promotedDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="product" type="{http://webservice.feedme.com/}productDTO" minOccurs="0"/>
 *         &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotedDTO", propOrder = {
    "fromTime",
    "id",
    "product",
    "toTime"
})
public class PromotedDTO {

    protected String fromTime;
    protected Integer id;
    protected ProductDTO product;
    protected String toTime;

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTime(String value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setProduct(ProductDTO value) {
        this.product = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTime(String value) {
        this.toTime = value;
    }

}
