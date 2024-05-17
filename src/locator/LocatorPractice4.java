package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice4 {

	public static void main(String[] args) {
		//PartialLinkText
		System.setProperty("WebDriver.Driver.ChromeDriver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x2 = driver.findElement(By.partialLinkText("forgot Password?"));
		x2.click();
	}

}
