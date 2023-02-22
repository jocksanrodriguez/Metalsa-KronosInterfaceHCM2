package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class GenieColumn {

    @XmlAttribute(name = "ColumnNumber")
    private String columnNumber;

    @XmlAttribute(name = "Label")
    private String label;

    /**
     * @return the columnNumber
     */
    public String getColumnNumber() {
        return columnNumber;
    }

    /**
     * @param columnNumber the columnNumber to set
     */
    public void setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

}
