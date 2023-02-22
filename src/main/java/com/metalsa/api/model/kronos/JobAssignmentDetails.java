package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class JobAssignmentDetails {

	@XmlAttribute(name = "DeviceGroupName")
	private String deviceGroupName;
	
	@XmlAttribute(name = "PayRuleName")
	private String payRuleName;
	
	@XmlAttribute(name = "SupervisorPersonNumber")
	private String supervisorPersonNumber;
	
	@XmlAttribute(name = "SupervisorName")
	private String supervisorName;
	
	@XmlAttribute(name = "TimeZoneName")
	private String timeZoneName;

	public String getDeviceGroupName() {
		return deviceGroupName;
	}

	public void setDeviceGroupName(String deviceGroupName) {
		this.deviceGroupName = deviceGroupName;
	}

	public String getPayRuleName() {
		return payRuleName;
	}

	public void setPayRuleName(String payRuleName) {
		this.payRuleName = payRuleName;
	}

	public String getSupervisorPersonNumber() {
		return supervisorPersonNumber;
	}

	public void setSupervisorPersonNumber(String supervisorPersonNumber) {
		this.supervisorPersonNumber = supervisorPersonNumber;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}

	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}
	
}
