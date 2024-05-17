package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase16 {
  //test scenario to locate right click button
	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//open url
  driver.get("https://demoqa.com/buttons");
  WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
  //WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
  //to perform right click we use action class
  Actions act = new Actions(driver);
  act.contextClick(button).build().perform();
  
  
	}

}
