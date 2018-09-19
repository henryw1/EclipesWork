package com.qa.Reporting;

import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

public class BingTest extends TestCase {
	public static ExtentReports report;
	WebDriver driver = null;
	public static ExtentTest test;

	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\empty\\bingpagetest.html", true);
	}

	@Before
	public void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void bingSearchBox() {
		test = report.startTest("Search Test");
		driver.get("https://www.bing.com");
		test.log(LogStatus.INFO, "bing opened");
		BingPage page = PageFactory.initElements(driver, BingPage.class);
		page.searchFor("selenium");
		bingsearch page2 = PageFactory.initElements(driver, bingsearch.class);
		assertEquals(page2.getRes().getText(), "Selenium");
		test.log(LogStatus.INFO, "search run");
		if (page2.getRes().getText().equals("Selenium")) {
			System.out.println(true);
			test.log(LogStatus.PASS, "SEARCH TEXT WAS FOUND");
		} else {
			test.log(LogStatus.FAIL, "search not gound");
		}
		report.endTest(test);
	}

	@After
	public void teatDown() {
		try {
			Thread.sleep(5000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void end() {
		report.flush();
	}
}
