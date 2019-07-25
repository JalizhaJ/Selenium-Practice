package TrainingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaTestNG {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void logintest(String browser, String url, String username, String password) throws InterruptedException{
	
		if(browser.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jaliza/Desktop/Selenium/Geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
			
		}
		
	    driver.get(url);
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='edit-name']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='edit-pass']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
		Thread.sleep(2000);
	}
	
	
	

}
