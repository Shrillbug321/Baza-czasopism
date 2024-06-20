package pl.bazaczasopism.util;

import javax.swing.JFrame;

import pl.bazaczasopism.gui.Frame;

public class Clear 
{
	public static void panel()
	{
		JFrame frame = Frame.getMain();
		int i=1; //i=0 is a toolbox
		while (i<frame.getContentPane().getComponentCount())
		{
			frame.getContentPane().remove(i);
			i++;
		}
	}
	
	public static void redraw()
	{
		JFrame frame = Frame.getMain();
		frame.revalidate();
		frame.repaint();
	}
}
