package com.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.utility.Base;

public class VerifyLoginTest extends Base
{
	
	@Test
	public void LoginTest()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			System.out.println(driver.getCurrentUrl());

			System.out.println("---------------------------");
			System.out.println("----------------------------------------");
			
			System.out.println("--------------LOGIN DONE-----------------------");
			
			System.out.println("Web Hook trial-----------");
			
			System.out.println("web hook added");
			
			System.out.println("28-test--jenkins");
			
			System.out.println("Buid");
			
			System.out.println("Build 123");
			
			System.out.println("***************ADDED WEBHOOK*****************************");

		}
		catch(Exception e)
		{
			System.out.println("Login failed due to "+ e);
			
		}
	}

}
