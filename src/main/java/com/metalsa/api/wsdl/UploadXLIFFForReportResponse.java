
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="uploadXLIFFForReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "uploadXLIFFForReportReturn"
})
@XmlRootElement(name = "uploadXLIFFForReportResponse")
public class UploadXLIFFForReportResponse {

    protected boolean uploadXLIFFForReportReturn;

    /**
     * Obtiene el valor de la propiedad uploadXLIFFForReportReturn.
     * 
     */
    public boolean isUploadXLIFFForReportReturn() {
        return uploadXLIFFForReportReturn;
    }

    /**
     * Define el valor de la propiedad uploadXLIFFForReportReturn.
     * 
     */
    public void setUploadXLIFFForReportReturn(boolean value) {
        this.uploadXLIFFForReportReturn = value;
    }

}
