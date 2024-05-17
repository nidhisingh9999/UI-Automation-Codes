package seleniumtestcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

	public static void main(String[] args)throws InterruptedException {
		// Open the browser
		//Delete all cookies
		//Set size of the window
		//Set position of the window
		//Maximize the window
	System.setProperty("driver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	//to delete cookies
	driver.manage().deleteAllCookies();
	//To set the size of window
	Dimension d = new Dimension(500,500);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	//To set the position of window
	Point p = new Point(250,250);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	//to maximize window
	driver.manage().window().maximize();

	}

}

