package AutoTesting.testing;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@RunWith(Parameterized.class)
public class BlackJackTest  
{
	private WebDriver driver;
	private String str = "https://henryw1.github.io/" ; 
	
	@Before 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\tesing/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
//	private int input1; 
//	private int input2;
//	private int expected; 
//	
//	@Parameters
//	public static List<Integer[]> inputs(){
//		
//		return Arrays.asList(new Integer [][] {{12, 1,12}, {5,22,5}, {9,22,5}});		
//	}
//	
//	public BlackJackTest(int expected, int input1, int input2) {
//		this.input1 = input1;
//		this.input2 = input2;
//		this.expected = expected;
//	}

    
// @Test
// public void tester()
// {
//	 BlackJack bl = new BlackJack(); 	 
//	 assertEquals("expected: " + expected + " input1: "+ input1 + " input2: " + input2, expected, bl.blackJack(input1, input2));
//	 
// }
 
 @Test
 public void testSite() {
	 //driver.manage().window().maximize();
	 driver.get(str);
	 
	try {
		Thread.sleep(5000);
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
