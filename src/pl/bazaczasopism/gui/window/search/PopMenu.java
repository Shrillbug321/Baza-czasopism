package pl.bazaczasopism.gui.window.search;

import javax.swing.JPopupMenu;
import javax.swing.JTable;

public class PopMenu extends JPopupMenu 
{
	public PopMenu(JTable table)
	{
		add(new DetailMenuItem(table));
		table.addMouseListener(new PopMenuEvent(this, table));
	}
}
