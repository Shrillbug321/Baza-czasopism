package pl.bazaczasopism.gui.window.edit.contentpage;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.SmallButton;

public class AddContentButton extends SmallButton
{
	public AddContentButton(String a, LabeledTextField header, LabeledTextField page) 
	{
		super(a);
		addActionListener(new AddContentButtonEvent(header, page));
	}
}
