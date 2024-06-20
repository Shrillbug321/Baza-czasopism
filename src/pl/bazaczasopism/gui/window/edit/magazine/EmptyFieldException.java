package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class EmptyFieldException extends Exception
{
	EmptyFieldException(int i)
	{
		JFrame frame = Frame.getMain();
		switch (i)
		{
			case 1:
				JOptionPane.showMessageDialog(frame, "Nazwa czasopisma nie może być pusta.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(frame, "Numer ISSN nie może być pusty.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
}
