package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DateTotals {

	@XmlAttribute(name = "Date")
	private String date;
	
	@XmlAttribute(name = "GrandTotal")
	private String grandTotal;
	
	@XmlElement(name = "Totals")
	private Totals totals;

	
	
	public String getDate() {
		return date;
	}

	public String getGrandTotal() {
		return grandTotal;
	}

	public Totals getTotals() {
		return totals;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}

	public void setTotals(Totals totals) {
		this.totals = totals;
	}
}
