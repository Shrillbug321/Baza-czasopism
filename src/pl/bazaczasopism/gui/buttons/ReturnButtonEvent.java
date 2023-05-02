package pl.bazaczasopism.gui.buttons;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.util.Clear;
import pl.bazaczasopism.util.Temp;

public class ReturnButtonEvent extends ButtonEvent
{
	private JPanel addPanel;
	protected ReturnButtonEvent(JPanel addPanel) 
	{
		super(addPanel);
		this.addPanel = addPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		Temp.delete();
		Clear.panel();
		frame.add(addPanel);
		Clear.redraw();
	}
}