package main.java;

import java.util.Properties;
import java.io.*;

public class PhoneDirectory {
	private Properties property = new Properties();
	public String path = null;
	
	public PhoneDirectory(){
		InputStream input = null;
		try
		{
			input = new FileInputStream("src/main/resources/phone.properties");
			property.load(input);
			path = property.getProperty("path");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(input != null){
				try
				{
					input.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
				
	public void addEntry(String name, String number)
	{
		System.out.println(name+ " " +number);
		try
		{
			Writer writer = new FileWriter(path, true);
			writer.write((name+ " " +number) + System.lineSeparator()) ;
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
			
	}
	
	public String getNumber(String name)
	{
		String number = "";
		String line;
	}
		
	

}
