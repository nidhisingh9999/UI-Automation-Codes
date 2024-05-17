package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//maximize current window
		driver.manage().window().maximize();
		//locate username -- tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//locate password -- tag and attribute --> (tag[attribute = value])
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		//locate login button--tag and class --> tag.valueofclass
		driver.findElement(By.cssSelector("input.btn_action")).click();
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		//locate add to cart button--tag,class and attribute--> (tag.valueofclass[attribute=value])
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
        //locate add to cart using substring -> (start with =^, ends with =$,contains =*)-tag[attribute^=substring]
		driver.findElement(By.cssSelector("button[id$=light]")).click();
		
	}

}
