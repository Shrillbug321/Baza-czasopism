package pl.bazaczasopism.gui.window.toolbar;
import java.awt.*;
import javax.swing.*;
public class Toolbar extends JToolBar
{
	public Toolbar()
	{
		setLayout(new FlowLayout());
		setSize(640, 480);
		add(new SearchButton());
		add(new EditButton());
		add(new CloseButton());
	}
}
