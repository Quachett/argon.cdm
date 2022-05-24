package uk.co.argon.cdm.radarlive.scribe.migration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MigrationModerator")
@XmlType(propOrder = { "moderatorName","transactionType","currentModel","newModel","executionOrder" })
public class MigrationModerator {
	@XmlElement
	private String moderatorName;
	@XmlElement
	private String transactionType;
	@XmlElement
	private int executionOrder;
	@XmlElement
	private MigrationModel currentModel;
	@XmlElement
	private MigrationModel newModel;
	
	public String getModeratorName() {
		return moderatorName;
	}
	public void setModeratorName(String moderatorName) {
		this.moderatorName = moderatorName;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getExecutionOrder() {
		return executionOrder;
	}
	public void setExecutionOrder(int executionOrder) {
		this.executionOrder = executionOrder;
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
	
}
