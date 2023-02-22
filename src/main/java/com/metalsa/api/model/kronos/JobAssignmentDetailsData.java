package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class JobAssignmentDetailsData {

	@XmlElement(name = "JobAssignmentDetails")
	private JobAssignmentDetails jobAssignmentDetails;

	public JobAssignmentDetails getJobAssignmentDetails() {
		return jobAssignmentDetails;
	}

	public void setJobAssignmentDetails(JobAssignmentDetails jobAssignmentDetails) {
		this.jobAssignmentDetails = jobAssignmentDetails;
	} 
}
