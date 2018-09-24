package com.qa.PassionTea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {
public static ExtentReports report; 
public static ExtentTest test;

WebDriver driver; 

@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Given("^the correct web address$")
public void the_correct_web_address() throws Throwable {
	driver.get("http://www.practiceselenium.com/welcome.html");
}

@When("^I navigate to the 'Menu' page$")
public void i_navigate_to_the_Menu_page() throws Throwable {
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	home.goToMenu();
}

@Then("^I can browse a list of the available products\\.$")
public void i_can_browse_a_list_of_the_available_products() throws Throwable {    
   MenuPage menu = PageFactory.initElements(driver, MenuPage.class);
   assertEquals("Green Tea", menu.findTea());
}

@When("^I click the checkout button$")
public void i_click_the_checkout_button() throws Throwable {
	MenuPage menu = PageFactory.initElements(driver, MenuPage.class);
	menu.checkOut();

}

@Then("^I am taken to the checkout page$")
public void i_am_taken_to_the_checkout_page() throws Throwable {
	Checkout checkout = PageFactory.initElements(driver, Checkout.class);
	assertTrue(checkout.checkTitle("Check Out",driver));
}

@After
public void tearDown() {
	try {
		Thread.sleep(30000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();	
	// TODO Auto-generated method stub

}

	
}
