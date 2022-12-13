package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import nopcommerceBase.Base;
import nopcommerceUtility.Utility;

public class Listener extends Base implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+" is passed", true);
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+" is failed", true);
	
	    try {
			Utility.screenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+" is skipped", true);
	}

}
