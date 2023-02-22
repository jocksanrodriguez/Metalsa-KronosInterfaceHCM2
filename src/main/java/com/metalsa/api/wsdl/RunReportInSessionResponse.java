
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
 *         &lt;element name="runReportInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportResponse"/>
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
    "runReportInSessionReturn"
})
@XmlRootElement(name = "runReportInSessionResponse")
public class RunReportInSessionResponse {

    @XmlElement(required = true)
    protected ReportResponse runReportInSessionReturn;

    /**
     * Obtiene el valor de la propiedad runReportInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportResponse }
     *     
     */
    public ReportResponse getRunReportInSessionReturn() {
        return runReportInSessionReturn;
    }

    /**
     * Define el valor de la propiedad runReportInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportResponse }
     *     
     */
    public void setRunReportInSessionReturn(ReportResponse value) {
        this.runReportInSessionReturn = value;
    }

}
