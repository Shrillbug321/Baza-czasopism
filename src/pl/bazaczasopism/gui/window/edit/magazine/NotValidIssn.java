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
			JOptionPane.showMessageDialog(frame, "Niepoprawny numer ISSN \n(powinien mie� 7 cyfr).",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(frame, "Numer ISSN nie zawiera liter \n(opr�cz wielkiego X na ko�cu).",
					"B��d", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}
