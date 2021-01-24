package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAutomation {
	WebDriver driver;
	//Find TSHirt button
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement T_ShirtH;
	//constructor for home page and pageFactory
	public HomePageAutomation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Function for click the tShirt
	public void click_T_shirts() {
		T_ShirtH.click();
}
}
