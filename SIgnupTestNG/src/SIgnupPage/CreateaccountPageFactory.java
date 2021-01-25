package SIgnupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateaccountPageFactory {
	//Driver referance 
	WebDriver driver;
	//WebElement for the registration form
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	WebElement TitleMr;
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement TitleMrs;
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	@FindBy(xpath="//select[@id='days']")
	WebElement day;
	@FindBy(xpath="//select[@id='months']")
	WebElement month;
	@FindBy(xpath="//select[@id='years']")
	WebElement year;
	@FindBy(xpath=" //input[@id='address1']")
	WebElement Address;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	@FindBy(xpath="//input[@id='postcode']")
	WebElement zip;
	@FindBy(xpath="//select[@id='id_country']")
	WebElement Country;
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobilephone;
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement Register;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/h1[1]")
	WebElement nextpage;
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement signout;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement Signupbutton;
	public CreateaccountPageFactory(WebDriver driver) {
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
	public String getdata() {
		return nextpage.getText();
	}
}
