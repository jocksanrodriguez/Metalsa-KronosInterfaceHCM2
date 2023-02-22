package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Schedule {

	@XmlAttribute(name = "QueryDateSpan")
	String queryDateSpan;
	
	@XmlElement(name = "ScheduleItems")
	ScheduleItems scheduleItems;

	public String getQueryDateSpan() {
		return queryDateSpan;
	}

	public void setQueryDateSpan(String queryDateSpan) {
		this.queryDateSpan = queryDateSpan;
	}

	public ScheduleItems getScheduleItems() {
		return scheduleItems;
	}

	public void setScheduleItems(ScheduleItems scheduleItems) {
		this.scheduleItems = scheduleItems;
	}
}
