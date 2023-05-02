package pl.bazaczasopism;

import java.io.Serializable;

public class MagazineNumber implements Serializable
{
	private String ean;
	private int number;
	private int year;
	private ContentPage content;
	private String magazine;
	private String issn;
	public MagazineNumber(int number, String magazine, int year)
	{
		content = new ContentPage();
		this.number = number;
		this.magazine = magazine;
		this.year = year;
	}
	
	private void calculateEan(String issn)
	{
		int convert[] = new int[7];
		int sum = 0;
		for (int i=0; i<6; i++)
		{
			convert[i] = Integer.parseInt(issn.substring(i, i+1));
		}
		if(issn.charAt(6) == 'X')
			convert[6] = 10;
		else
			convert[6] = Integer.parseInt(issn.substring(6, 7));
		ean = "977" + issn + (year%10) + "5";
		for (int i=0, j=8; i<7; i++, j--)
		{
			sum += convert[i]*j;
		}
		if (sum%11 == 0) 
			ean += "0"; 
		else	
			ean += (11-sum%11);
	}

	public void setIssn(String issn)
	{
		this.issn = issn;
		calculateEan(issn);
	}
	
	public int getNumber() 
	{
		return number;
	}

	public int getPages() 
	{
		return content.getPages();
	}
	
	public String getEan()
	{
		return ean;
	}
	
	public ContentPage getContentPage() 
	{
		return content;
	}

	public void setContentPage(ContentPage content) 
	{
		this.content = content;
	}
}
