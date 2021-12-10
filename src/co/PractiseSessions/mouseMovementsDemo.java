package co.PractiseSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovementsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://rvrjcce.ac.in/#");
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'R & D cell')]"))).click().build().perform();
		 Thread.sleep(3000);
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Research Centres')]"))).click().build().perform();
		 Thread.sleep(5000);
		 action.moveToElement(driver.findElement(By.id("link3"))).click().build().perform();
		 action.moveToElement(driver.findElement(By.id("menuItemText9"))).click().build().perform();
	} 

}
