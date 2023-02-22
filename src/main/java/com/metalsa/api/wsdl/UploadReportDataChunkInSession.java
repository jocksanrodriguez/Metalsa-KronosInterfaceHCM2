
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
 *         &lt;element name="fileID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportDataChunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="reportRawDataChunk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "fileID",
    "reportDataChunk",
    "reportRawDataChunk",
    "bipSessionToken"
})
@XmlRootElement(name = "uploadReportDataChunkInSession")
public class UploadReportDataChunkInSession {

    @XmlElement(required = true)
    protected String fileID;
    @XmlElement(required = true)
    protected byte[] reportDataChunk;
    @XmlElement(required = true)
    protected String reportRawDataChunk;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Obtiene el valor de la propiedad fileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Define el valor de la propiedad fileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Obtiene el valor de la propiedad reportDataChunk.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportDataChunk() {
        return reportDataChunk;
    }

    /**
     * Define el valor de la propiedad reportDataChunk.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportDataChunk(byte[] value) {
        this.reportDataChunk = value;
    }

    /**
     * Obtiene el valor de la propiedad reportRawDataChunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRawDataChunk() {
        return reportRawDataChunk;
    }

    /**
     * Define el valor de la propiedad reportRawDataChunk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRawDataChunk(String value) {
        this.reportRawDataChunk = value;
    }

    /**
     * Obtiene el valor de la propiedad bipSessionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Define el valor de la propiedad bipSessionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
