import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo extends defaultAccessModifier2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Anand Backup\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		defaultAccessModifier2 w = new defaultAccessModifier2();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicitWait
//		
//		driver.
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver,10);  //explicitWait
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
//		element.click();
		
		defaultAccessModifier2.abc a = w.new abc();
		
		a.display();
		
		//driver.switchTo().alert().
	
	Set<String> handle =driver.getWindowHandles();
//	
//	handle.add("100");
//	handle.add("Selenium");
//	
	Iterator it = handle.iterator();
	
	while(it.hasNext())
		
	{	
		System.out.println(it.next());
	}
	}	
			
}
