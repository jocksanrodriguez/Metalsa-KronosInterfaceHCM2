package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class HyperFindQuery {
	
	@XmlAttribute(name = "Description")
	private String description;
	
	@XmlAttribute(name = "HyperFindQueryName")
	private String hyperFindQueryName;
	
	@XmlAttribute(name = "VisibilityCode")
	private String visibilityCode;

	public String getDescription() {
		return description;
	}

	public String getHyperFindQueryName() {
		return hyperFindQueryName;
	}

	public String getVisibilityCode() {
		return visibilityCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHyperFindQueryName(String hyperFindQueryName) {
		this.hyperFindQueryName = hyperFindQueryName;
	}

	public void setVisibilityCode(String visibilityCode) {
		this.visibilityCode = visibilityCode;
	}

}

