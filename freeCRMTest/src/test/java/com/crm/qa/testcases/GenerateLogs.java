package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenerateLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
	    Logger log =	Logger.getLogger("GenerateLogs.class");	
		System.setProperty("webdriver.chrome.driver", "C:\\Anand Backup\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("Launching Browser...");
      driver.get("https://www.google.com");
      
//      WebDriverWait w = new WebDriverWait(driver, 40);
//      w.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
      String s = "100";
      
   int b =  Integer.parseInt(s);
   
     
     
     System.out.println(b);
      
//      int ar[] = new int[5];
//      
//      ar[0] = 4;
//      ar[2] = 3;
//      System.out.println(ar[2]);
      
	}


}