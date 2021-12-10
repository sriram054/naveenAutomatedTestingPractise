package co.PractiseSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("window-size=1400,800");
		 options.addArguments("headless");
		 WebDriver driver= new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		 driver.findElement(By.xpath("//span[contains(text(),'HTML, CSS')]")).click();
		 List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i).getText());
		 }
		 driver.quit();
	}
}
