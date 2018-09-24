package com.qa.PassionTea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]")
	private WebElement menu; 	
	
	public void goToMenu() {
		menu.click();

	}

}
