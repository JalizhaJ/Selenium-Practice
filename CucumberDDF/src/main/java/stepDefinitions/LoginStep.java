/*//DDF Without Examples

package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStep {
	
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

	@Then("^User enters username and password$")
	public void user_enters_Username_and_Password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='edit-name']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='edit-pass']")).clear();
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys("fl33t");
	    
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

	@Given("^User clicks About menu$")
	public void user_clicks_About_menu() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[2]/div/section[2]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^User should be taken to About page$")
	public void user_should_be_taken_to_About_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div/aside/div/section/div[2]/div/ul/li[1]/a"));
		String text = login.getText();
		Assert.assertEquals("About Us", text);
	}	

	@Given("^User clicks Our Network menu$")
	public void user_clicks_Our_Network_menu() throws Throwable {
		driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[2]/div/section[2]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^User should be taken to Our Network page$")
	public void user_should_be_taken_to_Our_Network_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/section/div/div/div[2]/h2"));
		String text = login.getText();
		Assert.assertEquals("SHOW MEMBERSHIP BY:", text);
	}

	@Given("^User clicks Calendar menu$")
	public void user_clicks_Calendar_menu() throws Throwable {
		driver.findElement(By.xpath("/html/body/header[1]/nav/div/div[2]/div[2]/div/section[2]/ul/li[5]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^User should be taken to Events pages$")
	public void user_should_be_taken_to_Events_pages() throws Throwable {
		WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/section/div/div[1]/div[2]/div[2]/div/div/div[1]/span/a"));
		String text = login.getText();
		Assert.assertEquals("CEO Summit 2019", text);
	}
}
*/