package com.crm.qa.base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static  Properties prop;
	 
	
	public static void main (String args[]) throws IOException
	
	{
	
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\freeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	prop.load(ip);
		
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Anand Backup\\selenium jars\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));

	}
		
	else if(browserName.equals("FF"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Anand Backup\\selenium jars\\firefox.exe");
		
		driver = new FirefoxDriver();
		
	}
		
	else if (browserName.equals("IE"))	
	{
		
	System.setProperty("webdriver.ie.driver", "C:\\Anand Backup\\selenium jars\\internetexplorerdriver.exe");
		
		driver = new ChromeDriver();
		
	}
		
	
	else if (browserName.equals("Safari"))	
	{
		
	System.setProperty("webdriver.safari.driver", "C:\\Anand Backup\\selenium jars\\safaridriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	
	else
	{
		
	System.out.println("Please pass 1 browser's name");
		
		driver = new ChromeDriver();
		
		driver.get("prop.url");
		
	}
		
	}
	

	}
