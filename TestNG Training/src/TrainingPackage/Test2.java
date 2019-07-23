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
	
	@BeforeMethod
public void beforeMethod() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	Thread.sleep(3000);
	}  
	
	
	  
  @Test
  public void a() throws InterruptedException {
	  //String expectedTitle1="Welcome: Mercury Tours";
		String actualTitle1=driver.getTitle();
		//System.out.println(actualTitle1);
		Assert.assertEquals(actualTitle1, "Welcome: Mercury", "Not matched");
		} 
    
  @Test
  public void b() throws InterruptedException {
	driver.findElement(By.linkText("SUPPORT")).click();
	Thread.sleep(2000);
	//String expectedTitle2="Under Construction: Mercury Tours";
	String actualTitle2=driver.getTitle();
	//System.out.println(actualTitle2);
	Assert.assertEquals(actualTitle2, "Under Construction: Mercury Tours", "Not matched");
    }
  
 

  @AfterMethod
  public void afterMethod() {
	driver.quit();
  }
}

