package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ReturnButton;

public class MagazinePanelInputs extends JPanel
{
	public MagazinePanelInputs(JPanel panel)
	{
		LabeledTextField magazineInput = new LabeledTextField("Czasopismo");
		add(magazineInput);
		LabeledTextField issnInput = new LabeledTextField("Numer ISSN");
		add(issnInput);
		add(new AddMagazineButton("+", magazineInput, issnInput));
		add(new ReturnButton(panel));
	}
}
