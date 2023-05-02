package pl.bazaczasopism.gui.window.search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class DropDownListSelectionEvent implements ActionListener
{
	private JComboBox<String> criterion;
	public DropDownListSelectionEvent(JComboBox<String> criterion)
	{
		this.criterion = criterion;
	}
	
	public int getIndex()
	{
		return criterion.getSelectedIndex();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	}
}
