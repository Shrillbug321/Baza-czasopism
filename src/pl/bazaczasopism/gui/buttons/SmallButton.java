package pl.bazaczasopism.gui.buttons;

import java.awt.Dimension;
import javax.swing.JPanel;

public class SmallButton extends Button
{
	protected SmallButton(String a, JPanel panel) 
	{
		super(a, panel);
		setPreferredSize(new Dimension(50, 25));
	}
	
	protected SmallButton(String a) 
	{
		super(a);
		setPreferredSize(new Dimension(50, 25));
	}
}
