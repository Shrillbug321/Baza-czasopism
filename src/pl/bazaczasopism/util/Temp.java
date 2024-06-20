package pl.bazaczasopism.util;

import java.io.File;

public class Temp 
{
	static public void delete()
	{
		File folder = new File("files/");
		File[] filesList = folder.listFiles();
		
		for (int i=0; i<filesList.length; i++)
		{
			String name = filesList[i].getName();
			if (name.substring(0,4).equals("temp") )
				filesList[i].delete();
		}
	}
	
	static public String findDirectory(String directory)
	{
		String name = directory.substring(6, directory.length()-4);
		return "files/temp"+name+".txt";
	}
}