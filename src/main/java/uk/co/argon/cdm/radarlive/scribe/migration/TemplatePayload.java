package uk.co.argon.cdm.radarlive.scribe.migration;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplatePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplatePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="crReference" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Requestor" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Approver" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="destinationEnvironment" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="requestedTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="listOfSections" type="{http://synapse.ominsure.co.za/webservice}Sections" minOccurs="0"/&gt;
 *         &lt;element name="listOfModerators" type="{http://synapse.ominsure.co.za/webservice}Moderators" minOccurs="0"/&gt;
 *         &lt;element name="statusOfDeployment" type="{http://synapse.ominsure.co.za/webservice}String"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplatePayload", propOrder = {
    "requestId",
    "crReference",
    "requestor",
    "approver",
    "destinationEnvironment",
    "requestedTime",
    "listOfSections",
    "listOfModerators",
    "statusOfDeployment",
    "errorMessage"
})
public class TemplatePayload {

    protected long requestId;
    protected String crReference;
    @XmlElement(name = "Requestor")
    protected String requestor;
    @XmlElement(name = "Approver")
    protected String approver;
    protected String destinationEnvironment;
    protected String requestedTime;
    protected List<MigrationSection> sections;
    protected List<MigrationModerator> moderators;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String statusOfDeployment;
    protected String errorMessage;

    /**
     * Gets the value of the requestId property.
     * 
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the crReference property.
     * 
     */
    public String getCrReference() {
        return crReference;
    }

    /**
     * Sets the value of the crReference property.
     * 
     */
    public void setCrReference(String value) {
        this.crReference = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     */
    public String getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     */
    public void setApprover(String value) {
        this.approver = value;
    }

    /**
     * Gets the value of the destinationEnvironment property.
     * 
     */
    public String getDestinationEnvironment() {
        return destinationEnvironment;
    }

    /**
     * Sets the value of the destinationEnvironment property.
     * 
     */
    public void setDestinationEnvironment(String value) {
        this.destinationEnvironment = value;
    }

    /**
     * Gets the value of the requestedTime property.
     * 
     */
    public String getRequestedTime() {
        return requestedTime;
    }

    /**
     * Sets the value of the requestedTime property.
     * 
     */
    public void setRequestedTime(String value) {
        this.requestedTime = value;
    }

    /**
     * Gets the value of the listOfSections property.
     * 
     * @return
     *     possible object is
     *     {@link Sections }
     *     
     */
    public List<MigrationSection> getSections() {
        return sections;
    }

    /**
     * Sets the value of the listOfSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sections }
     *     
     */
    public void setSections(List<MigrationSection> sections) {
        this.sections = sections;
    }

    /**
     * Gets the value of the listOfModerators property.
     * 
     * @return
     *     possible object is
     *     {@link Moderators }
     *     
     */
    public List<MigrationModerator> getModerators() {
        return moderators;
    }

    /**
     * Sets the value of the listOfModerators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moderators }
     *     
     */
    public void setListOfModerators(List<MigrationModerator> moderators) {
        this.moderators = moderators;
    }

    /**
     * Gets the value of the statusOfDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOfDeployment() {
        return statusOfDeployment;
    }

    /**
     * Sets the value of the statusOfDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOfDeployment(String value) {
        this.statusOfDeployment = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
