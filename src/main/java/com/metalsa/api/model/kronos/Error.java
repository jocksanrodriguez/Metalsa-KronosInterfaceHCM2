package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Error {

	@XmlAttribute(name = "Message")
	private String message;
	
	@XmlAttribute(name = "ErrorCode")
	private String errorCode;
	
	@XmlAttribute(name = "AtIndex")
	private String atIndex;
	
	@XmlAttribute(name = "BeanName")
	private String beanName;
	
	@XmlAttribute(name = "ActionName")
	private String actionName;
	
	@XmlElement(name = "DetailErrors")
	private DetailErrors detailError;

	public String getMessage() {
		return message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getAtIndex() {
		return atIndex;
	}

	public String getBeanName() {
		return beanName;
	}

	public String getActionName() {
		return actionName;
	}

	public DetailErrors getDetailError() {
		return detailError;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setAtIndex(String atIndex) {
		this.atIndex = atIndex;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public void setDetailError(DetailErrors detailError) {
		this.detailError = detailError;
	}
	
}
