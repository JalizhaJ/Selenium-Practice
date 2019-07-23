package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL="http://newtours.demoaut.com/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		
		driver.get(baseURL);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}		
	
}