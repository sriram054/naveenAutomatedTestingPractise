package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDExcel {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");

	}
	@Test(dataProvider="testdata")
	public void demoProject(String uname,String pass)
	{
		 System.out.println(uname);
		 System.out.println(pass);
	}
	@DataProvider(name="testdata")
	public Object[][] datafeed()
	{
		ReadExcelFile file= new ReadExcelFile("C:\\Users\\Sainadha\\Desktop\\TT\\FreeCRMTestData.xlsx");
		int rows=file.getRow(0);
		System.out.println(rows);
		Object[][] credentials= new Object[rows][2];
		for (int i=0;i<rows;i++)
		{
			credentials[i][0]=file.getData(0,i,0);
			credentials[i][1]=file.getData(0,i,1);
		}
		return credentials;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
