package pl.bazaczasopism.gui.window.edit.number;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;

public class AddNumberButtonEvent extends ButtonEvent
{
	private int index;
	private int number;
	private int year;
	private LabeledTextField numberInput;
	private LabeledTextField yearInput;
	private JFrame frame = Frame.getMain();
	
	protected AddNumberButtonEvent( LabeledTextField numberInput, LabeledTextField yearInput) 
	{
		this.numberInput = numberInput;
		this.yearInput = yearInput;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			String magazineIndex;
			ArrayList<Magazine> magazines = new ArrayList<Magazine>();
			Load.objects("files/magazines.dat", magazines);
			try
			{
				magazineIndex = Load.getName("files/tempmagazines.txt");
				index = Integer.parseInt(magazineIndex);
			}
			catch (NumberFormatException exc)
			{
				JOptionPane.showMessageDialog(frame, "Nie wybrano czasopisma.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				return;
			}
			try
			{
				if (numberInput.getText().isEmpty())
					throw new EmptyFieldException(1);
				
				if (yearInput.getText().isEmpty())
					throw new EmptyFieldException(2);
				
				number = Integer.parseInt(numberInput.getText());
				year = Integer.parseInt(yearInput.getText());
				if (year < 1500 || year > 2020)
					throw new NotValidYear();
			}
			catch (EmptyFieldException | NotValidYear exc)
			{
				return;
			}
			catch (NumberFormatException exc)
			{
				JOptionPane.showMessageDialog(frame, "Numer lub rok wydania zawiera literę.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				return;
			}
			numberInput.setText("");
			yearInput.setText("");
			MagazineNumber magazineNumber = new MagazineNumber(number, magazines.get(index).getName(), year);
			magazineNumber.setIssn(magazines.get(index).getIssn());
			
			magazines.get(index).addNumber(magazineNumber);
			Save.objects("files/magazines.dat", magazines);
			
			System.out.println("Dodano");
			JOptionPane.showMessageDialog(frame, "Pomyślnie dodano numer czasopisma.", "Informacja",
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch (Exception exc)
		{
			JOptionPane.showMessageDialog(frame, "Nie udało się dodać numeru czasopisma.",
					"Ostrzeżenie", JOptionPane.ERROR_MESSAGE);
		}
	}
}
