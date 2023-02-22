
package com.metalsa.api.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileDataSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileDataSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dynamicDataSourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temporaryDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDataSource", propOrder = {
    "dynamicDataSourcePath",
    "temporaryDataSource"
})
public class FileDataSource {

    @XmlElement(required = true, nillable = true)
    protected String dynamicDataSourcePath;
    protected boolean temporaryDataSource;

    /**
     * Obtiene el valor de la propiedad dynamicDataSourcePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicDataSourcePath() {
        return dynamicDataSourcePath;
    }

    /**
     * Define el valor de la propiedad dynamicDataSourcePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicDataSourcePath(String value) {
        this.dynamicDataSourcePath = value;
    }

    /**
     * Obtiene el valor de la propiedad temporaryDataSource.
     * 
     */
    public boolean isTemporaryDataSource() {
        return temporaryDataSource;
    }

    /**
     * Define el valor de la propiedad temporaryDataSource.
     * 
     */
    public void setTemporaryDataSource(boolean value) {
        this.temporaryDataSource = value;
    }

}
