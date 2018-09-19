package com.qa.TravelSite;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import freemarker.template.utility.Constants;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class homeTest 
    
{
	Constants constant = new Constants(); 
	public static ExtentReports report;
	public static ExtentTest test;
	WebDriver driver; 
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\empty\\travelSite.html", true);
		
	}
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.wi
	}
	
	
	@Test
	public void search() {
//		test = report.startTest("Search Test");
		driver.get(constant.travelSiteUrl);	
//		test.log(LogStatus.INFO, "Travel site opened");
		HomePage page = PageFactory.initElements(driver, HomePage.class);
		page.searchDestination("London", driver);
//		test.log(LogStatus.INFO, "search run");
		Actions action = new Actions(driver);
	}
	 
	@After
	public void tearDown() {
		try {
			Thread.sleep(5000);
			driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void end() {
		report.flush();
	}
	
  
}
