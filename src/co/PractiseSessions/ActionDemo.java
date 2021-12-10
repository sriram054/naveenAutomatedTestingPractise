package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 driver.get("http://google.com");
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).sendKeys("Selenium WebDriver").build().perform();
		 //action.sendKeys(Keys.RETURN).build().perform();
		 action.contextClick().build().perform();
		 //driver.quit();
		 
		 

	}

}
