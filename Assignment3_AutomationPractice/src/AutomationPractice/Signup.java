package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	//Referance of the classes and driver
	WebDriver driver;
	HomePageAutomation Homepagepbj;
	T_Shirt TShirt;
	//Element for the heading of the signup page
	@FindBy(xpath="//h1[contains(text(),'Authentication')]")
	WebElement headingsignin;
	//Element for the login email
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	//Element for the login password
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwordlogin;
	//Element for the login button
	@FindBy(xpath="//i[@class='icon-lock left']")
	WebElement login;
	//WebElement for the error masg
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	WebElement errormasg;
	//WebElement for the create account field
	@FindBy(xpath="//input[@id='email_create']")
	WebElement createaccemai;
	//WebElement for the create account button
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createaccount;
	//WebElement for the title male
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	WebElement malerb;
	//WebElement for the title female
	@FindBy(xpath="//div[@id='uniform-id_gender2']")
	WebElement femalerb;
	//WebElement for the input first name
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement fname;
	//WebElement for the input last name
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lname;
	//WebElement for the input password
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwordcreateaccount;
	//WebElement for the days dropdown
	@FindBy(xpath="//select[@id='days']")
	WebElement days;
	//WebElement for the month dropdown
	@FindBy(xpath="//select[@id='months']")
	WebElement month;
	//WebElement for the year dropdown
	@FindBy(xpath="//select[@id='years']")
	WebElement year;
	//WebElement for the input addresss
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	//WebElement for the input city
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	//WebElement for the input postcode
	@FindBy(xpath="//input[@id='postcode']")
	WebElement zip;
	//WebElement for the input country
	@FindBy(xpath="//select[@id='id_state']")
	WebElement country;
	//WebElement for the input mobile number
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobileno;
	//WebElement for the button registration
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement registerbutton;
	//Constructor for signup page
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Function to get main heading of sign up page
	public String getheadingsignin() {
		return headingsignin.getText();
	} 
	//Function to send keys to email login
	public void enteremail() {
		email.sendKeys("b8@gmail.com");
	}
	//Function to send keys to password login
	public void enterpass() {
		passwordlogin.sendKeys("12345");
	}
	//Function to click sign up
	public void clicksignup() {
		login.click();
	}
	//Function to get text of invalid email
	public String gettext() {
		return errormasg.getText();
	} 
	//Function to send keys to email create account
	public void entercreateemail() {
		createaccemai.sendKeys("b9@gmail.com");
	}
	//Function to click button
	public void clickcreateaccount() {
		createaccount.click();
	}
	//Function to click male button
	public void clickradiotitle() {
		malerb.click();
	}
	//Function to send keys to first name
	public void enterFname() {
		fname.sendKeys("AAA");
	}
	//Function to send keys to last name
	public void enterlname() {
		lname.sendKeys("AbAA");
	}
	//Function to send keys to password
	public void enterpasswordcreate() {
		passwordcreateaccount.sendKeys("12345");
	}
	//Function to send keys to days
	public void enterday() {
        Select sel = new  Select(days);
        sel.selectByValue("21");
	}
	//Function to send keys to month
	public void entermonth() {
        Select sel = new  Select(month);
        sel.selectByIndex(7);
	}
	//Function to send keys to year
	public void enteryear() {
        Select sel = new  Select(year);
        sel.selectByValue("1997");
	}
	//Function to send keys to address
	public void enteraddress() {
		address.sendKeys("abc");
	}
	//Function to send keys to city//Function to send keys to address
	public void entercity() {
		city.sendKeys("abc");
	}
	//Function to send keys to zip
	public void enterzip() {
		zip.sendKeys("54000");
	}
	//Function to send keys to country
	public void entercountry() {
        Select sel = new  Select(country);
        sel.selectByIndex(5);
}	
	//Function to send keys to mobile
	public void entermobile() {
      mobileno.sendKeys("033333333333");
}	//Function to click register
	public void clickregister() {
		registerbutton.click();
	}
}
