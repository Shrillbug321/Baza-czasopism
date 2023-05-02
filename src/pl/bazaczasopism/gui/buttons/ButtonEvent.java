package pl.bazaczasopism.gui.buttons;
import java.awt.event.*;
import javax.swing.*;
public abstract class ButtonEvent implements ActionListener
{
	protected JPanel panel;
	protected ButtonEvent() { }
	protected ButtonEvent(JPanel panel)
	{
		this.panel = panel;
	}
}
