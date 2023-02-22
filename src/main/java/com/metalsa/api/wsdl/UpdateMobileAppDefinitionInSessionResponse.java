
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="updateMobileAppDefinitionInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateMobileAppDefinitionInSessionReturn"
})
@XmlRootElement(name = "updateMobileAppDefinitionInSessionResponse")
public class UpdateMobileAppDefinitionInSessionResponse {

    protected boolean updateMobileAppDefinitionInSessionReturn;

    /**
     * Obtiene el valor de la propiedad updateMobileAppDefinitionInSessionReturn.
     * 
     */
    public boolean isUpdateMobileAppDefinitionInSessionReturn() {
        return updateMobileAppDefinitionInSessionReturn;
    }

    /**
     * Define el valor de la propiedad updateMobileAppDefinitionInSessionReturn.
     * 
     */
    public void setUpdateMobileAppDefinitionInSessionReturn(boolean value) {
        this.updateMobileAppDefinitionInSessionReturn = value;
    }

}
