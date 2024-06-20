package pl.bazaczasopism.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Save implements Serializable
{
	static public void oneObject(String directory, Object object)
	{
		try
		{
			ObjectOutputStream out = new AppendingObjectOutputStream(new FileOutputStream(directory, FileExists.exists(directory)));
			out.writeObject(object);
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Brak "+directory);
		}
		catch (IOException exc)
		{
			System.out.println("Błąd "+exc.getMessage());
		}
	}

	static public <T> void objects(String directory, List<T> objects)
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory)))
		{
            for (int i = 0; i < objects.size(); i++)
				out.writeObject(objects.get(i));
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Brak "+directory);
		}
		catch (IOException exc)
		{
			System.out.println("Błąd "+exc.getMessage());
		}
	}

	static public void line(String directory, String name, boolean append)
	{
		try (BufferedWriter out = new BufferedWriter(new FileWriter(directory, append)) )
		{
			out.write(name);
			out.newLine();
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Brak "+directory);
		}
		catch (IOException exc)
		{
			System.out.println("Błąd "+exc.getMessage());
		}
	}
}