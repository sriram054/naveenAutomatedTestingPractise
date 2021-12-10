package co.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class ListnerMainClass {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sainadha\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 EventFiringWebDriver eventHandler=new EventFiringWebDriver(driver);
		 EventCapture ecapture=new EventCapture();
		 eventHandler.register(ecapture);
		 eventHandler.navigate().to("https://www.edureka.co/");
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(3000);
		 eventHandler.findElement(By.linkText("Software Testing")).click();
		 eventHandler.navigate().to("https://www.edureka.co/all-courses");
		 eventHandler.navigate().back();
		 eventHandler.quit();
		 eventHandler.unregister(ecapture);
		 		
	}

}
