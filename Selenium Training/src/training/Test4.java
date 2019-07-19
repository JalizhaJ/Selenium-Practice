package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String underConsTitle = "Under Construction: Mercury Tours";
		String baseURL="http://newtours.demoaut.com/";
		Thread.sleep(2000);
		
		driver.get(baseURL);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
	}

}
