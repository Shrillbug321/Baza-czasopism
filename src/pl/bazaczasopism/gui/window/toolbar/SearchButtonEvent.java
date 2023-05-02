package pl.bazaczasopism.gui.window.toolbar;
import java.awt.event.*;
import javax.swing.*;

import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.buttons.ButtonEvent;
import pl.bazaczasopism.gui.window.search.SearchPanel;
import pl.bazaczasopism.util.Clear;
import pl.bazaczasopism.util.Temp;
public class SearchButtonEvent extends ButtonEvent
{
	public SearchButtonEvent()
	{
		super();
	}
	public void actionPerformed(ActionEvent e)
	{
		JFrame frame = Frame.getMain();
		Temp.delete();
		Clear.panel();
		frame.add(new SearchPanel());
		frame.revalidate();
		frame.repaint();
	}
}