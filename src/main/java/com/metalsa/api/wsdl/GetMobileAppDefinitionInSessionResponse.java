
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
 *         &lt;element name="getMobileAppDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/>
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
    "getMobileAppDefinitionInSessionReturn"
})
@XmlRootElement(name = "getMobileAppDefinitionInSessionResponse")
public class GetMobileAppDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected MobileAppDefinition getMobileAppDefinitionInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getMobileAppDefinitionInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *     
     */
    public MobileAppDefinition getGetMobileAppDefinitionInSessionReturn() {
        return getMobileAppDefinitionInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getMobileAppDefinitionInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *     
     */
    public void setGetMobileAppDefinitionInSessionReturn(MobileAppDefinition value) {
        this.getMobileAppDefinitionInSessionReturn = value;
    }

}
