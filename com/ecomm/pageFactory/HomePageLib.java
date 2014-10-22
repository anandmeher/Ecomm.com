package com.ecomm.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLib {
	
	@FindBy(linkText="Catalog")
	private WebElement catalogLink; 

}
