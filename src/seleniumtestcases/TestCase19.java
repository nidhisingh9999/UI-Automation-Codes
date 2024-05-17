package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase19 {

	public static void main(String[] args) {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://sellglobal.ebay.in/seller-center/");
		WebElement wb = driver.findElement(By.linkText("Shipping"));
		Actions act = new Actions(driver);
		//to perform mouse hover action
		act.moveToElement(wb).build().perform();
		

	}

}
