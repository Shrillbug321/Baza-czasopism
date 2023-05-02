package pl.bazaczasopism.gui.window.edit.publisher;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;

public class AddPublisherPanelButtonEvent extends ButtonEvent
{
	public AddPublisherPanelButtonEvent(JPanel panel) 
	{
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		frame.add(new PublisherPanel(frame, panel));
		frame.remove(panel);
		frame.revalidate();
		frame.repaint();
	}
}
