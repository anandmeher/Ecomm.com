package com.ecomm.catalogTest;

import java.lang.reflect.Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.businessLib.LoginLib;
import com.ecomm.genericLib.Driver;
import com.ecomm.genericLib.Utills;
import com.ecomm.pageFactory.HomePageLib;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reportLib.MyLog;
import com.ecomm.reportLib.TestReport;

public class Catalog {
	
	LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
	HomePageLib homePageObj = PageFactory.initElements(Driver.driver, HomePageLib.class);
	public static String testName;
	
	@BeforeTest
	public void beforeTest(){

		MyLog.Log().info("Open Browser and Navigate to Login Page");
		Driver.driver.get(loginPageObj.getURL());
		Driver.driver.manage().window().maximize();	
		LoginLib.LoginToApp("demo@avactis.com", "demo");
	}
	
	@BeforeMethod
	public void startTestCase(Method method) throws Exception {

		testName = method.getName();
		MyLog.Log().info("Executing TestCase : " + testName);
	}
	
	@AfterMethod
	public void endTestCase(Method method){
		MyLog.Log().info("Execution Completed : " + testName);
	}

	
	@AfterTest
	public void afterTest(){

		Driver.driver.quit();
		MyLog.Log().info("Browser is closed");
	}
	
  @Test
  public void TC001() {
	 try {
		  
		  //MyLog.Log().info("Executing TC001: Verify Home Page Title");	   
		  String expTitle = "Home - Avactis ShoppingCart";
		  String actualTitle = Driver.driver.getTitle();
		  Assert.assertEquals(actualTitle, expTitle, "Title Mis Match");		
		  
	} catch (AssertionError e) {
		TestReport.fail(e, testName);
	}   
  }
  
@Test
  public void TC002(){
	try {
		//MyLog.Log().info("Executing TC002: Verify Catalog / Manage Product Page Title");
		Utills.waitForLinkPresent("Catalog");
		homePageObj.getCatalogLink().click();
		homePageObj.getManageProductsLink().click();
		Utills.waitForPageToLoad();
		
		String expTitle = "Manage Products - Avactis ShoppingCart";
		String actualTitle = Driver.driver.getTitle();
		
		Assert.assertEquals(actualTitle, expTitle, "Title Mis Match");
		
		
		} catch (AssertionError e) {
		TestReport.fail(e,testName);
		}  
	  
  	}
}
