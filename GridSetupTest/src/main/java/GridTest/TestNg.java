package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	WebDriver driver1;
	WebDriver driver2;
	
@Test
void setupforchrome() throws MalformedURLException {
	String nodeUrl="http://192.168.10.5:4444/wd/hub";
	//DesiredCapabilities for chrome 
	DesiredCapabilities  objdesire=new DesiredCapabilities();
	objdesire.setBrowserName("chrome");
	objdesire.setPlatform(Platform.WINDOWS);
	//Chrome option defination
	ChromeOptions option=new ChromeOptions();
	option.merge(objdesire);
	WebDriverManager.chromedriver().setup();
	driver1 =new RemoteWebDriver(new URL(nodeUrl),option);
	
	driver1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver1.findElement(By.id("email")).sendKeys("mani1@gmail.com");
	driver1.findElement(By.id("passwd")).sendKeys("12345");
	
}
@Test
void setupforfire() throws MalformedURLException {
	String nodeUrl="http://192.168.10.5:4444/wd/hub";
	//DesiredCapabilities fro firefox
	DesiredCapabilities  objdesire=new DesiredCapabilities();
	objdesire.setBrowserName("firefox");
	objdesire.setPlatform(Platform.WINDOWS);
	//Chrome option defination
	FirefoxOptions option=new FirefoxOptions();
	option.merge(objdesire);
	WebDriverManager.firefoxdriver().setup();
	driver2 =new RemoteWebDriver(new URL(nodeUrl),option);
	driver2.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver2.findElement(By.id("email")).sendKeys("mani1@gmail.com");
	driver2.findElement(By.id("passwd")).sendKeys("12345");
	
}
public void closemethod() {
	driver1.quit();
	driver2.quit();
}
}
