package pl.bazaczasopism.gui.window.edit.number;

import javax.swing.JPanel;
import pl.bazaczasopism.gui.buttons.LargeButton;

public class AddNumberPanelButton extends LargeButton{

	public AddNumberPanelButton(String a, JPanel panel) 
	{
		super(a, panel);
		addActionListener( new AddNumberPanelButtonEvent(panel));
	}
}
