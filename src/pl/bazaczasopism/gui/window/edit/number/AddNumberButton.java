package pl.bazaczasopism.gui.window.edit.number;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.SmallButton;

public class AddNumberButton extends SmallButton
{
	public AddNumberButton(String a, LabeledTextField numberInput, LabeledTextField yearInput) 
	{
		super(a);
		addActionListener(new AddNumberButtonEvent(numberInput, yearInput));
	}
}
