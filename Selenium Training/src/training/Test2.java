package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Open Mercury Tours site
		//Type tutorial in Usename and clear it
		//Click Register here and Click Sign on
		//Enter UN and PWD and submit
		//Choose the radio button - business
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL="http://newtours.demoaut.com/";
		driver.get(baseURL);
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).clear();
		
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[value=Business]")).click();
		Thread.sleep(2000);
		
		driver.close();
		System.exit(0);
		
		
		
	}

}
