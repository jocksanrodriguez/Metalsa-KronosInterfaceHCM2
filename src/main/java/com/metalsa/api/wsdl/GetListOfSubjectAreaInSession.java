
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
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "bipSessionToken",
    "connectionName"
})
@XmlRootElement(name = "getListOfSubjectAreaInSession")
public class GetListOfSubjectAreaInSession {

    @XmlElement(required = true)
    protected String bipSessionToken;
    @XmlElement(required = true)
    protected String connectionName;

    /**
     * Obtiene el valor de la propiedad bipSessionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Define el valor de la propiedad bipSessionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

    /**
     * Obtiene el valor de la propiedad connectionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * Define el valor de la propiedad connectionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionName(String value) {
        this.connectionName = value;
    }

}
