
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
 *         &lt;element name="getReportSampleDataInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getReportSampleDataInSessionReturn"
})
@XmlRootElement(name = "getReportSampleDataInSessionResponse")
public class GetReportSampleDataInSessionResponse {

    @XmlElement(required = true)
    protected byte[] getReportSampleDataInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getReportSampleDataInSessionReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetReportSampleDataInSessionReturn() {
        return getReportSampleDataInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getReportSampleDataInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetReportSampleDataInSessionReturn(byte[] value) {
        this.getReportSampleDataInSessionReturn = value;
    }

}
