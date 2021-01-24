package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomation{
	static WebDriver driver;
	HomePageAutomation objhome;
	T_Shirt objtshirt;
	static Actions actions;
	static TestCases objtest;
	//main function
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		objtest=new TestCases(driver);
		//function call
		objtest.setup();
		objtest.verifyadditem();
		Thread.sleep(2000);
		objtest.successmasg();
		Thread.sleep(2000);
		objtest.productnamemasg();
		Thread.sleep(2000);
		objtest.productcolor();
		Thread.sleep(2000);
		objtest.productsize();
		Thread.sleep(2000);
		objtest.productquantity();
		Thread.sleep(2000);
		objtest.productprice();
		Thread.sleep(2000);
		objtest.shipprice();
		Thread.sleep(2000);
		objtest.totalprice();
		Thread.sleep(2000);
		objtest.Availableproduct();
		Thread.sleep(2000);
		objtest.Imagename();
		Thread.sleep(2000);
		objtest.crosstag();
		Thread.sleep(2000);
		objtest.clickproceed();
		Thread.sleep(2000);
		objtest.checkskyhead();
		Thread.sleep(2000);
		objtest.checkcolorsummpage();
		Thread.sleep(2000);
		objtest.checksizesummpage();
		Thread.sleep(2000);
		objtest.availablesummary();
		Thread.sleep(2000);
		objtest.unitpricesummary();
		Thread.sleep(2000);
		objtest.qty();
		Thread.sleep(2000);
		objtest.totalsummary();
		Thread.sleep(2000);
		objtest.delbutton();
		Thread.sleep(2000);
		objtest.clickPos();
		Thread.sleep(2000);
		objtest.clickneg();
		Thread.sleep(2000);
		objtest.clickprosum();
		Thread.sleep(2000);
		//objtest.LoginaccountError();
		Thread.sleep(2000);
		objtest.Loginaccount();
		Thread.sleep(2000);
		objtest.verifyaddress();
		Thread.sleep(2000);
		objtest.verifyshipping();
		Thread.sleep(2000);
		objtest.checkpayment();
		Thread.sleep(2000);
		objtest.qntyprice();
		Thread.sleep(2000);
		objtest.verifytotalprice();
		Thread.sleep(2000);
		//objtest.createaccount();
		//objtest.clickcontinueshop();
		//objtest.clickcross();
		//objtest.checkcontinue();
		//objtest.checkproceed();
		//objtest.clickproceed();
		//objtest.clickcontinueshop();
		//driver.quit();
}	
}