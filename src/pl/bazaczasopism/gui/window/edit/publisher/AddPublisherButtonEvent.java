package pl.bazaczasopism.gui.window.edit.publisher;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.Publisher;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
import pl.bazaczasopism.util.Save;

public class AddPublisherButtonEvent extends ButtonEvent
{
	private LabeledTextField publisherInput;
	public AddPublisherButtonEvent(LabeledTextField publisherInput) 
	{
		this.publisherInput = publisherInput;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		try 
		{
			String name;
			try 
			{
				name = publisherInput.getText();
				publisherInput.setText("");
				if (name.contentEquals(""))
					throw new EmptyPublisherInputException();
			}
			catch (EmptyPublisherInputException exc)
			{
				return;
			}
			Publisher publisher = new Publisher(name);
			Save.oneObject("files/publishers.dat", publisher);
			Save.line("files/publishers.txt", publisher.getName(), true);
			
			JOptionPane.showMessageDialog(frame, "Pomyœlnie dodano wydawnictwo.",
					"Informacja", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (Exception exc)
		{
			JOptionPane.showMessageDialog(frame, "Nie uda³o siê dodaæ wydawnictwa.",
					"B³¹d", JOptionPane.ERROR_MESSAGE);
		}
	}
}
