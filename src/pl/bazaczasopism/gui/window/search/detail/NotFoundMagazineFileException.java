package pl.bazaczasopism.gui.window.search.detail;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class NotFoundMagazineFileException extends Exception
{
	public NotFoundMagazineFileException()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Nie dodano jeszcze �adnego czasopisma.",
				"Błąd", JOptionPane.ERROR_MESSAGE);
	}
}
