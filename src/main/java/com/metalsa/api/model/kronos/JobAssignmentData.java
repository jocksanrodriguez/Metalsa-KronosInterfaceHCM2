package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class JobAssignmentData {
	
	@XmlElement(name = "JobAssignment")
	private JobAssignment jobAssignment;

	public JobAssignment getJobAssignment() {
		return jobAssignment;
	}

	public void setJobAssignment(JobAssignment jobAssignment) {
		this.jobAssignment = jobAssignment;
	} 

}
