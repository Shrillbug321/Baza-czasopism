package pl.bazaczasopism.gui.window.toolbar;
import pl.bazaczasopism.gui.buttons.LargeButton;
public class EditButton extends LargeButton
{
	public EditButton()
	{
		super("Dodaj");
		addActionListener(new EditButtonEvent());
	}
}
