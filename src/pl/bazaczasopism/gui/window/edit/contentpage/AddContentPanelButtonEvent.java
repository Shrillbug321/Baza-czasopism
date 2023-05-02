package pl.bazaczasopism.gui.window.edit.contentpage;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;

public class AddContentPanelButtonEvent extends ButtonEvent{

	public AddContentPanelButtonEvent(JPanel panel) 
	{
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		frame.remove(panel);
		frame.add(new ContentPanel(panel));
		frame.revalidate();
		frame.repaint();
	}
}
