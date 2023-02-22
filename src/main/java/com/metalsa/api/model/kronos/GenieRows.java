package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class GenieRows {
	
	@XmlElement(name = "GenieRow")
	private List<GenieRow> genieRow;

	public List<GenieRow> getGenieRow() {
		return genieRow;
	}

	public void setGenieRow(List<GenieRow> genieRow) {
		this.genieRow = genieRow;
	} 

}