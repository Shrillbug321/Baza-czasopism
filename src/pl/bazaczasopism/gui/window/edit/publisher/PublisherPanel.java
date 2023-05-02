package pl.bazaczasopism.gui.window.edit.publisher;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ReturnButton;

public class PublisherPanel extends JPanel
{
	public PublisherPanel(JFrame frame, JPanel panel)
	{
		LabeledTextField publisherInput = new LabeledTextField("Wydawnictwo");
		add(publisherInput);
		add(new AddPublisherButton("+", publisherInput));
		add(new ReturnButton(panel));
	}
}
