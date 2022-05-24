package uk.co.argon.cdm.radarlive.scribe.migration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MigrationSection")
@XmlType(propOrder = { "sectionName","sectionCode","typeId","currentModel","newModel","executionOrder" })
public class MigrationSection {
	@XmlElement
	private String sectionName;
	@XmlElement
	private String sectionCode;
	@XmlElement
	private String typeId;
	@XmlElement
	private MigrationModel currentModel;
	@XmlElement
	private MigrationModel newModel;
	@XmlElement
	private int executionOrder;
	
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getSectionCode() {
		return sectionCode;
	}
	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public MigrationModel getCurrentModel() {
		return currentModel;
	}
	public void setCurrentModel(MigrationModel currentModel) {
		this.currentModel = currentModel;
	}
	public MigrationModel getNewModel() {
		return newModel;
	}
	public void setNewModel(MigrationModel newModel) {
		this.newModel = newModel;
	}
	public int getExecutionOrder() {
		return executionOrder;
	}
	public void setExecutionOrder(int executionOrder) {
		this.executionOrder = executionOrder;
	}
	
}
