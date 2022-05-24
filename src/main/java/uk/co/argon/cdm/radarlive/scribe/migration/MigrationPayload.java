package uk.co.argon.cdm.radarlive.scribe.migration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MigrationPayload")
@XmlType(propOrder = { "campaignName","sections","moderators" })
public class MigrationPayload {
	@XmlElement
	private String campaignName;
	@XmlElement
	private List<MigrationSection> sections;
	@XmlElement
	private List<MigrationModerator> moderators;
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public List<MigrationSection> getSections() {
		if (sections==null)
			sections=new ArrayList<>();
		return sections;
	}
	public void setSections(List<MigrationSection> sections) {
		this.sections = sections;
	}
	public List<MigrationModerator> getModerators() {
		if (moderators==null)
			moderators=new ArrayList<>();
		return moderators;
	}
	public void setModerators(List<MigrationModerator> moderators) {
		this.moderators = moderators;
	}
}
