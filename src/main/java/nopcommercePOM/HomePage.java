package nopcommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import nopcommerceUtility.Utility;

public class HomePage
{
	@FindBy(xpath = "//a[text()='Register']") private WebElement registerButton;
	
	@FindBy(xpath = "//a[text()='Log in']") private WebElement signInButton;
	
	@FindBy(xpath = "//span[text()='Wishlist']") private WebElement wishlistButton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")private WebElement shoppingCartButton;
	
	@FindBy(xpath = "(//a[text()='Computers '])[1]")private WebElement computerButton;
	
	@FindBy(xpath = "(//a[text()='Books '])[1]")private WebElement booksButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterButton(WebDriver driver)
	{
		registerButton.click();
		
		Utility.wait(driver, 500);
		Reporter.log("clicking on register button", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickSignInButton(WebDriver driver)
	{
		signInButton.click();
		Utility.wait(driver, 500);
		Reporter.log("clicking on signIn button", true);
	}
	
	public void clickShoppingCartButton(WebDriver driver)
	{
		shoppingCartButton.click();
		Utility.wait(driver, 500);
		Reporter.log("clicking on shoppingCartButton button", true);
	}
	
	public void clickComputerButton(WebDriver driver)
	{
		computerButton.click();
		Utility.wait(driver, 500);
		Reporter.log("clicking on computerButton button", true);
	}
	
	public void ClickBooksButton(WebDriver driver)
	{
		booksButton.click();
		Utility.wait(driver, 500);
		Reporter.log("clicking on booksButton button", true);
	}
	

}
