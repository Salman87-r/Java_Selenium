package SIgnupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignuploginPagefactory {
	//Driver Initialization
	WebDriver driver;
	//Create account webelement
	@FindBy(xpath="//input[@id='email_create']")
	WebElement createaccount;
	//create button webelement
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createuttonbutton;
	//WebElement for user id
	@FindBy(xpath="//input[@id='email']")
	WebElement loginuser;
	//WebElement for password
	@FindBy(xpath=" //input[@id='passwd']")
	WebElement loginpass;
	//WebElement for login button
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement loginbutton;

	//Constructor for this page
	public SignuploginPagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Generic function to Click element for this class
	public void clickElement(WebElement a) {
		a.click();
	}
	//Sendkeys function 
	public void sendkeys(WebElement a) {
		a.sendKeys();
	}
}
