package com.metalsa.api.model.hcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class DataDs {
	
	@XmlElement(name = "G_EMP")
	private List<GEmp> gEmp;

	@XmlElement(name = "G_1")
	private List<G1> g1;

	public List<GEmp> getgEmp() {
		return gEmp;
	}
	
	public List<G1> getG1() {
		return g1;
	}

	public void setgEmp(List<GEmp> gEmp) {
		this.gEmp = gEmp;
	}
	
	public void setG1(List<G1> g1) {
		this.g1 = g1;
	}

	
}
