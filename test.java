package Test;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class test {
 
 
	public static void main(String[] args) throws Exception {
 
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://54.89.207.24/");
	    Thread.sleep(5000);
	    WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button[3]"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[7]/a")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jnirmalrajan+2@fleetstudio.com");
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("fleet");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section/div/form/div[2]/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='react-tabs-2']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='react-tabs-4']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='react-tabs-6']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='react-tabs-8']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	  
//driver.close();
 
 
}
}