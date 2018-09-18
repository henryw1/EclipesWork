package com.qa.BingTesting;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class BingPageTesting 
    extends TestCase
{
   WebDriver driver = null; 
   
   @Before
   private void setup() {
	// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
	   driver = new ChromeDriver(); 
}
   
   @Test
   private void bingSearchBox() {
	// TODO Auto-generated method stub
	   driver.get("https://www.bing.com");
	   BingPage page = PageFactory.initElements(driver, BingPage.class);
	   page.searchFor("selenium");
//	   WebElement checkElement = driver.findElement(By.id(id));
	   
	   
	   
	   }
   @After
   public void teatDown ()
   {
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
