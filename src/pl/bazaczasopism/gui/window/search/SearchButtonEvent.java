package pl.bazaczasopism.gui.window.search;

import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.TextField;
import pl.bazaczasopism.gui.buttons.ButtonEvent;

public class SearchButtonEvent extends ButtonEvent
{
	private TextField searchElement;
	private DropDownList criterion;
	protected SearchButtonEvent(JPanel panel, TextField searchElement, DropDownList criterion) 
	{
		super(panel);
		this.searchElement = searchElement;
		this.criterion = criterion;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String text = searchElement.getText();
		Search search = new Search(text, criterion.getSelectedIndex());
		try {
			panel.add(new TablePanel(search.createTable()));
		} catch (NotFoundMagazineException exc) {
			return;
		}
		if (panel.getComponentCount() > 4)
			panel.remove(panel.getComponent(3));
		panel.revalidate();
		panel.repaint();
	}
}
