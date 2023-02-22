package com.metalsa.api.model.hcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GEmp {

	@XmlElement(name = "REQ_CODE")
	private String reqCode;

	@XmlElement(name = "PERSON_TYPE")
	private String personType;

	@XmlElement(name = "PERSONNUM")
	private String personNum;

	@XmlElement(name = "FIRSTNAME")
	private String firstName;

	@XmlElement(name = "LASTNAME")
	private String lastName;

	@XmlElement(name = "HIREDATE")
	private String hireDate;

	@XmlElement(name = "TIMEZONE")
	private String timeZone;

	@XmlElement(name = "LOCATION")
	private String location;

	@XmlElement(name = "HOMELABOR1")
	private String homelabor1;

	@XmlElement(name = "HOMELABOR2")
	private String homelabor2;

	@XmlElement(name = "HOMELABOR3")
	private String homelabor3;

	@XmlElement(name = "HOMELABOR4")
	private String homelabor4;

	@XmlElement(name = "HOMELABOR5")
	private String homelabor5;

	@XmlElement(name = "HOMELABOR6")
	private String homelabor6;

	@XmlElement(name = "HOMELABOR7")
	private String homelabor7;

	@XmlElement(name = "GROUPSCHED")
	private String groupsched;

	@XmlElement(name = "BADGENUM")
	private String badgeNum;

	@XmlElement(name = "STATUSDATE")
	private String statusDate;

	@XmlElement(name = "USERNAME")
	private String userName;

	@XmlElement(name = "PASSWORD")
	private String password;

	@XmlElement(name = "EMPLOYEETYPE")
	private String employeeType;

	@XmlElement(name = "ASSIGNMENTCAT")
	private String assignmentCat;

	@XmlElement(name = "LAST_UPDATE_DATE")
	private String lastUpdateDate;

	@XmlElement(name = "NUM_EMP_COORDINADOR")
	private String numEmpCoordinador;

	@XmlElement(name = "COMPANIA")
	private String compania;

	@XmlElement(name = "EMPLEADO_ID_EBS")
	private String empleadoIdEbs;

	@XmlElement(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@XmlElement(name = "NSS")
	private String nss;
	
	@XmlElement(name = "TELEFONO_CELULAR")
	private String telefonoCelular;
	
	@XmlElement(name = "TELEFONO_CASA")
	private String telefonoCasa;

	@XmlElement(name = "A_LABORADOS")
	private String aLaborados;

	@XmlElement(name = "MX_ACUMULACION")
	private String mxAcumulacion;

	public String getReqCode() {
		return reqCode;
	}

	public String getPersonType() {
		return personType;
	}

	public String getPersonNum() {
		return personNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public String getLocation() {
		return location;
	}

	public String getHomelabor1() {
		return homelabor1;
	}

	public String getHomelabor2() {
		return homelabor2;
	}

	public String getHomelabor3() {
		return homelabor3;
	}

	public String getHomelabor4() {
		return homelabor4;
	}

	public String getHomelabor5() {
		return homelabor5;
	}

	public String getHomelabor6() {
		return homelabor6;
	}

	public String getHomelabor7() {
		return homelabor7;
	}

	public String getGroupsched() {
		return groupsched;
	}

	public String getBadgeNum() {
		return badgeNum;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public String getAssignmentCat() {
		return assignmentCat;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public String getNumEmpCoordinador() {
		return numEmpCoordinador;
	}

	public String getCompania() {
		return compania;
	}

	public String getEmpleadoIdEbs() {
		return empleadoIdEbs;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getNss() {
		return nss;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public String getaLaborados() {
		return aLaborados;
	}

	public String getMxAcumulacion() {
		return mxAcumulacion;
	}

	public void setReqCode(String reqCode) {
		this.reqCode = reqCode;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public void setPersonNum(String personNum) {
		this.personNum = personNum;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setHomelabor1(String homelabor1) {
		this.homelabor1 = homelabor1;
	}

	public void setHomelabor2(String homelabor2) {
		this.homelabor2 = homelabor2;
	}

	public void setHomelabor3(String homelabor3) {
		this.homelabor3 = homelabor3;
	}

	public void setHomelabor4(String homelabor4) {
		this.homelabor4 = homelabor4;
	}

	public void setHomelabor5(String homelabor5) {
		this.homelabor5 = homelabor5;
	}

	public void setHomelabor6(String homelabor6) {
		this.homelabor6 = homelabor6;
	}

	public void setHomelabor7(String homelabor7) {
		this.homelabor7 = homelabor7;
	}

	public void setGroupsched(String groupsched) {
		this.groupsched = groupsched;
	}

	public void setBadgeNum(String badgeNum) {
		this.badgeNum = badgeNum;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public void setAssignmentCat(String assignmentCat) {
		this.assignmentCat = assignmentCat;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public void setNumEmpCoordinador(String numEmpCoordinador) {
		this.numEmpCoordinador = numEmpCoordinador;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void setEmpleadoIdEbs(String empleadoIdEbs) {
		this.empleadoIdEbs = empleadoIdEbs;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	public void setaLaborados(String aLaborados) {
		this.aLaborados = aLaborados;
	}

	public void setMxAcumulacion(String mxAcumulacion) {
		this.mxAcumulacion = mxAcumulacion;
	}

	
}
