package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	//Referance of the classes
	static WebDriver driver;
	HomePageAutomation Homepagepbj;
	T_Shirt TShirt;
	//Address page heading
	@FindBy(xpath="//span[contains(text(),'Addresses')]")
	WebElement headingaddresspage;
	//Webelement to button check to proceed
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement proceedbat;
	//WebElement for the billing address
	@FindBy(xpath="//ul[@id='address_delivery']")
	WebElement billaddress;
	//WebElement for the invoice address
	@FindBy(xpath="//ul[@id='address_delivery']")
	WebElement invoiceaddress;
	//WebElement for the dilvery charges
	@FindBy(xpath="//div[contains(text(),'$2.00')]")
	WebElement dilverycharges;
	//WebElement for the check box
	@FindBy(xpath="//input[@id='cgv']")
	WebElement checkboxpage;
	//WebElement for the button check to proceed
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement nextpage;
	//Constructor of the class
	public Address(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Heading of the address page
	public String getaddresshead() {
		return headingaddresspage.getText();
	}
	//click to proceed to payment
	public void clickprobutn() {
		proceedbat.click();
	}
	//Function to find  address 
	public String getbilladdress() {
		return billaddress.getText();
	}
	//Function to find billing address
	public String getinvoiceaddress() {
		return invoiceaddress.getText();
	}
	//Function to find shipping charges
	public String getShippingprice() {
		return dilverycharges.getText();
	}
	//Function to click check box
	public void clickcheckbox() {
		checkboxpage.click();
	}
	//Function to click payment
	public void clicknextpage() {
		nextpage.click();
	}
	
}
