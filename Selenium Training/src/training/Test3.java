package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL="http://newtours.demoaut.com/";
		driver.get(baseURL);
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		
		Select Country=new Select(driver.findElement(By.name("fromPort")));
		//Country.selectByVisibleText("Acapulco");  For multiple select options, use both steps
		Country.selectByIndex(2);
	}

}
