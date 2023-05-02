package pl.bazaczasopism.gui.tables;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import pl.bazaczasopism.util.Save;
import pl.bazaczasopism.util.Temp;

public class TableInAddSelectionEvent implements ListSelectionListener
{
	protected JTable table;
	protected String directory;
	public TableInAddSelectionEvent(JTable table, String directory)
	{
		this.table = table;
		this.directory = directory;
	}
	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
		int index = table.getSelectedRow();
		directory = Temp.findDirectory(directory);
		Save.line(directory, Integer.toString(index), false);
		Save.line(directory, table.getValueAt(index, 0).toString(), true);
	}
}
