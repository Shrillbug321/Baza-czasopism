package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.gui.tables.TableMagazines;

public class TablePanel extends JPanel
{
	public TablePanel()
	{
		String[] magazinesHeader = {"Czasopismo"};
		TableMagazines magazinesList = new TableMagazines(magazinesHeader, "files/magazines.txt", this);
		add(new ScrollBar(magazinesList));
	}
}
