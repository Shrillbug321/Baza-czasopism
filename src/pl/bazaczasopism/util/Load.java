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
			T temp = null;
			while (true)
			{
				temp = (T) in.readObject();
				list.add(temp);
			}
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Nie znaleziono pliku "+directory);
		}
		catch (EOFException exc)
		{	}
		catch (IOException exc)
		{
			System.out.println("B³¹d"+exc.toString());
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
			System.out.println("B³¹d!");
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
			System.out.println("B³¹d!");
		}
		return name;
	}
	
	public static String line(String directory, int lineNumber)
	{
		String name = null;
		try (BufferedReader in = new BufferedReader(new FileReader(directory)))
		{
			int i=1;
			while (i<lineNumber)
			{
				name = in.readLine();
				i++;
			}
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
			System.out.println("B³¹d!");
		}
		return name;
	}
}
