package com.qa.PassionTea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath="/html/head/title")
	private WebElement pageTitle;
	
	public boolean checkTitle(String title, WebDriver driver) {	
		
		if(driver.getTitle().equals(title)) {
			System.out.println(driver.getTitle());
			return true;
		}else {
			return false ;
		}
		

	}

}
