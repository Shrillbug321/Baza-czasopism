package pl.bazaczasopism.gui.tables;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

import pl.bazaczasopism.util.Save;

public class TableNumbersSelectionEvent extends TableInAddSelectionEvent
{
	public TableNumbersSelectionEvent(JTable table, String directory) 
	{
		super(table, directory);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
		int numberIndex = table.getSelectedRow();
		Save.line("files/tempcontent.txt", Integer.toString(numberIndex), true);
	}
}
