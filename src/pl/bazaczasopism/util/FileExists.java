package pl.bazaczasopism.util;
import java.io.FileReader;
import java.io.IOException;
public class FileExists 
{
	static public boolean exists(String directory)
	{
		try(FileReader fr = new FileReader(directory))
		{			
			return true;
		}
		catch (IOException exc)
		{
			return false;
		}
	}
}
