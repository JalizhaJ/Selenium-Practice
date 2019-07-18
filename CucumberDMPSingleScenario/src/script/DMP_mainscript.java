package script;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.driver;

public class DMP_mainscript extends driver {

	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://54.89.207.24/");
		 driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		 Thread.sleep(7000);
	}
	
		
	public void clicklogin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[7]/a")).click();
	    Thread.sleep(7000);
	}
	
	public void entercredentials() throws Exception {
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("jnirmalrajan+2@fleetstudio.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("fleet123");
	    Thread.sleep(5000);
	}
	public void homepage() throws Exception {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	}
	public void deploytags() throws Exception {
		driver.findElement(By.id("react-tabs-2")).click();
	    Thread.sleep(3000);
	}
	public void accountinfo() throws Exception {
		driver.findElement(By.id("react-tabs-4")).click();
	    Thread.sleep(3000);
	}
	public void companyinfo() throws Exception {
		driver.findElement(By.id("react-tabs-6")).click();
	    Thread.sleep(3000);
	}
	public void billinginfo() throws Exception {
		driver.findElement(By.id("react-tabs-8")).click();
	    Thread.sleep(3000);
	}
	public void clicklogo() throws Exception {
		driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	    Thread.sleep(3000);
	}
	public void viewmenus() throws Exception {
		driver.findElement(By.xpath("//*[@id='user_profile']")).click();
	    Thread.sleep(3000);
	}
	public void clickMySegments() throws Exception {
		driver.findElement(By.xpath("(//a[contains(text(),'My Segments')])[2]")).click();
		Thread.sleep(5000);
	}
	public void viewMySegments() throws Exception {
		System.out.println("User is in My Segments tab");
	    Thread.sleep(3000);
	}
	public void clickDeployTags() throws Exception {
		//driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Deploy Tags')])[2]")).click();
		Thread.sleep(3000);
	}
	public void viewDeployTags() throws Exception {
		System.out.println("User is in Deploy Tags tab");
	    Thread.sleep(3000);
	}
	public void clickAccInfo() throws Exception {
		//driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Account Information')])[2]")).click();
	    Thread.sleep(3000);
	}
	public void viewAccInfo() throws Exception {
		System.out.println("User is in Acc Info tab");
	    Thread.sleep(3000);
	}
	public void clickCompInfo() throws Exception {
		//driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Company Information')])[2]")).click();
	    Thread.sleep(3000);
	}
	public void viewCompInfo() throws Exception {
		System.out.println("User is in Company Info tab");
	    Thread.sleep(3000);
	}
	public void clickBillingInfo() throws Exception {
		//driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Billing Information')])[2]")).click();
	    Thread.sleep(3000);
	}
	public void viewBillingInfo() throws Exception {
		System.out.println("User is in Billing Info tab");
	    Thread.sleep(3000);
	}
	public void clickMySegmentstab() throws Exception {
		driver.findElement(By.id("react-tabs-0")).click();
	    Thread.sleep(5000);
	}
	public void clickfilterslink() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div/div[3]/a")).click();
	    Thread.sleep(5000);
	}
	public void viewfilterspage() throws Exception {
		System.out.println("User is in Filters page");
	    Thread.sleep(5000);
	}
	public void clicktoplogo() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/a/img")).click();
	    Thread.sleep(5000);
	}
	public void clickzerorecordsegment() throws Exception {
		driver.findElement(By.xpath("//div[@id='react-tabs-11']/div/div[2]/div/div[2]/div/p")).click();
	    Thread.sleep(5000);
	}
	public void clicknumrecordsegment() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[8]")).click();
	    Thread.sleep(5000);
	}
	public void clickDeployTagstab() throws Exception {
		driver.findElement(By.id("react-tabs-32")).click();
	    Thread.sleep(5000);
	}
	public void clickGoodharvestlink() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/p/a")).click();
		driver.switchTo().window(tabs.get(1));
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
	}
	public void viewGoodharvestpage () throws Exception {
		System.out.println("User is in Good Harvest page");
	    Thread.sleep(3000);
	}
	public void clickGeneralParameterslink() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/a[1]")).click();
		driver.switchTo().window(tabs.get(1));
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
	}
	public void viewGeneralParameterspage () throws Exception {
		System.out.println("User is in General Parameters page");
	    Thread.sleep(3000);
	}
	public void clickTrackingSpecificEventslink() throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/a[2]")).click();
		driver.switchTo().window(tabs.get(1));
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
	}
	public void viewTrackingSpecificEventspage () throws Exception {
		System.out.println("User is in Tracking Specific Events page");
	    Thread.sleep(3000);
	}
	public void clickAccInfotab() throws Exception {
		driver.findElement(By.id("react-tabs-34")).click();
	    Thread.sleep(5000);
	}
	public void enterPassword() throws Exception {
		driver.findElement(By.id("user_password")).click();
	    //driver.findElement(By.id("user_password")).clear();
	    driver.findElement(By.id("user_password")).sendKeys("fleet");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='react-tabs-35']/div/div")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("confirm_password")).click();
	    //driver.findElement(By.id("confirm_password")).clear();
	    driver.findElement(By.id("confirm_password")).sendKeys("fleet");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='react-tabs-35']/div/div")).click();
	    Thread.sleep(5000);
	}
	public void clickSaveInAccntTab() throws Exception {
		driver.findElement(By.xpath("//div[@id='react-tabs-35']/div/div/form/div[5]/button")).click();
	    Thread.sleep(5000);
	}
	public void viewSuccessMessage() throws Exception {
		System.out.println("Changes updated successfully");
	    Thread.sleep(3000);	
	}
	public void clickCompInfotab() throws Exception {
		driver.findElement(By.id("react-tabs-36")).click();
	    Thread.sleep(5000);
	}
	public void selectdropdown() throws Exception {
		driver.findElement(By.xpath("//*[@id='company-input']")).click();
	    Thread.sleep(5000);
	    new Select(driver.findElement(By.xpath("//*[@id='temp']"))).selectByVisibleText("FS Tech");
	    driver.findElement(By.xpath("//option[@value='FS Tech']")).click();
	    Thread.sleep(5000);
	}
	public void clickSaveInCompTab() throws Exception {
		driver.findElement(By.xpath("//div[@id='react-tabs-37']/div/div/form/div[6]/button")).click();
	    Thread.sleep(5000);
	}
	public void clickBillInfotab() throws Exception {
		driver.findElement(By.id("react-tabs-38")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[2]/div/label")).click();
		Thread.sleep(5000);
		System.out.println("Only Company details should be auto filled in the form");
	    Thread.sleep(5000);
	}
	public void updatezip() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).clear();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).sendKeys("10015");
	    Thread.sleep(5000);
	}
	public void clickSaveInBillTab() throws Exception {
		driver.findElement(By.xpath("//div[@id='react-tabs-39']/div/div/section/div[2]/form/div[2]/button")).click();
	    Thread.sleep(5000);
	}
}