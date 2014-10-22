package com.ecomm.catalogTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecomm.businessLib.LoginLib;
import com.ecomm.genericLib.Driver;
import com.ecomm.reprotLib.MyLog;

public class Catalog {
	
  @Test
  public void TC001() {
	 try {
		  MyLog.LogInfo("LoginToApp is called");	  
		  LoginLib.LoginToApp("demo@avactis.com", "demo");
		  String expTitle = "Home - Avactis ShoppingCart";
		  String actualTitle = Driver.driver.getTitle();
		  Assert.assertEquals(actualTitle, expTitle, "Title Mis Match");		
		  
	} catch (AssertionError e) {
		
	}   
  }
  
@Test
  public void TC002(){
	  Driver.driver.close();
	  MyLog.LogInfo("Browser is closed");
  }
}
