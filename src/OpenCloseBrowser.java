import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenCloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name:");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.geckodriver","C:\\Users\\Nidhi\\BrowserDriverSelenium.geckodriver.exe");
			 driver = new FirefoxDriver();
		} else 
			if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			} else
				System.out.println("Invalid Browser");
		Thread.sleep(2000);
        driver.close();
	}

}
