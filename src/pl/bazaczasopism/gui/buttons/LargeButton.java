package pl.bazaczasopism.gui.buttons;

import java.awt.Dimension;
import javax.swing.JPanel;

public class LargeButton extends Button
{
	protected LargeButton(String a, JPanel panel) 
	{
		super(a, panel);
		setPreferredSize(new Dimension(150, 25));
	}
	
	protected LargeButton(String a) 
	{
		super(a);
		setPreferredSize(new Dimension(150, 25));
	}
}
