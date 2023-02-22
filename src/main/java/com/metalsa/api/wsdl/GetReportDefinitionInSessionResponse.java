
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
 *         &lt;element name="getReportDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDefinition"/>
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
    "getReportDefinitionInSessionReturn"
})
@XmlRootElement(name = "getReportDefinitionInSessionResponse")
public class GetReportDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected ReportDefinition getReportDefinitionInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getReportDefinitionInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getGetReportDefinitionInSessionReturn() {
        return getReportDefinitionInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getReportDefinitionInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setGetReportDefinitionInSessionReturn(ReportDefinition value) {
        this.getReportDefinitionInSessionReturn = value;
    }

}
