package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	static LoginPage login;
	static ContactsPage contacts;
	static HomePage homepage;
	String sheetName = "contacts";
	
	
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		  login = new LoginPage() ;
		  contacts = new ContactsPage();
		  homepage = new HomePage();
		  login.login(prop.getProperty("username"), prop.getProperty("password"));
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		  	  
	}
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1,dataProvider = "getTestData")
	public void EnterDetails( String fn, String ln, String mn)
	 {
		homepage.ClickOnContactsPage();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		contacts.EnterNewContact(fn, ln, mn);
	 }
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}