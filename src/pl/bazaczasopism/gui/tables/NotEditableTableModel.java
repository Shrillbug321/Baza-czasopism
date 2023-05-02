package pl.bazaczasopism.gui.tables;

import javax.swing.table.DefaultTableModel;

public class NotEditableTableModel extends DefaultTableModel
{
	public NotEditableTableModel (Object data[][], String columnName[])
	{
		super(data, columnName);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		return false;
	}
}
