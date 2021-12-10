package co.PractiseSessions;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotRobot {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Robot robot = new Robot();
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("d:\\Robot.png");
		ImageIO.write(bufferedImage, "png", imageFile);
		Thread.sleep(3000);
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			
		}
		
	}

}
