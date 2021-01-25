package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryAutoit {
	WebDriver driver;
	@FindBy(name="uploaded_file")
	public WebElement uploaded_file;
	@FindBy(xpath="//tbody/tr[2]/td[1]/img[1]")
	public WebElement submit;
	public PageFactoryAutoit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clicksubmit() {
		submit.click();
	}
	public void clickUploadfile() {
		Actions action = new Actions(driver);
		action.moveToElement(uploaded_file).click().build().perform();
	}
}
