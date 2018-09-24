package com.qa.DDTdemoSite;

import java.awt.LinearGradientPaint;
//import java.io.FileInputStream;
import java.io.FileInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegLogin {
	WebDriver driver;
	Constants constant = new Constants();
	FileInputStream file;
	ExtentReports report = new ExtentReports(constant.REPORTSPATH, false);
	public static ExtentTest test;

	

	@Before
	public void setup() {		
		ExcelUtils.setExcelFile(Constants.filePath + Constants.fileTestData, 0);
		System.setProperty("webdriver.chrome.driver", constant.chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("^I created urser using  \"([^\"]*)\"  and \"([^\"]*)\"$")	
	public void i_created_urser_using_and(String arg1, String arg2) throws Throwable {
		test = report.startTest("Reg Test");
		driver.get("http://thedemosite.co.uk/addauser.php");
		RegUser regPage = PageFactory.initElements(driver, RegUser.class);
		regPage.register(arg1, arg2);
		test.log(LogStatus.INFO,  "has been added");		
		ExcelUtils.setCellData(Integer.toString(constant.counter), constant.counter, 0);
		ExcelUtils.setCellData("Pass", constant.counter++, 1);

	}

	@When("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		RegUser regPage = PageFactory.initElements(driver, RegUser.class);
		regPage.goToLogin();
		assertEquals("Login example page to test the PHP MySQL online system", driver.getTitle());
		if(driver.getTitle().equals("Login example page to test the PHP MySQL online system")) {
			test.log(LogStatus.PASS, "navigated to login page");
		}else {
			test.log(LogStatus.FAIL,  "Navigation Failed");
		}
		
	}

	@Then("^I login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_using_and(String arg1, String arg2) throws Throwable {
		LoginUser loginPage = PageFactory.initElements(driver, LoginUser.class);
		loginPage.login(arg1, arg2);
		assertEquals("expected **Successful Login**" + "received : " + loginPage.check.getText(),"**Successful Login**", loginPage.check.getText());
		if (loginPage.check.getText().equals("**Successful Login**")) {
			test.log(LogStatus.PASS, arg1 + "logged in successgully ");
		}else {
				test.log(LogStatus.FAIL, arg1 + "Login not succesfull");			
		}
		report.endTest(test);
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		report.flush();

	}

}
