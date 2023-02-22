package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;



@XmlAccessorType(XmlAccessType.FIELD)
public class KronosWFC {

	@XmlAttribute
    private String version;

    @XmlAttribute(name = "TimeStamp")
    private String timeStamp;

    @XmlAttribute(name = "WFCVersion")
    private String wfcVersion;
    
    @XmlElement(name = "Response")
    List<KronosResponse> response;
    
    private String xmlRequest;

	private String xmlResponse;
	
	private String xmlResponseStatus;
   

	public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getWfcVersion() {
        return wfcVersion;
    }

    public void setWfcVersion(String wfcVersion) {
        this.wfcVersion = wfcVersion;
    }
    
    public List<KronosResponse> getResponse() {
        return response;
    }

    public void setResponse(List<KronosResponse> response) {
        this.response = response;
    }
    
    public String getXmlRequest() {
		return xmlRequest;
	}

	public void setXmlRequest(String xmlRequest) {
		this.xmlRequest = xmlRequest;
	}
    
    public String getXmlResponse() {
		return xmlResponse;
	}

	public void setXmlResponse(String xmlResponse) {
		this.xmlResponse = xmlResponse;
	}

	public String getXmlResponseStatus() {
		return xmlResponseStatus;
	}

	public void setXmlResponseStatus(String xmlResponseStatus) {
		this.xmlResponseStatus = xmlResponseStatus;
	}
}
