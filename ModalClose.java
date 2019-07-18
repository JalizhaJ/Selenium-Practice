package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ModalClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("http://www.bmwusa.com");
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/bmw-template-switch/header/section[2]/div[1]/div[1]/ul[1]/li[2]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/div[1]/div/div[1]/div[7]/a")).click();
Thread.sleep(1000);
driver.findElement(By.id("byo-options-modal-closer")).click();

	}

}
