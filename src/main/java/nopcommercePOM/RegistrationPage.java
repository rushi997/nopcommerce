package nopcommercePOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;



public class RegistrationPage 
{
	@FindBy(id="gender-male")private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")private WebElement firstNameField;
	
	@FindBy(id="LastName")private WebElement lastNameField;
	
	@FindBy(name="DateOfBirthDay")private WebElement dayDropDown;
	
	@FindBy(name="DateOfBirthMonth")private WebElement monthPick;
	
	@FindBy(name="DateOfBirthYear")private WebElement yearPick;
	
	@FindBy(id="Email")private WebElement emailField;
	
	@FindBy(id="Company")private WebElement companyField;
	
	@FindBy(id="Newsletter")private WebElement newsLetterCheckBox;
	
	@FindBy(id="Password")private WebElement passwordField;
	
	@FindBy(id="ConfirmPassword")private WebElement confirmPasswordField;
	
	@FindBy(id="register-button")private WebElement registerButton1;
	
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectGenderMale()
	{
		maleRadioButton.click();
		Reporter.log("clicking on male radio button", true);
	}
	
	public void selectGenderFemale()
	{
		femaleRadioButton.click();
		Reporter.log("clicking on female radio button", true);
	}
	
	public void enterFirstName(String firstname) throws EncryptedDocumentException, IOException
	{
		firstNameField.sendKeys(firstname);
		
		Reporter.log("sending firstname value", true);
	}
	
	public void enterLastName(String lastname) throws EncryptedDocumentException, IOException
	{
		lastNameField.sendKeys(lastname);
		
		Reporter.log("sending lastnamename value", true);
	}
	
	public void enterMail(String mail)
	{
		emailField.sendKeys(mail);
		Reporter.log("sending mail value", true);
	}
	
	public void selectDay(String dayValue)
	{
		Select s=new Select(dayDropDown);
		
		s.selectByValue(dayValue);
		
		Reporter.log("selecting date"+dayValue, true);
	}
	
	public void selectMonth(String monthValue)
	{
		Select s=new Select(monthPick);
		
		s.selectByValue(monthValue);
		
		Reporter.log("selecting month"+monthValue, true);
	}

	public void selectYear(String yeartext)
	{
		Select s=new Select(yearPick);
		
		s.selectByValue(yeartext);
		
		Reporter.log("selecting month"+yeartext, true);
	}
}
