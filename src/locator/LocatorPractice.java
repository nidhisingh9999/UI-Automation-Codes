package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args){
		//invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//inplicit wait-2sec timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//hit url on that browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//find elements on this page with id locator
		driver.findElement(By.id("inputUsername")).sendKeys("nidhi");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyi");
		driver.findElement(By.className("signInBtn")).click();
		// to print error in console
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
