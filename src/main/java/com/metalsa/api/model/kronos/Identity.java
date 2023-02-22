package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Identity {

	@XmlElement(name = "PersonIdentity")
	private PersonIdentity personIdentity;

	public PersonIdentity getPersonIdentity() {
		return personIdentity;
	}

	public void setPersonIdentity(PersonIdentity personIdentity) {
		this.personIdentity = personIdentity;
	}
}
