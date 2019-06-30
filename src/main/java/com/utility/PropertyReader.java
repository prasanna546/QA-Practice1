package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	
	Properties prop;
	FileInputStream fis;
	
	public  PropertyReader()
	{
		try
		{
			File file=new File("./src/main/resources/PropertyReader/SmokeTestData.properties");
			
			fis=new FileInputStream(file);
			
			prop=new Properties();
			
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Property Reader failed due to "+ e);
			
		}
	}
	
	public String getBrowserName()
	{
		
     	String browsername = prop.getProperty("BrowserName");
		return browsername;
	}

}
