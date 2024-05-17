package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase13 {

	public static void main(String[] args) {
		// navigate to home page by clicking on image link-opencart(logo)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		//find web element image link
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		//verify correctly navigate to homepage or not after clicking on opencart(logo)
        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
        	System.out.println("TestCase Passed");
        }else {
        	System.out.println("Test Case Failed");
        }
        driver.close();
	}

}
