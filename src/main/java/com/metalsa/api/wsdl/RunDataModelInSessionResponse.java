
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
 *         &lt;element name="runDataModelInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportResponse"/>
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
    "runDataModelInSessionReturn"
})
@XmlRootElement(name = "runDataModelInSessionResponse")
public class RunDataModelInSessionResponse {

    @XmlElement(required = true)
    protected ReportResponse runDataModelInSessionReturn;

    /**
     * Obtiene el valor de la propiedad runDataModelInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportResponse }
     *     
     */
    public ReportResponse getRunDataModelInSessionReturn() {
        return runDataModelInSessionReturn;
    }

    /**
     * Define el valor de la propiedad runDataModelInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportResponse }
     *     
     */
    public void setRunDataModelInSessionReturn(ReportResponse value) {
        this.runDataModelInSessionReturn = value;
    }

}
