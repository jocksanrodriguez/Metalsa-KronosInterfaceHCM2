package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleShift {
	
	@XmlAttribute(name = "LockedFlag")
	String lockedFlag;
	
	@XmlAttribute(name = "StartDate")
	String startDate;
	
	@XmlAttribute(name = "IsDeleted")
	String isDeleted;
	
	@XmlAttribute(name = "ShiftLabel")
	String shiftLabel;
	
	@XmlElement(name = "ShiftSegments")
	ShiftSegments shiftSegments;

	public String getLockedFlag() {
		return lockedFlag;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public String getShiftLabel() {
		return shiftLabel;
	}

	public ShiftSegments getShiftSegments() {
		return shiftSegments;
	}

	public void setLockedFlag(String lockedFlag) {
		this.lockedFlag = lockedFlag;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setShiftLabel(String shiftLabel) {
		this.shiftLabel = shiftLabel;
	}

	public void setShiftSegments(ShiftSegments shiftSegments) {
		this.shiftSegments = shiftSegments;
	}
	

}
