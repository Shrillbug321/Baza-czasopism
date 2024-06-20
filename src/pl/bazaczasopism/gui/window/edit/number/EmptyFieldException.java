package pl.bazaczasopism.gui.window.edit.number;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class EmptyFieldException extends Exception
{
	public EmptyFieldException(int i)
	{
		JFrame frame = Frame.getMain();
		switch (i)
		{
			case 1:
				JOptionPane.showMessageDialog(frame, "Numer nie może być pusty.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(frame, "Rok wydania nie może być pusty.",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
}
