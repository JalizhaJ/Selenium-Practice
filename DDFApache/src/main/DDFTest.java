package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excel.utility.Xls_Reader;

public class DDFTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://academynet.com/");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
	    
	    Xls_Reader reader = new Xls_Reader("C:\\Users\\Jaliza\\workspace\\Practice\\DDFApache\\src\\testData\\Report.xlsx");

	    String username = reader.getCellData("TestData", "Username", 2);
	    System.out.println(username);
	    
	    String password = reader.getCellData("TestData", "Password", 2);
	    System.out.println(password);
	    
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
