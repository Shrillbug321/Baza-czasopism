package pl.bazaczasopism.gui.window.edit.contentpage;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
import pl.bazaczasopism.gui.window.edit.contentpage.EmptyFieldException;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;

public class AddContentButtonEvent extends ButtonEvent
{
	private LabeledTextField headerInput;
	private LabeledTextField pageInput;
	private JFrame frame;
	protected AddContentButtonEvent(LabeledTextField headerInput, LabeledTextField pageInput)
	{
		this.headerInput = headerInput;
		this.pageInput = pageInput;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		frame = Frame.getMain();
		try 
		{
			ArrayList<Magazine> magazines = new ArrayList<Magazine>();
			Load.objects("files/magazines.dat", magazines);			
			int magazineIndex;
			int numberIndex;
			
			try 
			{
				magazineIndex = Integer.parseInt(Load.line("files/tempcontent.txt", 1));
			}
			catch (NumberFormatException exc)
			{
				JOptionPane.showMessageDialog(frame, "Nie wybrano czasopisma.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				return;
			}
			try 
			{
				numberIndex = Integer.parseInt(Load.line("files/tempcontent.txt", 2));
			}
			catch (NumberFormatException exc)
			{
				JOptionPane.showMessageDialog(frame, "Nie wybrano numeru.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String header;
			String page;
			try
			{
				if (headerInput.getText().isEmpty())
					throw new EmptyFieldException(1);
				if (pageInput.getText().isEmpty())
					throw new EmptyFieldException(2);
				checkPage(pageInput.getText());
				header = headerInput.getText();
				page = pageInput.getText();
			}
			catch (EmptyFieldException | NotValidPageException exc)
			{
				return;
			}
			
			headerInput.setText("");
			pageInput.setText("");
			
			magazines.get(magazineIndex).getNumbers().get(numberIndex).
			getContentPage().add(header, page);
			Save.objects("files/magazines.dat", magazines);
			
			JOptionPane.showMessageDialog(frame, "Pomyślnie dodano pozycję spisu treści.", "Informacja",
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch (Exception exc)
		{
			JOptionPane.showMessageDialog(frame, "Nie udało się dodać pozycji spisu treści.",
					"Ostrzeżenie", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void checkPage(String pageInput) throws NotValidPageException
	{
		for (int i=0; i<pageInput.length(); i++)
		{
			if (pageInput.charAt(i) < 48 || pageInput.charAt(i) > 59)
				throw new NotValidPageException();
		}
	}
}
