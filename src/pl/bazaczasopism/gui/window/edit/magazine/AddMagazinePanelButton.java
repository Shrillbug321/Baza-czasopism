package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.buttons.LargeButton;

public class AddMagazinePanelButton extends LargeButton
{
	public AddMagazinePanelButton(String a, JPanel panel) 
	{
		super(a, panel);
		addActionListener(new AddMagazinePanelButtonEvent(panel));
	}
}
