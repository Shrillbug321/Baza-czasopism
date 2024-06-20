package pl.bazaczasopism.util;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
public class Load 
{
	public static <T> void objects(String directory, List<T> list)
	{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(directory)))
		{
			while (true)
				list.add((T) in.readObject());
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Nie znaleziono pliku "+directory);
		}
		catch (EOFException exc)
		{	}
		catch (IOException exc)
		{
			System.out.println("Błąd"+exc);
		}
		catch (ClassNotFoundException exc)
		{
			System.out.println("Nie znaleziono klasy");
		}
	}
	
	public static void names(String directory, List<String> nameList)
	{
		try (BufferedReader in = new BufferedReader(new FileReader(directory)))
		{
			String temp;
			do 
			{
				temp = in.readLine();
				nameList.add(temp);
			} while (temp != null);
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Nie znaleziono pliku "+directory);
		}
		catch (EOFException exc)
		{	}
		catch (IOException exc)
		{
			System.out.println("Błąd!");
		}
	}
	
	public static String getName(String directory)
	{
		String name = null;
		try (BufferedReader in = new BufferedReader(new FileReader(directory)))
		{
			name = in.readLine();
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Nie znaleziono pliku "+directory);
		}
		catch (EOFException exc)
		{	}
		catch (IOException exc)
		{
			System.out.println("Błąd!");
		}
		return name;
	}
	
	public static String line(String directory, int lineNumber)
	{
		String name = null;
		try (BufferedReader in = new BufferedReader(new FileReader(directory)))
		{
			for (int i=1; i<=lineNumber; i++)
				name = in.readLine();
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Nie znaleziono pliku "+directory);
		}
		catch (EOFException exc)
		{	}
		catch (IOException exc)
		{
			System.out.println("Błąd!");
		}
		return name;
	}
}