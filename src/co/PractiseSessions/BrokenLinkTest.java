package co.PractiseSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.HttpUrl;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
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
		Thread.sleep(5000);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linklist.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();

		// Iterate linkList
		
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getAttribute("href"));
				if(linklist.get(i).getAttribute("href")!=null)
					activeLinks.add(linklist.get(i));
			
		}
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage(); /// It will return Ok If it is success 
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"----->"+response);
		}
		// Get the Size of active link List
		//System.out.println(activeLinks.size());

	}

}
