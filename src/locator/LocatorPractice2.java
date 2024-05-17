package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
    WebElement x = driver.findElement(By.id("user-name"));
    x.sendKeys("standard_user");
    WebElement x1 = driver.findElement(By.name("password"));
    x1.sendKeys("secret_sauce");
    WebElement x2 = driver.findElement(By.className("btn_action"));
    x2.click();
    //switch to product page
    String currWindowHandle = driver.getWindowHandle();
    driver.switchTo().window(currWindowHandle);
    //by link text
    driver.findElement(By.linkText("Sauce Labs Backpack")).click();
    //by partial link text- scenario list of item where sauce name shoud be there in items
    List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
    System.out.println("Element size:" + elementList.size() );
	}

} 
