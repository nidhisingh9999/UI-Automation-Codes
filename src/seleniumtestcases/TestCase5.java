package seleniumtestcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args)throws InterruptedException {
		// Gmail Account Login 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//enter url
		driver.get("https://www.google.com/");
		//to get title on current webpage
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		//to get the url of current web page
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		//to close the browser
		Thread.sleep(2000);
		driver.close();
		
	}

}
