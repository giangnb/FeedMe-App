
package com.feedme.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priviledgeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priviledgeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priviledge" type="{http://webservice.feedme.com/}priviledge" minOccurs="0"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priviledgeDTO", propOrder = {
    "admin",
    "description",
    "editor",
    "hr",
    "id",
    "manager",
    "name",
    "priviledge",
    "view"
})
public class PriviledgeDTO {

    protected boolean admin;
    protected String description;
    protected boolean editor;
    protected boolean hr;
    protected Short id;
    protected boolean manager;
    protected String name;
    protected Priviledge priviledge;
    protected boolean view;

    /**
     * Gets the value of the admin property.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     */
    public boolean isEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     */
    public void setEditor(boolean value) {
        this.editor = value;
    }

    /**
     * Gets the value of the hr property.
     * 
     */
    public boolean isHr() {
        return hr;
    }

    /**
     * Sets the value of the hr property.
     * 
     */
    public void setHr(boolean value) {
        this.hr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setId(Short value) {
        this.id = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     */
    public boolean isManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     */
    public void setManager(boolean value) {
        this.manager = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priviledge property.
     * 
     * @return
     *     possible object is
     *     {@link Priviledge }
     *     
     */
    public Priviledge getPriviledge() {
        return priviledge;
    }

    /**
     * Sets the value of the priviledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priviledge }
     *     
     */
    public void setPriviledge(Priviledge value) {
        this.priviledge = value;
    }

    /**
     * Gets the value of the view property.
     * 
     */
    public boolean isView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     */
    public void setView(boolean value) {
        this.view = value;
    }

}
