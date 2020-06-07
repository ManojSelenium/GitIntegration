package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.objrepo.CreateAccountPageProperties;
import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		//added space for commit 
		this.driver=driver;
	}
	
	public void createAccount(String firstName,String lastName,String password,String address,String city,String option,String zipcode,String phoneNumber,String alias) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterPassword(password);
		enterAddress(address);
		enterCity(city);
		selectState(option);
		enterZipCode(zipcode);
		enterPhoneNumber(phoneNumber);
		enterAlias(alias);
	}
	
	public void enterFirstName(String firstName) {
		enterText(FIRSTNAME_LOCATOR, firstName);
		
	}

	public void enterLastName(String lastName) {
		enterText(LASTNAME_LOCATOR, lastName);
	}

	public void enterPassword(String password) {
		enterText(PASSWRD_LOCATOR, password);
	}
	
	public void enterAddress(String address) {
		enterText(ADDRESS_LOCATOR, address);
	}
	
	public void enterCity(String city) {
		enterText(CITY_LOCATOR, city);
	}
	
	public void selectState(String option) {
		selectValueFromDropDown(STATE_LOCATOR, option);
	}
	
	public void enterZipCode(String zipcode) {
		enterText(ZIPCODE_LOCATOR, zipcode);
	}
	public void enterPhoneNumber(String phoneNumber) {
		enterText(PHONENUMBER_LOCATOR,phoneNumber);
	}
	public void enterAlias(String alias) {
		enterText(ALIAS_LOCATOR, alias);
	}
	
	
	
	public void clickRegister() {
		click(REGISTER_BUTTON_LOCATOR);
	}
	
}
