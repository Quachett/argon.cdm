package uk.co.argon.cdm.radarlive.scribe.migration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import uk.co.argon.cdm.radarlive.scribe.metadatarequest.MetadataRequest;


public class RadarMetadataRequest extends MetadataRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "tables")
	private RadarTemplateTables radarTables;
	/**
	 * @return the radarTables
	 */
	public RadarTemplateTables getRadarTables() {
		if(radarTables == null)
			radarTables = new RadarTemplateTables();
		return radarTables;
	}
	/**
	 * @param radarTables the radarTables to set
	 */
	public void setRadarTables(RadarTemplateTables radarTables) {
		this.radarTables = radarTables;
	}


}
