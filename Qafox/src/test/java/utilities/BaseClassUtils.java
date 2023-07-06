package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassUtils {
	public WebDriver driver;

	public void initDriver() {
		//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void clickButton(WebElement element) {
		element.click();

	}

	public void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String getStringText(WebElement element) {
		return element.getText(); 
	}


}
