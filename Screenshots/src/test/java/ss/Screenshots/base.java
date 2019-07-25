package ss.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	
	public static void openbrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://academynet.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='edit-name']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='edit-pass']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
		Thread.sleep(2000);
	}
	
	public void fail(String testMethod){
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			//for single screenshot
			//FileUtils.copyFile(srcFile, new File("C://Users/Jaliza/workspace/Screenshots/SS/fail.jpg"));
			//for multiple screenshot
			FileUtils.copyFile(srcFile, new File("C://Users/Jaliza/workspace/Screenshots/SS/"+testMethod+"_"+".jpg"));
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
