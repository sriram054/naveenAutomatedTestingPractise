package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimdip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\TT\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.get("https://www.geeksforgeeks.org/static-keyword-java/#");
		 driver.findElement(By.xpath("/html/body/div[6]/button/i")).click();
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("/html/body/div[6]/button/i")).click();
		 
		

	}

}
