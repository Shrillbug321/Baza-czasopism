package pl.bazaczasopism.gui.window.toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;

public class CloseButtonEvent extends ButtonEvent
{
	public CloseButtonEvent() 
	{
		super();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();		
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}