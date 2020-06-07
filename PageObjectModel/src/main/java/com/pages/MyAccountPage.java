package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.MyAccountPageProperties;
import com.util.WebDriverUtils;

public class MyAccountPage extends WebDriverUtils implements MyAccountPageProperties {

	
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public String getUserNameText() {
		return getText(NAME_LOCATOR);
	}
}
