package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class JobAssignment{

	@XmlAttribute(name = "HasPersonalOvertimeFlag")
	private String hasPersonalOvertimeFlag;
	
	@XmlAttribute(name = "ScheduleGroupName")
	private String scheduleGroupName;
	
	@XmlAttribute(name = "UseMultipleAssignmentsFlag")
	private String useMultipleAssignmentsFlag;
	
	@XmlElement(name = "JobAssignmentDetailsData")
	private JobAssignmentDetailsData jobAssignmentDetailsData;

	@XmlElement(name = "EmploymentTermAssignments")
	private EmploymentTermAssignments employmentTermAssignments;

	public String getHasPersonalOvertimeFlag() {
		return hasPersonalOvertimeFlag;
	}

	public String getScheduleGroupName() {
		return scheduleGroupName;
	}

	public String getUseMultipleAssignmentsFlag() {
		return useMultipleAssignmentsFlag;
	}

	public EmploymentTermAssignments getEmploymentTermAssignments() {
		return employmentTermAssignments;
	}

	public void setHasPersonalOvertimeFlag(String hasPersonalOvertimeFlag) {
		this.hasPersonalOvertimeFlag = hasPersonalOvertimeFlag;
	}

	public void setScheduleGroupName(String scheduleGroupName) {
		this.scheduleGroupName = scheduleGroupName;
	}

	public void setUseMultipleAssignmentsFlag(String useMultipleAssignmentsFlag) {
		this.useMultipleAssignmentsFlag = useMultipleAssignmentsFlag;
	}

	public void setEmploymentTermAssignments(EmploymentTermAssignments employmentTermAssignments) {
		this.employmentTermAssignments = employmentTermAssignments;
	}
	
	public JobAssignmentDetailsData getJobAssignmentDetailsData() {
		return jobAssignmentDetailsData;
	}

	public void setJobAssignmentDetailsData(JobAssignmentDetailsData jobAssignmentDetailsData) {
		this.jobAssignmentDetailsData = jobAssignmentDetailsData;
	}
}
