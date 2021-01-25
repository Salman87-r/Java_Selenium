package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver driver= null;
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside step : Browser is open");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@And("User  is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step :User land on search page");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q"));
		
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {
		System.out.println("Inside step : User enter text in search bar");
		driver.findElement(By.name("q")).sendKeys("Youtube");
	}

	@And("user enter click")
	public void user_enter_click() {
		System.out.println("Inside step : click search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user reach on that page")
	public void user_reach_on_that_page() {
		System.out.println("Inside step : User land on home page");
		driver.getPageSource().contains("YouTube Studio");
		
		driver.close();
		driver.quit();
	}
}
