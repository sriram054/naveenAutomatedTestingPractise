package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class handleCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		/*driver.findElement(By.id("datepicker")).click();
		 
		WebDriverWait wdw=new WebDriverWait(driver,5);
		wdw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		String monthyearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		String month=monthyearVal.split(" ")[0].trim();
	
		String year= monthyearVal.split(" ")[1].trim();
		
		while(!(month.equals("July") && year.equals("2021")))
		{
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthyearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			month=monthyearVal.split(" ")[0].trim();
		
			year= monthyearVal.split(" ")[1].trim();
		}
		WebElement day=driver.findElement(By.xpath("//a[text()='11']"));
		day.click();
		
		*/
		
		String date="07/11/1985";
		
		driver.findElement(By.id("datepicker")).sendKeys(date);
		WebElement day=driver.findElement(By.xpath("//a[text()='11']"));
		day.click();
		driver.quit();
		
		//String dateArr[]=date.split("-");
		//String day=dateArr[0];
		//String Month=dateArr[1];
		//String Year=dateArr[2]; 
		
	}

}
