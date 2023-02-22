package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DetailErrors {

	@XmlElement(name = "Error")
	private java.lang.Error error;

	public java.lang.Error getError() {
		return error;
	}

	public void setError(java.lang.Error error) {
		this.error = error;
	}
}
