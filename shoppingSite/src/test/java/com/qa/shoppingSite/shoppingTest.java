package com.qa.shoppingSite;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple App.
 */
//@RunWith(Parameterized.class)
public class shoppingTest 
{	
	private WebDriver driver; 
	private String url0 = "http://automationpractice.com/index.php"; 
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void checkItem() {
		driver.get(url0);		
		MainPage page = PageFactory.initElements(driver, MainPage.class);
		page.select("Blouse");
		File scrFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());

	}
	@After
	public void tearDown() {
		  driver.quit();
	} 
}
