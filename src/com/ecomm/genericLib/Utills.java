package com.ecomm.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utills {
	
	// waitForPageToLoad() method is used to implicitly wait for 20 seconds 
	public static void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	// waitForLinkPresent() Method is used to wait Link till it is Clickable.
	public static void waitForLinkPresent(String linkText){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
	}
	
	// waitForXPathPresent() method is used to wait till specified xpath is clickable.
	public static void waitForXPathPresent(String elementXPath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
	}
	
	
	// getAndVerifyTextPresent() method is used to get the text, verify and returns true or false. 
	public static boolean getAndVerifyTextPresent(String textXPath, String expectedText){
		
		boolean flag = false;
		
		String actualText = Driver.driver.findElement(By.xpath(textXPath)).getText();
		
		if (expectedText.equals(actualText)) {
			flag = true;
			System.out.println(actualText + " is Verified");
		}else {
			System.out.println(actualText + " is not verified");	
		}
		
		return flag;		
		
	}
	
	//NavigateTo() method is used to navigate specific url / page.
	public static void NavigateTo(String url){
		Driver.driver.manage().window().maximize();
		Driver.driver.get(url);		
				  
	  }
}
