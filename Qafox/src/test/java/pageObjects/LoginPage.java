package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="input-email")
	private WebElement eMail; 

	@FindBy(id="input-password")
	private WebElement password; 
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
}
