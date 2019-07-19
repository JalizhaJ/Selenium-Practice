package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Jaliza//Desktop//Selenium//Geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL="http://demo.guru99.com/selenium/guru99home/megaupload/upload.html";
		Thread.sleep(2000);
		
		driver.get(baseURL);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\newhtml.html");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}

}


//No site to test this script