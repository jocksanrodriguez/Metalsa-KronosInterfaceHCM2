
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
 *         &lt;element name="updateXLIFFForReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateXLIFFForReportInSessionReturn"
})
@XmlRootElement(name = "updateXLIFFForReportInSessionResponse")
public class UpdateXLIFFForReportInSessionResponse {

    protected boolean updateXLIFFForReportInSessionReturn;

    /**
     * Obtiene el valor de la propiedad updateXLIFFForReportInSessionReturn.
     * 
     */
    public boolean isUpdateXLIFFForReportInSessionReturn() {
        return updateXLIFFForReportInSessionReturn;
    }

    /**
     * Define el valor de la propiedad updateXLIFFForReportInSessionReturn.
     * 
     */
    public void setUpdateXLIFFForReportInSessionReturn(boolean value) {
        this.updateXLIFFForReportInSessionReturn = value;
    }

}
