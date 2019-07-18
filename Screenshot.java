package Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.bmwusa.com/");
Thread.sleep(1000);
File ss = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(ss, new File("C://Users//Jaliza//Desktop//Selenium//Results//Homepage.png"));
driver.close();
	}
}