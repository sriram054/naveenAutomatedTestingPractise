package co.PractiseSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupHandle {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://echoecho.com/jswindows03.htm");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//font[contains(text(),'Click Here To Go to Yahoo')]")).click();
		 Set <String> handler=driver.getWindowHandles();
		 Iterator <String> it=handler.iterator(); 
		 String parentWindow=it.next();
		 System.out.println("Parent Window Id:"+parentWindow);
		 String childWindow=it.next();
		 System.out.println("Child Window Id:"+childWindow);
		 for(int i=0;i<5;i++)
		 {
			 driver.switchTo().window(parentWindow);
			 //System.out.println(driver.getTitle());
			 Thread.sleep(2000);
			 driver.switchTo().window(childWindow);
			 //System.out.println(driver.getTitle());
			 Thread.sleep(2000);
			 
		}
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(parentWindow);
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 driver.quit();
	} 
}
