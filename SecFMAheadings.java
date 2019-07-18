package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SecFMAheadings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.bmwusa.com/");
Thread.sleep(1000);
WebElement heading = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div[1]/div[2]/div/h3"));
List<WebElement> sec =driver.findElements(By.className("fma__heading"));
for (int i = 1; i<=sec.size(); i=i+1)
{
System.out.println(sec.get(i).getText());
}
driver.close();
	}
}