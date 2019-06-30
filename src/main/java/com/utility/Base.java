package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Base
{
	
	public WebDriver driver;
	PropertyReader reader = new PropertyReader();
	
	@BeforeClass
	public void OpenBrowser()
	{
		
		String browsername =  reader.getBrowserName();
		System.out.println(browsername);
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./servers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./server/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
