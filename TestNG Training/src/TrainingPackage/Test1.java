/*package TrainingPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test1 {

	public String baseURL="http://newtours.demoaut.com/";
	public WebDriver driver;
	String driverpath="C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe";
		
	
  @Test
  public void f() {
	System.setProperty("webdriver.gecko.driver", driverpath);
	driver=new FirefoxDriver();
	driver.get(baseURL);
	String expectedTitle="Welcome: Mercury Tours";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	driver.close();
  }
}
*/