package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageDown_JS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-headless-browser-testing/");
		 scrollDown(driver);

	}

	private static void scrollDown(WebDriver driver) {
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}

}
