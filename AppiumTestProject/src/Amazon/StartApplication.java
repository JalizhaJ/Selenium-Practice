package Amazon;
 
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class StartApplication {
 
		private static AndroidDriver driver;
		public static void main(String[] args) {
			
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "OPPO A57");
			caps.setCapability("udid", "1a45d366"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "6.0");
			caps.setCapability("appPackage", "com.android.vending");
			caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
			caps.setCapability("noReset", "true");
			
			//Instantiate Appium Driver
			try {
					AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
	}
 
}