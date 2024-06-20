package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class NotValidPageException extends Exception
{
	NotValidPageException()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Numer strony nie moźe zawierać liter.",
				"Błąd", JOptionPane.ERROR_MESSAGE);
	}	
}
