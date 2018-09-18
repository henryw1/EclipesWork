package AutoTestingSel.Selenuim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLogin {
	@FindBy(name = "FormsButton2")
	private WebElement regButton;
	@FindBy(name = "username")
	private WebElement username; 
	@FindBy(name="password")
	private WebElement password;
	
	
	public void login(String name, String pass) {		
		username.sendKeys(name);
		password.sendKeys(pass);
		regButton.submit();	
		// TODO Auto-generated method stub

	}

}
