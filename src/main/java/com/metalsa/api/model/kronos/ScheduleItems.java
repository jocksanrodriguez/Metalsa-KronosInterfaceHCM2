package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleItems {
	
	@XmlElement(name = "ScheduleShift")
	List<ScheduleShift> scheduleShift;
	
	@XmlElement(name = "SchedulePayCodeEdit")
	List<SchedulePayCodeEdit> schedulePayCodeEdit;

	public List<ScheduleShift> getScheduleShift() {
		return scheduleShift;
	}

	public List<SchedulePayCodeEdit> getSchedulePayCodeEdit() {
		return schedulePayCodeEdit;
	}

	public void setScheduleShift(List<ScheduleShift> scheduleShift) {
		this.scheduleShift = scheduleShift;
	}

	public void setSchedulePayCodeEdit(List<SchedulePayCodeEdit> schedulePayCodeEdit) {
		this.schedulePayCodeEdit = schedulePayCodeEdit;
	}
	
}
