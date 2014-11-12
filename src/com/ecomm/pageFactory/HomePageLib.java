package com.ecomm.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLib {
	
	@FindBy(linkText="Catalog")
	private WebElement catalogLink; 
	
	@FindBy(linkText="Manage Products")
	private WebElement manageProductsLink;

	public WebElement getCatalogLink() {
		return catalogLink;
	}

	public WebElement getManageProductsLink() {
		return manageProductsLink;
	}
	
	

}
