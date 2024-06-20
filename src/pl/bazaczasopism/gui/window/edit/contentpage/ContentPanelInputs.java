package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ReturnButton;

public class ContentPanelInputs extends JPanel
{
	public ContentPanelInputs(JPanel panel)
	{
		LabeledTextField header = new LabeledTextField("Tytuł");
		add(header);
		LabeledTextField page = new LabeledTextField("Numer strony");
		add(page);
		add(new AddContentButton("+", header, page));
		add(new ReturnButton(panel));
	}
}
