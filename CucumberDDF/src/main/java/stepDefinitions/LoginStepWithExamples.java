/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepWithExamples {
	
	public static WebDriver driver;
	WebElement login;
	
	@Given("^User enters the Academy URL$")
	public void user_enters_the_Academy_URL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://academynet.com/");
		Thread.sleep(3000);
	    
	}

	@When("^User clicks Login button$")
	public void user_clicks_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_Username_and_Password(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='edit-name']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='edit-pass']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys(password);
	    
	}

	@Then("^User clicks Submit button$")
	public void user_clicks_Submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^User should be taken to homepage$")
	public void user_should_be_taken_to_homepage() throws InterruptedException {
		login = driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[1]/ul/li[1]/a"));
		String text = login.getText();
		Assert.assertEquals("MY ACCOUNT", text);
		Thread.sleep(5000);
	    
	}
	
	@Then("^Closes the browser$")
	public void closes_the_browser() throws InterruptedException {
		driver.quit();
	}

}
*/