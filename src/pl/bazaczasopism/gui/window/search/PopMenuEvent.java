package pl.bazaczasopism.gui.window.search;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class PopMenuEvent extends MouseAdapter
{
	private JPopupMenu popMenu;
	private JTable table;
	public PopMenuEvent(JPopupMenu popMenu, JTable table)
	{
		this.popMenu = popMenu;
		this.table = table;
	}
	public void mouseReleased(MouseEvent e)
	{
		if (SwingUtilities.isRightMouseButton(e))
		{
			popMenu.show(e.getComponent(), e.getX(), e.getY());
			int index = table.rowAtPoint(e.getPoint()); 
			table.setRowSelectionInterval(index, index);
		}
	}
}
