package SIgnupPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHome {
	//WebDriver reference 
	WebDriver driver;
	//Signup button locator in home page
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement Signupbutton;
	//Constructor of the pagefactory class
	public PageFactoryHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Ganeric function to Click element for this class
	public void clickElement(WebElement a) {
		a.click();
	}
}
