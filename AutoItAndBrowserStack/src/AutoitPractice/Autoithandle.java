package AutoitPractice;

import java.util.concurrent.TimeUnit;
import PageFactory.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Autoithandle {
	static WebDriver driver;
	@Test
	public static void checkautoit() throws Exception {
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//Upload file WebElement 
		PageFactoryAutoit obj=new PageFactoryAutoit(driver);
		WebElement File=obj.uploaded_file;
		//Click the webElement through action class
		Actions action = new Actions(driver);
		action.moveToElement(File).click().build().perform();
		//Apply Auto It in Selenium webdriver 
		Runtime.getRuntime().exec("AutoIt\\Fileuploadscript.exe");
		Thread.sleep(2000);

	}


}
