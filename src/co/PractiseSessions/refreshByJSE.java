package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class refreshByJSE {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 driver.get("http://google.com");
		 for(int i=0;i<100;i++)
		 {
			 refreshbyJS(driver);
		 }
	}
		 public static void refreshbyJS(WebDriver driver)
		 {
			 JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("history.go(0)");
		 }

	}
