package com.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.CreateAccountPage;
import com.pages.LandinPage;
import com.pages.MyAccountPage;
import com.pages.SignInPage;
import com.util.TestBase;

public class S234_CreateAccount_Test extends TestBase{

	WebDriver driver;
	String actualUserName;

	@BeforeMethod
	public void beforeMethod() {
		driver=initilizeDriver();
		enterURL(APPLICATION_URL);
	}

	@Test(dataProvider = "createAccountData")
	public void testCase1(String emailAddress,String firstName,String lastName,String password,String address,String city,String option,String zipcode,String phoneNumber,String alias) {      
		LandinPage landinPage=new LandinPage(driver);
		landinPage.clickSigninLink();
		SignInPage signInPage=new SignInPage(driver);
		emailAddress=RandomStringUtils.randomAlphabetic(5)+"@gmail.com";
		signInPage.enterEmailAddress(emailAddress);
		signInPage.clickCreateAccountButton();
		firstName=RandomStringUtils.randomAlphabetic(5);
		lastName=RandomStringUtils.randomAlphabetic(5);
		phoneNumber=RandomStringUtils.randomNumeric(10);
		CreateAccountPage createAccountPage =new CreateAccountPage(driver);
		createAccountPage.createAccount(firstName, lastName, password, address, city, option, zipcode, phoneNumber, alias);
		createAccountPage.clickRegister();
		MyAccountPage accountPage=new MyAccountPage(driver);
		actualUserName=accountPage.getUserNameText();
		System.out.println("Actual UserName ::: "+actualUserName);
		Assert.assertEquals(actualUserName, firstName+" "+lastName);
	}

	@DataProvider
	public Object[][] createAccountData() {
		Object[][] data=new Object[1][10];
		data[0][0]="emailAddress12@gmail.com";
		data[0][1]="firstname";
		data[0][2]="lastname";
		data[0][3]="Password@123";
		data[0][4]="address";
		data[0][5]="city";
		data[0][6]="5";
		data[0][7]="11111";
		data[0][8]="1234567890";
		data[0][9]="test";

		return data;
	}

	@AfterMethod
	public void afterMethod() {
		closeBrowser();
	}

	@Test
	public void testCase2() {
		System.out.println(actualUserName);
	}

}
