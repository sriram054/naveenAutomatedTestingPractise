package co.PractiseSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
		Thread.sleep(10000);
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));

		//WebElement list=driver.findElement(By.className("sbtc"));
		List <WebElement> rows=driver.findElements(By.xpath("//li[@class='sbct' and @role='presentation']"));
		int ls_size=rows.size();
		System.out.println("Total no of Suggessions"+ls_size);
		for(int i=1;i<ls_size; i++) 
		{
			System.out.println(rows.get(i).getText());
			if(rows.get(i).getText().equals("testing methodologies"))
			{
				rows.get(i).click();
				System.out.println(" the Index value is "+i);
				break;
			}
		}
		
		
		
		/*
		List <WebElement> ls=driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']//div[@class='wM6W7d WggQGd']//b"));
		int ls_size=ls.size();
		System.out.println("Total no of Suggessions"+ls_size);
		
		for(int i=0;i<ls_size; i++)
		{
			System.out.println(ls.get(i).getText());
			if(ls.get(i).getText().contains("testing methodologies"))
				ls.get(i).click();
				break;
		}
		Thread.sleep(4000);*/
		//driver.quit();
		
	}

}
