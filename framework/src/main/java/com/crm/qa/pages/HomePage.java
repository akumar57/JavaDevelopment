package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='top-header-menu']/div[2]/span[1]")
	WebElement  nameOfUser;
	
	@FindBy(xpath = "//*[@id='main-nav']/a[3]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchTxtBox;
	
	@FindBy(xpath = "")
	WebElement ddl;
	public String FetchUserName()
	{		
		String un = nameOfUser.getText();
		return un;
	}
	//functionOveriding in my framework where the below method gets overridden based on whether user wants to select by Index or By VisibleText
	public void SelectTopRightDropdown(int ByIndex)
	{		
		Select s = new Select(ddl);
		s.selectByIndex(ByIndex);
	}
	public void SelectTopRightDropdown(String ByVisibleText)
	{		
		Select s = new Select(ddl);
		s.deselectByVisibleText(ByVisibleText);			
	}
	
	
	public ContactsPage ClickOnContactsPage() 
	
	{   System.out.println("hello..!!");
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		contactsLink.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return new ContactsPage();
	}
	
public HomePage()
	{
		PageFactory.initElements(driver, this);	
	}
}
