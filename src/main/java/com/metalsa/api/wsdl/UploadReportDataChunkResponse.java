
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
 *         &lt;element name="uploadReportDataChunkReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uploadReportDataChunkReturn"
})
@XmlRootElement(name = "uploadReportDataChunkResponse")
public class UploadReportDataChunkResponse {

    @XmlElement(required = true)
    protected String uploadReportDataChunkReturn;

    /**
     * Obtiene el valor de la propiedad uploadReportDataChunkReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadReportDataChunkReturn() {
        return uploadReportDataChunkReturn;
    }

    /**
     * Define el valor de la propiedad uploadReportDataChunkReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadReportDataChunkReturn(String value) {
        this.uploadReportDataChunkReturn = value;
    }

}
