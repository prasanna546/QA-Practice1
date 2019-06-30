package com.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.Test;

import com.utility.Base;

public class VerifyHomePage extends Base
{
	
	@Test
	public void VerifyHome()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			System.out.println(driver.getCurrentUrl());
			
			System.out.println("--------------VERIFY HOME PAGE DONE-----------------------");
			System.out.println("Added web hooks----------");
			System.out.println("TRAIL-----------");
		}
		catch(Exception e)
		{
			System.out.println("Login failed due to "+ e);
			
		}
	}

}
