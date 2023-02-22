
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
 *         &lt;element name="getReportParametersReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValues"/>
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
    "getReportParametersReturn"
})
@XmlRootElement(name = "getReportParametersResponse")
public class GetReportParametersResponse {

    @XmlElement(required = true)
    protected ParamNameValues getReportParametersReturn;

    /**
     * Obtiene el valor de la propiedad getReportParametersReturn.
     * 
     * @return
     *     possible object is
     *     {@link ParamNameValues }
     *     
     */
    public ParamNameValues getGetReportParametersReturn() {
        return getReportParametersReturn;
    }

    /**
     * Define el valor de la propiedad getReportParametersReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamNameValues }
     *     
     */
    public void setGetReportParametersReturn(ParamNameValues value) {
        this.getReportParametersReturn = value;
    }

}
