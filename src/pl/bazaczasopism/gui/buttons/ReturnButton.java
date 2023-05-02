package pl.bazaczasopism.gui.buttons;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ReturnButton extends JButton
{
	public ReturnButton(JPanel addPanel) 
	{
		super("<-");
		setPreferredSize(new Dimension(50, 25));
		addActionListener(new ReturnButtonEvent(addPanel));
	}
}
