package pl.bazaczasopism.gui.window.search;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTable;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.gui.window.search.detail.DetailPanel;
import pl.bazaczasopism.util.Clear;

public class DetailMenuItemEvent extends MouseAdapter
{
	private JTable table;
	public DetailMenuItemEvent(JTable table)
	{
		this.table = table;
	}
	
	public void mouseReleased(MouseEvent e)
	{
		JFrame frame = Frame.getMain();
		Clear.panel();
		int index = table.getSelectedRow(); 
		ScrollBar scrollBar = new ScrollBar(new DetailPanel(index));
		frame.add(scrollBar);
		Clear.redraw();
	}
}
