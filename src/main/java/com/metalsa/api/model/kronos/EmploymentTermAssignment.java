package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class EmploymentTermAssignment {

	@XmlAttribute(name = "StartDate")
	private String startDate;
	
	@XmlAttribute(name = "EndDate")
	private String endDate;
	
	@XmlAttribute(name = "Name")
	private String name;

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getName() {
		return name;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setName(String name) {
		this.name = name;
	}
}
