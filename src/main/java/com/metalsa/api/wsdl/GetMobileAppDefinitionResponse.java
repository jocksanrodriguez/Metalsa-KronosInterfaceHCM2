
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMobileAppDefinitionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMobileAppDefinitionReturn"
})
@XmlRootElement(name = "getMobileAppDefinitionResponse")
public class GetMobileAppDefinitionResponse {

    @XmlElement(required = true)
    protected MobileAppDefinition getMobileAppDefinitionReturn;

    /**
     * Obtiene el valor de la propiedad getMobileAppDefinitionReturn.
     * 
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *     
     */
    public MobileAppDefinition getGetMobileAppDefinitionReturn() {
        return getMobileAppDefinitionReturn;
    }

    /**
     * Define el valor de la propiedad getMobileAppDefinitionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *     
     */
    public void setGetMobileAppDefinitionReturn(MobileAppDefinition value) {
        this.getMobileAppDefinitionReturn = value;
    }

}
