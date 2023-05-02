package pl.bazaczasopism;
import java.awt.EventQueue;

import pl.bazaczasopism.gui.Frame;
public class Baza 
{
	public static void main(String args[]) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
 			@Override
 			public void run() {
 				new Frame(true);
 			}
 		} );
 	}
}