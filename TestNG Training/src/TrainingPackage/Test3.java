package TrainingPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test3 {
	public String baseURL="http://newtours.demoaut.com/";
	public WebDriver driver;
	String driverpath="C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe";
  @Test
  public void SS() throws IOException {
	  System.setProperty("webdriver.gecko.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(baseURL);
		this.takess(driver,"C://Users//Jaliza//Desktop//Selenium//Results//Homepage.png");
		
	  
  }
private void takess(WebDriver driver2, String filepath) throws IOException {
	// TODO Auto-generated method stub
	File source = (File) ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
	File dest=new File(filepath);
	FileUtils.copyFile(source, dest);	
}
}
