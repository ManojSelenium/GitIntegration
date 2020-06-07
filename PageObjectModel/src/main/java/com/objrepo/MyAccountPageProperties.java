package com.objrepo;

import org.openqa.selenium.By;

public interface MyAccountPageProperties {

	
	By WISHLIST_LOCATOR=By.xpath("//a[@title='My wishlists']");
	
	By NAME_LOCATOR=By.xpath("//a[@title='View my customer account']/span");
	
	By PERSONAL_INFORMATION_LOCATOR=By.xpath("//a[@title='Information']");
}

