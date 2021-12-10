package co.PractiseSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("C:\\Users\\Sainadha\\Desktop\\TT\\fileupload1.html");
		 //driver.manage().window().maximize();
		 WebElement button=driver.findElement(By.id("fileupload"));
		 button.sendKeys("C:\\Users\\Sainadha\\Desktop\\TT\\Playlist Videos List.txt");
	}
}
