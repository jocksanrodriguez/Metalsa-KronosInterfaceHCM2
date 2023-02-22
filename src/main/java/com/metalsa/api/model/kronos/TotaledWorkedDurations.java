package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TotaledWorkedDurations {
	
	@XmlElement(name = "WorkedDuration")
	private WorkedDuration workedDuration;

	public WorkedDuration getWorkedDuration() {
		return workedDuration;
	}

	public void setWorkedDuration(WorkedDuration workedDuration) {
		this.workedDuration = workedDuration;
	}

}
