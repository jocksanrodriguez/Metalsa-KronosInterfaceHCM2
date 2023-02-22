package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	@XmlAttribute(name = "IsCurrencyFlag")
	private String isCurrencyFlag;
	
	@XmlAttribute(name = "PayCodeId")
	private String payCodeId;
	
	@XmlAttribute(name = "PayCodeName")
	private String payCodeName;
	
	@XmlAttribute(name = "AmountInTime")
	private String amountInTime;
	
	@XmlAttribute(name = "AmountInDays")
	private String amountInDays;

	public String getIsCurrencyFlag() {
		return isCurrencyFlag;
	}

	public String getPayCodeId() {
		return payCodeId;
	}

	public String getPayCodeName() {
		return payCodeName;
	}

	public String getAmountInTime() {
		return amountInTime;
	}

	public String getAmountInDays() {
		return amountInDays;
	}

	public void setIsCurrencyFlag(String isCurrencyFlag) {
		this.isCurrencyFlag = isCurrencyFlag;
	}

	public void setPayCodeId(String payCodeId) {
		this.payCodeId = payCodeId;
	}

	public void setPayCodeName(String payCodeName) {
		this.payCodeName = payCodeName;
	}

	public void setAmountInTime(String amountInTime) {
		this.amountInTime = amountInTime;
	}

	public void setAmountInDays(String amountInDays) {
		this.amountInDays = amountInDays;
	}
}
