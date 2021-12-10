package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
	@Test(priority=5,groups="sample1")
	public void googleTitleTest()
	{
		System.out.println(driver.getTitle());
	}
	@Test(priority=4,groups="sample1")
	public void googleLogoTest()
	{
		
		System.out.println(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
	}
	@Test(priority=3,groups="sample2")
	public void mailLinkTest()
	{
		
		System.out.println(driver.findElement(By.xpath("//a[@class='gb_f' and text()='mail']")).isDisplayed());
	}
	
	@Test(priority=2,groups="sample2")
	
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=1,groups="sample2")
	
	public void test2()
	{
		System.out.println("Test2");
	}
		
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
