package pl.bazaczasopism.gui.window.search;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.TextField;
import pl.bazaczasopism.gui.buttons.LargeButton;

public class SearchButton extends LargeButton
{
	public SearchButton(String a, JPanel panel, TextField searchElement, DropDownList criterion) 
	{
		super(a);
		addActionListener(new SearchButtonEvent(panel, searchElement, criterion));
	}
}
