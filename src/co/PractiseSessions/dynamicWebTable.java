package co.PractiseSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\TT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		List <WebElement> columns=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int rowcount=rows.size();
		int colcount=columns.size();
		System.out.println(rowcount+"::::"+colcount);
		String before_xpath="//table[@id='customers']/tbody/tr[";
		String middle="]/td[";
		String after_xpath="]";
		Thread.sleep(4000);
		for(int i=2;i<=rowcount;i++)
		{
			for(int j=1;j<=colcount;j++)
			{
				String actual_xpath=before_xpath+i+middle+j+after_xpath;
				System.out.print(driver.findElement(By.xpath(actual_xpath)).getText());
				System.out.print("\t\t\t ");
			
			}
			System.out.println(" ");
		}
		
		
		
		/*
		 * List <WebElement> columns1=driver.findElements(By.
		 * xpath("//*[@class='ws-table-all notranslate']/tbody/tr[1]/th")); int
		 * colcount1=columns1.size(); String
		 * before_col_xpath1="//table@class='ws-table-all notranslate']/tbody/tr[1]/th["
		 * ; String after_col_xpath1="]";
		 * 
		 * for (int j=1;j<=colcount1;j++) { String
		 * actual_xpath1=before_col_xpath1+j+after_col_xpath1;
		 * System.out.println(driver.findElement(By.xpath(actual_xpath1)).getText()); }
		 */
		
		/* List <WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int rowcount=rows.size();
		System.out.println(rowcount);
		String before_xpath="//*[@id=\"customers\"]/tbody/tr[";
		String middle_xpath="]/td[";
		String last_xpath="]";
		for(int i=2,j=1; i<=rowcount;i++)
		{
			String actual_xpath=before_xpath+i+middle_xpath+j+last_xpath;
			WebElement ele=driver.findElement(By.xpath(actual_xpath));
			System.out.print(ele.getText());
			System.out.print("\t");
			j++;
			String actual_xpath1=before_xpath+i+middle_xpath+j+last_xpath;
			WebElement ele1=driver.findElement(By.xpath(actual_xpath1));
			System.out.print(ele1.getText());
			System.out.print("\t");
			j++;
			String actual_xpath2=before_xpath+i+middle_xpath+j+last_xpath;
			WebElement ele2=driver.findElement(By.xpath(actual_xpath2));
			System.out.println(ele2.getText());
			j=1;
		}
		*/
		//pattern observed for the first column all rows:
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		// patterns observed for the first row all columns  
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
	}

}
