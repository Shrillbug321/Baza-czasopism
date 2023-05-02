package pl.bazaczasopism.gui.window.search;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTable;

import pl.bazaczasopism.gui.ScrollBar;

public class TablePanel extends JPanel
{
	public TablePanel(JTable table)
	{
		ScrollBar scrollBar = new ScrollBar(table);
		scrollBar.setPreferredSize(new Dimension(500, 300));
		add(scrollBar);
	}
}
