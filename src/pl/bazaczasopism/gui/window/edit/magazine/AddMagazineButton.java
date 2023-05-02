package pl.bazaczasopism.gui.window.edit.magazine;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.SmallButton;

public class AddMagazineButton extends SmallButton
{
	public AddMagazineButton(String a, LabeledTextField magazineInput, LabeledTextField issnInput) 
	{
		super(a);
		addActionListener(new AddMagazineButtonEvent(magazineInput, issnInput));
	}
}
