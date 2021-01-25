package SteepsForBackGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGround {
	WebDriver driver=null;
	@Given("User open browser")
	public void user_open_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

	}


	@When("User enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("User enter username and password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mani3@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
	 
	}
	@And("User enter click")
	public void user_enter_click() {
		System.out.println("User click on login page");
		driver.findElement(By.id("SubmitLogin")).click();
	}
	@Then("User is on home paage")
	public void user_is_on_home_paage() {
		
		System.out.println(driver.getTitle());
	}
	@Then("Log out button is present")
	public void log_out_button_is_present() {
		System.out.println("User land on home page");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).isDisplayed();
	}
	@Then("Contact button is present")
	public void contact_button_is_present() {
		System.out.println("User land on home page");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[3]/a[1]")).isDisplayed();
		driver.quit();
	    
	}

}
