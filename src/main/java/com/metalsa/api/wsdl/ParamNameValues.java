
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamNameValues complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamNameValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfParamNameValues" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfParamNameValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamNameValues", propOrder = {
    "listOfParamNameValues"
})
public class ParamNameValues {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfParamNameValue listOfParamNameValues;

    /**
     * Obtiene el valor de la propiedad listOfParamNameValues.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public ArrayOfParamNameValue getListOfParamNameValues() {
        return listOfParamNameValues;
    }

    /**
     * Define el valor de la propiedad listOfParamNameValues.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public void setListOfParamNameValues(ArrayOfParamNameValue value) {
        this.listOfParamNameValues = value;
    }

}
