
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
 *         &lt;element name="runReportReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportResponse"/>
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
    "runReportReturn"
})
@XmlRootElement(name = "runReportResponse")
public class RunReportResponse {

    @XmlElement(required = true)
    protected ReportResponse runReportReturn;

    /**
     * Obtiene el valor de la propiedad runReportReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportResponse }
     *     
     */
    public ReportResponse getRunReportReturn() {
        return runReportReturn;
    }

    /**
     * Define el valor de la propiedad runReportReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportResponse }
     *     
     */
    public void setRunReportReturn(ReportResponse value) {
        this.runReportReturn = value;
    }

}
