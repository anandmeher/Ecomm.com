package com.ecomm.catalogTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.businessLib.LoginLib;
import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reprotLib.MyLog;

public class Catalog {
	
	LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
	
	@BeforeTest
	public void beforeTest(){
		MyLog.Log().info("Open Browser and Navigate to Login Page");
		Driver.driver.get(loginPageObj.getURL());
		Driver.driver.manage().window().maximize();	
	}
	
	@AfterTest
	public void afterTest(){
		Driver.driver.quit();
		MyLog.Log().info("Browser is closed");
	}
	
  @Test
  public void TC001() {
	 try {
		  MyLog.Log().info("Executing TC001");	  
		  LoginLib.LoginToApp("demo@avactis.com", "demo");
		  String expTitle = "Home - Avactis ShoppingCart";
		  String actualTitle = Driver.driver.getTitle();
		  Assert.assertEquals(actualTitle, expTitle, "Title Mis Match");		
		  
	} catch (AssertionError ae) {
		System.out.println("Inside Catch");
		MyLog.Log().error(ae);
		Assert.fail(ae.toString());
	}   
  }
  
@Test
  public void TC002(){
	  MyLog.Log().info("Executing TC002");
	  
  }
}
