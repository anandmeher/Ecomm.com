package com.ecomm.businessLib;

import org.openqa.selenium.support.PageFactory;

import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reportLib.MyLog;

public class LoginLib {
	
	public static void LoginToApp(String emailAddress, String password){
		
		LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
		
		MyLog.LogInfo("Open Browser and Navigate to Login Page");
		Driver.driver.get(loginPageObj.getURL());
		Driver.driver.manage().window().maximize();
		
		MyLog.LogInfo("Clear Email Address Text field and enter email address");
		loginPageObj.getEmailAddressEdt().clear();
		loginPageObj.getEmailAddressEdt().sendKeys("demo@avactis.com");
		loginPageObj.getPasswordEdt().clear();
		loginPageObj.getPasswordEdt().sendKeys("demo");
		loginPageObj.getSignInBtn().click();
		MyLog.LogInfo("Logged in to application");
	}

}
