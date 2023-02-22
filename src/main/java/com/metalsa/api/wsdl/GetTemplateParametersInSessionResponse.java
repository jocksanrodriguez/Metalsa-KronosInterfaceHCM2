
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="getTemplateParametersInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValue" maxOccurs="unbounded"/>
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
    "getTemplateParametersInSessionReturn"
})
@XmlRootElement(name = "getTemplateParametersInSessionResponse")
public class GetTemplateParametersInSessionResponse {

    @XmlElement(required = true)
    protected List<ParamNameValue> getTemplateParametersInSessionReturn;

    /**
     * Gets the value of the getTemplateParametersInSessionReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getTemplateParametersInSessionReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetTemplateParametersInSessionReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamNameValue }
     * 
     * 
     */
    public List<ParamNameValue> getGetTemplateParametersInSessionReturn() {
        if (getTemplateParametersInSessionReturn == null) {
            getTemplateParametersInSessionReturn = new ArrayList<ParamNameValue>();
        }
        return this.getTemplateParametersInSessionReturn;
    }

}