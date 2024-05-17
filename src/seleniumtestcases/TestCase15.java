package seleniumtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase15 {

	public static void main(String[] args) throws InterruptedException {
		// Scenario handling dropdown
	System.setProperty("webdriver.edge.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://trytestingthis.netlify.app/");
	WebElement drpdwn = driver.findElement(By.id("option"));
	Select selctObj = new Select(drpdwn);
	selctObj.selectByIndex(1);
	Thread.sleep(2000);
	selctObj.selectByValue("option 2");
	Thread.sleep(2000);
	selctObj.selectByVisibleText("option 3");
	Thread.sleep(5000);
	driver.close();
	System.out.println("Done");
}
}