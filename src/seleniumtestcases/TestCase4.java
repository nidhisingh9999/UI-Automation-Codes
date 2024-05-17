package seleniumtestcases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase4 {

	public static void main(String[] args) {
		// Go to google.com, click gmail and check the title is Gmail or not 
		
		System.setProperty("webdriver.geckodriver", "C:\\Users\\Nidhi\\BrowserDriverSelenium.geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.findElement("/html/body/header/div/a/span"))
	}

}
