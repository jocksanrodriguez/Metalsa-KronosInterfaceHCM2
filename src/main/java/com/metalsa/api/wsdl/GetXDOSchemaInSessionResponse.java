
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
 *         &lt;element name="getXDOSchemaInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getXDOSchemaInSessionReturn"
})
@XmlRootElement(name = "getXDOSchemaInSessionResponse")
public class GetXDOSchemaInSessionResponse {

    @XmlElement(required = true)
    protected byte[] getXDOSchemaInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getXDOSchemaInSessionReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetXDOSchemaInSessionReturn() {
        return getXDOSchemaInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getXDOSchemaInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetXDOSchemaInSessionReturn(byte[] value) {
        this.getXDOSchemaInSessionReturn = value;
    }

}
