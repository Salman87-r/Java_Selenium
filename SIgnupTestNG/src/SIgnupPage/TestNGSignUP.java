package SIgnupPage;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGSignUP {
	static WebDriver driver=null;
	static PageFactoryHome  objhome;
	static SignuploginPagefactory objsign;
	static CreateaccountPageFactory  objcreate;
	static ExcelDataProvider objExcelclass;
	static AppachePOI obj;
	static XSSFWorkbook wb;
	
	@BeforeTest	
	public void setuptest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhome=new PageFactoryHome (driver);
		String url="http://automationpractice.com/";
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		objhome.clickElement(objhome.Signupbutton);
	}
  @Test
  public void TestNg() {



	}
	@DataProvider(name="Test1data",indices = {0})
	public  Object[][] getdata() {
		String address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"SIgnup");
		objExcelclass=new ExcelDataProvider();
		Object data[][]=objExcelclass.testdata();
		return data;	
	}
	@DataProvider(name="Test4data")
	public  Object[][] getdata1() {
		String address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"SIgnup");
		objExcelclass=new ExcelDataProvider();
		Object data[][]=objExcelclass.testdata();
		return data;	
	}
	@DataProvider(name="Test5data")
	public  Object[][] getdata3() {
		String address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"Login");
		objExcelclass=new ExcelDataProvider();
		Object data[][]=objExcelclass.testdata();
		return data;	
	}
	/*
	@Test(dataProvider="Test5data")
	public void test4data(String Email,String password) {
		objsign=new SignuploginPagefactory(driver);
		objcreate=new CreateaccountPageFactory(driver);
		String address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"Login");
		for(int i=1;i<obj.getcolumnCount();i++) {
			objsign.loginuser.sendKeys(obj.sheet.getRow(i).getCell(0).getStringCellValue());
			//objsign.createuttonbutton.click(); 
			//objcreate.clickElement(objcreate.TitleMr);
			objsign.loginpass.sendKeys(obj.sheet.getRow(i).getCell(1).getStringCellValue());
			objsign.loginbutton.click();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            objcreate.clickElement(objcreate.signout);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            objcreate.clickElement(objcreate.Signupbutton);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		}	
		String Email,String Fname,String Lname,String password,String Day,String Month,String Year,String Address,String City,String State,String Zip,String Country,String MobilePhone	
	}*/
	
	@Test(dataProvider="Test4data")
	public void test4data() throws Exception
	{ 	objhome=new PageFactoryHome (driver);
		objsign=new SignuploginPagefactory(driver);
		objcreate=new CreateaccountPageFactory(driver);
		String address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"SIgnup");
		for(int i=1;i<obj.getcolumnCount();i++) {
			objsign.createaccount.sendKeys(obj.sheet.getRow(i).getCell(0).getStringCellValue());
			objsign.createuttonbutton.click(); 
			objcreate.clickElement(objcreate.TitleMr);
			objcreate.firstname.sendKeys(obj.sheet.getRow(i).getCell(1).getStringCellValue());
			objcreate.lastname.sendKeys(obj.sheet.getRow(i).getCell(2).getStringCellValue());
			objcreate.password.sendKeys(obj.sheet.getRow(i).getCell(3).getStringCellValue());
			objcreate.day.sendKeys(obj.sheet.getRow(i).getCell(4).getStringCellValue());
			objcreate.month.sendKeys(obj.sheet.getRow(i).getCell(5).getStringCellValue());
			objcreate.year.sendKeys(obj.sheet.getRow(i).getCell(6).getStringCellValue());
			objcreate.Address.sendKeys(obj.sheet.getRow(i).getCell(7).getStringCellValue());
			objcreate.city.sendKeys(obj.sheet.getRow(i).getCell(8).getStringCellValue());
			objcreate.state.sendKeys(obj.sheet.getRow(i).getCell(9).getStringCellValue());
			objcreate.zip.sendKeys(obj.sheet.getRow(i).getCell(10).getStringCellValue());
			objcreate.Country.sendKeys(obj.sheet.getRow(i).getCell(11).getStringCellValue());
			objcreate.mobilephone.sendKeys(obj.sheet.getRow(i).getCell(12).getStringCellValue());
			objcreate.clickElement(objcreate.Register);
			
			String masg=objcreate.getdata();
			String Expectedvalue="MY ACCOUNT";
			//XSSFCell cell = obj.sheet.getRow(i).createCell(13);
			//XSSFCell cell = obj.sheet.getRow(i).createCell(13);
			//check if confirmation message is displayed
            if (Expectedvalue.contains(masg)) {
                // if the message is displayed , write PASS in the excel sheet
                cell.setCellValue("PASS");
                
            } else {
                //if the message is not displayed , write FAIL in the excel sheet
                cell.setCellValue("FAIL");
            }
            FileOutputStream outputStream = new FileOutputStream("Excel\\TestDat.xlsx");
            wb.write(outputStream);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            objcreate.clickElement(objcreate.signout);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            objcreate.clickElement(objcreate.Signupbutton);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		}
		 wb.close();
	}

  }

