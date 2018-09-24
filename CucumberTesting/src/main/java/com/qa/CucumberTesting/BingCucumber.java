package com.qa.CucumberTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingCucumber {
	
	@FindBy(id = "sb_form_q")
	private WebElement search; 
	
	
	public void search(String input) {
		search.sendKeys(input);
		search.submit();
	}

}
