package com.crossover.e2e;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMailTest extends TestCase {
    private WebDriver driver;
    private Properties properties = new Properties();

    public void setUp() throws Exception {
        
        properties.load(new FileReader(new File("src/test/resources/test.properties")));
        //Dont Change below line. Set this value in test.properties file incase you need to change it..
        System.setProperty("webdriver.chrome.driver",properties.getProperty("webdriver.chrome.driver") );
        driver = new ChromeDriver();
    }

    public void tearDown() throws Exception {
        driver.quit();
    }

    /*
     * Please focus on completing the task
     * 
     */
    @Test
    public void testSendEmail() throws Exception {
    	
    	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://mail.google.com/");
       
        
        WebElement userElement = driver.findElement(By.id("identifierId"));
        userElement.sendKeys(properties.getProperty("username"));

        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(1000);

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys(properties.getProperty("password"));
        driver.findElement(By.id("passwordNext")).click();

        Thread.sleep(1000);

        WebElement composeElement = driver.findElement(By.xpath("//*[@class='z0']/div"));
        composeElement.click();
        Thread.sleep(1000);
        driver.findElement(By.name("to")).clear();
        driver.findElement(By.name("to")).sendKeys(String.format("%s@gmail.com", properties.getProperty("recepientEmailAddress")));
        // emailSubject and emailbody to be used in this unit test.
        String emailSubject = properties.getProperty("email.subject");
        String emailBody = properties.getProperty("email.body"); 
        driver.findElement(By.name("subjectbox")).sendKeys(emailSubject);
        Thread.sleep(1000);
       
        driver.findElement(By.xpath("//*[@role='textbox']")).sendKeys(emailBody);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@role='button' and text()='Send']")).click();
        Thread.sleep(5000);
        
        String assertCorrectSubject = driver.findElement(By.xpath("(//div[@class='y6'])[1]")).getText(); 
        //keeping above locator will help our test case to always read the first message in the inbox folder[because we have kept 1]
          System.out.println("text displayed is=="+ assertCorrectSubject);
          if(assertCorrectSubject.contains(emailSubject))
          { //validating whether correct email subject content is displayed in the received message     	
           System.out.println("Test case is passed..!! Correct text is displayed in mail subject");
          }
          
        String assertCorrectBody = driver.findElement(By.xpath("(//span[@class='y2'])[1]")).getText(); 
      //keeping above locator will help our test case to always read the first message in the inbox folder[because we have kept 1]
        System.out.println("text displayed is=="+ assertCorrectBody);
        if(assertCorrectBody.contains(emailBody))
        { //validating whether correct email body content is displayed in the received message     	
         System.out.println("Test case is passed..!! Correct text is displayed in mail body");
        }
      
    }  
}
