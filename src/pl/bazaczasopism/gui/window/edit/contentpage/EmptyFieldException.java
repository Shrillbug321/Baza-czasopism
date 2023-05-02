package pl.bazaczasopism.gui.window.edit.contentpage;

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
			JOptionPane.showMessageDialog(frame, "Tytu� nie mo�e by� pusty.",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(frame, "Numer strony nie mo�e by� pusty.",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}
