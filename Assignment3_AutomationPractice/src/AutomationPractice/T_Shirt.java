package AutomationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirt {
	WebDriver driver;
	Actions actions;
	//WebElement for image in which hover button exist
	@FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")
	WebElement imagehover;
	//WebElement for add to cart button address
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement AddtoCart;
	@FindBy(xpath="//span[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement Itemname;
	//web element for locate successful massege
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
	WebElement succMesg;
	//Web element to allocate for color to selected item
	@FindBy(xpath="//span[@id='layer_cart_product_attributes']")
	WebElement color;
	//WebElement to allocate for quantity to selected item
	@FindBy(xpath="//span[@id='layer_cart_product_quantity']")
	WebElement quantity;
	//WebElement to allocate for price 
	@FindBy(xpath="//span[@id='layer_cart_product_price']")
	WebElement Price;
	//Shipping Element
	@FindBy(xpath="//span[@class='ajax_cart_shipping_cost']")
	WebElement Shippr;
	//Total price 
	@FindBy(xpath="//span[@class='ajax_block_cart_total']")
	WebElement totalcost;
	//Element in ship icon
	@FindBy(xpath="//span[contains(text(),'There is 1 item in your cart.')]")
	WebElement shipicon;
	//Image tag
	@FindBy(xpath="//img[@class='layer_cart_img img-responsive']")
	WebElement image;
	//Cross check 
	@FindBy(xpath="//span[@class='cross']")
	WebElement crossicon;
	//view cart
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")
	WebElement viewcart;
	//back to tShirt page
	@FindBy(xpath="//span[@class='category-name']")
	WebElement backtoTsp;
	//continue to shopping
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	WebElement continueshop;
	//proceed to ceck out
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceedtocheckout;
	//WebElement for summary element heading
	@FindBy(xpath="//h1[@id=\"cart_title\"]")
	WebElement summaryhead;
	//WebElement for description of product
	@FindBy(xpath="//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")
	WebElement Description;
	//Webelement for Desciption details 
	@FindBy(xpath="//small[contains(text(),'SKU : demo_1')]")
	WebElement sku;
	//WebElement for color in summary
	@FindBy(linkText="Color : Orange, Size : S")
	WebElement colorsumpage;
	//WebElement for check item available or not
	@FindBy(xpath="//span[contains(text(),'In stock')]")
	WebElement available;
	//WebElement for check unitprice
	@FindBy(xpath="//*[@id=\"product_price_1_1_0\"]/span")
	WebElement unitprice;
	//WebElement to check quantity 
	@FindBy(xpath="//tbody/tr[@id='product_1_1_0_0']/td[5]/input[1]")
	WebElement qty;
	//WebElement to check total price 
	@FindBy(xpath="//span[@id='total_product_price_1_1_0']")
	WebElement total;
	//WebElement to check delete
	@FindBy(xpath="//*[@id=\"1_1_0_0\"]")
	WebElement delete;
	//WebElement to +ve icon
	@FindBy(xpath="//i[@class='icon-plus']")
	WebElement Poicon;
	//WebElement to -ve icon
	@FindBy(xpath="//i[@class='icon-minus']")
	WebElement negicon;
	//WebElement to +ve increment 
	@FindBy(xpath="//*[@id=\"product_1_1_0_0\"]/td[5]/input[1]")
	WebElement Poiconincre;
	//Webelement for masg after click Delete on summary page
	@FindBy(xpath="//p[@class='alert alert-warning']")
	WebElement Delmang;
	//Proceed to checkout on summary page
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement Probutsummary;
	//Proceed to signup  on summary page
	//COnstructor for TShirt class 
	public T_Shirt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Function make to access hover element 
	public void accessaddtcb() {
		actions = new Actions(driver);
		actions.moveToElement(imagehover).perform();
		actions.moveToElement(AddtoCart).click().perform();
		
	}
	//Function to find item selected text
	public String itemaddedtext() {
		return Itemname.getText();
	}
	//Function to find text succcess masg on popup
	public String prodscstext() {
		return succMesg.getText();
	}
	//Function to find color on popup of selected item
	public String getcolor() {
		return color.getText();
	}
	//Function to find quantity on popup of selected item
	public String getQuantity() {
		return quantity.getText();
	}
	//Function to find  product price on popup of selected item
	public String getprice() {
		return Price.getText();
	}
	//Function to find  shipping price on popup of selected item
	public String getpriceship() {
		return Shippr.getText();
	}
	//Function to find total price on popup of selected item
	public String totalprice() {
		return totalcost.getText();
		}
	//Function to find how many item selected on popup 
	public String shipitem() {
		return shipicon.getText();
		}
	public String shipitem(WebElement a) {
		return a.getText();
	}
	//Function to find image tittle
	public String imagetag() {
		return image.getAttribute("title");
	}
	////Function to find crosstag present on popup 
	public String crosstag() {
		return crossicon.getAttribute("title");
	}
	//Function to find click cross bar selected on popup 
	public void clickcross() {
		crossicon.click();
	}
	//Function to find how many item selected in cart on popup 
	public String viewcart() {
		return viewcart.getText();
}
	//Function to find redirected to tshirt page 
	public String backtoTsp() {
		return backtoTsp.getText();
	}
	//Function to find continue shopping button is present on popup 
	public String continueshopbut() {
		return continueshop.getText();
	}
	//Function to find proceed to shipping button is present on popup 
	public String proceedtocheckbutton() {
		return proceedtocheckout.getAttribute("title");
	}
	//Function to click continue shopping button  on popup 
	public void clickcontinue() {
		continueshop.click();
	}
	//Function to click proceed to checkout button  on popup 
	public void clickpro() {
		proceedtocheckout.click();
	}
	//Function to get text of summary page
	public String getsummaryhead() {
		return summaryhead.getText();
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
	public String unitprice() {
		return unitprice.getText();	
	}
	//function to get qty
	public String qnty() {
		return qty.getAttribute("value");
	}
	//function to get Qnty and price after clicking +icon 
	public void posqty() {
		String beforeClick=qty.getAttribute("value");
		int countervalBefore = Integer.parseInt(beforeClick);
		System.out.println("COunter before :" +countervalBefore);
		System.out.println("Price before click :" +total());
		clickpicon();
		clickpicon();
		driver.navigate().refresh();
		String afterClick=qty.getAttribute("value");
		int countervalafter = Integer.parseInt(afterClick);
		System.out.println("After Click :" +countervalafter);
		System.out.println("Price after click :" +total());
		if(countervalafter>countervalBefore) {
			System.out.println("Counter is  working properly Test is pass");
		}
		else {
			System.out.println("Counter is not working properly Test is fail");
		}
	}
	//function to get price of product  
	public String total() {
		return total.getText();	
	}
	//function to check delete button 
	public String deletebutton() {
		return delete.getAttribute("title");	
	}
	//function to click positive button 
	public void clickpicon() {
		Poicon.click();
	}
	//function to find item selected value
	public String countclick() {
		return Poiconincre.getAttribute("value");	
	}
	//function to click negative button 
	public void clicknegicon() {
		negicon.click();
	}
	//function to get Qnty and price after clicking -icon 
	public void negqty() {
		String beforeClick=qty.getAttribute("value");
		System.out.println("Price before click :" +total());
		int countervalBefore = Integer.parseInt(beforeClick);
		System.out.println("COunter before :" +countervalBefore);
		clicknegicon();
		driver.navigate().refresh();
		String afterClick=qty.getAttribute("value");
		int countervalafter = Integer.parseInt(afterClick);
		System.out.println("After Click :" +countervalafter);
		System.out.println("Price after click :" +total());
		if(countervalafter<countervalBefore) {
			System.out.println("Negative Counter is  working properly Test is pass");
		}
		else {
			System.out.println("Negative Counter is not working properly Test is Fail");
		}
	}
	//function to click del button
	public void clickdelete() {
		delete.click();
	}
	//function to find text after del button
	public void delmasgtext() {
		System.out.println(Delmang.getText());
		}
	//function to click proceed to checkout
	public void clickprosummarypage() {
		Probutsummary.click();
	}

	
}
