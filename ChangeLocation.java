package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChangeLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("http://www.bmwusa.com");
Thread.sleep(1000);
WebElement location=driver.findElement(By.xpath("html/body/div[1]/bmw-template-switch/header/section[1]/div/div/ul/li[2]/button"));
location.click();
Thread.sleep(1000);
WebElement zip=driver.findElement(By.xpath("html/body/div[1]/bmw-template-switch/header/section[1]/div/div/div[1]/form/div/div/input"));
zip.sendKeys("10013");
WebElement submit=driver.findElement(By.xpath("html/body/div[1]/bmw-template-switch/header/section[1]/div/div/div[1]/form/input"));
submit.click();
driver.close();	
	}
}
