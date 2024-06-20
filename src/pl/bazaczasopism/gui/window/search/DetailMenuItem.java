package pl.bazaczasopism.gui.window.search;

import javax.swing.JMenuItem;
import javax.swing.JTable;

public class DetailMenuItem extends JMenuItem
{
	public DetailMenuItem(JTable table)
	{
		super("Szczegóły");
		addMouseListener(new DetailMenuItemEvent(table));
	}
}
