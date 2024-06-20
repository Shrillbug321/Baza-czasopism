package pl.bazaczasopism.gui.window.search.detail;

import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

import pl.bazaczasopism.MagazineNumber;

public class PopMenu extends JPopupMenu
{
	public PopMenu(JTable tableNumbers, List<MagazineNumber> magazineNumbers)
	{
		JMenuItem m1 = new NumberDetailMenuItem("Szczegóły");
		m1.addMouseListener(new NumberDetailMenuItemEvent(tableNumbers, magazineNumbers));
		add(m1);
	}
}
