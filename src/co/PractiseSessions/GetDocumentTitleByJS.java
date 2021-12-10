package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDocumentTitleByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 driver.get("http://google.com");
		 getdocumenttitle(driver);
		 

	}

	private static void getdocumenttitle(WebDriver driver) {
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 String title=js.executeScript("return document.title;").toString();
		 System.out.println(title);
	}
	

}
