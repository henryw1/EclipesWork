package AutoTestingSel.Selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demosite {
	
	@FindBy(name = "FormsButton2")
	private WebElement regButton;
	@FindBy(name = "username")
	private WebElement username; 
	@FindBy(name="password")
	private WebElement password;
	
	
	public void register(String name, String pass) {		
		username.sendKeys(name);
		password.sendKeys(pass);
		regButton.submit();
		// TODO Auto-generated method stub

	}
	

}
