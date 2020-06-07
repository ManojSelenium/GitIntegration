package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements Setup{

	public WebDriver driver;
	
	public WebDriver initilizeDriver() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Driver From Test Base ::: "+driver);
		maxmizeBrowser();
		return driver;
		
	}
	
	public void enterURL(String URL) {	
		driver.get(URL);
	}
	
	public void maxmizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
