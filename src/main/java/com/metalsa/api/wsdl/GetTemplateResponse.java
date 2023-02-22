
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
 *         &lt;element name="getTemplateReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getTemplateReturn"
})
@XmlRootElement(name = "getTemplateResponse")
public class GetTemplateResponse {

    @XmlElement(required = true)
    protected byte[] getTemplateReturn;

    /**
     * Obtiene el valor de la propiedad getTemplateReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetTemplateReturn() {
        return getTemplateReturn;
    }

    /**
     * Define el valor de la propiedad getTemplateReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetTemplateReturn(byte[] value) {
        this.getTemplateReturn = value;
    }

}
