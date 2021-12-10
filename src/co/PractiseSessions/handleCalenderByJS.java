package co.PractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleCalenderByJS {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("srirammurthy.i@gmail.com");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Srirammurthy@054");
		WebElement login_Btn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		login_Btn.click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Calendar')]"))).click().build().perform();
		selectDate("11","May","2020",driver);
			
	}

	public static void selectDate(String exDay, String exMon, String exYear,WebDriver driver) {
		 if (exMon.equals("February") && Integer.parseInt(exDay)>29)
		 {
			 System.out.println("Wrong Date:"+exMon+":"+exDay);
		 }
		 if(Integer.parseInt(exDay)>31)
		 {
			 System.out.println("Wrong Date:"+exMon+":"+exDay);
		 }
		String monthYearVal=driver.findElement(By.xpath("//span[@class='rbc-toolbar-label']")).getText();
		while(!(getMonthYear(monthYearVal)[0].equals(exMon) && (getMonthYear(monthYearVal)[1].equals(exYear) )))
				{
			driver.findElement(By.xpath("//button[@type='button']//i[@class='chevron left icon']")).click();
			monthYearVal=driver.findElement(By.xpath("//span[@class='rbc-toolbar-label']")).getText();
				}
		driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
	}
	public static String[] getMonthYear(String monthYearVal)
	{
		return monthYearVal.split(" ");
	}

}
