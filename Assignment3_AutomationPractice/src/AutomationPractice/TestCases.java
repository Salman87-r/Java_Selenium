package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class TestCases {
	//referance of classes
	WebDriver driver;
	HomePageAutomation Homepagepbj;
	T_Shirt TShirt;
	Signup objsign;
	Address objAddress;
	Payment objpayment;
	//Constructor of the class tese cases
	public TestCases(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkStringequal(String a,String b) {
		if(a.contains(b)) {
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}	
	}
	//Webside is working or not 
	public void setup() {
		driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Testing Webside Url
		String url="http://automationpractice.com/";
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
	}
	//smoke function to verify item add or not
	public void verifyadditem() {
		Homepagepbj=new HomePageAutomation(driver);
		TShirt=new T_Shirt(driver);
		Homepagepbj.click_T_shirts();
		TShirt.accessaddtcb();
		String Expected_result="Faded Short Sleeve T-shirts";
		System.out.println("Expected Result is :" + Expected_result);
		String Actual_result=TShirt.itemaddedtext();
		System.out.println("Actual Result is :" +Actual_result);
		checkStringequal(Expected_result,Actual_result);
		}
	//Sanity function find success mesg show 
	public void successmasg() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_masg="Product successfully added to";
		System.out.println("Expected masg after clicking is :" + Expected_masg);
		String Actual_masg=TShirt.prodscstext();
		checkStringequal(Expected_masg,Actual_masg);
	}
	//Sanity function find product name tag  on popup
	public void productnamemasg() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="Faded Short Sleeve T-shirts";
		System.out.println("Expected product name is :" + Expected_result);
		String Actual_result=TShirt.itemaddedtext();
		System.out.println("Actual product name is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);
	}
	//Sanity function find product color  on popup
	public void productcolor() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="Orange";
		System.out.println("Expected product color is :" + Expected_result);
		String Actual_result=TShirt.getcolor();
		System.out.println("Actual product color is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);	
	}
	//Sanity function find product size on popup
	public void productsize() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="S";
		System.out.println("Expected product SIze is :" + Expected_result);
		String Actual_result=TShirt.getcolor();
		System.out.println("Actual product SIze is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);	
	}
	//Sanity function find product quantity  on popup
	public void productquantity() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="1";
		System.out.println("Expected product Quanitity is :" + Expected_result);
		String Actual_result=TShirt.getQuantity();
		System.out.println("Actual product Quantity is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);
	}	
	//Sanity function find product price on popup
	public void productprice() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="$16.51";
		System.out.println("Expected product price is :" + Expected_result);
		String Actual_result=TShirt.getprice();
		System.out.println("Actual product price is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function find ship cost   on popup
	public void shipprice() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="$2.00";
		System.out.println("Expected Shipping price is :" + Expected_result);
		String Actual_result=TShirt.getpriceship();
		System.out.println("Actual shipping price is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function find total cost on popup
	public void totalprice() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="$18.51";
		System.out.println("Expected total cost is :" + Expected_result);
		String Actual_result=TShirt.totalprice();
		System.out.println("Actual total cost is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function find product available or not on popup
	public void Availableproduct() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="There is 1 item in your cart.";
		System.out.println("Expected available product is :" + Expected_result);
		String Actual_result=TShirt.shipitem(TShirt.shipicon);
		System.out.println("Actual available product  is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function find image title  on popup
	public void Imagename() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="Faded Short Sleeve T-shirts";
		System.out.println("Expected image tag is :" + Expected_result);
		String Actual_result=TShirt.imagetag();
		System.out.println("Actual image tag  is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function find cross tag  on popup
	public void crosstag() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String Expected_result="Close window";
		System.out.println("Expected tag name  :" + Expected_result);
		String Actual_result=TShirt.crosstag();
		System.out.println("Actual tag  is :" + Actual_result);
		checkStringequal(Expected_result,Actual_result);}
	//Sanity function click cross icon and what happened on popup
	public void clickcross() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		TShirt.clickcross();
		String Itemincart=TShirt.viewcart();
		System.out.println("Actual item number in cart :" + Itemincart);
		String page=TShirt.backtoTsp();
		System.out.println("Actual page when click on cart :" + page);
		if((Itemincart).equals("1") && (page).contains("T-shirts")) {
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}}
	//Sanity function find continue to shopping is present  on popup
	public void checkcontinue() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expectedbutton="Continue shopping";
		System.out.println("Expected button name is :" + expectedbutton);
		String actualbutton=TShirt.continueshopbut();
		System.out.println("Actual button name is :" + actualbutton);
		checkStringequal(expectedbutton,actualbutton);}
	//Sanity function find proceed to checkout button is present  on popup
	public void checkproceed() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expectedbutton="Proceed to checkout";
		System.out.println("Expected button name is :" + expectedbutton);
		String actualbutton=TShirt.proceedtocheckbutton();
		System.out.println("Actual button name is :" + actualbutton);
		checkStringequal(expectedbutton,actualbutton);}
	//smoke function click continue to shopping  
	public void clickcontinueshop() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		TShirt.clickcontinue();
		String EPage="T-shirts";
		System.out.println("Actual page when click on continue :" + EPage);
		String page=TShirt.backtoTsp();
		System.out.println("Actual page when click on continue :" + page);
		checkStringequal(EPage,page);}	
	//smoke function click proceed to checkout
	public void clickproceed() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		TShirt.clickpro();
		String expectedpage="SHOPPING-CART SUMMARY";
		System.out.println("Expected page is :" + expectedpage);
		String actual_page=TShirt.getsummaryhead();
		System.out.println("Directed Page heading:" +actual_page);
		checkStringequal(expectedpage,actual_page);}
	//sanity function to check summary of product is present 
	public void checkskyhead() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expectedvalue="demo";
		System.out.println("Expected value is :" + expectedvalue);
		String actual_value=TShirt.getsku();
		System.out.println("Actual value is:" +actual_value);
		checkStringequal(expectedvalue,actual_value);}
	//sanity function check color function on summary page
	public void checkcolorsummpage() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expectedcolor="Orange";
		System.out.println("Expected color is :" + expectedcolor);
		String actual_color=TShirt.colorsummpa();
		System.out.println("Actual color is:" +actual_color);
		checkStringequal(expectedcolor,actual_color);}
	//sanity function check size  on summary page
	public void checksizesummpage() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expectedsize="S";
		System.out.println("Expected size is :" + expectedsize);
		String actual_size=TShirt.colorsummpa();
		System.out.println("Actual color is:" +actual_size);
		checkStringequal(expectedsize,actual_size);}
	//function to verify item is available 
	public void availablesummary() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String exceptavail="In stock";
		System.out.println("Item is   :" + exceptavail);
		String actavail=TShirt.availableitem();
		System.out.println("Item is:" +actavail);
		checkStringequal(exceptavail,actavail);}
	//function to verify unit price
	public void unitpricesummary() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String exceptunitprice="$16.51";
		System.out.println("Expected Item unit price :" + exceptunitprice);
		String actunitp=TShirt.unitprice();
		System.out.println("Actual Item unit price:" +actunitp);
		checkStringequal(exceptunitprice,actunitp);}
	//function to verify Quantity
	public void qty() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String exceptqty="1";
		System.out.println("Expected quantity :" + exceptqty);
		String actqty=TShirt.qnty();
		System.out.println("Actual quantity:" +actqty);
		checkStringequal(exceptqty,actqty);}
	//function to verify total  price of product
	public void totalsummary() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String extotal="$16.51";
		System.out.println("Expected total :" + extotal);
		String actotal=TShirt.total();
		System.out.println("Actual total:" +actotal);
		checkStringequal(extotal,actotal);}
	//function to verify del button is present  
	public void delbutton() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		String expbuttitle="Delete";
		System.out.println("Expected button title :" + expbuttitle);
		String actbut=TShirt.deletebutton();
		System.out.println("Actual button title:" +actbut);
		checkStringequal(expbuttitle,actbut);}
	//Function verify +ve button working or not and check price  
	public void clickPos() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		TShirt.posqty();
	}
	//Function verify -ve button working or not and check price  
	public void clickneg() {
		TShirt=new T_Shirt(driver);
		System.out.println("");
		TShirt.negqty();
	}
	//verify that After Check summary  redirected move to login signup page
	public void clickprosum() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		System.out.println("");
		TShirt.clickprosummarypage();
		String exmasg="AUTHENTICATION";
		System.out.println("Expected Heading on signup page :" + exmasg);
		String Actmasg=objsign.getheadingsignin();
		System.out.println("Actual Heading on signup page :" + Actmasg);
		checkStringequal(exmasg,Actmasg);}

	//Verify that your email already registered 
	public void LoginaccountError() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		System.out.println();
		objsign.enteremail();
		objsign.enterpass();
		objsign.clicksignup();
		String ExpErrormasg="Authentication failed";
		System.out.println("Expected  masg :" + ExpErrormasg);
		String ActErrormasg=objsign.gettext();
		System.out.println("Actual masg :" + ActErrormasg +"create account for this email First and than login");
		checkStringequal(ExpErrormasg,ActErrormasg);}
	//Function to create account 
	public void createaccount() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		objAddress=new Address(driver);
		System.out.println();
		objsign.entercreateemail();
		objsign.clickcreateaccount();
		objsign.clickradiotitle();
		objsign.enterFname();
		objsign.enterlname();
		objsign.enterpasswordcreate();
		objsign.enterday();
		objsign.entermonth();
		objsign.enteryear();
		objsign.enteraddress();
		objsign.entercity();
		objsign.entercountry();
		objsign.enterzip();
		objsign.entermobile();
		objsign.clickregister();
		String expectpagehead="Address";
		System.out.println("Expected directed to page:" +expectpagehead);
		String actpagehead=objAddress.getaddresshead();
		System.out.println("Actual directed to page:" +actpagehead);
		checkStringequal(expectpagehead,actpagehead);}
	//Function to login account 
	public void Loginaccount() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		objAddress=new Address(driver);
		System.out.println();
		objsign.enteremail();
		objsign.enterpass();
		objsign.clicksignup();
		String expectpagehead="Address";
		System.out.println("Expected directed to page:" +expectpagehead);
		String actpagehead=objAddress.getaddresshead();
		System.out.println("Actual directed to page:" +actpagehead);
		checkStringequal(expectpagehead,actpagehead);}
	//Function to verify the address and move to shipping
	public void verifyaddress() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		objAddress=new Address(driver);
		System.out.println();
		if(objAddress.getbilladdress().equals(objAddress.getinvoiceaddress())) {
			System.out.println("Test case pass");
			objAddress.clickprobutn();
		}else
		{
			System.out.println("Test case fail");
		}}
	//verify shipping and redirected to payment page
	public void verifyshipping() {
		TShirt=new T_Shirt(driver);
		objsign=new Signup(driver);
		objAddress=new Address(driver);
		System.out.println();
		String expshipprice="$2.00";
		System.out.println("Expected Shipping price is:" +expshipprice);
		String shippingcost=objAddress.getShippingprice();
		System.out.println("Actual Shipping price is:" +shippingcost);
		if(expshipprice.equals(expshipprice)) {
			System.out.println("Test case pass");
			objAddress.clickcheckbox();
			objAddress.clicknextpage();
		}
		else {
			System.out.println("Test case Fail");
		}
	}
	//Verify that summary of the product on the payment page
	public void  checkpayment() {
		objpayment=new Payment(driver);
		String expsummary="Faded Short Sleeve T-shirts";
		System.out.println("Actual Summary of the product is :");
		System.out.println("Decription of the product" +objpayment.getdescription());
		String actsummary=objpayment.getdescription();
		checkStringequal(expsummary,actsummary);	}	
	//verify that unit price of the product
	public void qntyprice() {
		System.out.println();
		objpayment=new Payment(driver);
		double unitprice=objpayment.unitprice();
		double qty=objpayment.qnty();
		System.out.println("Unit price of product :" +objpayment.unitprice());
		System.out.println("No of  Selected product :" +objpayment.qnty());
		double total= unitprice*qty;
		System.out.println("Total price of selected item :" +total);
		if(objpayment.totalprice()==total) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case Fail");	}		
	}
	//Verify that total price of the product
	public void verifytotalprice() {
		System.out.println();
		objpayment=new Payment(driver);
		double unitprice=objpayment.unitprice();
		double qty=objpayment.qnty();
		double shipfee=2.00;
		System.out.println("Shipment fee :"+shipfee);
		System.out.println("Unit price of product :" +objpayment.unitprice());
		System.out.println("No of  Selected product :" +objpayment.qnty());
		double totalcost= (unitprice*qty)+shipfee;
		System.out.println("Total price of selected item :" +totalcost);
		if(objpayment.totalpriceincship()==totalcost) {
			System.out.println("Test case pass");
			driver.quit();
		}
		else {
			System.out.println("Test case Fail");
			driver.quit();}		
	}
}	

