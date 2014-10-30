package com.ecomm.catalogTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.businessLib.LoginLogoutLib;
import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reportLib.MyLog;
import com.ecomm.reportLib.TestStatus;

public class Catalog {
	
	LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
	
	@BeforeTest
	public void beforeTest(){
		MyLog.log().info("Open Browser and Navigate to Login Page");
		Driver.driver.get(loginPageObj.getURL());
		Driver.driver.manage().window().maximize();	
	}
	
	@AfterTest
	public void AfterTest(){
		MyLog.log().info("Quit Browser");
		Driver.driver.quit();
	}
	
	
  @Test
  public void TC001() throws Exception {
	 try {
		  MyLog.log().info("Executing TC001");	  
		  LoginLogoutLib.LoginToApp("demo@avactis.com", "demo");
		  String expTitle = "Home - Avactis ShoppingCart";
		  String actualTitle = Driver.driver.getTitle();
		  Assert.assertEquals(actualTitle, expTitle, "Title Mis-Match");		
		  
	} catch (AssertionError e) {
		
		TestStatus.fail(e);
		
	}   
  }
  
  @Test
  public void TC002(){
	  MyLog.log().info("Executing TC002");
  }
  
  
  
}
