package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JPanel;
import pl.bazaczasopism.gui.buttons.LargeButton;

public class AddContentPanelButton extends LargeButton
{
	public AddContentPanelButton(String a, JPanel panel) 
	{
		super(a, panel);
		addActionListener(new AddContentPanelButtonEvent(panel));
	}
}
