package com.metalsa.api.model.kronos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//import com.metalsa.interfaz.modelo.kronos.WFCGenie;

@XmlAccessorType(XmlAccessType.FIELD)
public class KronosResponse {
	
	@XmlAttribute(name = "Status")
    private String status;

    @XmlAttribute(name = "Timeout")
    private String timeout;

    @XmlAttribute(name = "PersonNumber")
    private String personNumber;

    @XmlAttribute(name = "Action")
    private String action;

    @XmlAttribute(name = "PersonKey")
    private String personKey;

    @XmlAttribute(name = "Username")
    private String username;

    @XmlAttribute(name = "Object")
    private String object;
    
    @XmlElement(name = "Schedule")
    private Schedule schedule;
    
    @XmlElement(name = "Error")
    private java.lang.Error error;

    @XmlElement(name = "Personality")
    private Personality personality;
    
    @XmlElement(name = "Timesheet")
    private Timesheet timesheet;
    
    @XmlElement(name = "WFCGenie")
    private WFCGenie wfcGenie;
    
    @XmlElement(name = "HyperFindQuery")
    private String hyperFindQuery;

	public java.lang.Error getError() {
		return error;
	}

	public void setError(java.lang.Error error) {
		this.error = error;
	}

	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getAction() {
        return action;
    }
    
    public WFCGenie getWfcGenie() {
		return wfcGenie;
	}
    
    public String getHyperFindQuery() {
		return hyperFindQuery;
	}

    public void setAction(String action) {
        this.action = action;
    }

    public String getPersonKey() {
        return personKey;
    }

    public void setPersonKey(String personKey) {
        this.personKey = personKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
    
    public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public Personality getPersonality() {
		return personality;
	}

	public void setPersonality(Personality personality) {
		this.personality = personality;
	}
	
	public Timesheet getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}
	
	public void setWfcGenie(WFCGenie wfcGenie) {
		this.wfcGenie = wfcGenie;
	}
	
	public void setHyperFindQuery(String hyperFindQuery) {
		this.hyperFindQuery = hyperFindQuery;
	}

}
