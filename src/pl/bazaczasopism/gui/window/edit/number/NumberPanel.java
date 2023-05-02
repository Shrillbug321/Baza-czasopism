package pl.bazaczasopism.gui.window.edit.number;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.gui.buttons.ReturnButton;
import pl.bazaczasopism.gui.tables.TableInAdd;

public class NumberPanel extends JPanel
{
	public NumberPanel(JPanel panel)
	{
		String magazinesHeader[] = {"Czasopismo"};
		TableInAdd magazinesList = new TableInAdd(magazinesHeader, "files/magazines.txt");
		add(new ScrollBar(magazinesList));
		LabeledTextField numberInput = new LabeledTextField("Numer");
		add(numberInput);
		LabeledTextField yearInput = new LabeledTextField("Rok wydania");
		add(yearInput);
		add(new AddNumberButton("+", numberInput, yearInput));
		add(new ReturnButton(panel));
	}
}
