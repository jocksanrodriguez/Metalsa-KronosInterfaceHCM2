package com.metalsa.api.model.hcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class G1 {
	
	@XmlElement(name = "REQ_CODE")
	private String reqCode; 
	
	@XmlElement(name = "LABOR_LEVEL_ENTRY_NAME")
	private String laborLevelEntryName;

	@XmlElement(name = "LABOR_LABEL_NAME")
	private String laborLabelName;
	
	@XmlElement(name = "LABOR_LEVEL_NAME")
	private String laborLevelName;

	@XmlElement(name = "CCOSTOS")
	private String centroCostos;
	
	@XmlElement(name = "FOLIOINCAP")
	private String folioIncap;
	
	@XmlElement(name = "CODIGOAUSENCIA")
	private String codigoAusencia;
	
	@XmlElement(name = "PERSONNUM")
	private String personNum;
	
	@XmlElement(name = "DURACION")
	private String duracion;
	
	@XmlElement(name = "ESTATUSAUS")
	private String estatusAus;
	@XmlElement(name = "ESTATUSAPRB")
	private String estatusAprb;
	
	@XmlElement(name = "CREADOPOR")
	private String creadoPor;
	
	@XmlElement(name = "FECHACREACION")
	private String fechaCreacion;
	
	@XmlElement(name = "INFOADICIONAL")
	private String infoAdicional;
	
	@XmlElement(name = "FECHAREALINICIO")
	private String fechaRealInicio;
	
	@XmlElement(name = "FECHAREALFIN")
	private String fechaRealFin;
	
	@XmlElement(name = "PLANTA")
	private String planta;
	
	@XmlElement(name = "TIPOEMPLEADO")
	private String tipoEmpleado;

	public String getReqCode() {
		return reqCode;
	}

	public String getLaborLevelEntryName() {
		return laborLevelEntryName;
	}

	public String getLaborLabelName() {
		return laborLabelName;
	}

	public String getLaborLevelName() {
		return laborLevelName;
	}

	public String getCentroCostos() {
		return centroCostos;
	}

	public String getFolioIncap() {
		return folioIncap;
	}

	public String getCodigoAusencia() {
		return codigoAusencia;
	}

	public String getPersonNum() {
		return personNum;
	}

	public String getDuracion() {
		return duracion;
	}

	public String getEstatusAus() {
		return estatusAus;
	}

	public String getEstatusAprb() {
		return estatusAprb;
	}

	public String getCreadoPor() {
		return creadoPor;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public String getInfoAdicional() {
		return infoAdicional;
	}

	public String getFechaRealInicio() {
		return fechaRealInicio;
	}

	public String getFechaRealFin() {
		return fechaRealFin;
	}
	
	public String getPlanta() {
		return planta;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setReqCode(String reqCode) {
		this.reqCode = reqCode;
	}

	public void setLaborLevelEntryName(String laborLevelEntryName) {
		this.laborLevelEntryName = laborLevelEntryName;
	}

	public void setLaborLabelName(String laborLabelName) {
		this.laborLabelName = laborLabelName;
	}

	public void setLaborLevelName(String laborLevelName) {
		this.laborLevelName = laborLevelName;
	}

	public void setCentroCostos(String centroCostos) {
		this.centroCostos = centroCostos;
	}

	public void setFolioIncap(String folioIncap) {
		this.folioIncap = folioIncap;
	}

	public void setCodigoAusencia(String codigoAusencia) {
		this.codigoAusencia = codigoAusencia;
	}

	public void setPersonNum(String personNum) {
		this.personNum = personNum;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setEstatusAus(String estatusAus) {
		this.estatusAus = estatusAus;
	}

	public void setEstatusAprb(String estatusAprb) {
		this.estatusAprb = estatusAprb;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

	public void setFechaRealInicio(String fechaRealInicio) {
		this.fechaRealInicio = fechaRealInicio;
	}

	public void setFechaRealFin(String fechaRealFin) {
		this.fechaRealFin = fechaRealFin;
	}
	
	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}
