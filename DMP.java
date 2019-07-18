package Test;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DMP {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Jaliza/Desktop/Selenium/chromedriver_win32/Newchromedriver.exe");
	driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    Thread.sleep(5000);
  }

  @Test
  public void testDMP() throws Exception {
    driver.get("http://54.89.207.24/");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[7]/a")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("jnirmalrajan+2@fleetstudio.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("fleet");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("react-tabs-2")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("react-tabs-4")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("react-tabs-6")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("react-tabs-8")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//a[contains(text(),'My Segments')])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Deploy Tags')])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Account Information')])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Company Information')])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Billing Information')])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("react-tabs-0")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div/div[3]/a")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@alt='Good Harvest Co']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='react-tabs-11']/div/div[2]/div/div[2]/div/p")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@alt='Good Harvest Co']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='react-tabs-21']/div/div[2]/div/div[2]/div[2]/h5")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@alt='Good Harvest Co']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("react-tabs-32")).click();
    Thread.sleep(5000);
    
    /*driver.findElement(By.linkText("developer.goodharvest.co")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.linkText("General Parameters")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Tracking Specific Events")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
    
    driver.findElement(By.id("react-tabs-34")).click();
    Thread.sleep(5000);
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
    driver.findElement(By.xpath("//div[@id='react-tabs-35']/div/div/form/div[5]/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("react-tabs-36")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='company-input']")).click();
    Thread.sleep(5000);
    new Select(driver.findElement(By.xpath("//*[@id='temp']"))).selectByVisibleText("FS Tech");
    driver.findElement(By.xpath("//option[@value='FS Tech']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='react-tabs-37']/div/div/form/div[6]/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("react-tabs-38")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/section/div[2]/form/div[1]/div[10]/input")).sendKeys("10015");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='react-tabs-39']/div/div/section/div[2]/form/div[2]/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("react-tabs-30")).click();
    Thread.sleep(5000);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
