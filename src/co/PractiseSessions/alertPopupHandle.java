package co.PractiseSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopupHandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.xpath("//input[@name='proceed']")).click();
		 Alert alert=driver.switchTo().alert();
		 System.out.println(alert.getText());
		 Thread.sleep(5000);
		 alert.accept();
	}

}
