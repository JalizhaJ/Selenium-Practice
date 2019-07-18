package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.bmwusa.com/");
Thread.sleep(1000);
WebElement element = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/bmw-simple-slideshow/div/div/div/div/div[1]/div/picture/img"));
System.out.println(element.getAttribute("src"));
WebElement linkdata=driver.findElement(By.className("fma__heading"));
System.out.println(linkdata.getText());
driver.close();
}
}