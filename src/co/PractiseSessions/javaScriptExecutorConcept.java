package co.PractiseSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\TT\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");

		 WebDriver driver=new ChromeDriver(options);
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.get("http://www.amazon.in");
		 driver.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("srirammurthy.i@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Srirammurthy@054");
		 Thread.sleep(1000);
		 driver.findElement(By.id("signInSubmit")).click();;
		 Thread.sleep(5000);
		 WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Become an Affiliate')]"));
		// WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
		flash(ele,driver);
		 for (int i=1;i<=10 ;i++) {
			 Thread.sleep(1000);
			 if(i % 2==0)
				 drawredBorder(ele,driver);
			 else
				 drawblueBorder(ele,driver);
		 }
		 takeScreenShot(driver);
		generateAlert(driver,"There is an issue in Login Button");
		 clcikElementbyJS(ele,driver);
		Thread.sleep(8000); 
		 refreshBrowserbyJS(driver);
		 Thread.sleep(6000);
		System.out.println(getTitleByJS(driver));
		System.out.println(getPageInnerText(driver));
		scrollpagedown(driver);
		scrollintoview(driver,ele);
		 
		 //driver.quit();
	}
	public static void flash(WebElement element,WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++)
		{
			changeColor("rgb(0,200,0)",element,driver);
			Thread.sleep(1000);
			//System.out.println("Hai");
			changeColor(bgcolor,element,driver);
			Thread.sleep(1000);
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	}
	public static void drawredBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void drawblueBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid blue'", element);
	}
	public static void takeScreenShot(WebDriver driver) throws IOException 
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Sainadha\\Desktop\\TT\\error.png"));
	}
	public static void generateAlert(WebDriver driver,String msg)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+msg+"')");
	}
	public static void clcikElementbyJS(WebElement element,WebDriver driver)
	{ 
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", element);
	}
	public static void refreshBrowserbyJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		return js.executeScript("return document.title;").toString();
	}
	public static String getPageInnerText(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		return js.executeScript("return document.documentElement.innerText").toString();	
	}
	public static void scrollpagedown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
