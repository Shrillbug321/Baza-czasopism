package pl.bazaczasopism.gui.window.search;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.TextField;

public class SearchPanel extends JPanel
{
	public SearchPanel()
	{
		TextField searchElement = new TextField();
		DropDownList criterion = new DropDownList();
		add(searchElement);
		add(criterion);
		add(new SearchButton("Szukaj", this, searchElement, criterion));
	}
}
