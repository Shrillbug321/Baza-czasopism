package pl.bazaczasopism.gui.tables;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import pl.bazaczasopism.util.Load;

public class TableInAdd extends JTable
{
	protected String columnsName[];
	protected ArrayList<String> rows;
	protected Object data[][];
	protected String directory;
	public TableInAdd(String columnsName[], String directory)
	{
		rows = new ArrayList<String>();
		this.columnsName = columnsName;
		this.directory = directory;
		Load.names(directory, rows);
		if (rows.size() == 0)
			return;
		data = new Object[rows.size()-1][1];
		for(int i=0; i<rows.size()-1; i++)
		{
			data[i][0]=rows.get(i);
		}
		this.setModel(new NotEditableTableModel(data, columnsName));
		getSelectionModel().addListSelectionListener(new TableInAddSelectionEvent(this, directory));
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	public TableInAdd()	{ }
}
