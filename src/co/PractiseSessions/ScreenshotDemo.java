package co.PractiseSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	static WebDriver driver;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("d:\\robot2.png"));

		}
		catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			
		}
		driver.quit();
	}

}
