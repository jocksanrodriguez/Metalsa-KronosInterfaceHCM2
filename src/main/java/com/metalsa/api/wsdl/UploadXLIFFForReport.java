
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
 *         &lt;element name="reportAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xliffData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="layoutFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportAbsolutePath",
    "xliffData",
    "layoutFileName",
    "locale",
    "userID",
    "password"
})
@XmlRootElement(name = "uploadXLIFFForReport")
public class UploadXLIFFForReport {

    @XmlElement(required = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true)
    protected byte[] xliffData;
    @XmlElement(required = true)
    protected String layoutFileName;
    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

    /**
     * Obtiene el valor de la propiedad reportAbsolutePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAbsolutePath() {
        return reportAbsolutePath;
    }

    /**
     * Define el valor de la propiedad reportAbsolutePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAbsolutePath(String value) {
        this.reportAbsolutePath = value;
    }

    /**
     * Obtiene el valor de la propiedad xliffData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXliffData() {
        return xliffData;
    }

    /**
     * Define el valor de la propiedad xliffData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXliffData(byte[] value) {
        this.xliffData = value;
    }

    /**
     * Obtiene el valor de la propiedad layoutFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutFileName() {
        return layoutFileName;
    }

    /**
     * Define el valor de la propiedad layoutFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutFileName(String value) {
        this.layoutFileName = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
