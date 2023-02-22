package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class WorkedDuration {
	
	@XmlAttribute(name = "Date")
	private String date;
	
	@XmlAttribute(name = "AmountInTime")
	private String amountInTime;
	
	@XmlAttribute(name = "PayCodeName")
	private String payCodeName;
	
	@XmlAttribute(name = "StartTime")
	private String startTime;

	public String getDate() {
		return date;
	}

	public String getAmountInTime() {
		return amountInTime;
	}

	public String getPayCodeName() {
		return payCodeName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAmountInTime(String amountInTime) {
		this.amountInTime = amountInTime;
	}

	public void setPayCodeName(String payCodeName) {
		this.payCodeName = payCodeName;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	

}
