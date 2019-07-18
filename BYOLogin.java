package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BYOLogin {

	    public static void main(String[] args) throws AWTException, InterruptedException {

	        //setup web driver
	    	System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
	        WebDriver driver = new FirefoxDriver(); 	    
	        driver.get("http://www.qa.bmwusa.spies.ws/content/bmwusa/byo-test.html");
	        Thread.sleep(1000);
	            Robot rb = new Robot();
	            StringSelection username = new StringSelection("qa");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
	            rb.keyPress(KeyEvent.VK_CONTROL);
	            rb.keyPress(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_CONTROL);

	            //tab to password entry field
	            rb.keyPress(KeyEvent.VK_TAB);
	            rb.keyRelease(KeyEvent.VK_TAB);
	            Thread.sleep(2000);

	            //Enter password by ctrl-v
	            StringSelection pwd = new StringSelection("8Pa9&");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
	            rb.keyPress(KeyEvent.VK_CONTROL);
	            rb.keyPress(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_CONTROL);
	            Thread.sleep(2000);
	            //press enter
	            rb.keyPress(KeyEvent.VK_ENTER);
	            rb.keyRelease(KeyEvent.VK_ENTER);

	            //wait
	            Thread.sleep(5000);
	        }                        
	    }    