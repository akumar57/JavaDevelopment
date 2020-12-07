package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {
	
	
	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/a")
	public
	WebElement newContact;
	@FindBy(name="first_name")
	WebElement firstName;
	@FindBy(name="last_name")
	WebElement lastName;
	@FindBy(name="middle_name")
	WebElement middleName;
	@FindBy(xpath ="//*[@class='save icon']")
	WebElement saveBtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterNewContact(String fn,String mn, String ln)
	{	
		newContact.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		middleName.sendKeys(mn);
		saveBtn.click();

	}
	

}
