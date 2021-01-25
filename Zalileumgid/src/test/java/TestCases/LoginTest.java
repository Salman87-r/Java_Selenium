package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	public RemoteWebDriver driver;
	DesiredCapabilities dc;
	@BeforeTest
	@Parameters("browser")
	public void setup(String br) throws MalformedURLException {
		dc = new DesiredCapabilities();
		if(br.equals("chrome")) {
//		dc.setBrowserName("chrome");
		dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);

		}
		else 
			if(br.equals("firefox")) {
				dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
				dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
				
				
//				driver.get(url);
				}
		URL url=new URL("http://localhost:4444/wd/hub");
		driver=new RemoteWebDriver(url,dc);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mani3@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println(driver.getTitle());
		String expected ="My account - My Store";
		Assert.assertEquals(driver.getTitle(), expected);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}

}
