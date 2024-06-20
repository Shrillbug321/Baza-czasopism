package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;

public class NotValidIssn extends Exception{
	NotValidIssn(int i)
	{
		JFrame frame = Frame.getMain();
		switch (i)
		{
			case 1:
				JOptionPane.showMessageDialog(frame, "Niepoprawny numer ISSN \n(powinien mieć 7 cyfr).",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(frame, "Numer ISSN nie zawiera liter \n(oprócz wielkiego X na końcu).",
						"Błąd", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
}
