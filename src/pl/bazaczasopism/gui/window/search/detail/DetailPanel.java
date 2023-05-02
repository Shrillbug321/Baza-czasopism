package pl.bazaczasopism.gui.window.search.detail;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.util.Clear;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;

public class DetailPanel extends JPanel
{
	public DetailPanel(int index)
	{
		JPanel firstPanel = new JPanel();
		JPanel secondPanel = new JPanel();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		List<Magazine> magazines = new ArrayList<Magazine>();
		Load.objects("files/magazines.dat", magazines);
		int magazineIndex = Integer.parseInt(Load.line("files/tempmagindex.txt", index+1));
		Magazine magazine = magazines.get(magazineIndex);
		magazines = null;
		ArrayList<MagazineNumber> magazineNumbers = magazine.getNumbers();
		Save.objects("files/tempnumbers.dat", magazineNumbers);
		for (int i=0; i<magazineNumbers.size(); i++)
		{
			Save.line("files/tempnumbers.txt", Integer.toString(magazineNumbers.get(i).getNumber()), true);
		}
		
		setTextFields(firstPanel, magazine);
		
		String numbersHeader[] = {"Numery"};
		JTable numbersList = new TableNumbers(numbersHeader, "files/tempnumbers.txt", magazineNumbers);
		
		firstPanel.add(new ScrollBar(numbersList));
		add(firstPanel);
		add(secondPanel);
		Clear.redraw();
	}
	
	private void setTextFields(JPanel firstPanel, Magazine magazine)
	{
		LabeledTextField magazineLabel = new LabeledTextField("Czasopismo", false);
		magazineLabel.setText(magazine.getName());
		LabeledTextField publisher = new LabeledTextField("Wydawnictwo", false);
		publisher.setText(magazine.getPublisher());
		LabeledTextField type = new LabeledTextField("Rodzaj", false);
		type.setText(magazine.getType());
		LabeledTextField frequency = new LabeledTextField("Czêstoœæ", false);
		frequency.setText(magazine.getFrequency());
		LabeledTextField numbers = new LabeledTextField("Liczba numerów", false);
		numbers.setText(Integer.toString(magazine.getNumbers().size()));
		LabeledTextField issn = new LabeledTextField("ISSN", false);
		issn.setText(magazine.getIssn());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,1));
		panel.add(magazineLabel);
		panel.add(publisher);
		panel.add(type);
		panel.add(frequency);
		panel.add(numbers);
		panel.add(issn);
		firstPanel.add(panel);
	}
}