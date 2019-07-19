package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL="http://newtours.demoaut.com/";
		Thread.sleep(2000);
		
		driver.get(baseURL);
		
		String a = driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();
		System.out.println(a);
		
		driver.close();
	}

}
