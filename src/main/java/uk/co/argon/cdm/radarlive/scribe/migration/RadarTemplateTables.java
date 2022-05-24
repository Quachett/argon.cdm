package uk.co.argon.cdm.radarlive.scribe.migration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", namespace = "http://synapse.ominsure.co.za/webservice/scribe", propOrder = {
		"table"
		})
@XmlRootElement(name = "tables", namespace = "http://synapse.ominsure.co.za/webservice/scribe")
public class RadarTemplateTables implements Serializable {
	private static final long serialVersionUID = 1L;
	@XmlElement
	private List<RadarTemplateTable> table;

	/**
	 * @return the radarTemplateTables
	 */
	public List<RadarTemplateTable> getTables() {
		if(table==null)
			table = new ArrayList<RadarTemplateTable>();
		return table;
	}

	/**
	 * @param radarTemplateTables the radarTemplateTables to set
	 */
	public void setTables(List<RadarTemplateTable> radarTemplateTables) {
		this.table = radarTemplateTables;
	}


}
