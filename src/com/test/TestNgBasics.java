package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
/*
 * 
 *  Setup system property        @BeforeSuite
	Login Method                 @BeforeTest
	Launching Chrome Browser     @BeforeClass
	Enter URL                    @BeforeMethod
	Google Title Test Case       @Test
	logout   					 @AfterMethod
	Closing the Browser          @AfterClass
	Delete all Cookies           @AfterTest
 * 
 * 
 * 
 */
	//pre conditions
	@BeforeSuite   // 1
	public void setUp()
	{
		System.out.println("Setup system property");
	}
	@BeforeClass // 3
	public void launchBrowser()
	{
		System.out.println("Launching Chrome Browser");
	}
	
	@BeforeTest  //2
	public void login()
	{
		System.out.println("Login Method");
	}
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("Enter URL");
	}
	
	//test cases
	@Test(priority=-1)
	public void googleTitleTest()
	{
		System.out.println("Google Title Test Case with priority -1");
	}
	@Test(priority=-2)
	public void googleTitleTest1()
	{
		System.out.println("Google Title Test Case with priority -2");
	}
	@Test(priority=1)
	public void googleTitleTest2()
	{
		System.out.println("Google Title Test Case with priority as 1");
	}
	@Test(priority=0)
	public void googleTitleTest3()
	{
		System.out.println("Google Title Test Casewith priority 0");
	}
	
	
	//post conditions
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterTest
	public void deleteAllcookies()
	{
		System.out.println("Delete all Cookies");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Closing the Browser");
	}
	@AfterSuite
	public void genereateReport()
	{
		System.out.println("Genereate Report");
	}
}
