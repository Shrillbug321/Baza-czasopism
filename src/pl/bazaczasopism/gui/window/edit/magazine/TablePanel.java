package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.gui.tables.TableInAdd;

public class TablePanel extends JPanel
{
	public TablePanel()
	{
		String[] publisherHeader= {"Wydawnictwo"};
		TableInAdd publisherTable = new TableInAdd(publisherHeader, "files/publishers.txt");
		add(new ScrollBar(publisherTable));

		String[] frequencyHeader= {"Częstość"};
		TableInAdd frequencyTable = new TableInAdd(frequencyHeader, "files/frequency.txt");
		add(new ScrollBar(frequencyTable));

		String[] typeHeader= {"Rodzaj"};
		TableInAdd typeTable = new TableInAdd(typeHeader, "files/types.txt");
		add(new ScrollBar(typeTable));
	}
}
