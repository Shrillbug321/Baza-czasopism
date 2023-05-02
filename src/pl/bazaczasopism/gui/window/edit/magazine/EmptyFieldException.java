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
			JOptionPane.showMessageDialog(frame, "Nazwa czasopisma nie mo�e by� pusta.",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(frame, "Numer ISSN nie mo�e by� pusty.",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}
