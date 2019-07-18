package Test;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

   public static void main(String[] args) {

   System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.bmwusa.com");
      try {
          Thread.sleep(6000);
      } catch(InterruptedException ex) {
          System.out.println(ex.getMessage());
      }
      driver.close();
      driver.quit();
   }
}