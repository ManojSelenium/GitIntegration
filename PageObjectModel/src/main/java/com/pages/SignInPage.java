package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SignInPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickCreateAccountButton() {
		click(CREATE_ACCOUNT_LOCATOR);
	}
	
	public void enterEmailAddress(String emailAddress) {
		
		enterText(EMAIL_ADDRESS_LOCATOR, emailAddress);
	}
}
