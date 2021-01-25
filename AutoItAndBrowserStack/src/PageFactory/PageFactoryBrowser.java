package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryBrowser {
	WebDriver driver;
	@FindBy(name="q")
	public WebElement Googlesearch;
	public PageFactoryBrowser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
