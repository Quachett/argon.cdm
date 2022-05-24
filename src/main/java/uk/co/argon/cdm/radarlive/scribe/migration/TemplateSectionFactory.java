package uk.co.argon.cdm.radarlive.scribe.migration;

import java.util.ArrayList;

import uk.co.argon.cdm.radarlive.scribe.metadatarequest.TableColumn;
import uk.co.argon.cdm.radarlive.scribe.metadatarequest.TableRow;
import uk.co.inc.argon.commons.util.CommonsUtil;

public class TemplateSectionFactory {

	private static int i = 0;
	private static int j = 0;
	public static void processSection(MigrationSection section, RadarTemplateTable tbl) {
		TableRow row = new TableRow();
		TableColumn col = new TableColumn();

		col.setIndex(0);
		col.setValue(section.getSectionName());
		row.getColumn().add(col);
		
		col = new TableColumn();
		col.setIndex(1);
		col.setValue(section.getSectionCode());
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(2);
		col.setValue(section.getTypeId());
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(3);
		col.setValue(CommonsUtil.getSerialisedObj(section.getCurrentModel()));
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(3);
		col.setValue(CommonsUtil.getSerialisedObj(section.getNewModel()));
		row.getColumn().add(col);
		
		row.setIndex(i++);
		if(tbl.getRows().isEmpty())
			tbl.getRows().add(new ArrayList<TableRow>());
		tbl.getRows().get(0).add(row);
	}
	
	public static void processModerator(MigrationModerator moderator,  RadarTemplateTable tbl) {
		TableRow row = new TableRow();
		TableColumn col = new TableColumn();

		col = new TableColumn();
		col.setIndex(0);
		col.setValue(moderator.getModeratorName());
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(1);
		col.setValue(moderator.getTransactionType());
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(2);
		col.setValue(CommonsUtil.getSerialisedObj(moderator.getCurrentModel()));
		row.getColumn().add(col);

		col = new TableColumn();
		col.setIndex(3);
		col.setValue(CommonsUtil.getSerialisedObj(moderator.getNewModel()));
		row.getColumn().add(col);

		row.setIndex(j++);
		if(tbl.getRows().size()==1)
			tbl.getRows().add(new ArrayList<TableRow>());
		tbl.getRows().get(1).add(row);
	}

}
