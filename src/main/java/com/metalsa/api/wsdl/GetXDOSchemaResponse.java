
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
 *         &lt;element name="getXDOSchemaReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getXDOSchemaReturn"
})
@XmlRootElement(name = "getXDOSchemaResponse")
public class GetXDOSchemaResponse {

    @XmlElement(required = true)
    protected byte[] getXDOSchemaReturn;

    /**
     * Obtiene el valor de la propiedad getXDOSchemaReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetXDOSchemaReturn() {
        return getXDOSchemaReturn;
    }

    /**
     * Define el valor de la propiedad getXDOSchemaReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetXDOSchemaReturn(byte[] value) {
        this.getXDOSchemaReturn = value;
    }

}
