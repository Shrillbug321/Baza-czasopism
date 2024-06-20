package pl.bazaczasopism.gui.window.search;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class NotFoundMagazineException extends Exception
{
	public NotFoundMagazineException()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Nie znaleziono szukanego czasopisma.",
			"Informacja", JOptionPane.INFORMATION_MESSAGE);
	}
}
