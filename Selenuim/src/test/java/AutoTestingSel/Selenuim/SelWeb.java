package AutoTestingSel.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

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
	private String url = "http://thedemosite.co.uk/addauser.php" ; 
	private String url2 = "http://thedemosite.co.uk/login.php" ; 
	private WebDriver driver; 
@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
	 driver = new ChromeDriver();
}

@Test 
public void login() {
	//driver.get(url);
	try {
				
		driver.get(url);
		Demosite regPage = PageFactory.initElements(driver, Demosite.class);		
		regPage.register("hello", "123456");	
		
		driver.get(url2);		
		DemoLogin loginPage = PageFactory.initElements(driver, DemoLogin.class);
		loginPage.login("hello", "123456");		
		WebElement check = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("expected **Successful Login**" + "received : " + check.getText(), "**Successful Login**", check.getText());
		
		Thread.sleep(50000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

@After
public void tearDown() {
	  driver.quit();
} 

	
   
}
