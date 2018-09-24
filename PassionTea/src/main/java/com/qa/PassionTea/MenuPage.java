package com.qa.PassionTea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span")
	private WebElement tea; 
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]")
	private WebElement checkout;
	
	
	public String  findTea() {			
		return tea.getText();
	}
	
	public void checkOut() {
		checkout.click();
	}

}
