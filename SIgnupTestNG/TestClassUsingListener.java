package Base;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestClassUsingListener {
	static String address="report.html";

	public WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		String dir=System.getProperty("user.dir")+"/reports/";
		new File(dir).mkdirs();

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestinghelp.com/extent-reports-selenium-webdriver/");


	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		driver.close();
	}
	@Test
	public void TestSuccessful() {
		System.out.println("Executing Successful Methods");
	}
	@Test
	public void TestFailed() {

		System.out.println("Executing Failed Methods");
		Assert.fail("Failed test ");

	}  @Test
	public void TestSkiped() {
		System.out.println("Executing Skipped Methods");
		throw new SkipException("Skip method");
	}	
}

