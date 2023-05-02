package pl.bazaczasopism;

import java.io.Serializable;
import java.util.ArrayList;

public class ContentPage implements Serializable
{
	private ArrayList<String> headers;
	private ArrayList<String> pages;
	public ContentPage()
	{
		headers = new ArrayList<String>();
		pages = new ArrayList<String>();
	}
	
	public void add(String header, String page)
	{
		headers.add(header);
		pages.add(page);
	}
	
	public String getHeader(int i)
	{
		return headers.get(i);
	}
	
	public String getPage(int i)
	{
		return pages.get(i);
	}
	
	public int getPages()
	{
		return Integer.parseInt(pages.get(pages.size()-1));
	}
	
	public int getSize()
	{
		return pages.size();
	}
}
