package pl.bazaczasopism.gui.window.toolbar;

import pl.bazaczasopism.gui.buttons.LargeButton;
public class SearchButton extends LargeButton
{
	public SearchButton()
	{
		super("Szukaj");
		addActionListener(new SearchButtonEvent());
	}
}
