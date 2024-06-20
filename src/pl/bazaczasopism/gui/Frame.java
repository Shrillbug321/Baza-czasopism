package pl.bazaczasopism.gui;
import java.awt.*;
import javax.swing.*;

import pl.bazaczasopism.gui.window.CloseWindowEvent;
import pl.bazaczasopism.gui.window.toolbar.Toolbar;

public class Frame extends JFrame
{
	static JFrame main;
	public Frame(boolean isMain)
	{
		if (isMain)
			setMain();
		setVisible(true);
		setSize(640, 480);
		setTitle("Jednostanowiskowa baza czasopism");
		addWindowListener( new CloseWindowEvent() );
		add(BorderLayout.NORTH, new Toolbar());
	}
	
	public void setMain()
	{
		main = this;
	}
	
	static public JFrame getMain()
	{
		return main;
	}
}
