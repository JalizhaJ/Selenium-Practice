package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExtractLinks {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.bmwusa.com/");
Thread.sleep(1000);
List<WebElement> links =driver.findElements(By.tagName("a"));
System.out.println(links.size());
for (int i = 1; i<=links.size(); i=i+1)
{
System.out.println(links.get(i).getText());
}
driver.close();
}
}