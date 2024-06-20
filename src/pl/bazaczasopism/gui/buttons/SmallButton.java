package pl.bazaczasopism.gui.buttons;

import java.awt.Dimension;

public class SmallButton extends Button
{
	protected SmallButton(String a) 
	{
		super(a);
		setPreferredSize(new Dimension(50, 25));
	}
}
