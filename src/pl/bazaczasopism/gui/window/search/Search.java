package pl.bazaczasopism.gui.window.search;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPopupMenu;
import javax.swing.JTable;

import pl.bazaczasopism.Magazine;
import pl.bazaczasopism.gui.tables.NotEditableTableModel;
import pl.bazaczasopism.gui.window.search.detail.NotFoundMagazineFileException;
import pl.bazaczasopism.util.Load;
import pl.bazaczasopism.util.Save;

public class Search 
{
	private String[] columsName = {"Czasopismo", "Wydawnictwo", "Rodzaj", "Częstość", "Liczba numerów"};
	private Object[][] data;
	final int COLUMNS_NUMBER = 5;
	private ArrayList<Magazine> magazines = new ArrayList<Magazine>();
	private List<List<String>> list = new ArrayList<List<String>>();
	public Search(String text, int criterion)
	{
		for (int i=0; i<COLUMNS_NUMBER; i++)
		{
			list.add(new ArrayList<String>());
		}
		Load.objects("files/magazines.dat", magazines);
		try
		{
			if (magazines.isEmpty())
				throw new NotFoundMagazineFileException();
		}
		catch (NotFoundMagazineFileException exc) {
			return;
		}
		if (text.isEmpty())
		{
			searchAll();
			return;
		}
		switch(criterion)
		{
			case 0:
				searchByMagazine(text);
				break;
			case 1:
				searchByPublisher(text);
				break;
			case 2:
				searchByType(text);
				break;
			case 3:
				searchByFrequency(text);
		}
	}
	
	public JTable createTable() throws NotFoundMagazineException
	{
		if (list.get(0).isEmpty())
			throw new NotFoundMagazineException();
		JTable table = new JTable(new NotEditableTableModel(data, columsName));
		JPopupMenu popMenu = new PopMenu(table);
		table.add(popMenu);
		return table;
	}
	
	private void searchByMagazine(String text)
	{
		for (int i=0; i<magazines.size(); i++)
		{
			if (magazines.get(i).getName().equals(text))
			{
				Magazine magazine = magazines.get(i);
				addList(magazine);
				Save.line("files/tempmagindex.txt", Integer.toString(i), true);
			}
		}
		setData();
	}
	
	private void searchByPublisher(String text)
	{
		for (int i=0; i<magazines.size(); i++)
		{
			if (magazines.get(i).getPublisher().equals(text))
			{
				Magazine magazine = magazines.get(i);
				addList(magazine);
				Save.line("files/tempmagindex.txt", Integer.toString(i), true);
			}
		}
		setData();
	}
	
	private void searchByType(String text)
	{
		for (int i=0; i<magazines.size(); i++)
		{
			if (magazines.get(i).getType().equals(text))
			{
				Magazine magazine = magazines.get(i);
				addList(magazine);
				Save.line("files/tempmagindex.txt", Integer.toString(i), true);
			}
		}
		setData();
	}
	
	private void searchByFrequency(String text)
	{
		for (int i=0; i<magazines.size(); i++)
		{
			if (magazines.get(i).getFrequency().equals(text))
			{
				Magazine magazine = magazines.get(i);
				addList(magazine);
				Save.line("files/tempmagindex.txt", Integer.toString(i), true);
				
			}
		}
		setData();
	}
	
	private void searchAll()
	{
		for (int i=0; i<magazines.size(); i++)
		{
			Magazine magazine = magazines.get(i);
			addList(magazine);
			Save.line("files/tempmagindex.txt", Integer.toString(i), true);
		}
		setData();
	}
	
	private void addList(Magazine magazine)
	{
		list.get(0).add(magazine.getName());
		list.get(1).add(magazine.getPublisher());
		list.get(2).add(magazine.getType());
		list.get(3).add(magazine.getFrequency());
		list.get(4).add(Integer.toString(magazine.howManyNumbers()));
	}
	
	private void setData()
	{
		if (list.get(0).isEmpty())
			return;
		data = new Object[list.get(0).size()][];
		for (int i=0; i<list.get(0).size(); i++)
		{
			data[i] = new Object[COLUMNS_NUMBER];
			for (int j=0; j<COLUMNS_NUMBER; j++) 
			{
				data[i][j] = list.get(j).get(i);
			}
		}
	}
}