package Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	static WebDriver driver;
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("mani1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		String expected="My account - My Store";
		Assert.assertEquals(driver.getTitle(),expected);
		driver.quit();
	}

}
