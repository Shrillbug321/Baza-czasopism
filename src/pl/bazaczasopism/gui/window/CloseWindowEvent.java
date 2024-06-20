package pl.bazaczasopism.gui.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.util.Temp;

public class CloseWindowEvent extends WindowAdapter
{
	public CloseWindowEvent() 
	{
		super();
	}

	public void windowClosing(WindowEvent e) 
	{
		JFrame frame = Frame.getMain();
		Object[] options = {"Tak", "Nie"};
		if (JOptionPane.showOptionDialog(frame, "Czy na pewno chcesz opuścić program?", "Zamknięcie",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 1)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		else
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Temp.delete();
		}
	}
}