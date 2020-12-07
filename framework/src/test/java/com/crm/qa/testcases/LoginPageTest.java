package com.crm.qa.testcases;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	public LoginPageTest()
	{
		super();	
	}
	@BeforeMethod
	public void setup()
	{
		initialization();	
		loginPage = new LoginPage();
	}
	@Test(priority=1)
	public void LoginToApplication()
	{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
	@Test(priority=2)  
	public void verifyPageTitle()
	{
		 String title = loginPage.checkPageTitle();
		 Assert.assertEquals(title, "CRM");
           WebDriverWait wait = new WebDriverWait(driver,20);
          // WebElement element = driver.findElement(By.xpath(""));
          // wait.until(ExpectedConditions.elementToBeClickable(element)); //explicit wait
//           Wait w = new FluentWait<WebDriver>(driver);
        		//   w.wait(10);
           Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
        	        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
         
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
