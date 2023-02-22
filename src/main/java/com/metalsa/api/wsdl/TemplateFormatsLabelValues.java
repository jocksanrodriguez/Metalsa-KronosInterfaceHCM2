
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TemplateFormatsLabelValues complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TemplateFormatsLabelValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="applyStyleTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="listOfTemplateFormatLabelValue" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfTemplateFormatLabelValue"/>
 *         &lt;element name="templateAvailableLocales" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/>
 *         &lt;element name="templateBaseLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateDefaultLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateFormatsLabelValues", propOrder = {
    "active",
    "applyStyleTemplate",
    "_default",
    "listOfTemplateFormatLabelValue",
    "templateAvailableLocales",
    "templateBaseLocale",
    "templateDefaultLocale",
    "templateID",
    "templateType",
    "templateURL",
    "viewOnline"
})
public class TemplateFormatsLabelValues {

    protected boolean active;
    protected boolean applyStyleTemplate;
    @XmlElement(name = "default")
    protected boolean _default;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTemplateFormatLabelValue listOfTemplateFormatLabelValue;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString templateAvailableLocales;
    @XmlElement(required = true, nillable = true)
    protected String templateBaseLocale;
    @XmlElement(required = true, nillable = true)
    protected String templateDefaultLocale;
    @XmlElement(required = true, nillable = true)
    protected String templateID;
    @XmlElement(required = true, nillable = true)
    protected String templateType;
    @XmlElement(required = true, nillable = true)
    protected String templateURL;
    protected boolean viewOnline;

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad applyStyleTemplate.
     * 
     */
    public boolean isApplyStyleTemplate() {
        return applyStyleTemplate;
    }

    /**
     * Define el valor de la propiedad applyStyleTemplate.
     * 
     */
    public void setApplyStyleTemplate(boolean value) {
        this.applyStyleTemplate = value;
    }

    /**
     * Obtiene el valor de la propiedad default.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Define el valor de la propiedad default.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Obtiene el valor de la propiedad listOfTemplateFormatLabelValue.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *     
     */
    public ArrayOfTemplateFormatLabelValue getListOfTemplateFormatLabelValue() {
        return listOfTemplateFormatLabelValue;
    }

    /**
     * Define el valor de la propiedad listOfTemplateFormatLabelValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *     
     */
    public void setListOfTemplateFormatLabelValue(ArrayOfTemplateFormatLabelValue value) {
        this.listOfTemplateFormatLabelValue = value;
    }

    /**
     * Obtiene el valor de la propiedad templateAvailableLocales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTemplateAvailableLocales() {
        return templateAvailableLocales;
    }

    /**
     * Define el valor de la propiedad templateAvailableLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTemplateAvailableLocales(ArrayOfString value) {
        this.templateAvailableLocales = value;
    }

    /**
     * Obtiene el valor de la propiedad templateBaseLocale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateBaseLocale() {
        return templateBaseLocale;
    }

    /**
     * Define el valor de la propiedad templateBaseLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateBaseLocale(String value) {
        this.templateBaseLocale = value;
    }

    /**
     * Obtiene el valor de la propiedad templateDefaultLocale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateDefaultLocale() {
        return templateDefaultLocale;
    }

    /**
     * Define el valor de la propiedad templateDefaultLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateDefaultLocale(String value) {
        this.templateDefaultLocale = value;
    }

    /**
     * Obtiene el valor de la propiedad templateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Define el valor de la propiedad templateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Obtiene el valor de la propiedad templateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Define el valor de la propiedad templateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Obtiene el valor de la propiedad templateURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * Define el valor de la propiedad templateURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateURL(String value) {
        this.templateURL = value;
    }

    /**
     * Obtiene el valor de la propiedad viewOnline.
     * 
     */
    public boolean isViewOnline() {
        return viewOnline;
    }

    /**
     * Define el valor de la propiedad viewOnline.
     * 
     */
    public void setViewOnline(boolean value) {
        this.viewOnline = value;
    }

}
