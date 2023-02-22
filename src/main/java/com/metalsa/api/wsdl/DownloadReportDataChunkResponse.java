
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
 *         &lt;element name="downloadReportDataChunkReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDataChunk"/>
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
    "downloadReportDataChunkReturn"
})
@XmlRootElement(name = "downloadReportDataChunkResponse")
public class DownloadReportDataChunkResponse {

    @XmlElement(required = true)
    protected ReportDataChunk downloadReportDataChunkReturn;

    /**
     * Obtiene el valor de la propiedad downloadReportDataChunkReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportDataChunk }
     *     
     */
    public ReportDataChunk getDownloadReportDataChunkReturn() {
        return downloadReportDataChunkReturn;
    }

    /**
     * Define el valor de la propiedad downloadReportDataChunkReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDataChunk }
     *     
     */
    public void setDownloadReportDataChunkReturn(ReportDataChunk value) {
        this.downloadReportDataChunkReturn = value;
    }

}
