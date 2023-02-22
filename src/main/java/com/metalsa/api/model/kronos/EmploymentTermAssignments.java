package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class EmploymentTermAssignments {
	
	@XmlElement(name = "EmploymentTermAssignment")
	private List<EmploymentTermAssignment> employmentTermAssignment;

	public List<EmploymentTermAssignment> getEmploymentTermAssignment() {
		return employmentTermAssignment;
	}

	public void setEmploymentTermAssignment(List<EmploymentTermAssignment> employmentTermAssignment) {
		this.employmentTermAssignment = employmentTermAssignment;
	}

}
