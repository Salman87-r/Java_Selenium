package Stepforhook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookClass {
	WebDriver driver=null;
	@Before
	public void beforetet() {
		System.out.println("I am in before ");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	@After
	public void teardown() {
		System.out.println("I am in after method");
		driver.close();
	}
	@BeforeStep
	public void beforestep() {
		System.out.println("I am before step");
	}
	@AfterStep
	public void AfterStep() {
		System.out.println("I am after step");
	}
	@Given("User in on login page")
	public void user_in_on_login_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		System.out.println("User enter username and password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mani3@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");

	}

	@And("Click Login button")
	public void click_login_button() {
		System.out.println("User click on login page");
		driver.findElement(By.id("SubmitLogin")).click();

	}

	@Then("User navigate to the next page")
	public void user_navigate_to_the_next_page() {
		System.out.println("User land on home page");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).isDisplayed();
		System.out.println(driver.getTitle());

	}


}
