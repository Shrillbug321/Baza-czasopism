package pl.bazaczasopism.gui.window.edit.publisher;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pl.bazaczasopism.gui.Frame;

public class EmptyPublisherInputException extends Exception
{
	EmptyPublisherInputException()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Nazwa wydawnictwa nie mo�e by� pusta.",
				"B��d", JOptionPane.ERROR_MESSAGE);
	}
}
