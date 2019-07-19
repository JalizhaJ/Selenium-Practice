package training;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
		String baseURL="http://www.guru99.com/software-testing.html";
		
		driver.get(baseURL);
		Thread.sleep(4000);
		
		/** Mouse Operation **/
		WebElement link_Home = driver.findElement(By.linkText("Selenium"));
		Actions a = new Actions(driver);
        Action mouseOverHome = a.moveToElement(link_Home).build();
		mouseOverHome.perform();
        
		/** Keyboard Operation **/
        //WebElement username = driver.findElement(By.name("userName"));
        //Thread.sleep(5000);
		//Actions b = new Actions(driver);
        //Action multipleactions = b.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "tutorial").keyUp(username, Keys.SHIFT).doubleClick(username).contextClick().build();
        //multipleactions.perform();
       
		}
		
	}

//Actions does not works on FF so used IE - Go to internet options>>Security, click on:'Reset all zones to default level and after that, ensure that the 'Enable protected mode' checkbox is ticked for all the four zones.