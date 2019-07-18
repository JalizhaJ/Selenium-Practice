//TestNG

package TrainingPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test2 {
	  
	public static WebDriver driver;
	
@BeforeTest
public void beforeTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	Thread.sleep(3000);
	}  
	
@BeforeMethod
public void beforeMethod() {
	String expectedTitle1="Welcome: Mercury Tours";
	String actualTitle1=driver.getTitle();
	System.out.println(actualTitle1);
	//Assert.assertEquals(expectedTitle, actualTitle);
	}
	  
  @Test
  public void a() throws InterruptedException {
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(2000);
	String expectedTitle2="Register: Mercury Tours";
	String actualTitle2=driver.getTitle();
	System.out.println(actualTitle2);
	//Assert.assertEquals(expectedTitle, actualTitle);  
    }
  @Test
  public void b() throws InterruptedException {
	driver.findElement(By.linkText("SUPPORT")).click();
	Thread.sleep(2000);
	String expectedTitle3="Under Construction: Mercury Tours";
	String actualTitle3=driver.getTitle();
	System.out.println(actualTitle3);
	//Assert.assertEquals(expectedTitle, actualTitle);  
    }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	driver.quit();
  }
}

