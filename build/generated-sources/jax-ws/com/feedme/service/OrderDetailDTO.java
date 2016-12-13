
package com.feedme.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDetailDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDetailDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://webservice.feedme.com/}singleInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="employee" type="{http://webservice.feedme.com/}employeeDTO" minOccurs="0"/>
 *         &lt;element name="foods" type="{http://webservice.feedme.com/}productDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderDetail" type="{http://webservice.feedme.com/}orderDetail" minOccurs="0"/>
 *         &lt;element name="ordertime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.feedme.com/}orderStatus" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDetailDTO", propOrder = {
    "comment",
    "customer",
    "discount",
    "employee",
    "foods",
    "orderDetail",
    "ordertime",
    "rating",
    "status",
    "subtotal"
})
public class OrderDetailDTO {

    protected String comment;
    @XmlElement(nillable = true)
    protected List<SingleInformation> customer;
    protected double discount;
    protected EmployeeDTO employee;
    @XmlElement(nillable = true)
    protected List<ProductDTO> foods;
    protected OrderDetail orderDetail;
    protected String ordertime;
    protected Double rating;
    protected OrderStatus status;
    protected Double subtotal;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleInformation }
     * 
     * 
     */
    public List<SingleInformation> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<SingleInformation>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the discount property.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDTO }
     *     
     */
    public EmployeeDTO getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDTO }
     *     
     */
    public void setEmployee(EmployeeDTO value) {
        this.employee = value;
    }

    /**
     * Gets the value of the foods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDTO }
     * 
     * 
     */
    public List<ProductDTO> getFoods() {
        if (foods == null) {
            foods = new ArrayList<ProductDTO>();
        }
        return this.foods;
    }

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetail }
     *     
     */
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetail }
     *     
     */
    public void setOrderDetail(OrderDetail value) {
        this.orderDetail = value;
    }

    /**
     * Gets the value of the ordertime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdertime() {
        return ordertime;
    }

    /**
     * Sets the value of the ordertime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdertime(String value) {
        this.ordertime = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating(Double value) {
        this.rating = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setStatus(OrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubtotal(Double value) {
        this.subtotal = value;
    }

}
