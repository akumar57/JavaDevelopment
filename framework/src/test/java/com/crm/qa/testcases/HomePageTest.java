package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	static HomePage homePage;
	static LoginPage loginPage;
	public HomePageTest()
	{
	 super();	
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void assertHomepageNavigation()
	{
		Assert.assertEquals(homePage.FetchUserName(), prop.getProperty("nameOfTheUser"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
