package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver=null;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User on login page");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		

	}

	@When("User enter (.*) and  (.*)")
	public void user_enter_username_and_password(String username,String password) {
		System.out.println("User enter username and password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		

	
		
	}

	@And("click login")
	public void click_login() {
		System.out.println("User click on login page");
		driver.findElement(By.id("SubmitLogin")).click();
		
	   
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User land on home page");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).isDisplayed();
		System.out.println(driver.getTitle());

	}



}
