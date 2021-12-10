package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 /*driver.get("http://www.google.com");
		 boolean b1= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed();
		 System.out.println(b1);
		 boolean b2= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isEnabled();
		 System.out.println(b2);*/
		 driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		 WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		 ele.click();   
		 boolean b1=ele.isSelected();
		 System.out.println(b1);
		 Thread.sleep(3000);
		 ele.click();
		 b1=ele.isSelected();
		 System.out.println(b1);
	}

}
