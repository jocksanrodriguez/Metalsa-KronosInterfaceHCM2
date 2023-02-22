
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
 *         &lt;element name="getReportSampleDataReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "getReportSampleDataReturn"
})
@XmlRootElement(name = "getReportSampleDataResponse")
public class GetReportSampleDataResponse {

    @XmlElement(required = true)
    protected byte[] getReportSampleDataReturn;

    /**
     * Obtiene el valor de la propiedad getReportSampleDataReturn.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetReportSampleDataReturn() {
        return getReportSampleDataReturn;
    }

    /**
     * Define el valor de la propiedad getReportSampleDataReturn.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetReportSampleDataReturn(byte[] value) {
        this.getReportSampleDataReturn = value;
    }

}
