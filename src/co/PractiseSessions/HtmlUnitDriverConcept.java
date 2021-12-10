package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new HtmlUnitDriver();
		
		 //driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.get("http://www.facebook.com");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srirammurthy.i@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Srirammurthy@054");
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
	}
}
