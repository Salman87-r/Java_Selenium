package GridTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class internetExplorer {
	WebDriver driver;
	@Test
	void setupInternetExplorer() throws MalformedURLException {
		String nodeUrl="http://192.168.10.5:4444/wd/hub";
		DesiredCapabilities objdesire = new DesiredCapabilities();
		objdesire.setBrowserName("InternetExplorer");
		objdesire.setPlatform(Platform.WINDOWS);
		objdesire.setCapability("Version", 11);
		//objdesire.set("ignoreProtectedModeSettings", true);
		objdesire.setCapability("ignoreProtectedModeSettings", true);
		objdesire.setCapability("ignoreZoomSetting", true);
		objdesire.setCapability("nativeEvents", false);
		objdesire.setCapability("acceptSslCerts", true);
		//Chrome option defination
		InternetExplorerOptions option = new InternetExplorerOptions();
		option.merge(objdesire);
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		driver =new RemoteWebDriver(new URL(nodeUrl),option);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}
		


	}

