
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetaData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metaDataName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metaDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaData", propOrder = {
    "metaDataName",
    "metaDataValue"
})
public class MetaData {

    @XmlElement(required = true, nillable = true)
    protected String metaDataName;
    @XmlElement(required = true, nillable = true)
    protected String metaDataValue;

    /**
     * Obtiene el valor de la propiedad metaDataName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataName() {
        return metaDataName;
    }

    /**
     * Define el valor de la propiedad metaDataName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataName(String value) {
        this.metaDataName = value;
    }

    /**
     * Obtiene el valor de la propiedad metaDataValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataValue() {
        return metaDataValue;
    }

    /**
     * Define el valor de la propiedad metaDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataValue(String value) {
        this.metaDataValue = value;
    }

}
