package uk.co.argon.cdm.radarlive.scribe.migration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "KeyValue")
@XmlType(propOrder = { "id","name" })
public class KeyValue {
	@XmlElement
	private int id;
	@XmlElement
	private String name;
	
	public KeyValue() {
		
	}
	
	public KeyValue(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
