
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetaDataList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetaDataList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metaDataList" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfMetaData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataList", propOrder = {
    "metaDataList"
})
public class MetaDataList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMetaData metaDataList;

    /**
     * Obtiene el valor de la propiedad metaDataList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetaData }
     *     
     */
    public ArrayOfMetaData getMetaDataList() {
        return metaDataList;
    }

    /**
     * Define el valor de la propiedad metaDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetaData }
     *     
     */
    public void setMetaDataList(ArrayOfMetaData value) {
        this.metaDataList = value;
    }

}
