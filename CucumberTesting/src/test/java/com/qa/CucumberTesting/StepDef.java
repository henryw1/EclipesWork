package com.qa.CucumberTesting;

import static org.junit.Assert.assertTrue;

//import  org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver=null; 	
	String url; 
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(driver);
		}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws Throwable {	
		
		System.out.println(arg1);
		
		driver.get(arg1);
		url=driver.getCurrentUrl();
//		throw new PendingException();
	    
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		
		BingCucumber page = PageFactory.initElements(driver, BingCucumber.class);
		page.search(arg1);
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
	    assertTrue(!url.equals(driver.getCurrentUrl()));
	}	
	
	
	@After
	private void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}
	

}
