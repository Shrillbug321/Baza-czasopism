package pl.bazaczasopism.gui.window.toolbar;

import pl.bazaczasopism.gui.buttons.SmallButton;

public class CloseButton extends SmallButton
{
	public CloseButton() 
	{
		super("X");
		addActionListener(new CloseButtonEvent());
	}
}
