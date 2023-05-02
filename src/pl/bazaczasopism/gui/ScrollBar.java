package pl.bazaczasopism.gui;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ScrollBar extends JScrollPane
{
	public ScrollBar(JComponent component)
	{
		super(component);
		setPreferredSize(new Dimension(200, 200));
	}
	
	public ScrollBar(JTable table)
	{
		super(table);
		setPreferredSize(new Dimension(150, 200));
	}
	
	public ScrollBar(JPanel panel)
	{
		super(panel);
		setPreferredSize(new Dimension(600, 400));
	}
}
