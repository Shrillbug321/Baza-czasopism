package pl.bazaczasopism.gui.window.search.detail;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.util.Clear;

public class NumberDetailMenuItemEvent extends MouseAdapter
{
	private JTable tableNumbers;
	private List<MagazineNumber> magazineNumbers;
	public NumberDetailMenuItemEvent(JTable tableNumbers, List<MagazineNumber> magazineNumbers)
	{
		this.tableNumbers = tableNumbers;
		this.magazineNumbers = magazineNumbers;
	}
	
	public void mouseReleased(MouseEvent e)
	{
		JFrame frame = Frame.getMain();
		JComponent scrollBar = (JComponent) frame.getContentPane().getComponent(1);
		scrollBar = (JComponent) scrollBar.getComponent(0);
		JPanel secondPanel = (JPanel) ((JPanel) scrollBar.getComponent(0)).getComponent(1);
		if (secondPanel.getComponentCount() > 0)
			secondPanel.removeAll();
		int index = tableNumbers.getSelectedRow();
		MagazineNumber number = magazineNumbers.get(index);
		JPanel numberDetailPanel = new NumberDetailPanel(number);
		secondPanel.add(numberDetailPanel);
		Clear.redraw();
	}
}