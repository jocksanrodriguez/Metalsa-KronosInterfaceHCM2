package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class SchedulePayCodeEdit {

	@XmlAttribute(name = "LockedFlag")
	String lockedFlag;
	
	@XmlAttribute(name = "StartDate")
	String startDate;
	
	@XmlAttribute(name = "IsDeleted")
	String isDeleted;
	
	@XmlAttribute(name = "AmountInTime")
	String amountInTime;
	
	@XmlAttribute(name = "AmountInDays")
	String amountInDays;
	
	@XmlAttribute(name = "DisplayTime")
	String displayTime;
	
	@XmlAttribute(name = "OrgJobPath")
	String orgJobPath;
	
	@XmlAttribute(name = "PayCodeName")
	String payCodeName;
	
	@XmlAttribute(name = "OverrideAccrualDaysAmount")
	String overrideAccrualDaysAmount;

	public String getLockedFlag() {
		return lockedFlag;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public String getAmountInTime() {
		return amountInTime;
	}

	public String getAmountInDays() {
		return amountInDays;
	}

	public String getDisplayTime() {
		return displayTime;
	}

	public String getOrgJobPath() {
		return orgJobPath;
	}

	public String getPayCodeName() {
		return payCodeName;
	}

	public String getOverrideAccrualDaysAmount() {
		return overrideAccrualDaysAmount;
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

	public void setAmountInTime(String amountInTime) {
		this.amountInTime = amountInTime;
	}

	public void setAmountInDays(String amountInDays) {
		this.amountInDays = amountInDays;
	}

	public void setDisplayTime(String displayTime) {
		this.displayTime = displayTime;
	}

	public void setOrgJobPath(String orgJobPath) {
		this.orgJobPath = orgJobPath;
	}

	public void setPayCodeName(String payCodeName) {
		this.payCodeName = payCodeName;
	}

	public void setOverrideAccrualDaysAmount(String overrideAccrualDaysAmount) {
		this.overrideAccrualDaysAmount = overrideAccrualDaysAmount;
	}
	

	
	
}
