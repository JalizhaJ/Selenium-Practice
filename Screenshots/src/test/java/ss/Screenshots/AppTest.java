package ss.Screenshots;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(CustomListener.class)

public class AppTest extends base

{

	@BeforeMethod()
	public void setup() throws InterruptedException{
		System.out.println("Open");
		openbrowser();
	}

	@Test
	public void screenshots1(){
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void screenshots2(){
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void screenshots3(){
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod()
	public void teardown(){
		System.out.println("Close");
		driver.quit();
	}

}
