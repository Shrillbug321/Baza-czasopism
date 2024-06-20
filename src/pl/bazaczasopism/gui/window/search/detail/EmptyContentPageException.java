package pl.bazaczasopism.gui.window.search.detail;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class EmptyContentPageException extends Exception
{
	public EmptyContentPageException()
	{
		JFrame frame = Frame.getMain();
		JOptionPane.showMessageDialog(frame, "Spis treści jest pusty.",
				"Informacja", JOptionPane.INFORMATION_MESSAGE);
	}
}
