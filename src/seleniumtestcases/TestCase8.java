package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {

	public static void main(String[] args) {
		// Test Case - count and prints all hyperlinks of webpage
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//locate total hyperlinks on webpage and count
	List<WebElement> HyperlinkElements = driver.findElements(By.tagName("a"));
	System.out.println("Total links on webpage:" +HyperlinkElements.size());
	//to print all links - use for each loop
	for(WebElement wb: HyperlinkElements)
	{
		System.out.println(wb.getText());
	}
	driver.close();
	}

}
