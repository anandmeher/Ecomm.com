package com.ecomm.businessLib;

import org.openqa.selenium.support.PageFactory;

import com.ecomm.genericLib.Driver;
import com.ecomm.pageFactory.HomePageLib;
import com.ecomm.pageFactory.LoginPageLib;
import com.ecomm.reportLib.MyLog;

public class LoginLogoutLib {
	
	static LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
	static HomePageLib homePageObj = PageFactory.initElements(Driver.driver, HomePageLib.class);
	
	public static void LoginToApp(String emailAddress, String password){
		
		//LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
		try {
			MyLog.log().info("Open Browser and Navigate to Login Page");
			Driver.driver.get(loginPageObj.getURL());
			Driver.driver.manage().window().maximize();
			
			MyLog.log().info("Clear Email Address Text field and enter email address");
			loginPageObj.getEmailAddressEdt().clear();
			loginPageObj.getEmailAddressEdt().sendKeys("demo@avactis.com");
			loginPageObj.getPasswordEdt().clear();
			loginPageObj.getPasswordEdt().sendKeys("demo");
			loginPageObj.getSignInBtn().click();
			MyLog.log().info("Logged in to application");
			
		} catch (Exception e) {
			MyLog.log().error(e.getMessage());
			throw(e);
		}
		
		
	}
	
	public static void LogoutApp(){
	
		homePageObj.getAdminInfoBtn().click();
	}

}
