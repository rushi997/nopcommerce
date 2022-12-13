package nopcommerceBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import nopcommerceUtility.Utility;

public class Base
{
	protected static WebDriver driver;
	public void launchNopcommerce() throws IOException
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Utility.readPropertyData("url"));
		
		Utility.wait(driver, 1000);
		
		Reporter.log("launching nopcommerce", true);
		
	}
	
	public void closeBrowser()
	{
		Utility.wait(driver, 500);
		driver.close();
		Reporter.log("closing browser", true);
	}
	

}
