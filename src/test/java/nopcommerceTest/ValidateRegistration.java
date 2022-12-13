package nopcommerceTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nopcommerceBase.Base;
import nopcommercePOM.HomePage;
import nopcommercePOM.RegistrationPage;
import nopcommerceUtility.Utility;
@Listeners(listener.Listener.class)
public class ValidateRegistration extends Base
{
	
	HomePage home;
	RegistrationPage regist;
 
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		launchNopcommerce();
		
		home = new HomePage(driver);
		regist=new RegistrationPage(driver);
	}
	
	
	@BeforeMethod
	public void clickingOnRegistration() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.clickRegisterButton(driver);
		Thread.sleep(500);
		regist.selectGenderMale();
		regist.enterFirstName(Utility.readExcelData(0, 0));
		regist.enterLastName(Utility.readExcelData(0, 1));
		
		regist.selectDay("1");
		
		regist.selectMonth("1");
		
		regist.selectYear("1997");
		
		regist.enterMail(Utility.readExcelData(0, 2));
		
		
	
	}
	
	@Test
  public void validateRegistrationModule() 
  {
  }
	
	
	
	@AfterMethod
	public void logOutFromNopcommerce()
	{
		//logOutFromNopcommerce();
	}
	
	@AfterClass
	public void close()
	{
		//closeBrowser();
	}
	
	
	
}
