package pl.bazaczasopism;
import java.io.Serializable;
import java.util.ArrayList;

public class Publisher implements Serializable
{
	private String name;
	private ArrayList<Magazine> magazines;
	
	public Publisher(String name)
	{
		this.name = name;
		magazines = new ArrayList<Magazine>();
	}
	
	public Publisher(String name, ArrayList<Publisher> publishers)
	{
		this.name = name;
		magazines = new ArrayList<Magazine>();
		publishers.add(this);
	}
	
	public void addMagazine(Magazine magazine)
	{
		magazines.add(magazine);
	}
	
	public String getName()
	{
		return name;
	}
}
