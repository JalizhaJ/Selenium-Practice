package TrainingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test4 {
	public String baseURL="http://demo.opensourcecms.com/wordpress/wp-login.php";
	public WebDriver driver;
	String driverpath="C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe";
	
  @Test
  public void opensite() {
	  System.setProperty("webdriver.gecko.driver",driverpath );
		driver=new FirefoxDriver();
		driver.get(baseURL);
  }
  
  @Test
  public void login() {
	  driver.findElement(By.xpath("//*[@id='user_login']"));
  }
}
