package seleniumtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase14 {

	public static void main(String[] args) throws InterruptedException  {
		//How to handle dropdown 
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(1000);
		selectObject.selectByValue("option 2");
		Thread.sleep(1000);
		selectObject.selectByVisibleText("option 3");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");

	}

}
