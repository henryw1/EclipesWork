package com.qa.shoppingSite;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	@FindBy(xpath="//*[@id=\"homefeatured\"]")
	private WebElement selected;
	
	private WebElement web []; 
		
	public void select(String checker) {			
		List<WebElement> AllCheckBoxes = selected.findElements(By.xpath("//*[@id=\"homefeatured\"]/li"));		
		
//		for (WebElement webelem : AllCheckBoxes) {
			
			for (int i = 1; i < AllCheckBoxes.size(); i++) {			
				 
			String path = "//*[@id='homefeatured']/li[" + i + "]/div/div/div/a/img";			
			WebElement s = AllCheckBoxes.get(i).findElement(By.xpath(path)); 
			String img_text=s.getAttribute("alt").trim();			
			System.out.println(img_text);
			String check =AllCheckBoxes.get(i).getText();
			try {
			if (img_text.equals(checker)) {				
				s.click();
				Thread.sleep(30000);
			
					break;
			}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}


	}

}
