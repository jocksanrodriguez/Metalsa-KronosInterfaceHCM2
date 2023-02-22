package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Personality {

	@XmlElement(name = "Identity")
	private Identity identity;
	
	@XmlElement(name = "JobAssignmentData")
	private JobAssignmentData jobAssignmentData;

	public Identity getIdentity() {
		return identity;
	}

	public JobAssignmentData getJobAssignmentData() {
		return jobAssignmentData;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public void setJobAssignmentData(JobAssignmentData jobAssignmentData) {
		this.jobAssignmentData = jobAssignmentData;
	}
}
