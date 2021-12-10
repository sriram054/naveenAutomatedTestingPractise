package co.PractiseSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) { 
		//get the total links in the web page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.facebook.com");
		 List <WebElement> list=driver.findElements(By.tagName("a" ));
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i).getText());
			
		 }
		 
	}

}
