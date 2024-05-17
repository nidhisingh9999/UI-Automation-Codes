import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchGeckoWD {

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver","C:\\Users\\Nidhi\\BrowserDriverSelenium.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}

}
