package uk.co.argon.cdm.radarlive.scribe.migration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MigrationModel")
@XmlType(propOrder = { "modelId","modelKeyName","radarModelName","radarModelVersion","startDate","exists","renewalStartDate" })
public class MigrationModel {
	@XmlElement
	private String modelId;
	@XmlElement
	private String modelKeyName;
	@XmlElement	
	private String radarModelName;
	@XmlElement
	private String radarModelVersion;	
	@XmlElement
	private String startDate;
	@XmlElement
	private Boolean exists;
	@XmlElement
	private String renewalStartDate;
	
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getModelKeyName() {
		return modelKeyName;
	}
	public void setModelKeyName(String modelKeyName) {
		this.modelKeyName = modelKeyName;
	}
	public String getRadarModelName() {
		return radarModelName;
	}
	public void setRadarModelName(String radarModelName) {
		this.radarModelName = radarModelName;
	}
	public String getRadarModelVersion() {
		return radarModelVersion;
	}
	public void setRadarModelVersion(String radarModelVersion) {
		this.radarModelVersion = radarModelVersion;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Boolean getExists() {
		return exists;
	}
	public void setExists(Boolean exists) {
		this.exists = exists;
	}
	public String getRenewalStartDate() {
		return renewalStartDate;
	}
	public void setRenewalStartDate(String renewalStartDate) {
		this.renewalStartDate = renewalStartDate;
	}
	
}
