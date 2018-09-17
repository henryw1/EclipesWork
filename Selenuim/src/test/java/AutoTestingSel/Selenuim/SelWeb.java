package AutoTestingSel.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SelWeb 
{
	private String url = "https://github.com/login" ; 
private WebDriver driver; 


@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
	 driver = new ChromeDriver();
}
//@Test
//public void testSite() {
//	 driver.manage().window().maximize();
//	 driver.get(url);
//	 
//	try {
//		Thread.sleep(50000);
//		
//	} catch (InterruptedException e) {
//		 TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}

@Test 
public void login() {
	driver.get(url);
	try {
		WebElement sub = driver.findElement(By.name("commit"));
		
		WebElement name = driver.findElement(By.id("login_field"));
		name.sendKeys("henryw1");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");	
		sub.submit();
		Thread.sleep(50000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement sub = driver.findElement(By.name("commit"));	
	WebElement name = driver.findElement(By.id("login_field"));
	name.sendKeys("henryw1");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("this is not my password");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sub.submit();
	

}

@After
public void tearDown() {
	  driver.quit();
} 

	
   
}
