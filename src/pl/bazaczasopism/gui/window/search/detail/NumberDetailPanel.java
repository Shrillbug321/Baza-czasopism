package pl.bazaczasopism.gui.window.search.detail;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;

import pl.bazaczasopism.ContentPage;
import pl.bazaczasopism.MagazineNumber;
import pl.bazaczasopism.gui.LabeledTextField;
import pl.bazaczasopism.gui.ScrollBar;
import pl.bazaczasopism.gui.tables.NotEditableTableModel;
import pl.bazaczasopism.util.Clear;

public class NumberDetailPanel extends JPanel
{
	public NumberDetailPanel(MagazineNumber number)
	{
		ContentPage content = number.getContentPage();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		JTable table;
		try	{
			table = createTable(content); 
		}
		catch (EmptyContentPageException exc) {
			return; 
		}
		
		ScrollBar scrollBar = new ScrollBar(table);
		LabeledTextField ean = new LabeledTextField("EAN", false);
		LabeledTextField pages = new LabeledTextField("Liczba stron", false);
		ean.setText(number.getEan());
		pages.setText(Integer.toString(number.getPages()));
		panel.add(ean);
		panel.add(pages);
		add(panel);
		add(scrollBar);
		Clear.redraw();
	}
	
	private JTable createTable(ContentPage content) throws EmptyContentPageException
	{
		String[] columnsName = {"Tytuł", "Strona"};
		int COLUMNS_NUMBER = 2;
		Object[][] data;
		List<List<String>> list = new ArrayList<List<String>>();		
		for (int i=0; i<COLUMNS_NUMBER; i++)
		{
			list.add(new ArrayList<String>());
		}

		if (content.getSize() == 0)
			throw new EmptyContentPageException();

		for (int i=0; i<content.getSize(); i++)
		{
			list.get(0).add(content.getHeader(i));
			list.get(1).add(content.getPage(i));
		}
		
		data = new Object[list.get(0).size()][];
		for (int i=0; i<list.get(0).size(); i++)
		{
			data[i] = new Object[COLUMNS_NUMBER];
			for (int j=0; j<COLUMNS_NUMBER; j++) 
			{
				data[i][j] = list.get(j).get(i);
			}
		}
		return new JTable(new NotEditableTableModel(data, columnsName));
	}
}