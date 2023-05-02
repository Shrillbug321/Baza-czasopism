package pl.bazaczasopism.gui.window.edit.publisher;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.buttons.LargeButton;

public class AddPublisherPanelButton extends LargeButton
{
	public AddPublisherPanelButton(String a, JPanel panel) 
	{
		super(a, panel);
		addActionListener(new AddPublisherPanelButtonEvent(panel));
	}
}
