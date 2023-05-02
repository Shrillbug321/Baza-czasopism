package pl.bazaczasopism.gui.tables;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.Frame;
import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;
import pl.bazaczasopism.util.Temp;

public class TableMagazinesSelectionEvent extends TableInAddSelectionEvent
{
	private JPanel panel;
	public TableMagazinesSelectionEvent(JPanel panel, JTable table, String directory) 
	{
		super(table, directory);
		this.panel = panel;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) 
	{	
		if (e.getValueIsAdjusting())
		{
			Temp.delete();
			ArrayList<Magazine> magazines = new ArrayList<Magazine>();
			ArrayList<MagazineNumber> magazineNumbers;
			Load.objects("files/magazines.dat", magazines);
			int magazineIndex = table.getSelectedRow();
			Save.line("files/tempcontent.txt", Integer.toString(magazineIndex), false);
			magazineNumbers = magazines.get(magazineIndex).getNumbers();
			for (int i=0; i<magazineNumbers.size(); i++)
			{
				Save.line("files/tempnumbers.txt", Integer.toString(magazineNumbers.get(i).getNumber()), true);
			}
			
			if (panel.getComponents().length>1)
			{
				panel.remove(panel.getComponent(1));
			}
			String numbersHeader[] = {"Numery"};
			TableInAdd numbersList = new TableInAdd(numbersHeader, "files/tempnumbers.txt");
			if (numbersList.getRowCount() == 0)
			{
				JFrame frame = Frame.getMain();
				JOptionPane.showMessageDialog(frame, "Lista numerów jest pusta.",
						"Informacja", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			numbersList.getSelectionModel().addListSelectionListener(new TableNumbersSelectionEvent(numbersList, "files/tempnumbers.txt"));
			panel.add(new ScrollBar(numbersList));
			panel.revalidate();
			panel.repaint();
		}
	}
}
