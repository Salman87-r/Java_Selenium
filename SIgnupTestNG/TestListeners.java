package Base;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import TestNg.Main;

public class TestListeners implements ITestListener {
	private static ExtentReports extent=ExtentManager.createinstance();
	private static ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		ExtentTest test=extent.createTest(result.getTestClass().getName() +"::::"+
				result.getMethod().getMethodName());
		extenttest.set(test);	 
	}
	public void onTestSuccess(ITestResult result) {
		String logtest="<br> Test method" + result.getMethod().getMethodName() +"Passed </br>";
		Markup m=MarkupHelper.createLabel(logtest, ExtentColor.BLUE);
		extenttest.get().log(Status.PASS, m); 
	}
	public void onTestSkip(ITestResult result) {
		
		String logtest="<br> Test method" + result.getMethod().getMethodName() +"Skiped </br>";
		Markup m=MarkupHelper.createLabel(logtest, ExtentColor.YELLOW);
		extenttest.get().log(Status.PASS, m); 
	}
	public void onTestFailure(ITestResult result) {
		String Methodname=result.getMethod().getMethodName();
		String exceptionmasg=Arrays.toString(result.getThrowable().getStackTrace());
		extenttest.get().fail("<details><summary> <b><font color=red>Exception occored:Click to see details:</font></b></summary>"
				+ exceptionmasg.replaceAll(",", "<br>")+ "</details>");	
		WebDriver driver =((Main)result.getInstance()).driver;
		String path=takeScreenshot(driver,result.getMethod().getMethodName());
		try {
			extenttest.get().fail("<b><font color=red>" + "Secreen Shot failure:" + "</font></b>",
					MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}catch (Exception e) {

			extenttest.get().fail("test Failed and can not attached secreen shot");
		}
		String logtest="<br> Test method" + Methodname +"Failed </br>";
		Markup m=MarkupHelper.createLabel(logtest, ExtentColor.RED);
		extenttest.get().log(Status.FAIL, m);
	}
	public static String getsecreenshotname(String methodname) {
		Date d=new Date();
		String filename = methodname + "_" + d.toString().replace(":", "_").replace(" ", " _") +".png";
		return filename;	
	}
	public static String takeScreenshot(WebDriver driver,String methodname) {
		String filename=getsecreenshotname(methodname);
		String dir=System.getProperty("user.dir")+ "/secreenshots/";
		new File(dir).mkdir();
		String path=dir+filename;
		try {
			File secreen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(secreen, new File(path));
			System.out.println("********************");
			System.out.println("Secreen Shot save at :" +path);
			System.out.println("********************");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;		
	}
	public void onFinish(ITestResult result) {
		if(extent!=null) {
			extent.flush();
		}
		
	}

}
