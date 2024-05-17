package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase17 {

	public static void main(String[] args) {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximise browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://demoqa.com/buttons");
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		//for right click use action class and in parenthesis of action class we pass object of webdriver/chromedriver
		Actions act = new Actions(driver);
		//for double click
		act.doubleClick(button).build().perform();
		

	}

}
