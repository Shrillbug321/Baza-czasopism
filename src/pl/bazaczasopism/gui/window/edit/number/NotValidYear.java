package pl.bazaczasopism.gui.window.edit.number;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class NotValidYear extends Exception
{
	NotValidYear()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Niepoprawny rok.",
				"B³¹d", JOptionPane.ERROR_MESSAGE);
	}
}
