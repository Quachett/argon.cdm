package uk.co.argon.cdm.radarlive.scribe.migration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import uk.co.argon.cdm.radarlive.scribe.metadatarequest.Table;
import uk.co.argon.cdm.radarlive.scribe.metadatarequest.TableRow;

@XmlRootElement(name = "table", namespace = "http://synapse.ominsure.co.za/webservice/scribe")
public class RadarTemplateTable extends Table {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@XmlElement(name = "table")
	private List<List<TableRow>> rows;

	/**
	 * @return the rows
	 */
	public List<List<TableRow>> getRows() {
		if(rows == null)
			rows = new ArrayList<List<TableRow>>();
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<List<TableRow>> rows) {
		this.rows = rows;
	}

}
