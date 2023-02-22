package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class GenieColumns {
	
	@XmlElement(name = "GenieColumn")
	private List<GenieColumn> genieColumn;

	public List<GenieColumn> getGenieColumn() {
		return genieColumn;
	}

	public void setGenieColumn(List<GenieColumn> genieColumn) {
		this.genieColumn = genieColumn;
	} 

}