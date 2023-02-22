package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ShiftSegments {

	@XmlElement(name = "ShiftSegment")
	ShiftSegment shiftSegment;

	public ShiftSegment getShiftSegment() {
		return shiftSegment;
	}

	public void setShiftSegment(ShiftSegment shiftSegment) {
		this.shiftSegment = shiftSegment;
	} 
}
