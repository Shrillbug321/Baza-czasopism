package pl.bazaczasopism.gui.window.edit.number;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;

public class AddNumberPanelButtonEvent extends ButtonEvent
{
	public AddNumberPanelButtonEvent(JPanel panel) 
	{
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		frame.remove(panel);
		frame.add(new NumberPanel(panel));
		frame.revalidate();
		frame.repaint();
	}
}
