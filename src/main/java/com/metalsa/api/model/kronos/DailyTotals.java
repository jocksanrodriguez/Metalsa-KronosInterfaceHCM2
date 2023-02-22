package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DailyTotals {
	
	@XmlElement(name = "DateTotals")
	private DateTotals dateTotals;

	public DateTotals getDateTotals() {
		return dateTotals;
	}

	public void setDateTotals(DateTotals dateTotals) {
		this.dateTotals = dateTotals;
	}
}
