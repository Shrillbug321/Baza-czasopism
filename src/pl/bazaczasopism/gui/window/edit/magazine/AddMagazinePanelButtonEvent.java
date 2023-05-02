package pl.bazaczasopism.gui.window.edit.magazine;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
public class AddMagazinePanelButtonEvent extends ButtonEvent
{
	public AddMagazinePanelButtonEvent(JPanel panel) 
	{
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = Frame.getMain();
		frame.remove(panel);
		frame.add(new MagazinePanel(panel));
		frame.revalidate();
		frame.repaint();
	}
}
