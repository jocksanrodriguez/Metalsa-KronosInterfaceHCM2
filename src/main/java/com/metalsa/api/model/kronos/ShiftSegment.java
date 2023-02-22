package com.metalsa.api.model.kronos;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class ShiftSegment {
	
	@XmlAttribute(name = "SegmentTypeName")
	String segmentTypeName;
	
	@XmlAttribute(name = "StartDate")
	String startDate;
	
	@XmlAttribute(name = "StartTime")
	String startTime;
	
	@XmlAttribute(name = "StartDayNumber")
	String startDayNumber;
	
	@XmlAttribute(name = "EndDate")
	String endDate;
	
	@XmlAttribute(name = "EndTime")
	String endTime;
	
	@XmlAttribute(name = "EndDayNumber")
	String endDayNumber;
	
	@XmlAttribute(name = "WorkRuleName")
	String workRuleName;

	public String getSegmentTypeName() {
		return segmentTypeName;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getStartDayNumber() {
		return startDayNumber;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public String getEndDayNumber() {
		return endDayNumber;
	}

	public String getWorkRuleName() {
		return workRuleName;
	}

	public void setSegmentTypeName(String segmentTypeName) {
		this.segmentTypeName = segmentTypeName;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setStartDayNumber(String startDayNumber) {
		this.startDayNumber = startDayNumber;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setEndDayNumber(String endDayNumber) {
		this.endDayNumber = endDayNumber;
	}

	public void setWorkRuleName(String workRuleName) {
		this.workRuleName = workRuleName;
	}
}
