package com.ecomm.businessLib;

import org.openqa.selenium.support.PageFactory;

import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reprotLib.MyLog;

public class LoginLib {
	
	public static void LoginToApp(String emailAddress, String password){
		
		LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
		
		MyLog.Log().info("Clear Email Address Text field and enter email address");
		loginPageObj.getEmailAddressEdt().clear();
		loginPageObj.getEmailAddressEdt().sendKeys("demo@avactis.com");
		loginPageObj.getPasswordEdt().clear();
		loginPageObj.getPasswordEdt().sendKeys("demo");
		loginPageObj.getSignInBtn().click();
		MyLog.Log().info("Logged in to application");
	}

}
