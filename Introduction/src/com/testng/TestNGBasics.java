package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite
	void start()
	{
		System.out.println("test case execution starts");	
	}
	
	@BeforeClass		
	void properties()
	{		
	System.out.println("all the system properties are set succesfuly");	
	}

	@BeforeMethod
	
	void browser()
	{
	System.out.println("launching chrome browser..");
	}
	
	@Test
	void testCase()
	{	
		System.out.println("pass...browser title is displayed as expected");
	}
		
	@Test
	void testCase2()
	{	
		System.out.println("verifying whether browser title is displayed as expected or not");
	}
	
	@AfterMethod
	void CloseBrowser()
	{
		
	  System.out.println("Browser is closed..");
	}
	
	@AfterClass
	void DeleteCookies()
	{
		
	  System.out.println("cookies are deleted..");
	}
	
	@AfterSuite
	void terminateExection()
	{
		
	  System.out.println("execution is terminated..");
	}
	
	@BeforeTest
	void invokeServer()
	{		
	System.out.println("server is invoked");	
	}
	
}
	
