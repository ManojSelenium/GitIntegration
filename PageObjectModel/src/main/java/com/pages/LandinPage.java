package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objrepo.LandingPageProperties;
import com.util.WebDriverUtils;

public class LandinPage extends WebDriverUtils  implements  LandingPageProperties {

	
	WebDriver driver;
	
	public LandinPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	public void clickSigninLink() {
		click(SIGNIN_LOCATOR);
	}
	
	public void clickContactusLink() {
		System.out.println("Clicked contactus link");
	}
}
