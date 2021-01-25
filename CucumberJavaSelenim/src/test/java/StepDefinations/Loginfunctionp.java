package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Loginfunctionp {
	WebDriver driver=null;
	@Given("User open the browser")
	public void user_open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		

	}

	@When("User enter {string} and enter {string}")
	public void user_enter_and_enter(String username, String password) {
		System.out.println("User enter username and password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
	}

	@And("User Enter click login button")
	public void user_enter_click_login_button() {
		System.out.println("User click on login page");
		driver.findElement(By.id("SubmitLogin")).click();

	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("User land on home page");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).isDisplayed();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), driver.getTitle());
		driver.quit();
		driver.close();
	}



}
