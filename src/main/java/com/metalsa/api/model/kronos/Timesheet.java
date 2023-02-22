package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Timesheet {

	@XmlAttribute(name = "LastTotalizationDateTime")
	private String lastTotalizationDateTime;
	
	@XmlAttribute(name = "ManagerSignoffDateTime")
	private String managerSignoffDateTime;
	
	@XmlAttribute(name = "TotalsUpToDateFlag")
	private String totalsUpToDateFlag;
	
	@XmlElement(name = "TotaledWorkedDurations")
	private TotaledWorkedDurations totaledWorkedDurations;
	
	@XmlElement(name = "DailyTotals")
	private DailyTotals dailyTotals;

	public String getLastTotalizationDateTime() {
		return lastTotalizationDateTime;
	}

	public String getManagerSignoffDateTime() {
		return managerSignoffDateTime;
	}

	public String getTotalsUpToDateFlag() {
		return totalsUpToDateFlag;
	}

	public TotaledWorkedDurations getTotaledWorkedDurations() {
		return totaledWorkedDurations;
	}

	public DailyTotals getDailyTotals() {
		return dailyTotals;
	}

	public void setLastTotalizationDateTime(String lastTotalizationDateTime) {
		this.lastTotalizationDateTime = lastTotalizationDateTime;
	}

	public void setManagerSignoffDateTime(String managerSignoffDateTime) {
		this.managerSignoffDateTime = managerSignoffDateTime;
	}

	public void setTotalsUpToDateFlag(String totalsUpToDateFlag) {
		this.totalsUpToDateFlag = totalsUpToDateFlag;
	}

	public void setTotaledWorkedDurations(TotaledWorkedDurations totaledWorkedDurations) {
		this.totaledWorkedDurations = totaledWorkedDurations;
	}

	public void setDailyTotals(DailyTotals dailyTotals) {
		this.dailyTotals = dailyTotals;
	}

	
}
