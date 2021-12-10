package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@Test(dataProvider="TestDataFeed")
	public void Testgoogle(String uname,String pwd)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		email.sendKeys(uname);
		pass.sendKeys(pwd);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] TestDataFeed()
	{
		Object[][] facebookdata=new Object[2][2];
		facebookdata[0][0]="srirammurthy.i@gmail.com";
		facebookdata[0][1]="123456789"; 
		facebookdata[1][0]="srirammurthy.ithineni@gmail.com";
		facebookdata[1][1]="987654321";
		return facebookdata;
	}

}
