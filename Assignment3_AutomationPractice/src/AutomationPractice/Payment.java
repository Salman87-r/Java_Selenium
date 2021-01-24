package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Payment {
	static WebDriver driver;
	//WebElement for description of product
	@FindBy(xpath="//tbody/tr[@id='product_1_1_0_415381']/td[2]")
	WebElement Description;
	//Webelement for Desciption details 
	@FindBy(xpath="//small[contains(text(),'SKU : demo_1')]")
	WebElement sku;
	//WebElement for color in payment
	@FindBy(linkText="Color : Orange, Size : S")
	WebElement colorsumpage;
	//WebElement for check item available or not
	@FindBy(xpath="//span[contains(text(),'In stock')]")
	WebElement available;
	//WebElement for check unitprice
	@FindBy(xpath="//*[@id=\"product_price_1_1_415381\"]/span")
	WebElement unitprice;
	//WebElement to check quantity 
	@FindBy(xpath="//*[@id=\"product_1_1_0_415381\"]/td[5]/span")
	WebElement qty;
	//WebElement to check total price 
	@FindBy(xpath="//span[@id='total_product_price_1_1_415381']")
	WebElement total;
	//WebElement for the total price
	@FindBy(xpath="//td[@id='total_price_container']")
	WebElement totalprice;
	//COnstructor for the class
	public Payment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Function to get description text of summary page
	public String getdescription() {
		return Description.getText();
	}
	//function to get sku text 
	public String getsku() {
		return sku.getText();
	}
	//function to get color present is summary page 
	public String colorsummpa() {
		return colorsumpage.getText();

	}
	//function to get item is present in stock
	public String availableitem() {
		return available.getText();	
	}
	//function to get unit price 
	public float unitprice() {
		String cost= unitprice.getText();
		//Remove $ sign from price
		String unitprice = cost.replace("$", "").replace(",", "");
		//COnvert into float
		float unitpri=Float.parseFloat(unitprice);
		return unitpri;	
	}
	//function to get quantity
	public float qnty() {
		String actualqty=  qty.getText();
		float qty=Float.parseFloat(actualqty);
		return qty;
	}
	//Function to get quantity and price
	public float totalprice() {
		String cost= total.getText();
		String unitprice = cost.replace("$", "").replace(",", "");
		float totalprice=Float.parseFloat(unitprice);
		return totalprice;	
	}
	//Function to get total price
	public float totalpriceincship() {
		String cost= totalprice.getText();
		String unitprice = cost.replace("$", "").replace(",", "");
		float totalprice=Float.parseFloat(unitprice);
		return totalprice;	
	}

}
