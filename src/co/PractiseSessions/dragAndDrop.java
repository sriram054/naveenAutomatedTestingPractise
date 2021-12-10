package co.PractiseSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		 Actions action=new Actions(driver);
		 Thread.sleep(5000);
		 WebElement ele1=driver.findElement(By.id("draggable"));
		 WebElement ele2=driver.findElement(By.id("droppable"));
		 // action.dragAndDrop(ele1, ele2).build().perform();
		 action.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
	}

}
