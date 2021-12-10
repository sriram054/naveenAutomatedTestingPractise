package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEditable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_readonly");
		 driver.switchTo().frame("iframeResult");
		 String value=driver.findElement(By.id("country")).getAttribute("readonly");
		 System.out.println(value);
	}

}
