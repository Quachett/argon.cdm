package uk.co.argon.cdm.radarlive.scribe.migration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DeploymentRequest")
@XmlType(propOrder = { "requestId","scheduledTime","changeControlReference","requestorUserId","requestor","approverUserId","approver",
		"destinationEnvironment","payload", "status", "requestedTime","startedTime","completedTime"})
public class DeploymentRequest {
	@XmlElement
	private long requestId;
	@XmlElement
	private String scheduledTime;
	@XmlElement
	private String changeControlReference;
	@XmlElement
	private String requestorUserId;
	@XmlElement
	private String requestor;
	@XmlElement
	private String approverUserId;
	@XmlElement
	private String approver;
	@XmlElement
	private String destinationEnvironment;
	@XmlElement
	private String payload;
	@XmlElement
	private KeyValue status;
	@XmlElement
	private String requestedTime;
	@XmlElement
	private String startedTime;
	@XmlElement
	private String completedTime;

	public long getRequestId() {
		return requestId;
	}
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	public String getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public String getChangeControlReference() {
		return changeControlReference;
	}
	public void setChangeControlReference(String changeControlReference) {
		this.changeControlReference = changeControlReference;
	}
	public String getRequestorUserId() {
		return requestorUserId;
	}
	public void setRequestorUserId(String requestorUserId) {
		this.requestorUserId = requestorUserId;
	}
	public String getRequestor() {
		return requestor;
	}
	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}
	public String getApproverUserId() {
		return approverUserId;
	}
	public void setApproverUserId(String approverUserId) {
		this.approverUserId = approverUserId;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getDestinationEnvironment() {
		return destinationEnvironment;
	}
	public void setDestinationEnvironment(String destinationEnvironment) {
		this.destinationEnvironment = destinationEnvironment;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public KeyValue getStatus() {
		return status;
	}
	public void setStatus(KeyValue status) {
		this.status = status;
	}
	public String getRequestedTime() {
		return requestedTime;
	}
	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}
	public String getStartedTime() {
		return startedTime;
	}
	public void setStartedTime(String startedTime) {
		this.startedTime = startedTime;
	}
	public String getCompletedTime() {
		return completedTime;
	}
	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}
}
