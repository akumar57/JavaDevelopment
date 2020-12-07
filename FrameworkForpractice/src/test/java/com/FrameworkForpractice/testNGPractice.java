package com.FrameworkForpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
@Parameters({"url","emailID"})
public class testNGPractice {
	
	
	WebDriver driver;
	
	public void yahooLoginTest(String url, String emailID)
		{
//		System.setProperty("webdriver.chrome.driver", "C:\\Anand Backup\\selenium jars\\chromedriver.exe");
//		 driver = new ChromeDriver();	
//		driver.get("https://www.google.com");
//		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(emailID);
	    WebElement element = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
		Select ddl = new Select(element);
		ddl.selectByVisibleText("abc");
		
		}
	
	}

