package com.ecomm.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLib {
	
	@FindBy(xpath="//input[@type='text' and @name='AdminEmail']")
	private WebElement emailAddressEdt;
	
	@FindBy(xpath="//input[@name='Password' and @type='password']")
	private WebElement passwordEdt;
	
	@FindBy(id="SignInButton1")
	private WebElement signInBtn;
	
	@FindBy(xpath="//form[@id='SignInForm']/table/tbody/tr[10]/td/span")
	private WebElement signInErrorText;
	
	private String URL = "http://demo.avactis.com/4.6/avactis-system/admin/signin.php";

	public WebElement getEmailAddressEdt() {
		return emailAddressEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public String getURL() {
		return URL;
	}
	
	

}
