package main;

import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import excel.utility.Xls_Reader;

public class Parameterization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://academynet.com/");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Jaliza\\workspace\\Practice\\DDFApache\\src\\testData\\Report.xlsx");
		int rowCount = reader.getRowCount("TestData");
		
		reader.addColumn("TestData", "Status");
		
		
		for (int rowNum=2; rowNum<=rowCount; rowNum++)
		{
			String username = reader.getCellData("TestData", "Username", rowNum);
			System.out.println(username);
			
			String password = reader.getCellData("TestData", "Password", rowNum);
			System.out.println(password);
			
		
		
		driver.findElement(By.xpath("//*[@id='edit-name']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='edit-pass']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[1]/a"));
		String text = login.getText();
		if (text.equals("MY ACCOUNT"))
		{
			
			reader.setCellData("TestData", "Status", rowNum, "Pass");
			
			driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[1]/ul/li[5]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[3]/a")).click();
			Thread.sleep(3000);
	
		}
		else
		{
			
			reader.setCellData("TestData", "Status", rowNum, "Fail");
			
			driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[3]/a")).click();
			Thread.sleep(3000);
			
		}
	}
		
	}

}
