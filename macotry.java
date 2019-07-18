package Test;
 
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 

public class macotry {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.ie.driver","C:/Users/Jaliza/Desktop/Selenium/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("http://www.bmwusa.com/centers.html");
Thread.sleep(1000);

//
String linkdata=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div[1]/div[2]/div/h3")).getText();
Thread.sleep(1000);
System.out.println(linkdata);
	
//
String FilePath = "C:/Users/Jaliza/Desktop/Selenium/Test Files/MACO_test.xls";
FileInputStream fs = new FileInputStream(FilePath);
Workbook wb = Workbook.getWorkbook(fs);
	
// TO get the access to the sheet
Sheet sh = wb.getSheet("Centers");
// To get the number of rows present in sheet
		String exceldata=sh.getCell(5, 16).getContents();
		System.out.println(exceldata);
if (linkdata.equals(exceldata))
		{
	System.out.println("TRUE");
}
else
{
	System.out.println("FALSE");
}
	}
}