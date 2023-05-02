package pl.bazaczasopism.gui.window.edit.publisher;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.SmallButton;

public class AddPublisherButton extends SmallButton
{
	public AddPublisherButton(String a, LabeledTextField publisherInput) 
	{
		super(a);
		addActionListener(new AddPublisherButtonEvent(publisherInput));
	}
}
