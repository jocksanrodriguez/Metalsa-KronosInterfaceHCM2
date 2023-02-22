
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
 *         &lt;element name="uploadReportDataChunkInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uploadReportDataChunkInSessionReturn"
})
@XmlRootElement(name = "uploadReportDataChunkInSessionResponse")
public class UploadReportDataChunkInSessionResponse {

    @XmlElement(required = true)
    protected String uploadReportDataChunkInSessionReturn;

    /**
     * Obtiene el valor de la propiedad uploadReportDataChunkInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadReportDataChunkInSessionReturn() {
        return uploadReportDataChunkInSessionReturn;
    }

    /**
     * Define el valor de la propiedad uploadReportDataChunkInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadReportDataChunkInSessionReturn(String value) {
        this.uploadReportDataChunkInSessionReturn = value;
    }

}
