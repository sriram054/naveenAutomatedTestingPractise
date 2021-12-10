package co.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testGrid {
	static WebDriver driver;
	static String nodeUrl;
	public static void main(String[] args)  {
		try {
		nodeUrl="http://192.168.0.103:4444/wd/hub";
		DesiredCapabilities capabilities =DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		//capabilities.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL(nodeUrl),capabilities);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
	}

}
