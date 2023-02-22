package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//import com.metalsa.interfaz.modelo.kronos.GenieRows;
@XmlAccessorType(XmlAccessType.FIELD)
public class WFCGenie {

    @XmlAttribute(name = "GenieType")
    private String genieType;

    @XmlAttribute(name = "HyperFindQueryName")
    private String hyperFindQueryName;

    @XmlAttribute(name = "GenieName")
    private String genieName;

    @XmlElement(name = "GenieRows")
    private GenieRows genieRows;

    @XmlElement(name = "GenieColumns")
    private GenieColumns genieColumns;

    public String getGenieType() {
        return genieType;
    }

    public String getHyperFindQueryName() {
        return hyperFindQueryName;
    }

    public String getGenieName() {
        return genieName;
    }

    public GenieRows getGenieRows() {
        return genieRows;
    }

    public void setGenieType(String genieType) {
        this.genieType = genieType;
    }

    public void setHyperFindQueryName(String hyperFindQueryName) {
        this.hyperFindQueryName = hyperFindQueryName;
    }

    public void setGenieName(String genieName) {
        this.genieName = genieName;
    }

    public void setGenieRows(GenieRows genieRows) {
        this.genieRows = genieRows;
    }

    /**
     * @return the genieColumns
     */
    public GenieColumns getGenieColumns() {
        return genieColumns;
    }

    /**
     * @param genieColumns the genieColumns to set
     */
    public void setGenieColumns(GenieColumns genieColumns) {
        this.genieColumns = genieColumns;
    }

}
