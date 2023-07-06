package step_definition;

import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.BaseClassUtils;
public class LoginTest extends BaseClassUtils {
	
	LoginPage login=null;
	@AfterStep
	public void captureScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed step screenshot");
		}
	}
	@After
	public void closeWindow() {
		driver.close();
	}
	
	@Given("initialize the driver")
	public void initialize_the_driver() {
		initDriver();
	}

	@Given("User is on the login page {string}")
	public void user_is_on_the_login_page(String string) {
		getUrl(string);    
	}
	

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    login=new LoginPage(driver);
	    inputText(login.geteMail(),string);
	    inputText(login.getPassword(),string2);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		clickButton(login.getLoginBtn());
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		try {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		org.junit.Assert.assertEquals("Login successfully", "https://tutorialsninja.com/demo/index.php?route=account/account", currentUrl);
		}
		catch(Exception e) {
			System.out.println("Login Failed" +e);
			
		}
	}
	
	
}
