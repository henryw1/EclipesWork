package AutoTestingSel.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

/**
 * Unit test for simple App.
 */
public class SelWeb {
	Constants constant = new Constants();
	private WebDriver driver;
	FileInputStream file = null;
	private String cell1;
	private String cell2;
	public static ExtentReports report; 
	public static ExtentTest test;
	
	@BeforeClass
	public static void initial () {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\empty\\sel.html");
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", constant.chromeExe);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		try {
			file = new FileInputStream(constant.filePath + constant.test_data);
		} catch (FileNotFoundException e1) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (Exception e) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			cell1 = sheet.getRow(i).getCell(0).getStringCellValue();
			cell2 = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(cell1 + cell2);
		}
		try {
			test = report.startTest("registering user ");
			driver.get(constant.regUrl);
			Demosite regPage = PageFactory.initElements(driver, Demosite.class);
			regPage.register(cell1, cell2);
			test = report.startTest("logon in user");
			driver.get(constant.loginUrl);
			DemoLogin loginPage = PageFactory.initElements(driver, DemoLogin.class);
			loginPage.login(cell1, cell2);
			WebElement check = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
			assertEquals("expected **Successful Login**" + "received : " + check.getText(), "**Successful Login**",check.getText());
			
			if(check.getText().equals("**Successful Login**")) {
				test.log(LogStatus.PASS, "user created and logged in successfully");
			}else 
			{
				test.log(LogStatus.FAIL, "the user login did not work");
			}
			report.endTest(test);
			
			Thread.sleep(50000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	@AfterClass
	public static void end() {
		report.flush();

	}

}
