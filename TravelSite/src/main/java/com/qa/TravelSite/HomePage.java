package com.qa.TravelSite;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//*[@id=\"s2id_location_from\"]/a")
	private WebElement textbox;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li")
	private WebElement inputBox;
	@FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a")
	private WebElement flights;

	public void searchDestination(String input, WebDriver driver) {
		flights.click();
		textbox.click();
		textbox.sendKeys(input);
		inputBox.click();
//		Actions action = new Actions(driver);			
//		action.sendKeys(Keys.ENTER);		
//		inputBox.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
