package pl.bazaczasopism.util;

import javax.swing.JFrame;

import pl.bazaczasopism.gui.Frame;

public class Clear 
{
	public static void panel()
	{
		JFrame frame = Frame.getMain();
		int i=1; //dla i=0 mamy pasek narzêdziowy
		while (i<frame.getContentPane().getComponentCount())
		{ //usuwa wszystko poza paskiem aby elementy nie nachodzi³y na siebie
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
