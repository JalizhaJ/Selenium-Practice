package Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Brokenlinks {
	public static int brokenLinks;
	public static int validLinks;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("www.yahoo.com");
		
	    List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		System.out.println("size:" + allURLs.size());
 
		// The below code will find broken links and check their status.
		//
		validLinks = brokenLinks = 0;
		for (int iter = 0; iter < allURLs.size(); iter++) {
			System.out.println(allURLs.get(iter).getAttribute("href"));
			int statusCode = 0;
			try {
				statusCode = verifyURLStatus(allURLs.get(iter).getAttribute("href"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (statusCode == 404) {
				++brokenLinks;
			} else {
				++validLinks;
			}
		}
 
		System.out.println("Total broken links found# " + brokenLinks);
		System.out.println("Total valid links found#" + validLinks);
 
	}
	private static int verifyURLStatus(String attribute) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	