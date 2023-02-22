
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
 *         &lt;element name="createReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "createReportInSessionReturn"
})
@XmlRootElement(name = "createReportInSessionResponse")
public class CreateReportInSessionResponse {

    @XmlElement(required = true)
    protected String createReportInSessionReturn;

    /**
     * Obtiene el valor de la propiedad createReportInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateReportInSessionReturn() {
        return createReportInSessionReturn;
    }

    /**
     * Define el valor de la propiedad createReportInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateReportInSessionReturn(String value) {
        this.createReportInSessionReturn = value;
    }

}
