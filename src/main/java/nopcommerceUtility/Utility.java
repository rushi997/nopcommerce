package nopcommerceUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	//common methods like screenshot,excel read,property file read,scroll,wait
	
	
	public static void screenShot(WebDriver driver,String name) throws IOException
	{
		File tempsc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\rushi\\OneDrive\\Desktop\\software testing\\selenium screenshots\\"+name+".png");
		
		FileHandler.copy(tempsc, dest);
		
		Reporter.log("taking screenshot", true);
	}
	
	
	public static String readExcelData(int row,int cell) throws EncryptedDocumentException, IOException
	{
        File xl=new File("C:\\Users\\rushi\\OneDrive\\Desktop\\software testing\\AUTOMATION +SELENIUM\\nopcom.xlsx");
		
		String value = WorkbookFactory.create(xl).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
		
		Reporter.log("taking value from Xl "+value, true);
		return value;
		
	}
	
	public static String readPropertyData(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\nopcommerce\\nopCom.properties");
		
		p.load(f);
		
		String value = p.getProperty(key);
		Reporter.log("reading value from Property file "+value, true);
		return value;
	}
	
	public static void wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for "+waittime+" millis", true);
	}
	
	public static void scroll(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		
		act.scrollToElement(element).perform();
		
		Reporter.log("scrolling to "+element, true);
	}
	
	

}
