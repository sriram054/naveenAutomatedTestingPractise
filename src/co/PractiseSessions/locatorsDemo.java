package co.PractiseSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorsDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("C:\\Users\\Sainadha\\Desktop\\TT\\sample.html");
		 WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		 firstName.sendKeys("SRIRAM");
		 WebElement middleName=driver.findElement(By.xpath("//input[@name='middlename']"));
		 middleName.sendKeys("MURTHY");
		 WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		 lastName.sendKeys("ITHINENI");
		 WebElement mobileNumber=driver.findElement(By.cssSelector("body > form > div > input[type=text]:nth-child(12)"));
		 mobileNumber.sendKeys("9396445444");
		 Select select=new Select(driver.findElement(By.cssSelector("body > form > div > div:nth-child(9) > select")));
		 select.selectByVisibleText("B.Tech");
		 WebElement phoneno=driver.findElement(By.xpath("//input[@name='phone']"));
		 phoneno.sendKeys("7989257461");
		 WebElement address=driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
		 address.sendKeys("10/3 Srinivasaraopet,Near Subhani Hotel, Opposite ITC,Guntur");
		 WebElement radio=driver.findElement(By.xpath("//input[@type='radio' and @value='Female']"));
		 radio.click();
		 //WebElement courseDD=driver.findElement(null))
	}

}
