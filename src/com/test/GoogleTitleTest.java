package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test()
	public void googleTitleTest()
	{
		String Title=driver.getTitle();
		Assert.assertEquals(Title, "google","Title is not Matched");
	}
	
	
	@Test()
	public void mailLinkTest()
	{
		
		boolean b=driver.findElement(By.xpath("//a[@class='gb_f' and text()='mail']")).isDisplayed();
		Assert.assertTrue(b);  //Assert.assertEquals(b,true); works same
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
