package seleniumtestcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

	public static void main(String[] args)throws InterruptedException {
		////NAVIGATION COMMANDS
		//1. Navigate().to()
		//2. Refresh()
		//3. Back()
		//4. Forword()
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//to delete the cookies
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		//to enter the URL
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		//to navigate to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		//to navigate to next page
		driver.navigate().forward();
		Thread.sleep(1000);
		//to refresh the current webpage
		driver.navigate().refresh();
		
		

	}

}
