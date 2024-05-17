package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	//locate username using single attribute-relative xpath
	//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//locate user name using contains method in xpath
	driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
	//locate password using multiple attribute
	driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
	//locate login button
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	//switch to product page
	String currentWindowHandle = driver.getWindowHandle();
	driver.switchTo().window(currentWindowHandle);
	//locate addtocart product
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' and @name='add-to-cart-sauce-labs-bike-light']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket' and @name='add-to-cart-sauce-labs-fleece-jacket']")).click();
	}

}
