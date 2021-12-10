package KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Methods {
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void navigate()
	{
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
	}
	public static void inputUsername()
	{
		WebElement username=driver.findElement(By.id("si_popup_email"));
		username.sendKeys("srirammurthy.i@gmail.com");
	}
	public static void inputPassword() throws InterruptedException
	{
		WebElement password=driver.findElement(By.id("si_popup_passwd"));
		password.sendKeys("Srirammurthy@054");
		Thread.sleep(4000);
	}
	public static void verifyLogin()
	{
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle,pageTitle );
	}
	public static void clickLogin()
	{
		WebElement next=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		next.click();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
}
