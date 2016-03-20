package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader
{
	// FUNCTION  : reads a file, removes spaces in data and puts data into an arraylist
	// PARAMETER : directory of file / location of file
	// RETURN    : returns the arraylist of the data
	public static String read(String directory)
	{
		Scanner scanner = null;
		String input = "";
		
		// instantiate file reader for file
		try
		{
			scanner = new Scanner(new File(directory));
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return null;
		}
		
		// read a line, remove the spaces and add data to arraylist
		while(scanner.hasNextLine())
		{
			input += scanner.nextLine() + "\n";
		}
		
		scanner.close();
		
		return input;
	}
}
