
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
 *         &lt;element name="getTemplateInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getTemplateInSessionReturn"
})
@XmlRootElement(name = "getTemplateInSessionResponse")
public class GetTemplateInSessionResponse {

    @XmlElement(required = true)
    protected byte[] getTemplateInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getTemplateInSessionReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetTemplateInSessionReturn() {
        return getTemplateInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getTemplateInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetTemplateInSessionReturn(byte[] value) {
        this.getTemplateInSessionReturn = value;
    }

}
