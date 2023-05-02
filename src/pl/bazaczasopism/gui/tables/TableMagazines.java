package pl.bazaczasopism.gui.tables;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import pl.bazaczasopism.util.Load;

public class TableMagazines extends TableInAdd
{
	public TableMagazines(String[] columnsName, String directory, JPanel panel) 
	{
		rows = new ArrayList<String>();
		this.columnsName = columnsName;
		this.directory = directory;
		Load.names(directory, rows);
		data = new Object[rows.size()-1][1];
		for(int i=0; i<rows.size()-1; i++)
		{
			data[i][0]=rows.get(i);
		}
		setModel(new NotEditableTableModel(data, columnsName));
		getSelectionModel().addListSelectionListener(new TableMagazinesSelectionEvent(panel, this, directory));
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
}
