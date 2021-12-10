package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.facebook.com");
		 for(int i=1;i<5;i++)
		 {
			 Thread.sleep(3000);
			 driver.navigate().refresh();
		 }
		 driver.close();
			/*Thread.sleep(2000);
		 driver.navigate().to("http://www.amazon.in");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();*/
		 
	}

}
