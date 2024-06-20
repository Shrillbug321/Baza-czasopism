package pl.bazaczasopism.gui.window.edit.magazine;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.Publisher;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;

public class AddMagazineButtonEvent extends ButtonEvent
{
	private LabeledTextField magazineInput;
	private LabeledTextField issnInput;
	private JFrame frame = Frame.getMain();
	public AddMagazineButtonEvent(LabeledTextField magazineInput, LabeledTextField issnInput) 
	{
		this.magazineInput = magazineInput;
		this.issnInput = issnInput;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			String magazineName;
			String issnNumber;
			String publisherName;
			int publisherIndex;
			String frequency;
			String type;
			ArrayList<Publisher> publishers = new ArrayList<Publisher>();
			try
			{
				magazineName = magazineInput.getText();
				issnNumber = issnInput.getText();
				if (magazineName.isEmpty())
					throw new EmptyFieldException(1);
				if (issnNumber.isEmpty())
					throw new EmptyFieldException(2);
			}
			catch (EmptyFieldException exc)
			{
				return;
			}
			try
			{
				if (issnNumber.length() < 7)
					throw new NotValidIssn(1);
				checkIssn(issnNumber);
			}
			catch (NotValidIssn exc)
			{
				return;
			}
			try
			{
				Load.objects("files/publishers.dat", publishers);
				String tempIndex = Load.getName("files/temppublishers.txt");				
				publisherIndex = Integer.parseInt(tempIndex);
				publisherName = publishers.get(publisherIndex).getName();
				frequency = Load.line("files/tempfrequency.txt", 2);
				type = Load.line("files/temptypes.txt", 2);
				if (frequency == null || type == null)
					throw new NullPointerException();
			}
			catch (NullPointerException | NumberFormatException exc)
			{
				JOptionPane.showMessageDialog(frame, "Nie wybrano wszystkich wartości z list.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			Magazine magazine = new Magazine(magazineName, frequency, publisherName, type, issnNumber);
			magazineInput.setText("");
			issnInput.setText("");
			
			publishers.get(publisherIndex).addMagazine(magazine);
			Save.objects("files/publishers.dat", publishers);
			Save.oneObject("files/magazines.dat", magazine);
			Save.line("files/magazines.txt", magazine.getName(), true);
			
			System.out.println("Dodano");
			JOptionPane.showMessageDialog(frame, "Pomyślnie dodano czasopismo.", "Informacja",
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch (Exception exc)
		{
			JOptionPane.showMessageDialog(frame, "Nie udało się dodać czasopisma.",
					"Błąd", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void checkIssn(String issnNumber) throws NotValidIssn
	{
		for (int i=0; i<6; i++)
		{
			if (issnNumber.charAt(i) < 48 || issnNumber.charAt(i) > 59)
				throw new NotValidIssn(2);
		}
		if ((issnNumber.charAt(6) < 48 || issnNumber.charAt(6) > 59) && issnNumber.charAt(6) != 'X')
			throw new NotValidIssn(2);
	}
}
