package pl.bazaczasopism.gui.window.search.detail;

import java.util.List;

import javax.swing.JPopupMenu;

import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.tables.TableInAdd;

public class TableNumbers extends TableInAdd
{
	public TableNumbers(String[] columnsName, String directory, List<MagazineNumber> magazineNumbers)
	{
		super(columnsName, directory);
		JPopupMenu popMenu = new PopMenu(this, magazineNumbers);
		add(popMenu);
		addMouseListener(new PopMenuEvent(popMenu, this));
	}	
}
