package pl.bazaczasopism;

import java.io.Serializable;
import java.util.ArrayList;

public class Magazine implements Serializable
{
	private String type;
	private String frequency;
	private String publisher;
	private String issn;
	private String name;
	private ArrayList<MagazineNumber> numbers;
	
	public Magazine(String name, String frequency, String publisher, String type, String issn)
	{
		this.name = name;
		this.frequency = frequency;
		this.publisher = publisher;
		this.type = type;
		this.issn = issn;
		numbers = new ArrayList<MagazineNumber>();
	}
	
	public void addNumber(MagazineNumber magazineNumber)
	{
		numbers.add(magazineNumber);
	}
	
	public String getPublisher() {
		return publisher;
	}

	public int howManyNumbers()
	{
		return numbers.size();
	}
	
	public void setNumbers(ArrayList<MagazineNumber> numbers) 
	{
		this.numbers = numbers;
	}

	public ArrayList<MagazineNumber> getNumbers()
	{
		return numbers;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public String getType() 
	{
		return type;
	}

	public String getFrequency() 
	{
		return frequency;
	}

	public String getIssn() 
	{
		return issn;
	}
}
