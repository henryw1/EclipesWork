package com.qa.Reporting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bingsearch {
	@FindBy (xpath = "//*[@id=\"b_context\"]/li[1]/div/div[1]/h2")
	private WebElement res;

	public WebElement getRes() {
		return res;
	}

	public void setRes(WebElement res) {
		this.res = res;
	} 
	
	
//	public void getSearch() {
//	res.getText();
//	}

}
