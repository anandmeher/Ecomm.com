package com.ecomm.businessLib;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.HomePageLib;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reportLib.MyLog;

public class LoginLib {
	
	public static void LoginToApp(String emailAddress, String password){
		
		try {
			LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
			
			MyLog.Log().info("Clear Email Address Text field and enter email address");
			loginPageObj.getEmailAddressEdt().clear();
			loginPageObj.getEmailAddressEdt().sendKeys("demo@avactis.com");
			loginPageObj.getPasswordEdt().clear();
			loginPageObj.getPasswordEdt().sendKeys("demo");
			loginPageObj.getSignInBtn().click();
			MyLog.Log().info("Logged in to application");
			
		} catch (Exception e) {
			MyLog.Log().error(e.toString());
			Assert.fail(e.toString());
		}
		
	}
	
	public static void LogoutApp(){
		
		HomePageLib.getAdminInfoBtn().click();
	}

}
