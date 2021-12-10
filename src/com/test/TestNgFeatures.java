package com.test;
import org.testng.annotations.Test;
public class TestNgFeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		//int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homepageTest()
	{
		System.out.println("Home Page Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest()
	{
		System.out.println("SearchPageTest");
	}@Test(dependsOnMethods="loginTest")
	public void RegistrationpageTest()
	{
		System.out.println("RegistrationpageTest");
	}
}
