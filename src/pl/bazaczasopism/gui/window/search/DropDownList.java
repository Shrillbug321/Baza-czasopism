package pl.bazaczasopism.gui.window.search;

import javax.swing.JComboBox;

public class DropDownList extends JComboBox<String>
{
	private static String list[] = {"Czasopismo", "Wydawnictwo", "Rodzaj", "Cz�sto��"};
	public DropDownList()
	{
		super(list);
		addActionListener(new DropDownListSelectionEvent(this));
	}
}
